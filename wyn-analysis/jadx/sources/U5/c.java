package U5;

import E5.S;
import E5.T;
import E5.o0;
import J5.h;
import J5.w;
import N1.C0764m;
import N1.C0765n;
import N1.D;
import Q1.x;
import f6.C2584N;
import java.math.RoundingMode;
import s2.C;
import s2.j;
import s2.o;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements b, Z2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12323a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f12324b;

    /* renamed from: c, reason: collision with root package name */
    public long f12325c;

    /* renamed from: d, reason: collision with root package name */
    public int f12326d;

    /* renamed from: e, reason: collision with root package name */
    public long f12327e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12328f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12329g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f12330h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f12331i;

    public c(C2584N c2584n, w wVar, e eVar, String str, int i5) throws o0 {
        this.f12328f = c2584n;
        this.f12329g = wVar;
        this.f12330h = eVar;
        int i10 = eVar.f12342d;
        int i11 = eVar.f12339a;
        int i12 = (i10 * i11) / 8;
        int i13 = eVar.f12341c;
        if (i13 != i12) {
            throw o0.a("Expected block size: " + i12 + "; got: " + i13, null);
        }
        int i14 = eVar.f12340b;
        int i15 = i14 * i12;
        int i16 = i15 * 8;
        int iMax = Math.max(i12, i15 / 10);
        this.f12324b = iMax;
        S s10 = new S();
        s10.k = str;
        s10.f3200f = i16;
        s10.f3201g = i16;
        s10.f3205l = iMax;
        s10.f3217x = i11;
        s10.f3218y = i14;
        s10.f3219z = i5;
        this.f12331i = new T(s10);
    }

    @Override // U5.b
    public final void a(int i5, long j8) {
        switch (this.f12323a) {
            case 0:
                ((C2584N) this.f12328f).x(new g((e) this.f12330h, 1, i5, j8));
                ((w) this.f12329g).a((T) this.f12331i);
                break;
            default:
                ((o) this.f12328f).s(new Z2.d((e) this.f12330h, 1, i5, j8));
                ((C) this.f12329g).c((C0765n) this.f12331i);
                break;
        }
    }

    @Override // U5.b
    public final void b(long j8) {
        switch (this.f12323a) {
            case 0:
                this.f12325c = j8;
                this.f12326d = 0;
                this.f12327e = 0L;
                break;
            default:
                this.f12325c = j8;
                this.f12326d = 0;
                this.f12327e = 0L;
                break;
        }
    }

    @Override // Z2.b
    public boolean c(j jVar, long j8) {
        int i5;
        int i10;
        Object obj = this.f12329g;
        long j10 = j8;
        while (j10 > 0 && (i5 = this.f12326d) < (i10 = this.f12324b)) {
            int iD = ((C) obj).d(jVar, (int) Math.min(i10 - i5, j10), true);
            if (iD == -1) {
                j10 = 0;
            } else {
                this.f12326d += iD;
                j10 -= iD;
            }
        }
        e eVar = (e) this.f12330h;
        int i11 = this.f12326d;
        int i12 = eVar.f12341c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long j11 = this.f12325c;
            long j12 = this.f12327e;
            long j13 = eVar.f12340b;
            int i14 = x.f9724a;
            long jS = j11 + x.S(j12, 1000000L, j13, RoundingMode.DOWN);
            int i15 = i13 * i12;
            int i16 = this.f12326d - i15;
            ((C) obj).a(jS, 1, i15, i16, null);
            this.f12327e += i13;
            this.f12326d = i16;
        }
        return j10 <= 0;
    }

    @Override // U5.b
    public boolean d(h hVar, long j8) {
        int i5;
        int i10;
        long j10 = j8;
        while (j10 > 0 && (i5 = this.f12326d) < (i10 = this.f12324b)) {
            int iD = ((w) this.f12329g).d(hVar, (int) Math.min(i10 - i5, j10), true);
            if (iD == -1) {
                j10 = 0;
            } else {
                this.f12326d += iD;
                j10 -= iD;
            }
        }
        e eVar = (e) this.f12330h;
        int i11 = this.f12326d;
        int i12 = eVar.f12341c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long jD = this.f12325c + v.D(this.f12327e, 1000000L, eVar.f12340b);
            int i14 = i13 * i12;
            int i15 = this.f12326d - i14;
            ((w) this.f12329g).b(jD, 1, i14, i15, null);
            this.f12327e += i13;
            this.f12326d = i15;
        }
        return j10 <= 0;
    }

    public c(o oVar, C c10, e eVar, String str, int i5) throws D {
        this.f12328f = oVar;
        this.f12329g = c10;
        this.f12330h = eVar;
        int i10 = eVar.f12342d;
        int i11 = eVar.f12339a;
        int i12 = (i10 * i11) / 8;
        int i13 = eVar.f12341c;
        if (i13 == i12) {
            int i14 = eVar.f12340b;
            int i15 = i14 * i12;
            int i16 = i15 * 8;
            int iMax = Math.max(i12, i15 / 10);
            this.f12324b = iMax;
            C0764m c0764m = new C0764m();
            c0764m.f8194m = N1.C.m(str);
            c0764m.f8190h = i16;
            c0764m.f8191i = i16;
            c0764m.f8195n = iMax;
            c0764m.f8173B = i11;
            c0764m.f8174C = i14;
            c0764m.f8175D = i5;
            this.f12331i = new C0765n(c0764m);
            return;
        }
        throw D.a(null, "Expected block size: " + i12 + "; got: " + i13);
    }
}
