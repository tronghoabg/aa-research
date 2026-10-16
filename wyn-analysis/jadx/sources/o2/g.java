package o2;

import S1.A;
import ad.L;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l8.AbstractC3409K;
import l8.e0;
import l8.j0;

/* loaded from: classes.dex */
public final class g implements d, A {

    /* renamed from: n, reason: collision with root package name */
    public static final e0 f41288n = AbstractC3409K.m(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o, reason: collision with root package name */
    public static final e0 f41289o = AbstractC3409K.m(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p, reason: collision with root package name */
    public static final e0 f41290p = AbstractC3409K.m(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q, reason: collision with root package name */
    public static final e0 f41291q = AbstractC3409K.m(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r, reason: collision with root package name */
    public static final e0 f41292r = AbstractC3409K.m(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f41293s = AbstractC3409K.m(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t, reason: collision with root package name */
    public static g f41294t;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f41295a;

    /* renamed from: b, reason: collision with root package name */
    public final L f41296b = new L(16);

    /* renamed from: c, reason: collision with root package name */
    public final Q1.q f41297c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41298d;

    /* renamed from: e, reason: collision with root package name */
    public final r f41299e;

    /* renamed from: f, reason: collision with root package name */
    public int f41300f;

    /* renamed from: g, reason: collision with root package name */
    public long f41301g;

    /* renamed from: h, reason: collision with root package name */
    public long f41302h;

    /* renamed from: i, reason: collision with root package name */
    public long f41303i;

    /* renamed from: j, reason: collision with root package name */
    public long f41304j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f41305l;

    /* renamed from: m, reason: collision with root package name */
    public int f41306m;

    public g(Context context, HashMap map, int i5, Q1.q qVar, boolean z2) {
        this.f41295a = j0.a(map);
        this.f41299e = new r(i5);
        this.f41297c = qVar;
        this.f41298d = z2;
        if (context == null) {
            this.f41306m = 0;
            this.k = a(0);
            return;
        }
        Q1.n nVarB = Q1.n.b(context);
        int iC = nVarB.c();
        this.f41306m = iC;
        this.k = a(iC);
        f fVar = new f(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) nVarB.f9697c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fVar));
        ((Handler) nVarB.f9696b).post(new C8.d(25, nVarB, fVar));
    }

    public final long a(int i5) {
        Integer numValueOf = Integer.valueOf(i5);
        j0 j0Var = this.f41295a;
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
        if (i5 == 0 && j8 == 0 && j10 == this.f41305l) {
            return;
        }
        this.f41305l = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f41296b.f17515b).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f41279c) {
                i10 = i5;
                j11 = j8;
                j12 = j10;
            } else {
                i10 = i5;
                j11 = j8;
                j12 = j10;
                cVar.f41277a.post(new b(cVar, i10, j11, j12, 0));
            }
            i5 = i10;
            j8 = j11;
            j10 = j12;
        }
    }
}
