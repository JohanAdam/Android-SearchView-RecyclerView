package com.josh.example.searchviewnew;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josh on 2/1/2016.
 */
public class MainFragment extends Fragment implements SearchView.OnQueryTextListener {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    RecyclerView mRecyclerView;

    private List<Data> dabListItem;
    private RecyclerViewAdapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.recyclerview, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        dabListItem = new ArrayList<>();

        dabListItem = Data.getData();

        mAdapter = new RecyclerViewAdapter(getActivity(), dabListItem);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        final MenuItem item = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint("Search Hint");
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        final List<Data> filteredModelList = filter(dabListItem, query);
        mAdapter.setItems(filteredModelList);
        mAdapter.notifyDataSetChanged();
        mRecyclerView.scrollToPosition(0);

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        return true;
    }

    private List<Data> filter(List<Data> datas, String newText) {
        newText = newText.toLowerCase().trim();

        final List<Data> filteredModelList = new ArrayList<>();
        for (Data data : datas) {
            final String text = data.getTitle().toLowerCase().trim();
            if (text.contains(newText)) {
                filteredModelList.add(data);
            }
        }
        return filteredModelList;
    }

}
