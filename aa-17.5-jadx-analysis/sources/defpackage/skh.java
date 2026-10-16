package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class skh {
    static final skf a;
    static final skf b;
    public static Context c;
    static volatile son d;
    private static final Object e;

    static {
        new sjy(soj.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new sjz(soj.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new ska(soj.d("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new skb(soj.d("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new skc(soj.d("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new skd(soj.d("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        e = new Object();
    }

    static synchronized void a(Context context) {
        if (c == null) {
            c = context.getApplicationContext();
        } else {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    static void b() throws sqs {
        son sonVar;
        if (d != null) {
            return;
        }
        if (c == null) {
            throw new NullPointerException("null reference");
        }
        synchronized (e) {
            if (d == null) {
                IBinder iBinderC = DynamiteModule.b(c, DynamiteModule.b, "com.google.android.gms.googlecertificates").c();
                if (iBinderC == null) {
                    sonVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    sonVar = iInterfaceQueryLocalInterface instanceof son ? (son) iInterfaceQueryLocalInterface : new son(iBinderC);
                }
                d = sonVar;
            }
        }
    }

    @Deprecated
    static skj c(String str, soj sojVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, sojVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static skj d(final String str, final soj sojVar, final boolean z, boolean z2) {
        try {
            b();
            spu.aw(c);
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, sojVar, z, z2);
            try {
                son sonVar = d;
                sqi sqiVar = new sqi(c.getPackageManager());
                Parcel parcelGh = sonVar.gh();
                ijp.g(parcelGh, googleCertificatesQuery);
                ijp.i(parcelGh, sqiVar);
                Parcel parcelGi = sonVar.gi(5, parcelGh);
                boolean zJ = ijp.j(parcelGi);
                parcelGi.recycle();
                return zJ ? skj.a : new ski(new Callable() { // from class: sjx
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws NoSuchAlgorithmException {
                        Context context = skh.c;
                        String str2 = str;
                        soj sojVar2 = sojVar;
                        boolean z3 = z;
                        String str3 = (z3 || !skh.d(str2, sojVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestA = spj.a();
                        spu.aw(messageDigestA);
                        byte[] bArrDigest = messageDigestA.digest(((ske) sojVar2).a);
                        char[] cArr = spq.a;
                        int length = bArrDigest.length;
                        char[] cArr2 = new char[length + length];
                        int i = 0;
                        for (byte b2 : bArrDigest) {
                            int i2 = i + 1;
                            char[] cArr3 = spq.a;
                            cArr2[i] = cArr3[(b2 & 255) >>> 4];
                            i += 2;
                            cArr2[i2] = cArr3[b2 & 15];
                        }
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, new String(cArr2), Boolean.valueOf(z3), "263210000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return new skj(false, "module call", e2);
            }
        } catch (sqs e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return new skj(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
