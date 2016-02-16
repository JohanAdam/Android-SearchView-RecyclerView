package com.josh.example.searchviewnew;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by johan on 17/01/2016.
 */
public class Data implements Serializable
{

    private String Title;
    private String Description;
    private String Company;
    private String Location;
    private String SkillReq;
    private String Qual;
    private String JobType;
    private int Salary;

    public static String Desc_data = "Lorem ipsum dolor sit amet, " +
            "consectetur adipiscing elit. Integer nec odio. " +
            "Praesent libero. Sed cursus ante dapibus diam. " +
            "Sed nisi. Nulla quis sem at nibh elementum imperdiet. " +
            "Duis sagittis ipsum. Praesent mauris. Fusce nec tellus " +
            "sed augue semper porta. Mauris massa. Vestibulum lacinia " +
            "arcu eget nulla. Class aptent taciti sociosqu ad " +
            "litora torquent per conubia nostra, per inceptos " +
            "himenaeos. Curabitur sodales ligula in libero. " +
            "Sed dignissim lacinia nunc.";

    public static String SkillReq_Data ="Lorem ipsum dolor sit amet, " +
            "consectetur adipiscing elit. Morbi congue tempor augue ut mattis. " +
            "Sed vel aliquet nibh. Nam ac nunc mi. Fusce eget velit a nibh bibendum " +
            "tincidunt at sed orci. Phasellus eu hendrerit lacus. Sed placerat vel " +
            "ligula ac bibendum. Aenean mollis felis a quam ornare, " +
            "quis volutpat felis dictum.";

    public static String Qualification_Data = "Lorem ipsum dolor sit amet, " +
            "consectetur adipiscing elit. Morbi congue tempor augue ut mattis. " +
            "Sed vel aliquet nibh. Nam ac nunc mi.";

    /*public static final Data[] datas =
            {
                    new Data("Warehouse Support Staffs", "Nyan.SDN.BHD" , "London" , "Part Time" , 10, Desc_data, SkillReq_Data , Qualification_Data),
                    new Data("Projects work coordinator", "Abu.SDN.BHD" , "Petaling Nyan" , "Full Time" , 20, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Sales Executive - Digital Marketing", "Ali.SDN.BHD" , "Kedah" , "Full Time" , 30, Desc_data ,  SkillReq_Data, Qualification_Data),
                    new Data("Administration clerk", "AbuNyan.SDN.BHD" , "France" , "Full Time" , 40, Desc_data ,  SkillReq_Data, Qualification_Data),
                    new Data("Admin", "AliNyan.SDN.BHD" , "Venezuale" , "Part Time" , 50, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Store Clerk", "NyanNyan.SDN.BHD" , "New York" , "Part Time" , 60, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Cat Manager", "Nyanicorn.SDN.BHD" , "Old York" , "Full Time" , 70, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Sales man", "NyanSenpai.SDN.BHD" , "Metro" , "Full Time" , 80, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Project man", "SenpaiSenpai.SDN.BHD" , "France" , "Part Time" , 90, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Staff", "NyanCorp.SDN.BHD" , "Arab Saudi" , "Full Time" , 100, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Warehouse Support Staffs", "Nyan.SDN.BHD" , "London" , "Part Time" , 110, Desc_data, SkillReq_Data , Qualification_Data),
                    new Data("Projects work coordinator", "Abu.SDN.BHD" , "Petaling Nyan" , "Full Time" , 120, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Sales Executive - Digital Marketing", "Ali.SDN.BHD" , "Kedah" , "Full Time" , 130, Desc_data ,  SkillReq_Data, Qualification_Data),
                    new Data("Administration clerk", "AbuNyan.SDN.BHD" , "France" , "Full Time" , 140, Desc_data ,  SkillReq_Data, Qualification_Data),
                    new Data("Admin", "AliNyan.SDN.BHD" , "Venezuale" , "Part Time" , 150, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Store Clerk", "NyanNyan.SDN.BHD" , "New York" , "Part Time" , 160, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Cat Manager", "Nyanicorn.SDN.BHD" , "Old York" , "Full Time" , 170, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Sales man", "NyanSenpai.SDN.BHD" , "Metro" , "Full Time" , 180, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Project man", "SenpaiSenpai.SDN.BHD" , "France" , "Part Time" , 190, Desc_data , SkillReq_Data, Qualification_Data),
                    new Data("Staff", "NyanCorp.SDN.BHD" , "Arab Saudi" , "Full Time" , 200, Desc_data , SkillReq_Data, Qualification_Data)

            };

    public static ArrayList<Data> getDatas() {

        ArrayList<Data> datasList = new ArrayList<Data>(Arrays.asList(datas));
        return datasList;

    }*/



