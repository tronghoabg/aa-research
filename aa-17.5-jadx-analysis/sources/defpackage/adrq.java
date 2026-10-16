package defpackage;

/* loaded from: classes.dex */
public final class adrq extends adli {
    final /* synthetic */ adrr f;
    private final adla g;
    private adli h;
    private adlk i;

    public adrq(adrr adrrVar, adla adlaVar) {
        this.f = adrrVar;
        this.g = adlaVar;
        adlk adlkVar = adrrVar.a;
        this.i = adlkVar;
        this.h = adlkVar.a(adlaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.adli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.adnq a(defpackage.adle r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.c
            adzn r0 = (defpackage.adzn) r0
            if (r0 != 0) goto L11
            adrr r0 = r8.f
            adzn r1 = new adzn
            adlk r0 = r0.a
            r2 = 0
            r1.<init>(r0, r2)
            r0 = r1
        L11:
            adlk r1 = r8.i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            adlk r4 = r0.a
            java.lang.String r1 = r1.c()
            java.lang.String r4 = r4.c()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L68
        L27:
            adla r1 = r8.g
            adjh r4 = defpackage.adjh.a
            adkz r5 = new adkz
            adlc r6 = defpackage.adlc.a
            r5.<init>(r6)
            r1.f(r4, r5)
            adli r4 = r8.h
            r4.d()
            adlk r4 = r0.a
            r8.i = r4
            adli r5 = r8.h
            adli r4 = r4.a(r1)
            r8.h = r4
            adiy r1 = r1.a()
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            adli r5 = r8.h
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r4
            r7[r3] = r5
            java.lang.String r4 = "Load balancer changed from {0} to {1}"
            r1.b(r6, r4, r7)
        L68:
            java.lang.Object r0 = r0.b
            if (r0 == 0) goto L7b
            adla r1 = r8.g
            adiy r1 = r1.a()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r2 = "Load-balancing config: {0}"
            r1.b(r3, r2, r4)
        L7b:
            adli r8 = r8.h
            adis r1 = defpackage.adis.a
            java.util.List r1 = r9.a
            adis r9 = r9.b
            adle r2 = new adle
            r2.<init>(r1, r9, r0)
            adnq r8 = r8.a(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrq.a(adle):adnq");
    }

    @Override // defpackage.adli
    public final void b(adnq adnqVar) {
        this.h.b(adnqVar);
    }

    @Override // defpackage.adli
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.adli
    public final void d() {
        this.h.d();
        this.h = null;
    }
}
