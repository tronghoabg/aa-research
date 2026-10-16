package n2;

import N1.C0765n;
import N1.O;
import Q1.x;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3579b extends AbstractC3580c {

    /* renamed from: g, reason: collision with root package name */
    public final o2.d f40793g;

    /* renamed from: h, reason: collision with root package name */
    public final long f40794h;

    /* renamed from: i, reason: collision with root package name */
    public final long f40795i;

    /* renamed from: j, reason: collision with root package name */
    public final long f40796j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f40797l;

    /* renamed from: m, reason: collision with root package name */
    public final float f40798m;

    /* renamed from: n, reason: collision with root package name */
    public final float f40799n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC3409K f40800o;

    /* renamed from: p, reason: collision with root package name */
    public final Q1.q f40801p;

    /* renamed from: q, reason: collision with root package name */
    public float f40802q;

    /* renamed from: r, reason: collision with root package name */
    public int f40803r;

    /* renamed from: s, reason: collision with root package name */
    public int f40804s;

    /* renamed from: t, reason: collision with root package name */
    public long f40805t;

    /* renamed from: u, reason: collision with root package name */
    public l2.l f40806u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3579b(O o7, int[] iArr, o2.d dVar, long j8, long j10, long j11, AbstractC3409K abstractC3409K) {
        super(o7, iArr);
        Q1.q qVar = Q1.q.f9708a;
        if (j11 < j8) {
            Q1.k.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j8;
        }
        this.f40793g = dVar;
        this.f40794h = j8 * 1000;
        this.f40795i = j10 * 1000;
        this.f40796j = j11 * 1000;
        this.k = 1279;
        this.f40797l = 719;
        this.f40798m = 0.7f;
        this.f40799n = 0.75f;
        this.f40800o = AbstractC3409K.j(abstractC3409K);
        this.f40801p = qVar;
        this.f40802q = 1.0f;
        this.f40804s = 0;
        this.f40805t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j8 = 0;
        for (long j10 : jArr) {
            j8 += j10;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C3406H c3406h = (C3406H) arrayList.get(i5);
            if (c3406h != null) {
                c3406h.a(new C3578a(j8, jArr[i5]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            l2.l lVar = (l2.l) AbstractC3437s.j(list);
            long j8 = lVar.f39895g;
            if (j8 != -9223372036854775807L) {
                long j10 = lVar.f39896h;
                if (j10 != -9223372036854775807L) {
                    return j10 - j8;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // n2.AbstractC3580c, n2.q
    public final void a() {
        this.f40806u = null;
    }

    @Override // n2.AbstractC3580c, n2.q
    public final void d(float f10) {
        this.f40802q = f10;
    }

    @Override // n2.AbstractC3580c, n2.q
    public final void i() {
        this.f40805t = -9223372036854775807L;
        this.f40806u = null;
    }

    @Override // n2.q
    public final void l(long j8, long j10, long j11, List list, l2.m[] mVarArr) {
        long jX;
        this.f40801p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = this.f40803r;
        if (i5 >= mVarArr.length || !mVarArr[i5].next()) {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jX = x(list);
                    break;
                }
                l2.m mVar = mVarArr[i10];
                if (mVar.next()) {
                    jX = mVar.h() - mVar.f();
                    break;
                }
                i10++;
            }
        } else {
            l2.m mVar2 = mVarArr[this.f40803r];
            jX = mVar2.h() - mVar2.f();
        }
        int i11 = this.f40804s;
        if (i11 == 0) {
            this.f40804s = 1;
            this.f40803r = w(jElapsedRealtime);
            return;
        }
        int i12 = this.f40803r;
        int iQ = list.isEmpty() ? -1 : q(((l2.l) AbstractC3437s.j(list)).f39892d);
        if (iQ != -1) {
            i11 = ((l2.l) AbstractC3437s.j(list)).f39893e;
            i12 = iQ;
        }
        int iW = w(jElapsedRealtime);
        if (iW != i12 && !m(i12, jElapsedRealtime)) {
            C0765n[] c0765nArr = this.f40810d;
            C0765n c0765n = c0765nArr[i12];
            C0765n c0765n2 = c0765nArr[iW];
            long jMin = this.f40794h;
            if (j11 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j11 - jX : j11) * this.f40799n), jMin);
            }
            int i13 = c0765n2.f8229j;
            int i14 = c0765n.f8229j;
            if ((i13 > i14 && j10 < jMin) || (i13 < i14 && j10 >= this.f40795i)) {
                iW = i12;
            }
        }
        if (iW != i12) {
            i11 = 3;
        }
        this.f40804s = i11;
        this.f40803r = iW;
    }

    @Override // n2.q
    public final int n() {
        return this.f40803r;
    }

    @Override // n2.q
    public final Object p() {
        return null;
    }

    @Override // n2.AbstractC3580c, n2.q
    public final int s(long j8, List list) {
        int i5;
        int i10;
        this.f40801p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f40805t;
        if (j10 != -9223372036854775807L && jElapsedRealtime - j10 < 1000 && (list.isEmpty() || ((l2.l) AbstractC3437s.j(list)).equals(this.f40806u))) {
            return list.size();
        }
        this.f40805t = jElapsedRealtime;
        this.f40806u = list.isEmpty() ? null : (l2.l) AbstractC3437s.j(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jA = x.A(((l2.l) list.get(size - 1)).f39895g - j8, this.f40802q);
        long j11 = this.f40796j;
        if (jA >= j11) {
            x(list);
            C0765n c0765n = this.f40810d[w(jElapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                l2.l lVar = (l2.l) list.get(i11);
                C0765n c0765n2 = lVar.f39892d;
                if (x.A(lVar.f39895g - j8, this.f40802q) >= j11 && c0765n2.f8229j < c0765n.f8229j && (i5 = c0765n2.f8240v) != -1 && i5 <= this.f40797l && (i10 = c0765n2.f8239u) != -1 && i10 <= this.k && i5 < c0765n.f8240v) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // n2.q
    public final int u() {
        return this.f40804s;
    }

    public final int w(long j8) {
        long j10;
        o2.g gVar = (o2.g) this.f40793g;
        synchronized (gVar) {
            j10 = gVar.k;
        }
        long j11 = (long) (j10 * this.f40798m);
        this.f40793g.getClass();
        long j12 = (long) (j11 / this.f40802q);
        if (!this.f40800o.isEmpty()) {
            int i5 = 1;
            while (i5 < this.f40800o.size() - 1 && ((C3578a) this.f40800o.get(i5)).f40791a < j12) {
                i5++;
            }
            C3578a c3578a = (C3578a) this.f40800o.get(i5 - 1);
            C3578a c3578a2 = (C3578a) this.f40800o.get(i5);
            long j13 = c3578a.f40791a;
            long j14 = c3578a.f40792b;
            j12 = j14 + ((long) (((j12 - j13) / (c3578a2.f40791a - j13)) * (c3578a2.f40792b - j14)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f40808b; i11++) {
            if (j8 == Long.MIN_VALUE || !m(i11, j8)) {
                if (this.f40810d[i11].f8229j <= j12) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
