## Google Firebase  Crashlytics & Analytics Demo Application
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
