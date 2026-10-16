package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.util.Log;
import com.google.android.libraries.assistant.appintegration.proto.NavigationState;
import com.google.android.libraries.assistant.appintegration.shared.util.EmptyActivityLifecycleCallbacks;
import com.google.d.b.aa;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class NavigationClientActivityLifecycleCallbacks extends EmptyActivityLifecycleCallbacks {
    private static final String MORRIS_NFC_DATA_SCHEME = "google.assistant.drivingmode";
    private static final String TAG = "NavClientActLifecycleCb";
    private final IAppIntegrationSessionCallbackStub callbackStub;
    private boolean isActivityResumed = false;
    private NavigationState navigationState = NavigationState.UNKNOWN;
    private final NfcAdapter nfcAdapter;
    private final PendingIntent nfcPendingIntent;
    private final IntentFilter[] nfcTagIntentFilters;

    public NavigationClientActivityLifecycleCallbacks(Context context, IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub) {
        this.callbackStub = iAppIntegrationSessionCallbackStub;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.nfcAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w(TAG, "NFC Unsupported.");
        }
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        intentFilter.addDataScheme(MORRIS_NFC_DATA_SCHEME);
        this.nfcTagIntentFilters = new IntentFilter[]{intentFilter};
        this.nfcPendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(), 67108864);
    }

    private boolean isRegisteredActivity(Activity activity) {
        IAppIntegrationSessionCallbackStub iAppIntegrationSessionCallbackStub = this.callbackStub;
        return iAppIntegrationSessionCallbackStub != null && iAppIntegrationSessionCallbackStub.getActivityOptional().f() && this.callbackStub.getActivityOptional().b() == activity;
    }

    private void maybeUpdateNfcForegroundDispatch() {
        NfcAdapter nfcAdapter = this.nfcAdapter;
        aa<Activity> activityOptional = this.callbackStub.getActivityOptional();
        if (nfcAdapter == null || !activityOptional.f() || !this.isActivityResumed) {
            Log.w(TAG, String.format("NOT qualified to enable/disable NFC foreground dispatch: nfcAdapter: %s, activityPresent: %b, activityResumed: %b", this.nfcAdapter, Boolean.valueOf(activityOptional.f()), Boolean.valueOf(this.isActivityResumed)));
        } else if (this.navigationState == NavigationState.GUIDED_NAVIGATION_IN_FOREGROUND) {
            Log.d(TAG, "enabling NFC foreground dispatch.");
            this.nfcAdapter.enableForegroundDispatch((Activity) activityOptional.b(), this.nfcPendingIntent, this.nfcTagIntentFilters, null);
        } else {
            Log.d(TAG, "disabling NFC foreground dispatch.");
            this.nfcAdapter.disableForegroundDispatch((Activity) activityOptional.b());
        }
    }

    public void notifyNavigationStateChanged(NavigationState navigationState) {
        this.navigationState = navigationState;
        maybeUpdateNfcForegroundDispatch();
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.util.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d(TAG, String.format("Activity paused: act: %s", activity));
        if (isRegisteredActivity(activity)) {
            this.isActivityResumed = false;
        }
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.util.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d(TAG, String.format("Activity resumed: act: %s", activity));
        if (isRegisteredActivity(activity)) {
            this.isActivityResumed = true;
            maybeUpdateNfcForegroundDispatch();
        }
    }
}
