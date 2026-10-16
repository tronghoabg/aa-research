package f6;

import E5.I0;
import E5.J0;
import java.util.ArrayList;
import u6.AbstractC4256a;

/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2593f extends b0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f35047l;

    /* renamed from: m, reason: collision with root package name */
    public final long f35048m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f35049n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f35050o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f35051p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f35052q;

    /* renamed from: r, reason: collision with root package name */
    public final I0 f35053r;

    /* renamed from: s, reason: collision with root package name */
    public C2591d f35054s;

    /* renamed from: t, reason: collision with root package name */
    public C2592e f35055t;

    /* renamed from: u, reason: collision with root package name */
    public long f35056u;

    /* renamed from: v, reason: collision with root package name */
    public long f35057v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2593f(AbstractC2588a abstractC2588a, long j8, long j10, boolean z2, boolean z10, boolean z11) {
        super(abstractC2588a);
        abstractC2588a.getClass();
        AbstractC4256a.e(j8 >= 0);
        this.f35047l = j8;
        this.f35048m = j10;
        this.f35049n = z2;
        this.f35050o = z10;
        this.f35051p = z11;
        this.f35052q = new ArrayList();
        this.f35053r = new I0();
    }

    @Override // f6.AbstractC2588a
    public final InterfaceC2610w a(C2613z c2613z, o2.e eVar, long j8) {
        C2590c c2590c = new C2590c(this.k.a(c2613z, eVar, j8), this.f35049n, this.f35056u, this.f35057v);
        this.f35052q.add(c2590c);
        return c2590c;
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void i() throws C2592e {
        C2592e c2592e = this.f35055t;
        if (c2592e != null) {
            throw c2592e;
        }
        super.i();
    }

    @Override // f6.AbstractC2588a
    public final void m(InterfaceC2610w interfaceC2610w) {
        ArrayList arrayList = this.f35052q;
        AbstractC4256a.i(arrayList.remove(interfaceC2610w));
        this.k.m(((C2590c) interfaceC2610w).f35036a);
        if (!arrayList.isEmpty() || this.f35050o) {
            return;
        }
        C2591d c2591d = this.f35054s;
        c2591d.getClass();
        z(c2591d.f35081b);
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void o() {
        super.o();
        this.f35055t = null;
        this.f35054s = null;
    }

    @Override // f6.b0
    public final void x(J0 j02) {
        if (this.f35055t != null) {
            return;
        }
        z(j02);
    }

    public final void z(J0 j02) {
        long j8;
        long j10;
        long j11;
        I0 i02 = this.f35053r;
        j02.n(0, i02);
        long j12 = i02.f3124p;
        C2591d c2591d = this.f35054s;
        ArrayList arrayList = this.f35052q;
        long j13 = this.f35048m;
        if (c2591d == null || arrayList.isEmpty() || this.f35050o) {
            boolean z2 = this.f35051p;
            j8 = this.f35047l;
            if (z2) {
                long j14 = i02.f3120l;
                j8 += j14;
                j10 = j14 + j13;
            } else {
                j10 = j13;
            }
            this.f35056u = j12 + j8;
            this.f35057v = j13 != Long.MIN_VALUE ? j12 + j10 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                C2590c c2590c = (C2590c) arrayList.get(i5);
                long j15 = this.f35056u;
                long j16 = this.f35057v;
                c2590c.f35040e = j15;
                c2590c.f35041f = j16;
            }
            j11 = j10;
        } else {
            j8 = this.f35056u - j12;
            j11 = j13 != Long.MIN_VALUE ? this.f35057v - j12 : Long.MIN_VALUE;
        }
        try {
            C2591d c2591d2 = new C2591d(j02, j8, j11);
            this.f35054s = c2591d2;
            l(c2591d2);
        } catch (C2592e e7) {
            this.f35055t = e7;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C2590c) arrayList.get(i10)).f35042g = this.f35055t;
            }
        }
    }
}
