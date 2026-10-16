package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.aw;
import com.google.android.gms.common.internal.ax;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u {

    /* renamed from: g, reason: collision with root package name */
    static volatile ax f5133g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5134h = 0;

    /* renamed from: j, reason: collision with root package name */
    private static Context f5136j;

    /* renamed from: a, reason: collision with root package name */
    static final s f5127a = new k(q.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* renamed from: b, reason: collision with root package name */
    static final s f5128b = new l(q.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* renamed from: c, reason: collision with root package name */
    static final s f5129c = new m(q.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: d, reason: collision with root package name */
    static final s f5130d = new n(q.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: e, reason: collision with root package name */
    static final s f5131e = new o(q.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: f, reason: collision with root package name */
    static final s f5132f = new p(q.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: i, reason: collision with root package name */
    private static final Object f5135i = new Object();

    @Deprecated
    static ac a(String str, q qVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, qVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static ac b(aa aaVar) {
        ac acVarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            av.m(f5136j);
            try {
                e();
                av.m(f5136j);
                try {
                    x xVarA = f5133g.a(aaVar.a(f5136j));
                    if (xVarA.b()) {
                        xVarA.d();
                        xVarA.e();
                        acVarD = ac.f();
                    } else {
                        String strA = xVarA.a();
                        PackageManager.NameNotFoundException nameNotFoundException = xVarA.c() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strA == null) {
                            strA = "error checking package certificate";
                        }
                        xVarA.d();
                        xVarA.c();
                        acVarD = ac.g(strA, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    acVarD = ac.d("module call", e2);
                }
            } catch (com.google.android.gms.dynamite.h e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                acVarD = ac.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            return acVarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static /* synthetic */ String c(boolean z, String str, q qVar) throws NoSuchAlgorithmException {
        String str2 = (z || !f(str, qVar, true, false).f4668a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestA = com.google.android.gms.common.util.a.a("SHA-256");
        av.m(messageDigestA);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.d.a(messageDigestA.digest(qVar.e())), Boolean.valueOf(z), "262630000.false");
    }

    static synchronized void d(Context context) {
        if (f5136j != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f5136j = context.getApplicationContext();
        }
    }

    static void e() {
        if (f5133g != null) {
            return;
        }
        av.m(f5136j);
        synchronized (f5135i) {
            if (f5133g == null) {
                f5133g = aw.d(com.google.android.gms.dynamite.l.d(f5136j, com.google.android.gms.dynamite.l.f5190a).c());
            }
        }
    }

    @Deprecated
    private static ac f(final String str, final q qVar, final boolean z, boolean z2) {
        try {
            e();
            av.m(f5136j);
            try {
                return f5133g.b(new y(str, qVar, z, z2), com.google.android.gms.g.b.b(f5136j.getPackageManager())) ? ac.b() : new ab(new Callable() { // from class: com.google.android.gms.common.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return u.c(z, str, qVar);
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return ac.d("module call", e2);
            }
        } catch (com.google.android.gms.dynamite.h e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return ac.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
