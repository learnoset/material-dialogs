package com.learnoset.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppUpdateDialog extends Dialog {

    private final Context context;
    private final String versionNameTxt;
    private final List<String> updateDetailsLists = new ArrayList<>();
    private UpdateBtnClickListener updateBtnClickListener;

    private int waveColorOne;
    private int waveColorTwo;
    private int versionNameColor;
    private int dialogBackgroundColor;
    private int updateNowBtnColor;
    private int textColor;
    private int updateAvailableTxtColor;

    private ImageView waveImageOne, waveImageTwo;
    private ImageView rocketIcon;
    private AppCompatButton updateNowBtn;
    private TextView versionName;
    private LinearLayout dialogBackground;
    private TextView updateAvailableTxt;

    private boolean rocketShowing = true;

    private UpdateDetailsAdapter updateDetailsAdapter;
    private boolean dialogShowing = false;

    public AppUpdateDialog(@NonNull Context context, String versionName) {
        super(context);
        this.context = context;
        this.versionNameTxt = versionName;

        waveColorOne = Color.parseColor("#FFD748");
        waveColorTwo = Color.parseColor("#F1CB44");
        versionNameColor = Color.parseColor("#F65555");
        dialogBackgroundColor = Color.parseColor("#FFFFFF");
        updateNowBtnColor = Color.parseColor("#F65555");
        textColor = Color.parseColor("#99000000");
        updateAvailableTxtColor = Color.parseColor("#CC000000");

    }

    public void showRocketIcon(boolean showRocketIcon) {
        rocketShowing = showRocketIcon;

        if (dialogShowing) {
            refreshDialog();
        }
    }

    public void setDialogTheme(DialogTheme dialogTheme) {
        if (dialogTheme == DialogTheme.DARK) {
            waveColorOne = Color.parseColor("#AA00FF");
            waveColorTwo = Color.parseColor("#6D00A3");
            versionNameColor = Color.parseColor("#F65555");
            dialogBackgroundColor = Color.parseColor("#0C243C");
            updateNowBtnColor = Color.parseColor("#F65555");
            textColor = Color.parseColor("#99FFFFFF");
            updateAvailableTxtColor = Color.parseColor("#CCFFFFFF");
        } else {
            waveColorOne = Color.parseColor("#FFD748");
            waveColorTwo = Color.parseColor("#F1CB44");
            versionNameColor = Color.parseColor("#F65555");
            dialogBackgroundColor = Color.parseColor("#FFFFFF");
            updateNowBtnColor = Color.parseColor("#F65555");
            textColor = Color.parseColor("#99000000");
            updateAvailableTxtColor = Color.parseColor("#CC000000");
        }

        if (dialogShowing) {
            refreshDialog();
        }
    }

    public void setDialogTheme(CustomDialogTheme customDialogTheme) {

        if (customDialogTheme.getWaveColorOne() != 0) {
            waveColorOne = Color.parseColor("#AA00FF");
        }
        if (customDialogTheme.getWaveColorTwo() != 0) {
            waveColorTwo = Color.parseColor("#6D00A3");
        }
        if (customDialogTheme.getVersionNameColor() != 0) {
            versionNameColor = Color.parseColor("#F65555");
        }
        if (customDialogTheme.getDialogBackgroundColor() != 0) {
            dialogBackgroundColor = Color.parseColor("#FFFFFF");
        }
        if (customDialogTheme.getUpdateNowBtnColor() != 0) {
            updateNowBtnColor = Color.parseColor("#F65555");
        }
        if (customDialogTheme.getTextColor() != 0) {
            textColor = Color.parseColor("#99000000");
        }

        if(customDialogTheme.getUpdateAvailableTxtColor() != 0){
            updateAvailableTxtColor = customDialogTheme.getUpdateAvailableTxtColor();
        }

        if (dialogShowing) {
            refreshDialog();
        }
    }

    public void setUpdateBtnClickListener(UpdateBtnClickListener updateBtnClickListener) {
        this.updateBtnClickListener = updateBtnClickListener;
    }

    public void addUpdateFeature(String newUpdateFeature) {
        updateDetailsLists.add(newUpdateFeature);
    }

    public void addUpdateFeatures(String[] newUpdateFeature) {
        updateDetailsLists.addAll(Arrays.asList(newUpdateFeature));
    }

    public void addUpdateFeatures(List<String> updateDetailsLists) {
        this.updateDetailsLists.addAll(updateDetailsLists);
    }

    public void removeFeature(int position) {
        updateDetailsLists.remove(position);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(android.R.color.transparent)));
        setContentView(R.layout.update_dialog_layout);

        final RecyclerView updateDetails = findViewById(R.id.updateDetailsRecyclerView);
        updateNowBtn = findViewById(R.id.updateNowBtn);
        versionName = findViewById(R.id.updateVersionName);
        rocketIcon = findViewById(R.id.rocketIcon);
        waveImageOne = findViewById(R.id.waveImageOne);
        waveImageTwo = findViewById(R.id.waveImageTwo);

        dialogBackground = findViewById(R.id.dialogBackground);

        versionName.setText(versionNameTxt);

        updateDetailsAdapter = new UpdateDetailsAdapter(updateDetailsLists);
        updateDetailsAdapter.setTextColor(textColor);

        updateDetails.setAdapter(updateDetailsAdapter);

        updateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBtnClickListener.onClick();
            }
        });

        dialogShowing = true;
        refreshDialog();
    }

    private void refreshDialog() {

        DrawableCompat.setTint(waveImageOne.getDrawable(), waveColorOne);
        DrawableCompat.setTint(waveImageTwo.getDrawable(), waveColorTwo);
        versionName.setTextColor(versionNameColor);
        updateNowBtn.setBackgroundDrawable(generateRoundBack(updateNowBtnColor));
        dialogBackground.setBackgroundColor(dialogBackgroundColor);
        updateDetailsAdapter.reloadRecyclerView(textColor, updateDetailsLists);
        updateAvailableTxt.setTextColor(updateAvailableTxtColor);
        
        if (rocketShowing) {
            rocketIcon.setVisibility(View.VISIBLE);
        } else {
            rocketIcon.setVisibility(View.GONE);
        }
    }

    private Drawable generateRoundBack(int color) {

        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setShape(GradientDrawable.RECTANGLE);
        drawable.setCornerRadius(1000f);

        return drawable;
    }

    public enum DialogTheme {
        DARK,
        LIGHT
    }

    public enum DialogColors {
        DEFAULT,
        GRAY,
        RED,
        DARK_RED,
        LIGHT_RED,
        BLACK,
        WHITE,
        ORANGE,
        DARK_ORANGE,
        LIGHT_ORANGE,
        YELLOW,
        BLUE,
        LIGHT_BLUE,
        DARK_BLUE
    }

}
