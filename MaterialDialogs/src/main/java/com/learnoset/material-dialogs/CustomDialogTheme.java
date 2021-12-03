package com.learnoset.dialogs;

import android.graphics.Color;

public class CustomDialogTheme {

    private int waveColorOne;
    private int waveColorTwo;
    private int versionNameColor;
    private int dialogBackgroundColor;
    private int updateNowBtnColor;
    private int textColor;

    public CustomDialogTheme() {
        waveColorOne = 0;
        waveColorTwo = 0;
        versionNameColor = 0;
        dialogBackgroundColor = 0;
        updateNowBtnColor = 0;
        textColor = 0;
    }

    public CustomDialogTheme(int waveColorOne, int waveColorTwo, int versionNameColor, int dialogBackgroundColor, int updateNowBtnColor, int textColor) {
        this.waveColorOne = waveColorOne;
        this.waveColorTwo = waveColorTwo;
        this.versionNameColor = versionNameColor;
        this.dialogBackgroundColor = dialogBackgroundColor;
        this.updateNowBtnColor = updateNowBtnColor;
        this.textColor = textColor;
    }

    public int getWaveColorOne() {
        return waveColorOne;
    }

    public void setWaveColorOne(int waveColorOne) {
        this.waveColorOne = waveColorOne;
    }

    public void setWaveColorOne(com.learnoset.dialogs.AppUpdateDialog.DialogColors waveColorOne) {
        this.waveColorOne = Color.parseColor(getColorValue(waveColorOne));
    }

    public int getWaveColorTwo() {
        return waveColorTwo;
    }

    public void setWaveColorTwo(int waveColorTwo) {
        this.waveColorTwo = waveColorTwo;
    }

    public void setWaveColorTwo(com.learnoset.dialogs.AppUpdateDialog.DialogColors waveColorTwo) {
        this.waveColorTwo = Color.parseColor(getColorValue(waveColorTwo));
    }

    public int getVersionNameColor() {
        return versionNameColor;
    }

    public void setVersionNameColor(int versionNameColor) {
        this.versionNameColor = versionNameColor;
    }

    public void setVersionNameColor(com.learnoset.dialogs.AppUpdateDialog.DialogColors versionNameColor) {
        this.versionNameColor = Color.parseColor(getColorValue(versionNameColor));
    }

    public int getDialogBackgroundColor() {
        return dialogBackgroundColor;
    }

    public void setDialogBackgroundColor(int dialogBackgroundColor) {
        this.dialogBackgroundColor = dialogBackgroundColor;
    }

    public void setDialogBackgroundColor(com.learnoset.dialogs.AppUpdateDialog.DialogColors dialogBackgroundColor) {
        this.dialogBackgroundColor = Color.parseColor(getColorValue(dialogBackgroundColor));
    }

    public int getUpdateNowBtnColor() {
        return updateNowBtnColor;
    }

    public void setUpdateNowBtnColor(int updateNowBtnColor) {
        this.updateNowBtnColor = updateNowBtnColor;
    }

    public void setUpdateNowBtnColor(com.learnoset.dialogs.AppUpdateDialog.DialogColors updateNowBtnColor) {
        this.updateNowBtnColor = Color.parseColor(getColorValue(updateNowBtnColor));
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setTextColor(com.learnoset.dialogs.AppUpdateDialog.DialogColors textColor) {
        this.textColor = Color.parseColor(getColorValue(textColor));
    }

    private String getColorValue(com.learnoset.dialogs.AppUpdateDialog.DialogColors navColor) {

        String selectedColorValue = "";

        if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.RED) {
            selectedColorValue = "#FFFF1744";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.BLACK) {
            selectedColorValue = "#000000";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.GRAY) {
            selectedColorValue = "#998A8A8A";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.ORANGE) {
            selectedColorValue = "#FF9100";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.WHITE) {
            selectedColorValue = "#FFFFFF";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.YELLOW) {
            selectedColorValue = "#FFEA00";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.DARK_RED) {
            selectedColorValue = "#FFD50000";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.LIGHT_RED) {
            selectedColorValue = "#FFFF8A80";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.DARK_ORANGE) {
            selectedColorValue = "#FFFF6D00";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.LIGHT_ORANGE) {
            selectedColorValue = "#FFFFD180";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.BLUE) {
            selectedColorValue = "#FF00B0FF";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.DARK_BLUE) {
            selectedColorValue = "#FF0091EA";
        } else if (navColor == com.learnoset.dialogs.AppUpdateDialog.DialogColors.LIGHT_BLUE) {
            selectedColorValue = "#FF80D8FF";
        }

        return selectedColorValue;
    }

}
