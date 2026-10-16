package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class j4 extends AbstractC2934c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2929b f38239j;
    private final IntFunction k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f38240l;

    /* renamed from: m, reason: collision with root package name */
    private long f38241m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38242n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f38243o;

    @Override // j$.util.stream.AbstractC2934c
    protected final void h() {
        this.f38159i = true;
        if (this.f38240l && this.f38243o) {
            f(AbstractC3044y0.H(this.f38239j.F()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.e r0 = r8.f38175d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.j4 r0 = (j$.util.stream.j4) r0
            boolean r0 = r0.f38242n
            j$.util.stream.e r1 = r8.f38176e
            j$.util.stream.j4 r1 = (j$.util.stream.j4) r1
            boolean r1 = r1.f38242n
            r0 = r0 | r1
            r8.f38242n = r0
            boolean r0 = r8.f38240l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.f38159i
            if (r0 == 0) goto L2a
            r8.f38241m = r1
            j$.util.stream.b r0 = r8.f38239j
            j$.util.stream.h3 r0 = r0.F()
            j$.util.stream.e1 r0 = j$.util.stream.AbstractC3044y0.H(r0)
            goto L88
        L2a:
            boolean r0 = r8.f38240l
            if (r0 == 0) goto L41
            j$.util.stream.e r0 = r8.f38175d
            j$.util.stream.j4 r0 = (j$.util.stream.j4) r0
            boolean r3 = r0.f38242n
            if (r3 == 0) goto L41
            long r1 = r0.f38241m
            r8.f38241m = r1
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L41:
            j$.util.stream.e r0 = r8.f38175d
            j$.util.stream.j4 r0 = (j$.util.stream.j4) r0
            long r3 = r0.f38241m
            j$.util.stream.e r5 = r8.f38176e
            j$.util.stream.j4 r5 = (j$.util.stream.j4) r5
            long r6 = r5.f38241m
            long r3 = r3 + r6
            r8.f38241m = r3
            long r3 = r0.f38241m
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L5d
            java.lang.Object r0 = r5.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L5d:
            long r3 = r5.f38241m
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L6a:
            j$.util.stream.b r0 = r8.f38239j
            j$.util.stream.h3 r0 = r0.F()
            j$.util.stream.e r1 = r8.f38175d
            j$.util.stream.j4 r1 = (j$.util.stream.j4) r1
            java.lang.Object r1 = r1.c()
            j$.util.stream.K0 r1 = (j$.util.stream.K0) r1
            j$.util.stream.e r2 = r8.f38176e
            j$.util.stream.j4 r2 = (j$.util.stream.j4) r2
            java.lang.Object r2 = r2.c()
            j$.util.stream.K0 r2 = (j$.util.stream.K0) r2
            j$.util.stream.M0 r0 = j$.util.stream.AbstractC3044y0.F(r0, r1, r2)
        L88:
            r8.f(r0)
        L8b:
            r0 = 1
            r8.f38243o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.j4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    j4(AbstractC2929b abstractC2929b, AbstractC2929b abstractC2929b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2929b2, spliterator);
        this.f38239j = abstractC2929b;
        this.k = intFunction;
        this.f38240l = EnumC2958g3.ORDERED.t(abstractC2929b2.H());
    }

    j4(j4 j4Var, Spliterator spliterator) {
        super(j4Var, spliterator);
        this.f38239j = j4Var.f38239j;
        this.k = j4Var.k;
        this.f38240l = j4Var.f38240l;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new j4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2934c
    protected final Object j() {
        return AbstractC3044y0.H(this.f38239j.F());
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        C0 c0K = this.f38172a.K(-1L, this.k);
        InterfaceC3011r2 interfaceC3011r2O = this.f38239j.O(this.f38172a.H(), c0K);
        AbstractC2929b abstractC2929b = this.f38172a;
        boolean zY = abstractC2929b.y(this.f38173b, abstractC2929b.T(interfaceC3011r2O));
        this.f38242n = zY;
        if (zY) {
            i();
        }
        K0 k0A = c0K.a();
        this.f38241m = k0A.count();
        return k0A;
    }
}
