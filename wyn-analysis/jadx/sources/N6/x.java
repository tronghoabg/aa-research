package N6;

import A7.CallableC0308z0;
import A7.RunnableC0299w0;
import A7.Y0;
import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.ArrayList;
import java.util.HashMap;
import p7.AbstractC3772b;
import x6.C4476g;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8561a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8562b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f8563c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdzy f8564d;

    /* renamed from: e, reason: collision with root package name */
    public final zzhcp f8565e;

    public x(Context context, zzdzy zzdzyVar, zzhcp zzhcpVar) {
        this.f8563c = context;
        this.f8564d = zzdzyVar;
        this.f8565e = zzhcpVar;
    }

    public final synchronized void a(Object obj, Q6.b bVar) throws Throwable {
        try {
            try {
                C6.n.f1857D.k.getClass();
                Pair pair = new Pair(bVar, Long.valueOf(System.currentTimeMillis()));
                zzcfy.zzf.execute(new RunnableC0299w0(15, this, obj, pair, false));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:15:0x0032, B:17:0x0036, B:21:0x0049, B:25:0x0053, B:28:0x0072, B:29:0x0076, B:31:0x007c, B:20:0x0041, B:14:0x002f), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(boolean r10, N6.z r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.f8561a     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L3f
            N6.z r2 = (N6.z) r2     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            C6.n r5 = C6.n.f1857D     // Catch: java.lang.Throwable -> L3f
            n7.b r5 = r5.k     // Catch: java.lang.Throwable -> L3f
            r5.getClass()     // Catch: java.lang.Throwable -> L3f
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            long r7 = r2.f8574c     // Catch: java.lang.Throwable -> L3f
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r4
            goto L25
        L24:
            r5 = r3
        L25:
            if (r5 != 0) goto L2f
            Q6.a r2 = r2.f8572a     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L2f
            Q6.a r2 = r11.f8572a     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L32
        L2f:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L3f
        L32:
            Q6.a r0 = r11.f8572a     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L41
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzblc.zzf     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L3f
            goto L49
        L3f:
            r10 = move-exception
            goto L88
        L41:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzblc.zzg     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L3f
        L49:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L3f
            Q6.a r0 = r11.f8572a     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L52
            goto L53
        L52:
            r4 = r3
        L53:
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.internal.ads.zzcfy.zzd     // Catch: java.lang.Throwable -> L3f
            N6.w r2 = new N6.w     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r9, r10, r4)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3f
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L3f
            java.util.HashMap r10 = r9.f8562b     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3f
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L72
            goto L86
        L72:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L76:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L86
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L3f
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L3f
            r9.e(r11, r0, r3)     // Catch: java.lang.Throwable -> L3f
            goto L76
        L86:
            monitor-exit(r9)
            return
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L3f
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.x.b(boolean, N6.z):void");
    }

    public final void c(boolean z2) {
        HashMap map = this.f8562b;
        Boolean boolValueOf = Boolean.valueOf(z2);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f8565e.submit(new Y0(2, this, z2));
    }

    public final synchronized void d(boolean z2, boolean z10) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z2);
                HashMap map = this.f8561a;
                Boolean boolValueOf = Boolean.valueOf(z2);
                z zVar = (z) map.get(boolValueOf);
                int i5 = 0;
                if (z10 && zVar != null) {
                    try {
                        i5 = zVar.f8575d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                z zVar2 = (z) map.get(boolValueOf);
                y yVar = new y(this, z2, i5, zVar2 == null ? null : Boolean.valueOf(zVar2.f8576e.get()), this.f8564d);
                C4476g c4476g = new C4476g((AdRequest$Builder) new AdRequest$Builder(14).x(AdMobAdapter.class, bundle));
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmJ)).booleanValue()) {
                    Q6.a.a(this.f8563c, EnumC4471b.BANNER, c4476g, yVar);
                    return;
                }
                try {
                    this.f8565e.submit(new CallableC0308z0(4, this, c4476g, yVar, false));
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void e(z zVar, Pair pair, boolean z2) {
        zVar.f8576e.set(true);
        Q6.a aVar = zVar.f8572a;
        if (aVar != null) {
            ((Q6.b) pair.first).onSuccess(aVar);
        } else {
            ((Q6.b) pair.first).onFailure(zVar.f8573b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        C6.n.f1857D.k.getClass();
        AbstractC3772b.a0(this.f8564d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z2)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }
}
