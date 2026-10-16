package defpackage;

/* loaded from: classes.dex */
public final class epe extends eql {
    public eoz a;
    private eph h;

    public epe(afco afcoVar, long j, afeg afegVar) {
        aiwh aiwhVar = new aiwh(null);
        aitu aituVar = aium.a;
        this.a = new eoz(this, afegVar, j, ahni.b(ajct.a.i().plus(afcoVar).plus(aiwhVar)), new epp(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.epc
            if (r0 == 0) goto L13
            r0 = r7
            epc r0 = (defpackage.epc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            epc r0 = new epc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.woy.dF(r7)
            goto L52
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.woy.dF(r7)
            eph r7 = r6.h
            if (r7 == 0) goto L52
            r0.c = r3
            aitu r2 = defpackage.aium.a
            aivr r2 = defpackage.ajct.a
            aivr r2 = r2.i()
            dxi r3 = new dxi
            r5 = 6
            r3.<init>(r7, r4, r5, r4)
            java.lang.Object r7 = defpackage.ahnc.a(r2, r3, r0)
            if (r7 == r1) goto L4f
            afak r7 = defpackage.afak.a
        L4f:
            if (r7 != r1) goto L52
            return r1
        L52:
            r6.h = r4
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epe.a(afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.eqj r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.epd
            if (r0 == 0) goto L13
            r0 = r7
            epd r0 = (defpackage.epd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            epd r0 = new epd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)
            goto L45
        L38:
            defpackage.woy.dF(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 == r1) goto L66
        L45:
            r7 = 0
            r0.a = r7
            r0.d = r3
            aitu r2 = defpackage.aium.a
            aivr r2 = defpackage.ajct.a
            aivr r2 = r2.i()
            dxa r3 = new dxa
            eqj r6 = (defpackage.eqj) r6
            r4 = 3
            r3.<init>(r5, r6, r7, r4)
            java.lang.Object r7 = defpackage.ahnc.a(r2, r3, r0)
            if (r7 != r1) goto L61
            goto L66
        L61:
            eph r7 = (defpackage.eph) r7
            r5.h = r7
            return r7
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epe.b(eqj, afck):java.lang.Object");
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        eoz eozVar = this.a;
        if (eozVar != null) {
            aivh aivhVar = eozVar.g;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            eozVar.g = null;
            if (eozVar.f != null) {
                return;
            }
            eozVar.f = ahnc.d(eozVar.d, null, 0, new dmx(eozVar, (afck) null, 3), 3);
        }
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        eoz eozVar = this.a;
        if (eozVar != null) {
            if (eozVar.g != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            aitx aitxVar = eozVar.d;
            aitu aituVar = aium.a;
            eozVar.g = ahnc.d(aitxVar, ajct.a.i(), 0, new btm(eozVar, (afck) null, 11), 2);
        }
    }
}
