package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.av;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleCompat;
import androidx.loader.app.LoaderManager;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SignInHubActivity extends av {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4609f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4610g = false;

    /* renamed from: h, reason: collision with root package name */
    private SignInConfiguration f4611h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4612i;

    /* renamed from: j, reason: collision with root package name */
    private int f4613j;

    /* renamed from: k, reason: collision with root package name */
    private Intent f4614k;

    private final void f() {
        LoaderManager.getInstance(this).initLoader(0, null, new p(this));
        f4609f = false;
    }

    private final void g(int i2) {
        Status status = new Status(i2);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f4609f = false;
    }

    private final void h(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f4611h);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f4610g = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            g(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f4610g) {
            return;
        }
        setResult(0);
        if (i2 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) IntentCompat.getParcelableExtra(intent, "signInAccount", SignInAccount.class);
            if (signInAccount != null && signInAccount.a() != null) {
                GoogleSignInAccount googleSignInAccountA = signInAccount.a();
                if (googleSignInAccountA == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    g(12500);
                    return;
                }
                l.a(this).c(this.f4611h.a(), googleSignInAccountA);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountA);
                this.f4612i = true;
                this.f4613j = i3;
                this.f4614k = intent;
                f();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                g(intExtra);
                return;
            }
        }
        g(8);
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            g(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            g(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) BundleCompat.getParcelable(bundleExtra, "config", SignInConfiguration.class);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f4611h = signInConfiguration;
        if (bundle == null) {
            if (f4609f) {
                setResult(0);
                g(12502);
                return;
            } else {
                f4609f = true;
                h(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.f4612i = z;
        if (z) {
            this.f4613j = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) BundleCompat.getParcelable(bundle, "signInResultData", Intent.class);
            if (intent2 != null) {
                this.f4614k = intent2;
                f();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // android.support.v4.app.av, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f4609f = false;
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f4612i);
        if (this.f4612i) {
            bundle.putInt("signInResultCode", this.f4613j);
            bundle.putParcelable("signInResultData", this.f4614k);
        }
    }
}
