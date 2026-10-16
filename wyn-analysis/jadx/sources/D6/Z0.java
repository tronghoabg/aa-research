package D6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q7.BinderC3877b;
import x6.C4488s;
import x6.EnumC4471b;
import x6.InterfaceC4485p;

/* loaded from: classes3.dex */
public final class Z0 {

    /* renamed from: m, reason: collision with root package name */
    public static final HashSet f2392m = new HashSet(Arrays.asList(EnumC4471b.APP_OPEN_AD, EnumC4471b.INTERSTITIAL, EnumC4471b.REWARDED));

    /* renamed from: n, reason: collision with root package name */
    public static Z0 f2393n;

    /* renamed from: a, reason: collision with root package name */
    public T0 f2394a;

    /* renamed from: b, reason: collision with root package name */
    public T0 f2395b;

    /* renamed from: c, reason: collision with root package name */
    public T0 f2396c;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0385m0 f2403j;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2397d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final Object f2398e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2400g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2401h = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2402i = new Object();
    public InterfaceC4485p k = null;

    /* renamed from: l, reason: collision with root package name */
    public C4488s f2404l = new C4488s(-1, -1, null, new ArrayList(), 1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2399f = new ArrayList();

    public static zzbsf a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrw zzbrwVar = (zzbrw) it.next();
            map.put(zzbrwVar.zza, new zzbse(zzbrwVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrwVar.zzd, zzbrwVar.zzc));
        }
        return new zzbsf(map);
    }

    public static Z0 d() {
        Z0 z02;
        synchronized (Z0.class) {
            try {
                if (f2393n == null) {
                    f2393n = new Z0();
                }
                z02 = f2393n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z02;
    }

    public final void b(Context context) {
        if (this.f2403j == null) {
            this.f2403j = (InterfaceC0385m0) new C0384m(C0392q.f2477g.f2479b, context).d(context, false);
        }
    }

    public final void c() {
        InterfaceC0385m0 interfaceC0385m0 = this.f2403j;
        if (interfaceC0385m0 == null) {
            return;
        }
        try {
            interfaceC0385m0.zze();
            this.f2403j.zzj(null, new BinderC3877b(null));
        } catch (RemoteException e7) {
            H6.l.g("MobileAdsSettingManager initialization failed", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, RemoteException -> 0x0050, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x0059, B:45:0x0077, B:47:0x0088, B:49:0x009a, B:56:0x00df, B:57:0x00fa, B:50:0x00ab, B:52:0x00b9, B:54:0x00cb, B:55:0x00d7, B:36:0x005d, B:39:0x0062, B:42:0x006c, B:44:0x0072), top: B:65:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, RemoteException -> 0x0050, blocks: (B:25:0x0033, B:27:0x003a, B:32:0x0052, B:34:0x0059, B:45:0x0077, B:47:0x0088, B:49:0x009a, B:56:0x00df, B:57:0x00fa, B:50:0x00ab, B:52:0x00b9, B:54:0x00cb, B:55:0x00d7, B:36:0x005d, B:39:0x0062, B:42:0x006c, B:44:0x0072), top: B:65:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.Z0.e(android.content.Context, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final InitializationStatus f() {
        synchronized (this.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to getting initialization status.", this.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = this.f2403j;
            if (interfaceC0385m0 == null) {
                return new A.e0(this, 4);
            }
            try {
                return a(interfaceC0385m0.zzq());
            } catch (RemoteException unused) {
                H6.l.c("Unable to get Initialization status.");
                return new A.e0(this, 4);
            }
        }
    }
}
