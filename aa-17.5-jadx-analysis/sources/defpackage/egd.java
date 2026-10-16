package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class egd implements efa {
    public final ehj a;
    public final eer b;
    public final aitx c;
    public final aezr d;
    public final aezr e;
    public final egz f;
    public final kwp g;
    public final mko h;
    private final aiyk i;
    private int j;
    private aivh k;
    private final ajdz l;

    public egd(ehj ehjVar, List list, eer eerVar, afco afcoVar) {
        eerVar.getClass();
        this.a = ehjVar;
        this.b = eerVar;
        aivh aivhVar = (aivh) afcoVar.get(aivh.d);
        if (aivhVar == null) {
            Objects.toString(afcoVar);
            throw new IllegalStateException("Missing Job on Coroutine context: ".concat(afcoVar.toString()));
        }
        aitx aitxVarB = ahni.b(afcoVar.plus(aivhVar));
        this.c = aitxVarB;
        this.i = new aiyb(new efi(this, (afck) null, 0));
        this.l = new ajdz();
        this.g = new kwp((byte[]) null, (byte[]) null);
        this.f = new egz(this, list, ((ajbw) aitxVarB).a);
        this.d = woy.dG(new deh(this, 7));
        this.e = woy.dG(new deh(this, 8));
        this.h = new mko(aitxVarB, new daz(this, 10), new ddw(15), new bto(this, (afck) null, 2));
    }

    @Override // defpackage.efa
    public final Object a(afeg afegVar, afck afckVar) {
        affx.f(((ajbw) this.c).a);
        return dsu.g(new bgf(this, afegVar, (afck) null, 4), afckVar);
    }

    @Override // defpackage.efa
    public final aiyk b() {
        return this.i;
    }

    public final egp c() {
        return (egp) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.eff
            if (r0 == 0) goto L13
            r0 = r6
            eff r0 = (defpackage.eff) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eff r0 = new eff
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.woy.dF(r6)
            goto L45
        L36:
            defpackage.woy.dF(r6)
            aitx r6 = r5.c
            ajbw r6 = (defpackage.ajbw) r6
            afco r6 = r6.a
            defpackage.affx.f(r6)
            r0.c = r4
            r6 = 0
        L45:
            fdf r6 = (defpackage.fdf) r6
            r0.c = r3
            java.lang.Object r6 = r5.n(r0)
            if (r6 == r1) goto L88
        L4f:
            ehi r6 = (defpackage.ehi) r6
            boolean r5 = r6 instanceof defpackage.ees
            if (r5 == 0) goto L5a
            ees r6 = (defpackage.ees) r6
            java.lang.Object r5 = r6.a
            return r5
        L5a:
            boolean r5 = r6 instanceof defpackage.ehl
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            if (r5 != 0) goto L82
            boolean r5 = r6 instanceof defpackage.egx
            if (r5 != 0) goto L7d
            boolean r5 = r6 instanceof defpackage.ego
            if (r5 != 0) goto L78
            boolean r5 = r6 instanceof defpackage.egv
            if (r5 == 0) goto L72
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L72:
            aezs r5 = new aezs
            r5.<init>()
            throw r5
        L78:
            ego r6 = (defpackage.ego) r6
            java.lang.Throwable r5 = r6.a
            throw r5
        L7d:
            egx r6 = (defpackage.egx) r6
            java.lang.Throwable r5 = r6.a
            throw r5
        L82:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.d(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.afck r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.efj
            if (r0 == 0) goto L13
            r0 = r5
            efj r0 = (defpackage.efj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            efj r0 = new efj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ajdz r0 = r0.d
            defpackage.woy.dF(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.woy.dF(r5)
            ajdz r5 = r4.l
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L5e
            r0 = r5
        L41:
            int r5 = r4.j     // Catch: java.lang.Throwable -> L59
            int r5 = r5 + (-1)
            r4.j = r5     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L53
            aivh r5 = r4.k     // Catch: java.lang.Throwable -> L59
            r1 = 0
            if (r5 == 0) goto L51
            r5.s(r1)     // Catch: java.lang.Throwable -> L59
        L51:
            r4.k = r1     // Catch: java.lang.Throwable -> L59
        L53:
            r0.d()
            afak r4 = defpackage.afak.a
            return r4
        L59:
            r4 = move-exception
            r0.d()
            throw r4
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.e(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.efl
            if (r0 == 0) goto L13
            r0 = r6
            efl r0 = (defpackage.efl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            efl r0 = new efl
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ajdz r0 = r0.d
            defpackage.woy.dF(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r6)
            ajdz r6 = r5.l
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L65
            r0 = r6
        L41:
            int r6 = r5.j     // Catch: java.lang.Throwable -> L60
            int r6 = r6 + r3
            r5.j = r6     // Catch: java.lang.Throwable -> L60
            if (r6 != r3) goto L5a
            aitx r6 = r5.c     // Catch: java.lang.Throwable -> L60
            beo r1 = new beo     // Catch: java.lang.Throwable -> L60
            r2 = 10
            r3 = 0
            r1.<init>(r5, r3, r2, r3)     // Catch: java.lang.Throwable -> L60
            r2 = 0
            r4 = 3
            aivh r6 = defpackage.ahnc.d(r6, r3, r2, r1, r4)     // Catch: java.lang.Throwable -> L60
            r5.k = r6     // Catch: java.lang.Throwable -> L60
        L5a:
            r0.d()
            afak r5 = defpackage.afak.a
            return r5
        L60:
            r5 = move-exception
            r0.d()
            throw r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.f(afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r9, defpackage.afck r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.g(boolean, afck):java.lang.Object");
    }

    public final Object h(afck afckVar) {
        return dsu.g(new eew(this, (afck) null, 4, (byte[]) null), afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r13, defpackage.afeg r14, defpackage.afck r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.efr
            if (r0 == 0) goto L13
            r0 = r15
            efr r0 = (defpackage.efr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            efr r0 = new efr
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.c
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.woy.dF(r15)
            return r15
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            boolean r13 = r0.a
            java.lang.Object r14 = r0.b
            defpackage.woy.dF(r15)
            goto L45
        L3b:
            defpackage.woy.dF(r15)
            r0.b = r14
            r0.a = r13
            r0.e = r5
            r15 = r3
        L45:
            r8 = r13
            r9 = r14
            aitx r13 = r12.c
            r7 = r15
            fdf r7 = (defpackage.fdf) r7
            gbs r5 = new gbs
            r10 = 0
            r11 = 1
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.b = r3
            r0.a = r8
            r0.e = r4
            ajbw r13 = (defpackage.ajbw) r13
            afco r12 = r13.a
            java.lang.Object r12 = defpackage.ahnc.a(r12, r5, r0)
            if (r12 != r1) goto L65
            return r1
        L65:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.i(boolean, afeg, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r11, boolean r12, defpackage.afck r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ega
            if (r0 == 0) goto L13
            r0 = r13
            ega r0 = (defpackage.ega) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ega r0 = new ega
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            afft r10 = r0.d
            defpackage.woy.dF(r13)
            goto L51
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.woy.dF(r13)
            afft r6 = new afft
            r6.<init>()
            egl r13 = r10.k()
            egc r4 = new egc
            r9 = 0
            r5 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r6
            r0.c = r3
            java.lang.Object r10 = r13.c(r4, r0)
            if (r10 == r1) goto L59
            r10 = r6
        L51:
            int r10 = r10.a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.j(java.lang.Object, boolean, afck):java.lang.Object");
    }

    public final egl k() {
        return (egl) this.d.a();
    }

    public final Object l(afeg afegVar, afco afcoVar, fdf fdfVar, afck afckVar) {
        return c().c(new efy(this, fdfVar, afcoVar, afegVar, null), afckVar);
    }

    public final Object m(afck afckVar) throws Throwable {
        Object objG = dsu.g(new efm(this, null), afckVar);
        return objG == afcr.a ? objG : afak.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.efv
            if (r0 == 0) goto L13
            r0 = r6
            efv r0 = (defpackage.efv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            efv r0 = new efv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L57
            goto L4c
        L36:
            defpackage.woy.dF(r6)
            kwp r6 = r5.g
            ehi r6 = r6.h()
            boolean r6 = r6 instanceof defpackage.ego
            if (r6 != 0) goto L5f
            r0.c = r4     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r5.m(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L4c
            goto L55
        L4c:
            r0.c = r3
            r6 = 0
            java.lang.Object r5 = r5.g(r6, r0)
            if (r5 != r1) goto L56
        L55:
            return r1
        L56:
            return r5
        L57:
            r5 = move-exception
            egx r6 = new egx
            r0 = -1
            r6.<init>(r5, r0)
            return r6
        L5f:
            kwp r5 = r5.g
            ehi r5 = r5.h()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egd.n(afck):java.lang.Object");
    }
}
