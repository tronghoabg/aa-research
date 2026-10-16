package t6;

import a2.C1323c;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l8.AbstractC3409K;
import l8.e0;
import l8.j0;

/* loaded from: classes3.dex */
public final class p implements InterfaceC4137e, K {

    /* renamed from: n, reason: collision with root package name */
    public static final e0 f45887n = AbstractC3409K.m(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final e0 f45888o = AbstractC3409K.m(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final e0 f45889p = AbstractC3409K.m(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final e0 f45890q = AbstractC3409K.m(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f45891r = AbstractC3409K.m(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f45892s = AbstractC3409K.m(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    public static p f45893t;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f45894a;

    /* renamed from: b, reason: collision with root package name */
    public final C1323c f45895b = new C1323c(26);

    /* renamed from: c, reason: collision with root package name */
    public final I f45896c;

    /* renamed from: d, reason: collision with root package name */
    public final u6.q f45897d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45898e;

    /* renamed from: f, reason: collision with root package name */
    public int f45899f;

    /* renamed from: g, reason: collision with root package name */
    public long f45900g;

    /* renamed from: h, reason: collision with root package name */
    public long f45901h;

    /* renamed from: i, reason: collision with root package name */
    public int f45902i;

    /* renamed from: j, reason: collision with root package name */
    public long f45903j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f45904l;

    /* renamed from: m, reason: collision with root package name */
    public long f45905m;

    public p(Context context, HashMap map, int i5, u6.q qVar, boolean z2) {
        this.f45894a = j0.a(map);
        this.f45896c = new I(i5);
        this.f45897d = qVar;
        this.f45898e = z2;
        if (context == null) {
            this.f45902i = 0;
            this.f45904l = a(0);
            return;
        }
        u6.o oVarB = u6.o.b(context);
        int iC = oVarB.c();
        this.f45902i = iC;
        this.f45904l = a(iC);
        o oVar = new o(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) oVarB.f46708c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(oVar));
        ((Handler) oVarB.f46707b).post(new ng.a(16, oVarB, oVar));
    }

    public final long a(int i5) {
        Integer numValueOf = Integer.valueOf(i5);
        j0 j0Var = this.f45894a;
        Long l10 = (Long) j0Var.get(numValueOf);
        if (l10 == null) {
            l10 = (Long) j0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void b(int i5, long j8, long j10) {
        int i10;
        long j11;
        long j12;
        if (i5 == 0 && j8 == 0 && j10 == this.f45905m) {
            return;
        }
        this.f45905m = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f45895b.f17156b).iterator();
        while (it.hasNext()) {
            C4136d c4136d = (C4136d) it.next();
            if (c4136d.f45861c) {
                i10 = i5;
                j11 = j8;
                j12 = j10;
            } else {
                i10 = i5;
                j11 = j8;
                j12 = j10;
                c4136d.f45859a.post(new o2.b(c4136d, i10, j11, j12, 1));
            }
            i5 = i10;
            j8 = j11;
            j10 = j12;
        }
    }
}
