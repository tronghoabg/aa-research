package d7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.J;
import com.google.android.gms.common.internal.K;
import com.google.android.gms.internal.common.zzc;
import q7.BinderC3877b;
import r7.C3931a;
import r7.C3934d;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final m f34156a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f34157b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile K f34158c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f34159d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f34160e;

    static {
        new m(n.S("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new m(n.S("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new m(n.S("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new m(n.S("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        f34156a = new m(n.S("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        f34157b = new m(n.S("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        f34159d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f34160e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f34160e = context.getApplicationContext();
        }
    }

    public static void b() {
        K i5;
        if (f34158c != null) {
            return;
        }
        AbstractC1732v.i(f34160e);
        synchronized (f34159d) {
            try {
                if (f34158c == null) {
                    IBinder iBinderB = C3934d.c(f34160e, C3934d.f44526e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = J.f26603a;
                    if (iBinderB == null) {
                        i5 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        i5 = iInterfaceQueryLocalInterface instanceof K ? (K) iInterfaceQueryLocalInterface : new I(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f34158c = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static w c(String str, o oVar, boolean z2, boolean z10) {
        try {
            b();
            AbstractC1732v.i(f34160e);
            u uVar = new u(str, oVar, z2, z10);
            try {
                K k = f34158c;
                BinderC3877b binderC3877b = new BinderC3877b(f34160e.getPackageManager());
                I i5 = (I) k;
                Parcel parcelZza = i5.zza();
                zzc.zzc(parcelZza, uVar);
                zzc.zze(parcelZza, binderC3877b);
                Parcel parcelZzB = i5.zzB(5, parcelZza);
                boolean zZza = zzc.zza(parcelZzB);
                parcelZzB.recycle();
                return zZza ? w.f34178d : new v(new p(z2, str, oVar));
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return w.c("module call", e7);
            }
        } catch (C3931a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return w.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}
