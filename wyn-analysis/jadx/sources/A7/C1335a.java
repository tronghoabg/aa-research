package a7;

import android.content.Context;
import android.content.Intent;
import b7.h;
import b7.j;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C1711z;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import h7.C2793a;
import r7.C3934d;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1335a extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final C1339e f17390a = new C1339e();

    /* renamed from: b, reason: collision with root package name */
    public static int f17391b = 1;

    public final Intent c() {
        Context applicationContext = getApplicationContext();
        int iE = e();
        int i5 = iE - 1;
        if (iE == 0) {
            throw null;
        }
        if (i5 == 2) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) getApiOptions();
            j.f19392a.a("getFallbackSignInIntent()", new Object[0]);
            Intent intentA = j.a(applicationContext, googleSignInOptions);
            intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return intentA;
        }
        if (i5 == 3) {
            return j.a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        GoogleSignInOptions googleSignInOptions2 = (GoogleSignInOptions) getApiOptions();
        j.f19392a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentA2 = j.a(applicationContext, googleSignInOptions2);
        intentA2.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentA2;
    }

    public final Task d() {
        BasePendingResult basePendingResultDoWrite;
        o oVarAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        int i5 = 1;
        boolean z2 = e() == 3;
        j.f19392a.a("Revoking access", new Object[0]);
        String strD = b7.b.a(applicationContext).d("refreshToken");
        j.b(applicationContext);
        if (!z2) {
            basePendingResultDoWrite = ((J) oVarAsGoogleApiClient).f26468b.doWrite((l) new h(oVarAsGoogleApiClient, i5));
        } else if (strD == null) {
            C2793a c2793a = b7.c.f19373c;
            Status status = new Status(4, null, null, null);
            AbstractC1732v.a("Status code must not be SUCCESS", !status.V());
            basePendingResultDoWrite = new z(status);
            basePendingResultDoWrite.setResult((BasePendingResult) status);
        } else {
            b7.c cVar = new b7.c(strD);
            new Thread(cVar).start();
            basePendingResultDoWrite = cVar.f19375b;
        }
        return AbstractC1732v.o(basePendingResultDoWrite, new ae.d(2));
    }

    public final synchronized int e() {
        int i5;
        try {
            i5 = f17391b;
            if (i5 == 1) {
                Context applicationContext = getApplicationContext();
                d7.e eVar = d7.e.f34127d;
                int iD = eVar.d(applicationContext, 12451000);
                if (iD == 0) {
                    i5 = 4;
                    f17391b = 4;
                } else if (eVar.b(applicationContext, iD, null) != null || C3934d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i5 = 2;
                    f17391b = 2;
                } else {
                    i5 = 3;
                    f17391b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i5;
    }

    public final Task signOut() {
        BasePendingResult basePendingResultDoWrite;
        o oVarAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        boolean z2 = e() == 3;
        j.f19392a.a("Signing out", new Object[0]);
        j.b(applicationContext);
        if (z2) {
            Status status = Status.f26424e;
            basePendingResultDoWrite = new C1711z(oVarAsGoogleApiClient, 0);
            basePendingResultDoWrite.setResult((BasePendingResult) status);
        } else {
            basePendingResultDoWrite = ((J) oVarAsGoogleApiClient).f26468b.doWrite((l) new h(oVarAsGoogleApiClient, 0));
        }
        return AbstractC1732v.o(basePendingResultDoWrite, new ae.d(2));
    }
}
