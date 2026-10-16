package B;

import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.C0745t;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import l0.InterfaceC3369b;
import r7.AbstractC3935e;
import u0.Y;
import x0.C4440j;

/* loaded from: classes.dex */
public final class E extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1365i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1366j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i5, Object obj, boolean z2) {
        super(3);
        this.f1365i = i5;
        this.f1366j = z2;
        this.k = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(D.i r4, N.V r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof B.O
            if (r0 == 0) goto L13
            r0 = r6
            B.O r0 = (B.O) r0
            int r1 = r0.f1398d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1398d = r1
            goto L18
        L13:
            B.O r0 = new B.O
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1397c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1398d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            D.e r4 = r0.f1396b
            N.V r5 = r0.f1395a
            Fe.e.U(r6)
            goto L51
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            Fe.e.U(r6)
            java.lang.Object r6 = r5.getValue()
            D.e r6 = (D.e) r6
            if (r6 != 0) goto L54
            D.e r6 = new D.e
            r6.<init>()
            r0.f1395a = r5
            r0.f1396b = r6
            r0.f1398d = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L50
            return r1
        L50:
            r4 = r6
        L51:
            r5.setValue(r4)
        L54:
            ef.C r4 = ef.C2515C.f34653a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B.E.a(D.i, N.V, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(D.i r4, N.V r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof B.P
            if (r0 == 0) goto L13
            r0 = r6
            B.P r0 = (B.P) r0
            int r1 = r0.f1401c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1401c = r1
            goto L18
        L13:
            B.P r0 = new B.P
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1400b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1401c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            N.V r5 = r0.f1399a
            Fe.e.U(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Fe.e.U(r6)
            java.lang.Object r6 = r5.getValue()
            D.e r6 = (D.e) r6
            if (r6 == 0) goto L50
            D.f r2 = new D.f
            r2.<init>(r6)
            r0.f1399a = r5
            r0.f1401c = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            r4 = 0
            r5.setValue(r4)
        L50:
            ef.C r4 = ef.C2515C.f34653a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B.E.b(D.i, N.V, lf.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r72;
        Z.k kVar;
        Z.k kVarN = Z.i.f16922a;
        C3109i c3109i = C3109i.f38759a;
        N.P p10 = C0732k.f7800a;
        boolean z2 = this.f1366j;
        Object obj4 = this.k;
        int i5 = 0;
        switch (this.f1365i) {
            case 0:
                Z.k composed = (Z.k) obj;
                C0740o c0740o = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed, "$this$composed");
                c0740o.M(1871352361);
                c0740o.M(773894976);
                c0740o.M(-492369756);
                Object objF = c0740o.F();
                if (objF == p10) {
                    objF = new C0745t(C0718d.x(c3109i, c0740o));
                    c0740o.U(objF);
                }
                c0740o.p(false);
                Kd.a aVar = ((C0745t) objF).f7923a;
                c0740o.p(false);
                c0740o.M(-492369756);
                Object objF2 = c0740o.F();
                N.P p11 = N.P.f7730f;
                if (objF2 == p10) {
                    objF2 = C0718d.G(null, p11);
                    c0740o.U(objF2);
                }
                c0740o.p(false);
                N.V v2 = (N.V) objF2;
                c0740o.M(-492369756);
                Object objF3 = c0740o.F();
                if (objF3 == p10) {
                    objF3 = C0718d.G(null, p11);
                    c0740o.U(objF3);
                }
                c0740o.p(false);
                N.V v10 = (N.V) objF3;
                c0740o.M(-492369756);
                Object objF4 = c0740o.F();
                if (objF4 == p10) {
                    objF4 = C0718d.G(Boolean.FALSE, p11);
                    c0740o.U(objF4);
                }
                c0740o.p(false);
                N.V v11 = (N.V) objF4;
                c0740o.M(-492369756);
                Object objF5 = c0740o.F();
                if (objF5 == p10) {
                    objF5 = new c0.o();
                    c0740o.U(objF5);
                }
                c0740o.p(false);
                c0.o focusRequester = (c0.o) objF5;
                c0740o.M(-492369756);
                Object objF6 = c0740o.F();
                if (objF6 == p10) {
                    objF6 = new G.e();
                    c0740o.U(objF6);
                }
                c0740o.p(false);
                G.e bringIntoViewRequester = (G.e) objF6;
                D.i iVar = (D.i) obj4;
                C0718d.c(iVar, new C0320k(v2, iVar, 1), c0740o);
                C0718d.c(Boolean.valueOf(z2), new r(z2, aVar, v2, iVar), c0740o);
                if (z2) {
                    if (((Boolean) v11.getValue()).booleanValue()) {
                        c0740o.M(-492369756);
                        Object objF7 = c0740o.F();
                        if (objF7 == p10) {
                            objF7 = new I();
                            c0740o.U(objF7);
                        }
                        r72 = 0;
                        c0740o.p(false);
                        kVar = (Z.k) objF7;
                    } else {
                        r72 = 0;
                        kVar = kVarN;
                    }
                    Z.k kVarA = Y.a(Fe.g.J(kVarN, r72, new A.W(4, v11, focusRequester)), new X(new z(v10, r72)));
                    AbstractC3340k.e(kVarA, "<this>");
                    AbstractC3340k.e(bringIntoViewRequester, "bringIntoViewRequester");
                    Z.k kVarN2 = AbstractC3935e.n(kVarA, new G.f(bringIntoViewRequester, 0));
                    a2.v vVar = c0.p.f19531a;
                    AbstractC3340k.e(kVarN2, "<this>");
                    AbstractC3340k.e(focusRequester, "focusRequester");
                    Z.k kVarG = AbstractC3935e.n(kVarN2, new G.f(focusRequester, 4)).g(kVar);
                    D d3 = new D(aVar, v11, bringIntoViewRequester, v10, v2, (D.i) obj4);
                    AbstractC3340k.e(kVarG, "<this>");
                    Z.k kVarN3 = AbstractC3935e.n(kVarG, new G.f(d3, 2));
                    a2.v vVar2 = c0.k.f19514a;
                    AbstractC3340k.e(kVarN3, "<this>");
                    kVarN = AbstractC3935e.n(kVarN3, c0.j.f19513i);
                }
                c0740o.p(false);
                return kVarN;
            case 1:
                Z.k composed2 = (Z.k) obj;
                C0740o c0740o2 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed2, "$this$composed");
                c0740o2.M(-618949501);
                F f10 = new F((InterfaceC3369b) c0740o2.j(u0.M.f46148j), i5);
                a2.v vVar3 = c0.m.f19525a;
                Z.k kVarN4 = AbstractC3935e.n(new c0.n(f10), new E((D.i) obj4, z2, i5));
                c0740o2.p(false);
                return kVarN4;
            case 2:
                Z.k composed3 = (Z.k) obj;
                C0740o c0740o3 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed3, "$this$composed");
                c0740o3.M(1294013553);
                c0740o3.M(773894976);
                c0740o3.M(-492369756);
                Object objF8 = c0740o3.F();
                if (objF8 == p10) {
                    C0745t c0745t = new C0745t(C0718d.x(c3109i, c0740o3));
                    c0740o3.U(c0745t);
                    objF8 = c0745t;
                }
                c0740o3.p(false);
                Kd.a aVar2 = ((C0745t) objF8).f7923a;
                c0740o3.p(false);
                c0740o3.M(-492369756);
                Object objF9 = c0740o3.F();
                if (objF9 == p10) {
                    objF9 = C0718d.G(null, N.P.f7730f);
                    c0740o3.U(objF9);
                }
                c0740o3.p(false);
                N.V v12 = (N.V) objF9;
                D.i iVar2 = (D.i) obj4;
                C0718d.c(iVar2, new C0320k(v12, iVar2, 2), c0740o3);
                C0718d.d(c0740o3, Boolean.valueOf(z2), new J(z2, v12, iVar2, null));
                if (z2) {
                    kVarN = p0.w.a(kVarN, iVar2, new N(aVar2, iVar2, v12, null));
                }
                c0740o3.p(false);
                return kVarN;
            default:
                Z.k composed4 = (Z.k) obj;
                C0740o c0740o4 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(composed4, "$this$composed");
                c0740o4.M(-140499264);
                c0740o4.M(-492369756);
                Object objF10 = c0740o4.F();
                if (objF10 == p10) {
                    objF10 = Integer.valueOf(C4440j.f47596c.addAndGet(1));
                    c0740o4.U(objF10);
                }
                c0740o4.p(false);
                C4440j c4440j = new C4440j(((Number) objF10).intValue(), z2, (tf.l) obj4);
                c0740o4.p(false);
                return c4440j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(D.i iVar, boolean z2, int i5) {
        super(3);
        this.f1365i = i5;
        this.k = iVar;
        this.f1366j = z2;
    }
}
