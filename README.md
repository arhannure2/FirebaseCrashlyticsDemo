## Google Firebase  Crashlytics & Analytics Demo Application
____________________
Screenshot notes :
1) Waiting for first crash report to happen after setup in application
2) First crash found with date and counts ( how many times its crashed )
3) Crash Event Summary ( Here we will get File name , line number in code , and crash report along with its reason )
4) Verify crash Event in our code
5) Crash Event Summary Date ( details regarding device )
____________________
### 1) Waiting for first crash report to happen after setup in application
<img src="https://user-images.githubusercontent.com/57435729/144242667-10c2100a-e510-4c2f-9a33-644e45682c58.jpg" width="400" height="100">

### 2) First crash found with date and counts ( how many times its crashed )

<img src="https://user-images.githubusercontent.com/57435729/144242678-1b8ac455-0ba9-4c5a-8ad9-c60d6adf1610.jpg" width="400" height="100">

### 3) Crash Event Summary ( Here we will get File name , line number in code , and crash report along with its reason )

<img src="https://user-images.githubusercontent.com/57435729/144242684-96115638-0283-404b-87b2-a1adf23f2505.jpg" width="400" height="100">

### 4) Verify crash Event in our code

<img src="https://user-images.githubusercontent.com/57435729/144242695-191c98e8-325d-4f25-94d6-66db54476d69.jpg" width="400" height="100">

### 5) Crash Event Summary Date ( details regarding device )

<img src="https://user-images.githubusercontent.com/57435729/144242700-62566715-8a1a-4fcb-8c13-9f6cb281a999.jpg" width="400" height="100">

____________________
### [Before you begin]
### Sign into Firebase using your Google account
Option 1 ( Recommended ) : Add Firebase using the Firebase console.\
Step 1: Create a Firebase project.\
Step 2: Register your app with Firebase.\
Registering your app is often called "adding" your app to your project.\
Step 3: Add a Firebase configuration file.\
Step 4: Add Firebase SDKs to your app.

Option 2: Add Firebase using the Firebase Assistant
(may require additional configuration)
____________________
### After you begin :
Step 1: Enable Crashlytics in the Firebase console\
Step 2: Add the Firebase Crashlytics SDK to your app\
Step 3: Add the Firebase Crashlytics plugin to your app\
Step 4: Force a test crash to finish setup

____________________
# Test your Crashlytics implementation:
### Force a crash to test your implementation

1) Force the test crash in order to send your app's first crash report:
    a) Open your app from your test device or emulator.
    b) In your app, press the "Test Crash" button that you added using the code above.
    c) After your app crashes, restart it so that your app can send the crash report to Firebase.
2) Go to the Crashlytics dashboard of the Firebase console to see your test crash.
If you've refreshed the console and you're still not seeing the test crash after five minutes, try enabling debug logging

____________________
## **Conclusion :**

And that's it! Crashlytics is now monitoring your app for crashes, non-fatal errors, and ANRs. Visit the Crashlytics dashboard to view and investigate all your reports and statistics.
____________________
### **Reference:**

[Google Firebase Crashlytics ](https://firebase.google.com/docs/crashlytics/get-started?platform=android) ,
[Firebase Setup ](https://firebase.google.com/docs/android/setup) and 
[Test your Crashlytics implementation ](https://firebase.google.com/docs/crashlytics/test-implementation?platform=android&authuser=0)
