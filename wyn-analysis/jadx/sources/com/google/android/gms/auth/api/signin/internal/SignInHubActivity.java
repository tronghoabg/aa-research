package com.google.android.gms.auth.api.signin.internal;

import E4.F;
import J1.a;
import J1.b;
import J1.c;
import J1.d;
import ad.L;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import b7.k;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import java.lang.reflect.Modifier;
import java.util.Set;
import x.C4430w;

@KeepName
/* loaded from: classes3.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f26413g = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26414b = false;

    /* renamed from: c, reason: collision with root package name */
    public SignInConfiguration f26415c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26416d;

    /* renamed from: e, reason: collision with root package name */
    public int f26417e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f26418f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.v, java.lang.Object] */
    public final void C() {
        a supportLoaderManager = getSupportLoaderManager();
        L l10 = new L(this, 1);
        d dVar = (d) supportLoaderManager;
        c cVar = dVar.f5541b;
        if (cVar.f5539c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C4430w c4430w = cVar.f5538b;
        b bVar = (b) c4430w.c(0);
        ?? r02 = dVar.f5540a;
        if (bVar == 0) {
            try {
                cVar.f5539c = true;
                Set set = o.f26564a;
                synchronized (set) {
                }
                b7.d dVar2 = new b7.d(this, set);
                if (b7.d.class.isMemberClass() && !Modifier.isStatic(b7.d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar2);
                }
                b bVar2 = new b(dVar2);
                c4430w.d(0, bVar2);
                cVar.f5539c = false;
                F f10 = new F(bVar2.f5534l, l10);
                bVar2.d(r02, f10);
                F f11 = bVar2.f5536n;
                if (f11 != null) {
                    bVar2.i(f11);
                }
                bVar2.f5535m = r02;
                bVar2.f5536n = f10;
            } catch (Throwable th) {
                cVar.f5539c = false;
                throw th;
            }
        } else {
            F f12 = new F(bVar.f5534l, l10);
            bVar.d(r02, f12);
            F f13 = bVar.f5536n;
            if (f13 != null) {
                bVar.i(f13);
            }
            bVar.f5535m = r02;
            bVar.f5536n = f12;
        }
        f26413g = false;
    }

    public final void D(int i5) {
        Status status = new Status(i5, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f26413g = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f26414b) {
            return;
        }
        setResult(0);
        if (i5 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f26409b) != null) {
                k kVarI = k.I(this);
                GoogleSignInOptions googleSignInOptions = this.f26415c.f26412b;
                synchronized (kVarI) {
                    ((b7.b) kVarI.f19396b).c(googleSignInAccount, googleSignInOptions);
                    kVarI.f19397c = googleSignInAccount;
                    kVarI.f19398d = googleSignInOptions;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f26416d = true;
                this.f26417e = i10;
                this.f26418f = intent;
                C();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                D(intExtra);
                return;
            }
        }
        D(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            D(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f26415c = signInConfiguration;
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
            this.f26416d = z2;
            if (z2) {
                this.f26417e = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f26418f = intent2;
                C();
                return;
            }
            return;
        }
        if (f26413g) {
            setResult(0);
            D(12502);
            return;
        }
        f26413g = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f26415c);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f26414b = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            D(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f26413g = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f26416d);
        if (this.f26416d) {
            bundle.putInt("signInResultCode", this.f26417e);
            bundle.putParcelable("signInResultData", this.f26418f);
        }
    }
}
