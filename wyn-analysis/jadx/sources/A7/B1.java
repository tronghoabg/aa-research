package A7;

import android.os.Bundle;
import android.os.SystemClock;
import o2.C3643a;
import t6.C4133a;
import u6.AbstractC4256a;

/* loaded from: classes4.dex */
public final class B1 implements N2.g, S5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f422a;

    /* renamed from: b, reason: collision with root package name */
    public long f423b;

    /* renamed from: c, reason: collision with root package name */
    public long f424c;

    /* renamed from: d, reason: collision with root package name */
    public Object f425d;

    /* renamed from: e, reason: collision with root package name */
    public Object f426e;

    @Override // S5.d
    public J5.t a() {
        AbstractC4256a.i(this.f423b != -1);
        return new J5.o((J5.p) this.f425d, this.f423b, 0);
    }

    @Override // N2.g, S5.d
    public void b(long j8) {
        switch (this.f422a) {
            case 1:
                long[] jArr = (long[]) ((Y2.B) this.f426e).f16383b;
                this.f424c = jArr[Q1.x.e(jArr, j8, true)];
                break;
            default:
                long[] jArr2 = (long[]) ((S3.e) this.f426e).f10941b;
                this.f424c = jArr2[u6.v.e(jArr2, j8, true)];
                break;
        }
    }

    public boolean c(long j8, boolean z2, boolean z10) {
        C0303x1 c0303x1 = (C0303x1) this.f426e;
        c0303x1.c0();
        c0303x1.h0();
        C0273n0 c0273n0 = (C0273n0) c0303x1.f421a;
        if (c0273n0.e()) {
            Z zA0 = c0303x1.a0();
            c0273n0.f985n.getClass();
            zA0.f776q.f(System.currentTimeMillis());
        }
        long j10 = j8 - this.f423b;
        if (!z2 && j10 < 1000) {
            c0303x1.zzj().f612n.d("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z10) {
            j10 = j8 - this.f424c;
            this.f424c = j8;
        }
        c0303x1.zzj().f612n.d("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        U1.u0(c0303x1.f0().k0(!c0273n0.f979g.q0()), bundle, true);
        if (!z10) {
            c0303x1.e0().H0("auto", "_e", bundle);
        }
        this.f423b = j8;
        C1 c12 = (C1) this.f425d;
        c12.a();
        c12.b(((Long) AbstractC0304y.f1176d0.a(null)).longValue());
        return true;
    }

    @Override // S5.d
    public long d(J5.h hVar) {
        long j8 = this.f424c;
        if (j8 < 0) {
            return -1L;
        }
        long j10 = -(j8 + 2);
        this.f424c = -1L;
        return j10;
    }

    @Override // N2.g
    public long f(s2.j jVar) {
        long j8 = this.f424c;
        if (j8 < 0) {
            return -1L;
        }
        long j10 = -(j8 + 2);
        this.f424c = -1L;
        return j10;
    }

    public B1(C0303x1 c0303x1) {
        this.f422a = 0;
        this.f426e = c0303x1;
        this.f425d = new C1(this, (C0273n0) c0303x1.f421a, 0);
        ((C0273n0) c0303x1.f421a).f985n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f423b = jElapsedRealtime;
        this.f424c = jElapsedRealtime;
    }

    @Override // N2.g
    /* renamed from: a, reason: collision with other method in class */
    public s2.w mo1a() {
        Q1.k.g(this.f423b != -1);
        return new s2.q((J5.p) this.f425d, this.f423b, 0);
    }

    public B1(int i5, int i10, long j8) {
        this.f422a = i10;
        switch (i10) {
            case 4:
                Q1.k.g(((C3643a) this.f425d) == null);
                this.f423b = j8;
                this.f424c = j8 + i5;
                break;
            default:
                AbstractC4256a.i(((C4133a) this.f425d) == null);
                this.f423b = j8;
                this.f424c = j8 + i5;
                break;
        }
    }
}
