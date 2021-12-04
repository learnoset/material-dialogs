package com.learnoset.materialdialogs;

import android.graphics.Color;

public class CustomDialogTheme {

    private int waveColorOne;
    private int waveColorTwo;
    private int versionNameColor;
    private int dialogBackgroundColor;
    private int updateNowBtnColor;
    private int textColor;
    private int updateAvailableTxtColor;

    public CustomDialogTheme() {
        waveColorOne = 0;
        waveColorTwo = 0;
        versionNameColor = 0;
        dialogBackgroundColor = 0;
        updateNowBtnColor = 0;
        textColor = 0;
        updateAvailableTxtColor = 0;
    }

    public CustomDialogTheme(int waveColorOne, int waveColorTwo, int versionNameColor, int dialogBackgroundColor, int updateNowBtnColor, int textColor, int updateAvailableTxtColor) {
        this.waveColorOne = waveColorOne;
        this.waveColorTwo = waveColorTwo;
        this.versionNameColor = versionNameColor;
        this.dialogBackgroundColor = dialogBackgroundColor;
        this.updateNowBtnColor = updateNowBtnColor;
        this.textColor = textColor;
        this.updateAvailableTxtColor = updateAvailableTxtColor;
    }

    public int getWaveColorOne() {
        return waveColorOne;
    }

    public void setWaveColorOne(int waveColorOne) {
        this.waveColorOne = waveColorOne;
    }

    public void setWaveColorOne(AppUpdateDialog.DialogColors waveColorOne) {
        this.waveColorOne = Color.parseColor(getColorValue(waveColorOne));
    }

    public int getWaveColorTwo() {
        return waveColorTwo;
    }

    public void setWaveColorTwo(int waveColorTwo) {
        this.waveColorTwo = waveColorTwo;
    }

    public void setWaveColorTwo(AppUpdateDialog.DialogColors waveColorTwo) {
        this.waveColorTwo = Color.parseColor(getColorValue(waveColorTwo));
    }

    public int getVersionNameColor() {
        return versionNameColor;
    }

    public void setVersionNameColor(int versionNameColor) {
        this.versionNameColor = versionNameColor;
    }

    public void setVersionNameColor(AppUpdateDialog.DialogColors versionNameColor) {
        this.versionNameColor = Color.parseColor(getColorValue(versionNameColor));
    }

    public int getDialogBackgroundColor() {
        return dialogBackgroundColor;
    }

    public void setDialogBackgroundColor(int dialogBackgroundColor) {
        this.dialogBackgroundColor = dialogBackgroundColor;
    }

    public void setDialogBackgroundColor(AppUpdateDialog.DialogColors dialogBackgroundColor) {
        this.dialogBackgroundColor = Color.parseColor(getColorValue(dialogBackgroundColor));
    }

    public int getUpdateNowBtnColor() {
        return updateNowBtnColor;
    }

    public void setUpdateNowBtnColor(int updateNowBtnColor) {
        this.updateNowBtnColor = updateNowBtnColor;
    }

    public void setUpdateNowBtnColor(AppUpdateDialog.DialogColors updateNowBtnColor) {
        this.updateNowBtnColor = Color.parseColor(getColorValue(updateNowBtnColor));
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setTextColor(AppUpdateDialog.DialogColors textColor) {
        this.textColor = Color.parseColor(getColorValue(textColor));
    }

    public int getUpdateAvailableTxtColor() {
        return updateAvailableTxtColor;
    }

    public void setUpdateAvailableTxtColor(int updateAvailableTxtColor) {
        this.updateAvailableTxtColor = updateAvailableTxtColor;
    }

    public void setUpdateAvailableTxtColor(AppUpdateDialog.DialogColors updateAvailableTxtColor) {
        this.updateAvailableTxtColor = Color.parseColor(getColorValue(updateAvailableTxtColor));
    }

    private String getColorValue(AppUpdateDialog.DialogColors navColor) {

        String selectedColorValue = "";

        if (navColor == AppUpdateDialog.DialogColors.RED) {
            selectedColorValue = "#FFFF1744";
        } else if (navColor == AppUpdateDialog.DialogColors.BLACK) {
            selectedColorValue = "#000000";
        } else if (navColor == AppUpdateDialog.DialogColors.GRAY) {
            selectedColorValue = "#998A8A8A";
        } else if (navColor == AppUpdateDialog.DialogColors.ORANGE) {
            selectedColorValue = "#FF9100";
        } else if (navColor == AppUpdateDialog.DialogColors.WHITE) {
            selectedColorValue = "#FFFFFF";
        } else if (navColor == AppUpdateDialog.DialogColors.YELLOW) {
            selectedColorValue = "#FFEA00";
        } else if (navColor == AppUpdateDialog.DialogColors.DARK_RED) {
            selectedColorValue = "#FFD50000";
        } else if (navColor == AppUpdateDialog.DialogColors.LIGHT_RED) {
            selectedColorValue = "#FFFF8A80";
        } else if (navColor == AppUpdateDialog.DialogColors.DARK_ORANGE) {
            selectedColorValue = "#FFFF6D00";
        } else if (navColor == AppUpdateDialog.DialogColors.LIGHT_ORANGE) {
            selectedColorValue = "#FFFFD180";
        } else if (navColor == AppUpdateDialog.DialogColors.BLUE) {
            selectedColorValue = "#FF00B0FF";
        } else if (navColor == AppUpdateDialog.DialogColors.DARK_BLUE) {
            selectedColorValue = "#FF0091EA";
        } else if (navColor == AppUpdateDialog.DialogColors.LIGHT_BLUE) {
            selectedColorValue = "#FF80D8FF";
        }

        return selectedColorValue;
    }

}
