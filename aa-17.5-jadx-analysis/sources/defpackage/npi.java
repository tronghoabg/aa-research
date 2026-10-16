package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class npi implements npa, npl {
    public final List a;
    public final npw b;
    private final kjz c;
    private final eqj d;
    private final eqj e;
    private final eqj f;
    private final eqj g;
    private final eqj h;
    private final eqj i;
    private final eqj j;
    private final eqj k;

    public npi(kjz kjzVar) {
        npk norVar;
        this.c = kjzVar;
        List listA = kjzVar.b.a();
        this.a = listA;
        npt nptVar = npt.a;
        npj.a(listA, nptVar);
        int iOrdinal = nptVar.ordinal();
        if (iOrdinal == 0) {
            norVar = new nor(listA);
        } else {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            norVar = new nos(listA);
        }
        this.b = new npw(norVar.c() + norVar.b(), norVar.a() - norVar.c(), norVar.c(), Float.valueOf(norVar.b()), Float.valueOf(norVar.a()));
        eqj eqjVarF = jul.f(kjzVar);
        this.d = eqjVarF;
        kjz kjzVar2 = (kjz) woy.bH(jul.e(kjq.a.a().i(), 289408270));
        eqj eqmVar = (kjzVar2 == null || (eqmVar = jul.f(kjzVar2)) == null) ? new eqm(kke.a) : eqmVar;
        this.e = eqmVar;
        eqj eqjVarD = jun.d(eqmVar, new nox(16));
        this.f = eqjVarD;
        njg njgVar = new njg(this, 10);
        eqjVarF.getClass();
        int i = 7;
        this.g = jun.e(tby.d(eqjVarF, eqjVarD, new juy(njgVar, i)));
        eqj eqjVarB = eqy.b(eqjVarF, new noo(this, 6));
        this.h = eqjVarB;
        this.i = tby.o(eqjVarB);
        eqj eqjVarB2 = eqy.b(eqjVarF, new noo(this, i));
        this.j = eqjVarB2;
        this.k = tby.o(eqjVarB2);
    }

    @Override // defpackage.npa
    public final eqj a() {
        return this.d;
    }

    @Override // defpackage.npl
    public final eqj b() {
        return this.k;
    }

    @Override // defpackage.npl
    public final eqj c() {
        return this.i;
    }

    @Override // defpackage.npl
    public final eqj d() {
        return this.f;
    }

    @Override // defpackage.npl
    public final eqj e() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.npl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.npf
            if (r0 == 0) goto L13
            r0 = r5
            npf r0 = (defpackage.npf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            npf r0 = new npf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r5)
            aezw r5 = (defpackage.aezw) r5
            java.lang.Object r4 = r5.a
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r5)
            eqj r5 = r4.j
            boolean r2 = r5.n()
            if (r2 == 0) goto L74
            boolean r2 = r5.o()
            if (r2 == 0) goto L6c
            java.lang.Object r5 = r5.e()
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 != 0) goto L5c
            yph r4 = defpackage.npc.c
            yop r4 = r4.h()
            ype r4 = (defpackage.ype) r4
            java.lang.String r5 = "decrement() called but can't decrement"
            r4.u(r5)
            afak r4 = defpackage.afak.a
            return r4
        L5c:
            float r5 = r5.floatValue()
            r0.c = r3
            java.lang.Object r4 = r4.h(r5, r0)
            if (r4 != r1) goto L69
            return r1
        L69:
            afak r4 = defpackage.afak.a
            return r4
        L6c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "`canDecrement` must be initialized to call decrement()"
            r4.<init>(r5)
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Must observe `canDecrement` to call decrement()"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.f(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.npl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.npg
            if (r0 == 0) goto L13
            r0 = r5
            npg r0 = (defpackage.npg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            npg r0 = new npg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r5)
            aezw r5 = (defpackage.aezw) r5
            java.lang.Object r4 = r5.a
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r5)
            eqj r5 = r4.h
            boolean r2 = r5.n()
            if (r2 == 0) goto L74
            boolean r2 = r5.o()
            if (r2 == 0) goto L6c
            java.lang.Object r5 = r5.e()
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 != 0) goto L5c
            yph r4 = defpackage.npc.c
            yop r4 = r4.h()
            ype r4 = (defpackage.ype) r4
            java.lang.String r5 = "increment() called but can't increment"
            r4.u(r5)
            afak r4 = defpackage.afak.a
            return r4
        L5c:
            float r5 = r5.floatValue()
            r0.c = r3
            java.lang.Object r4 = r4.h(r5, r0)
            if (r4 != r1) goto L69
            return r1
        L69:
            afak r4 = defpackage.afak.a
            return r4
        L6c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "`canIncrement` must be initialized to call increment()"
            r4.<init>(r5)
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Must observe `canIncrement` to call increment()"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.g(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(float r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nph
            if (r0 == 0) goto L13
            r0 = r6
            nph r0 = (defpackage.nph) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nph r0 = new nph
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r6)
            aezw r6 = (defpackage.aezw) r6
            java.lang.Object r5 = r6.a
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            kjz r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r5 = defpackage.jul.g(r6, r2, r0)
            if (r5 == r1) goto L5f
        L45:
            java.lang.Throwable r6 = defpackage.aezw.a(r5)
            if (r6 == 0) goto L5e
            yph r0 = defpackage.npc.c
            yop r0 = r0.h()
            ype r0 = (defpackage.ype) r0
            kjz r4 = r4.c
            java.lang.String r6 = r6.getMessage()
            java.lang.String r1 = "Unable to change temperature of %s: %s"
            r0.M(r1, r4, r6)
        L5e:
            return r5
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.h(float, afck):java.lang.Object");
    }
}
