# SearchView + RecyclerView
This repo show how to filtering/searching items in a RecyclerView list.

**Level :** *Beginner*

##Usage 
MainFragment.java:
```java
    @Override
    public boolean onQueryTextChange(String newText) {
        final List<MemberData> filteredModelList = filter(tabListItem, newText);
        mAdapter.setItems(filteredModelList); //setItems method is found in RecyclerViewAdapter.java
        mAdapter.notifyDataSetChanged();
        mRecyclerView.scrollToPosition(0);
        return true;
    }
    
        private List<MemberData> filter(List<MemberData> datas, String newText) {
        newText = newText.toLowerCase();

        final List<MemberData> filteredModelList = new ArrayList<>();
        for (MemberData data : datas) {
            final String text = data.getName().toLowerCase();
            if (text.contains(newText)) {
                filteredModelList.add(data);
            }
        }
        return filteredModelList;
    }
```
Simply swap out getName() for any other getter you wish to make searchable. E.g, in this project, getName() could be replaced with getSubText().

##OnClick Action
* ```MemberData.java``` implements Serializable
* Set the onClickListener in the Adapter:
```java
holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("DATA", mItemList.get(position));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
```
Then, receive the intent in ```DetailActivity.java```
```java
public class DetailActivity extends AppCompatActivity {
    ...
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ...
        MemberData memberData = (MemberData)getIntent().getExtras().getSerializable("DATA");
        
        textName = (TextView)findViewById(R.id.title_text);
        textName.setText(memberData.name);
        
        ...
    }
```

Based on [this Stack Overflow post](http://stackoverflow.com/questions/30398247/how-to-filter-a-recyclerview-with-a-searchview/30429439#30429439) with some changes.

**If you have any question please feel free to email me at : johanadam95@gmail.com**
