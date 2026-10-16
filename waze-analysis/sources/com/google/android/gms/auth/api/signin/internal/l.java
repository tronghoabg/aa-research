package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static l f4628b;

    /* renamed from: a, reason: collision with root package name */
    final q f4629a;

    private l(Context context) {
        q qVarC = q.c(context);
        this.f4629a = qVarC;
        qVarC.a();
        qVarC.b();
    }

    public static synchronized l a(Context context) {
        return d(context.getApplicationContext());
    }

    private static synchronized l d(Context context) {
        l lVar = f4628b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        f4628b = lVar2;
        return lVar2;
    }

    public final synchronized void b() {
        this.f4629a.e();
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f4629a.f(googleSignInAccount, googleSignInOptions);
    }
}
