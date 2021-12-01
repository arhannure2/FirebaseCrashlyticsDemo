package com.example.firebasecrashlytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.buttonForceCrash).setOnClickListener {
            testingFirebaseCrashlytics()
        }






    }

    private fun testingFirebaseCrashlytics()
    {
        //  https://firebase.google.com/docs/crashlytics/upgrade-sdk?platform=android
        ////////////////////////////////////////
//       testing log Events in Firebase Analytics
        ////////////////////////////////////////

        // OPTIONAL: If crash reporting has been explicitly disabled previously, add:
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        // Obtain the FirebaseAnalytics instance.
        firebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "ID")
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "NAME")
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image")
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle)


        val crashlytics = FirebaseCrashlytics.getInstance()
        crashlytics.log("my message")
        // To log a message to a crash report, use the following syntax:
        crashlytics.log("E/TAG: my message")
        //setBool, setDouble, setFloat, and setInt, setLong, and setString are aggregated into setCustomKey.
        crashlytics.setCustomKey("bool_key", true);
        crashlytics.setCustomKey("double_key", 42.0);
        crashlytics.setCustomKey("float_key", 42.0F);
        crashlytics.setCustomKey("int_key", 42);
        crashlytics.setCustomKey("long_key", 42L);
        crashlytics.setCustomKey("str_key", "42");
        //Firebase Crashlytics SDK
        // //setUserIdentifier is now setUserId. setUserName and setUserEmail are removed.
        crashlytics.setUserId("myAppUserId");

        //Crashlytics.logException(Throwable) is replaced by FirebaseCrashlytics.recordException(Throwable).

        try {
            /* Code that can throw checked
                exceptions. */

            // ...
        } catch (e: Exception) {
            FirebaseCrashlytics.getInstance().recordException(e)
        }


        ///The CrashlyticsListener is replaced by didCrashOnPreviousExecution().
        if (FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()) {
            // ...App code to execute if a crash occurred during previous execution.


        }

        ///The crash method is removed.
        throw  RuntimeException("Testing Crash reports ");
    }


}