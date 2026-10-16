package androidx.credentials.playservices.controllers.identityauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleCredentialFlow(String str) {
        HiddenActivity hiddenActivity;
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (pendingIntent == null) {
            setupPendingIntentFailureByType(str);
            return;
        }
        try {
            this.mWaitingForActivityResult = true;
            hiddenActivity = this;
            try {
                hiddenActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                hiddenActivity.setupIntentSenderFailureByType(str, e);
            }
        } catch (IntentSender.SendIntentException e3) {
            e = e3;
            hiddenActivity = this;
        }
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    private final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        CredentialProviderBaseController.Companion.reportError$credentials_play_services_auth(resultReceiver, str, str2);
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final void setupIntentSenderFailureByType(String str, IntentSender.SendIntentException sendIntentException) {
        switch (str.hashCode()) {
            case -441061071:
                if (str.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    x.c(resultReceiver);
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During begin sign in, one tap ui intent sender failure: ".concat(String.valueOf(sendIntentException.getMessage())));
                    break;
                }
                break;
            case 15545322:
                if (str.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    x.c(resultReceiver2);
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: ".concat(String.valueOf(sendIntentException.getMessage())));
                    break;
                }
                break;
            case 1246634622:
                if (str.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    x.c(resultReceiver3);
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: ".concat(String.valueOf(sendIntentException.getMessage())));
                    break;
                }
                break;
            case 1980564212:
                if (str.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    x.c(resultReceiver4);
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "During get sign-in intent, one tap ui intent sender failure: ".concat(String.valueOf(sendIntentException.getMessage())));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final void setupPendingIntentFailureByType(String str) {
        switch (str.hashCode()) {
            case -441061071:
                if (str.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                    ResultReceiver resultReceiver = this.resultReceiver;
                    x.c(resultReceiver);
                    setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the begin sign in operation");
                    break;
                }
                break;
            case 15545322:
                if (str.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                    ResultReceiver resultReceiver2 = this.resultReceiver;
                    x.c(resultReceiver2);
                    setupFailure(resultReceiver2, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during public key credential creation");
                    break;
                }
                break;
            case 1246634622:
                if (str.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                    ResultReceiver resultReceiver3 = this.resultReceiver;
                    x.c(resultReceiver3);
                    setupFailure(resultReceiver3, CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during password creation");
                    break;
                }
                break;
            case 1980564212:
                if (str.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                    ResultReceiver resultReceiver4 = this.resultReceiver;
                    x.c(resultReceiver4);
                    setupFailure(resultReceiver4, CredentialProviderBaseController.GET_UNKNOWN, "internal error during the sign-in intent operation");
                    break;
                }
                break;
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.Companion.reportResult$credentials_play_services_auth(resultReceiver, i2, i3, intent);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            handleCredentialFlow(stringExtra);
        } else {
            Log.w(TAG, "Activity handed an unsupported type");
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        x.f(bundle, "outState");
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
