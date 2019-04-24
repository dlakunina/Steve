package com.javacore.steve.profile;

import com.javacore.steve.common.Canvas;
import com.javacore.steve.common.CompositeView;


public class ProfileView extends CompositeView {
    @Override
    public void draw() {
        System.out.println("Criminal profile view ");
        System.out.println("ID: " + ((ProfileModel) model).getId());
        System.out.println("Name: " + ((ProfileModel) model).getName());
        System.out.println("Active: " + ((ProfileModel) model).isActive());
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw();
        canvas.drawText("Criminal profile view ");
        canvas.drawText("ID: " + ((ProfileModel) model).getId());
        canvas.drawText("Name: " + ((ProfileModel) model).getName());
        canvas.drawText("Active: " + ((ProfileModel) model).isActive());
        //canvas.drawText("");
    }

    public void init() {
        ProfilePhotoView photoView = new ProfilePhotoView(30, 20, 10);
        addChildView(photoView);
    }


}