    public static ArrayList<Data> getData() {
        ArrayList<Data> datas = new ArrayList<>();
        datas.add(new Data("Warehouse Support Staffs", "Nyan.SDN.BHD" , "London" , "Part Time" , 10, Data.Desc_data, Data.SkillReq_Data , Data.Qualification_Data));
        datas.add(new Data("Projects work coordinator", "Abu.SDN.BHD" , "Petaling Nyan" , "Full Time" , 20, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Sales Executive - Digital Marketing", "Ali.SDN.BHD" , "Kedah" , "Full Time" , 30, Data.Desc_data ,  Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Administration clerk", "AbuNyan.SDN.BHD" , "France" , "Full Time" , 40, Data.Desc_data ,  Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Admin", "AliNyan.SDN.BHD" , "Venezuale" , "Part Time" , 50, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Store Clerk", "NyanNyan.SDN.BHD" , "New York" , "Part Time" , 60, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Cat Manager", "Nyanicorn.SDN.BHD" , "Old York" , "Full Time" , 70, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Sales man", "NyanSenpai.SDN.BHD" , "Metro" , "Full Time" , 80, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Project man", "SenpaiSenpai.SDN.BHD" , "France" , "Part Time" , 90, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Staff", "NyanCorp.SDN.BHD" , "Arab Saudi" , "Full Time" , 100, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Warehouse Support Staffs", "Nyan.SDN.BHD" , "London" , "Part Time" , 110, Data.Desc_data, Data.SkillReq_Data , Data.Qualification_Data));
        datas.add(new Data("Projects work coordinator", "Abu.SDN.BHD" , "Petaling Nyan" , "Full Time" , 120, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Sales Executive - Digital Marketing", "Ali.SDN.BHD" , "Kedah" , "Full Time" , 130, Data.Desc_data ,  Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Administration clerk", "AbuNyan.SDN.BHD" , "France" , "Full Time" , 140, Data.Desc_data ,  Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Admin", "AliNyan.SDN.BHD" , "Venezuale" , "Part Time" , 150, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Store Clerk", "NyanNyan.SDN.BHD" , "New York" , "Part Time" , 160, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Cat Manager", "Nyanicorn.SDN.BHD" , "Old York" , "Full Time" , 170, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Sales man", "NyanSenpai.SDN.BHD" , "Metro" , "Full Time" , 180, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Project man", "SenpaiSenpai.SDN.BHD" , "France" , "Part Time" , 190, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));
        datas.add(new Data("Staff", "NyanCorp.SDN.BHD" , "Arab Saudi" , "Full Time" , 200, Data.Desc_data , Data.SkillReq_Data, Data.Qualification_Data));

        return datas;
    }


    public Data(String Title, String Company, String Location, String JobType, int salary, String Desc, String SkillReq , String Qual)
    {
        this.Title = Title;
        this.Company = Company;
        this.Description = Desc;
        this.Location = Location;
        this.JobType = JobType;
        this.SkillReq = SkillReq;
        this.Qual = Qual;
        this.Salary = salary;
    }


    public String getCompany()
    {
        return Company;
    }

    public String getTitle()
    {
        return Title;
    }

    public String getDesc()
    {
        return Description;
    }

    public String getLocation()
    {
        return Location;
    }

    public Integer getSalary() {
        return Salary;
    }

    public String getSkillReq()
    {
        return SkillReq;
    }

    public String getQualification()
    {
        return Qual;
    }

    public String getJobType()
    {
        return JobType;
    }


}

