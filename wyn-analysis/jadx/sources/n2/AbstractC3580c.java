package n2;

import N1.C0765n;
import N1.O;
import Q1.x;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import l2.AbstractC3380e;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3580c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final O f40807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40808b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f40809c;

    /* renamed from: d, reason: collision with root package name */
    public final C0765n[] f40810d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f40811e;

    /* renamed from: f, reason: collision with root package name */
    public int f40812f;

    public AbstractC3580c(O o7, int[] iArr) {
        int i5 = 0;
        Q1.k.g(iArr.length > 0);
        o7.getClass();
        this.f40807a = o7;
        int length = iArr.length;
        this.f40808b = length;
        this.f40810d = new C0765n[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f40810d[i10] = o7.f8076d[iArr[i10]];
        }
        Arrays.sort(this.f40810d, new A0.f(17));
        this.f40809c = new int[this.f40808b];
        while (true) {
            int i11 = this.f40808b;
            if (i5 >= i11) {
                this.f40811e = new long[i11];
                return;
            } else {
                this.f40809c[i5] = o7.a(this.f40810d[i5]);
                i5++;
            }
        }
    }

    @Override // n2.q
    public final C0765n b(int i5) {
        return this.f40810d[i5];
    }

    @Override // n2.q
    public final int c(int i5) {
        return this.f40809c[i5];
    }

    @Override // n2.q
    public final /* synthetic */ void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC3580c abstractC3580c = (AbstractC3580c) obj;
            if (this.f40807a.equals(abstractC3580c.f40807a) && Arrays.equals(this.f40809c, abstractC3580c.f40809c)) {
                return true;
            }
        }
        return false;
    }

    @Override // n2.q
    public final int f(int i5) {
        for (int i10 = 0; i10 < this.f40808b; i10++) {
            if (this.f40809c[i10] == i5) {
                return i10;
            }
        }
        return -1;
    }

    @Override // n2.q
    public final O g() {
        return this.f40807a;
    }

    public final int hashCode() {
        if (this.f40812f == 0) {
            this.f40812f = Arrays.hashCode(this.f40809c) + (System.identityHashCode(this.f40807a) * 31);
        }
        return this.f40812f;
    }

    @Override // n2.q
    public final C0765n j() {
        return this.f40810d[n()];
    }

    @Override // n2.q
    public final /* synthetic */ void k() {
    }

    @Override // n2.q
    public final int length() {
        return this.f40809c.length;
    }

    @Override // n2.q
    public final boolean m(int i5, long j8) {
        return this.f40811e[i5] > j8;
    }

    @Override // n2.q
    public final boolean o(int i5, long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zM = m(i5, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f40808b && !zM) {
            zM = (i10 == i5 || m(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zM) {
            return false;
        }
        long[] jArr = this.f40811e;
        long j10 = jArr[i5];
        int i11 = x.f9724a;
        long j11 = jElapsedRealtime + j8;
        if (((j8 ^ j11) & (jElapsedRealtime ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        jArr[i5] = Math.max(j10, j11);
        return true;
    }

    @Override // n2.q
    public final int q(C0765n c0765n) {
        for (int i5 = 0; i5 < this.f40808b; i5++) {
            if (this.f40810d[i5] == c0765n) {
                return i5;
            }
        }
        return -1;
    }

    @Override // n2.q
    public final /* synthetic */ boolean r(long j8, AbstractC3380e abstractC3380e, List list) {
        return false;
    }

    @Override // n2.q
    public int s(long j8, List list) {
        return list.size();
    }

    @Override // n2.q
    public final int t() {
        return this.f40809c[n()];
    }

    @Override // n2.q
    public void a() {
    }

    @Override // n2.q
    public void i() {
    }

    @Override // n2.q
    public void d(float f10) {
    }

    @Override // n2.q
    public final void h(boolean z2) {
    }
}
