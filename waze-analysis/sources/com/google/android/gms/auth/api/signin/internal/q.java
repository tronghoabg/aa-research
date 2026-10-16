package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.av;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Lock f4632a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private static q f4633b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f4634c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f4635d;

    q(Context context) {
        this.f4635d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static q c(Context context) {
        av.m(context);
        Lock lock = f4632a;
        lock.lock();
        try {
            q qVar = f4633b;
            if (qVar == null) {
                qVar = new q(context.getApplicationContext());
                f4633b = qVar;
            }
            lock.unlock();
            return qVar;
        } catch (Throwable th) {
            f4632a.unlock();
            throw th;
        }
    }

    private static final String h(String str, String str2) {
        return str + ":" + str2;
    }

    public final GoogleSignInAccount a() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strD2) && (strD = d(h("googleSignInAccount", strD2))) != null) {
            try {
                return GoogleSignInAccount.b(strD);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions b() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strD2) && (strD = d(h("googleSignInOptions", strD2))) != null) {
            try {
                return GoogleSignInOptions.b(strD);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String d(String str) {
        this.f4634c.lock();
        try {
            return this.f4635d.getString(str, null);
        } finally {
            this.f4634c.unlock();
        }
    }

    public final void e() {
        this.f4634c.lock();
        try {
            this.f4635d.edit().clear().apply();
        } finally {
            this.f4634c.unlock();
        }
    }

    public final void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        av.m(googleSignInOptions);
        g("defaultGoogleSignInAccount", googleSignInAccount.c());
        av.m(googleSignInOptions);
        String strC = googleSignInAccount.c();
        g(h("googleSignInAccount", strC), googleSignInAccount.d());
        g(h("googleSignInOptions", strC), googleSignInOptions.f());
    }

    protected final void g(String str, String str2) {
        this.f4634c.lock();
        try {
            this.f4635d.edit().putString(str, str2).apply();
        } finally {
            this.f4634c.unlock();
        }
    }
}
