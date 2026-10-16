package A7;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import c8.C1581e;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzhj;
import java.util.concurrent.atomic.AtomicInteger;
import n7.C3597b;
import n7.InterfaceC3596a;

/* renamed from: A7.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0273n0 implements C0 {

    /* renamed from: I, reason: collision with root package name */
    public static volatile C0273n0 f964I;

    /* renamed from: A, reason: collision with root package name */
    public volatile Boolean f965A;

    /* renamed from: B, reason: collision with root package name */
    public final Boolean f966B;

    /* renamed from: C, reason: collision with root package name */
    public final Boolean f967C;

    /* renamed from: D, reason: collision with root package name */
    public volatile boolean f968D;

    /* renamed from: E, reason: collision with root package name */
    public int f969E;

    /* renamed from: F, reason: collision with root package name */
    public int f970F;

    /* renamed from: H, reason: collision with root package name */
    public final long f972H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f973a;

    /* renamed from: b, reason: collision with root package name */
    public final String f974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f975c;

    /* renamed from: d, reason: collision with root package name */
    public final String f976d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f977e;

    /* renamed from: f, reason: collision with root package name */
    public final C1581e f978f;

    /* renamed from: g, reason: collision with root package name */
    public final C0245e f979g;

    /* renamed from: h, reason: collision with root package name */
    public final Z f980h;

    /* renamed from: i, reason: collision with root package name */
    public final N f981i;

    /* renamed from: j, reason: collision with root package name */
    public final C0264k0 f982j;
    public final C0303x1 k;

    /* renamed from: l, reason: collision with root package name */
    public final U1 f983l;

    /* renamed from: m, reason: collision with root package name */
    public final J f984m;

    /* renamed from: n, reason: collision with root package name */
    public final C3597b f985n;

    /* renamed from: o, reason: collision with root package name */
    public final C0259i1 f986o;

    /* renamed from: p, reason: collision with root package name */
    public final P0 f987p;

    /* renamed from: q, reason: collision with root package name */
    public final r f988q;

    /* renamed from: r, reason: collision with root package name */
    public final C0250f1 f989r;

    /* renamed from: s, reason: collision with root package name */
    public final String f990s;

    /* renamed from: t, reason: collision with root package name */
    public H f991t;

    /* renamed from: u, reason: collision with root package name */
    public C0271m1 f992u;

    /* renamed from: v, reason: collision with root package name */
    public C0281q f993v;

    /* renamed from: w, reason: collision with root package name */
    public I f994w;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f996y;

    /* renamed from: z, reason: collision with root package name */
    public long f997z;

    /* renamed from: x, reason: collision with root package name */
    public boolean f995x = false;

    /* renamed from: G, reason: collision with root package name */
    public final AtomicInteger f971G = new AtomicInteger(0);

    public C0273n0(L0 l02) {
        Bundle bundle;
        boolean z2 = false;
        Context context = l02.f549a;
        C1581e c1581e = new C1581e(1);
        this.f978f = c1581e;
        I0.k = c1581e;
        this.f973a = context;
        this.f974b = l02.f550b;
        this.f975c = l02.f551c;
        this.f976d = l02.f552d;
        this.f977e = l02.f556h;
        this.f965A = l02.f553e;
        this.f990s = l02.f558j;
        this.f968D = true;
        zzdw zzdwVar = l02.f555g;
        if (zzdwVar != null && (bundle = zzdwVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f966B = (Boolean) obj;
            }
            Object obj2 = zzdwVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f967C = (Boolean) obj2;
            }
        }
        zzhj.zzb(context);
        this.f985n = C3597b.f40921a;
        Long l10 = l02.f557i;
        this.f972H = l10 != null ? l10.longValue() : System.currentTimeMillis();
        C0245e c0245e = new C0245e(this);
        c0245e.f853d = new m9.S(1);
        this.f979g = c0245e;
        Z z10 = new Z(this);
        z10.f0();
        this.f980h = z10;
        N n10 = new N(this);
        n10.f0();
        this.f981i = n10;
        U1 u12 = new U1(this);
        u12.f0();
        this.f983l = u12;
        this.f984m = new J(new xa.d(this, 3));
        this.f988q = new r(this);
        C0259i1 c0259i1 = new C0259i1(this);
        c0259i1.i0();
        this.f986o = c0259i1;
        P0 p02 = new P0(this);
        p02.i0();
        this.f987p = p02;
        C0303x1 c0303x1 = new C0303x1(this);
        c0303x1.i0();
        this.k = c0303x1;
        C0250f1 c0250f1 = new C0250f1(this);
        c0250f1.f0();
        this.f989r = c0250f1;
        C0264k0 c0264k0 = new C0264k0(this);
        c0264k0.f0();
        this.f982j = c0264k0;
        zzdw zzdwVar2 = l02.f555g;
        if (zzdwVar2 != null && zzdwVar2.zzb != 0) {
            z2 = true;
        }
        if (context.getApplicationContext() instanceof Application) {
            b(p02);
            C0273n0 c0273n0 = (C0273n0) p02.f421a;
            if (c0273n0.f973a.getApplicationContext() instanceof Application) {
                Application application = (Application) c0273n0.f973a.getApplicationContext();
                if (p02.f650c == null) {
                    p02.f650c = new C0241c1(p02);
                }
                if (!z2) {
                    application.unregisterActivityLifecycleCallbacks(p02.f650c);
                    application.registerActivityLifecycleCallbacks(p02.f650c);
                    p02.zzj().f612n.c("Registered activity lifecycle callback");
                }
            }
        } else {
            d(n10);
            n10.f608i.c("Application context is not an Application");
        }
        c0264k0.m0(new RunnableC0278p(2, this, l02));
    }

    public static C0273n0 a(Context context, zzdw zzdwVar, Long l10) {
        Bundle bundle;
        if (zzdwVar != null && (zzdwVar.zze == null || zzdwVar.zzf == null)) {
            zzdwVar = new zzdw(zzdwVar.zza, zzdwVar.zzb, zzdwVar.zzc, zzdwVar.zzd, null, null, zzdwVar.zzg, null);
        }
        AbstractC1732v.i(context);
        AbstractC1732v.i(context.getApplicationContext());
        if (f964I == null) {
            synchronized (C0273n0.class) {
                try {
                    if (f964I == null) {
                        f964I = new C0273n0(new L0(context, zzdwVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzdwVar != null && (bundle = zzdwVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1732v.i(f964I);
            f964I.f965A = Boolean.valueOf(zzdwVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1732v.i(f964I);
        return f964I;
    }

    public static void b(Y y10) {
        if (y10 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!y10.f756b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y10.getClass())));
        }
    }

    public static void c(B0 b02) {
        if (b02 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void d(D0 d02) {
        if (d02 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!d02.f435b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d02.getClass())));
        }
    }

    public final boolean e() {
        return g() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f995x
            if (r0 == 0) goto Lb4
            A7.k0 r0 = r6.f982j
            d(r0)
            r0.c0()
            java.lang.Boolean r0 = r6.f996y
            n7.b r1 = r6.f985n
            if (r0 == 0) goto L34
            long r2 = r6.f997z
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f997z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f997z = r0
            A7.U1 r0 = r6.f983l
            c(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.g1(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.g1(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f973a
            E0.a r4 = p7.C3773c.a(r1)
            boolean r4 = r4.e()
            if (r4 != 0) goto L74
            A7.e r4 = r6.f979g
            boolean r4 = r4.r0()
            if (r4 != 0) goto L74
            boolean r4 = A7.U1.K0(r1)
            if (r4 == 0) goto L76
            boolean r1 = A7.U1.V0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f996y = r4
            if (r1 == 0) goto Lad
            A7.I r1 = r6.j()
            java.lang.String r1 = r1.l0()
            A7.I r4 = r6.j()
            r4.h0()
            java.lang.String r4 = r4.f519m
            boolean r0 = r0.P0(r1, r4)
            if (r0 != 0) goto La7
            A7.I r0 = r6.j()
            r0.h0()
            java.lang.String r0 = r0.f519m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f996y = r0
        Lad:
            java.lang.Boolean r0 = r6.f996y
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0273n0.f():boolean");
    }

    public final int g() {
        C0264k0 c0264k0 = this.f982j;
        d(c0264k0);
        c0264k0.c0();
        Boolean boolM0 = this.f979g.m0("firebase_analytics_collection_deactivated");
        if (boolM0 != null && boolM0.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f967C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C0264k0 c0264k02 = this.f982j;
        d(c0264k02);
        c0264k02.c0();
        if (!this.f968D) {
            return 8;
        }
        Z z2 = this.f980h;
        c(z2);
        z2.c0();
        Boolean boolValueOf = z2.l0().contains("measurement_enabled") ? Boolean.valueOf(z2.l0().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolM02 = this.f979g.m0("firebase_analytics_collection_enabled");
        if (boolM02 != null) {
            return boolM02.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f966B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f965A == null || this.f965A.booleanValue()) ? 0 : 7;
    }

    public final r h() {
        r rVar = this.f988q;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C0281q i() {
        d(this.f993v);
        return this.f993v;
    }

    public final I j() {
        b(this.f994w);
        return this.f994w;
    }

    public final H k() {
        b(this.f991t);
        return this.f991t;
    }

    public final J l() {
        return this.f984m;
    }

    public final C0271m1 m() {
        b(this.f992u);
        return this.f992u;
    }

    public final void n() {
        c(this.f983l);
    }

    @Override // A7.C0
    public final Context zza() {
        return this.f973a;
    }

    @Override // A7.C0
    public final InterfaceC3596a zzb() {
        return this.f985n;
    }

    @Override // A7.C0
    public final C1581e zzd() {
        return this.f978f;
    }

    @Override // A7.C0
    public final N zzj() {
        N n10 = this.f981i;
        d(n10);
        return n10;
    }

    @Override // A7.C0
    public final C0264k0 zzl() {
        C0264k0 c0264k0 = this.f982j;
        d(c0264k0);
        return c0264k0;
    }
}
