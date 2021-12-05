
# Best Material UI design Library for Android Studio

![](https://learnoset.com/GitHubImages/custom-navigation-drawer-in-android-stu.png)


Learnoset Material Dialogs is a powerful library for Android Studio that consist of
<ul>
<a href = "#update_dialog"><li>Custom Update Available Dialog</li></a>
<a href = "#rate_us_dialog"><li>Custom Rate Us Dialog</li></a>
</ul>
<br>

<h3>Why use Learnoset Material Dialogs Library</h3>
<ul>
<li>
  Easy to Use 
 </li>
  <li>
  Don't need to right lengthy code
 </li>  
  <li>
  Easy to implement
 </li>
  <li>
  Responsive Designs
 </li>
  <li>
  Modern Designs
 </li> 
</ul>
<br><br>
<h3>How to add Learnoset Material Dialogs library to your Project?</h3>
1. Add below line in your module level build.gradle file

```groovy
implementation 'com.github.learnoset:material-dialogs:1.7'
```

<br>

2. Add below line in your project level build.gradle file

```groovy
allprojects {
    repositories {
        google()
        jcenter()
        
        // add below line
        maven {url 'https://jitpack.io' }
    }
}
```

<br>

<h3 id = "update_dialog">How to use Custom Update Available Dialog in Android Studio</h3>

<br>

1. Add below code in the XML file

```java
// Creating Dialog
AppUpdateDialog appUpdateDialog = new AppUpdateDialog(context, "V1.6");
appUpdateDialog.setCancelable(false);

// adding update features
appUpdateDialog.addUpdateFeature("Bugs Fixed");
appUpdateDialog.addUpdateFeature("Design Improvements");
appUpdateDialog.addUpdateFeature("New Functionalities");
appUpdateDialog.addUpdateFeature("More Update Features");

// show dialog
appUpdateDialog.show();

// listen for update button click
appUpdateDialog.setUpdateBtnClickListener(new UpdateBtnClickListener() {
    @Override
    public void onClick() {
      // handle click event here
    }
});
                
```

2. Using Themes with Custom Update Available Dialog

```java
appUpdateDialog.setDialogTheme(AppUpdateDialog.DialogTheme.LIGHT);
// OR
appUpdateDialog.setDialogTheme(AppUpdateDialog.DialogTheme.DARK);
// OR USING CUSTOM THEME
CustomDialogTheme customDialogTheme = new CustomDialogTheme();
customDialogTheme.setDialogBackgroundColor(Color.RED); // setting custom dialog background color
customDialogTheme.setTextColor(Color.BLACK); // text colors
customDialogTheme.setUpdateAvailableTxtColor(Color.BLACK); // setting NEW UPDATE AVAILABLE text color
customDialogTheme.setUpdateNowBtnColor(Color.BLUE); // setting Update Now button color
customDialogTheme.setWaveColorOne(Color.BLUE); // setting wave one color
customDialogTheme.setWaveColorTwo(Color.BLUE); // setting wave two  color
customDialogTheme.setVersionNameColor(Color.WHITE); // setting version name text color

appUpdateDialog.setDialogTheme(customDialogTheme);

// show dialog after setting theme
appUpdateDialog.show();
```

<br>


You can Visit our Website to learn more about Android App Development, Java, Python, JavaScript, Artificial Intelligence<br>
[Learnoset Website](https://learnoset.com/)

<br>
We provide source code for Login & Register pages, Custom Dialogs, Custom Navigation Bar, Custom Toolbar, Custom Bottom Bar with material UI design and complete project files
