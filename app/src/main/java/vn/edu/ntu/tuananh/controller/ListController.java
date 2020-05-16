package vn.edu.ntu.tuananh.controller;

import android.app.Application;

import java.util.ArrayList;

import vn.edu.ntu.tuananh.model.ListCustom;

public class ListController extends Application implements controller{
    ArrayList<ListCustom> listControllers =new ArrayList<>();
    public ListController(){
        listControllers.add(new ListCustom("Thu Cúc","30/4/1990","090123789"));
        listControllers.add(new ListCustom("Thu Đú","8/3/1991","090123456"));
        listControllers.add(new ListCustom("Thu Tiền","30/4/1990","090123789"));
        listControllers.add(new ListCustom("Minh Thảo","8/3/1999","123456789"));
        listControllers.add(new ListCustom("Thu Tiền","30/4/1990","090123789"));
        listControllers.add(new ListCustom("Xuân Huy","27/12/1999","0924740562"));


    }

    @Override
    public ArrayList<ListCustom> getListCustom() {
        return listControllers;
    }
}
