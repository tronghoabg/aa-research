package defpackage;

/* loaded from: classes.dex */
public final class blp implements ben {
    final /* synthetic */ blr a;
    private dfv c;
    private boolean b = true;
    private bko d = bkn.a;

    public blp(blr blrVar) {
        this.a = blrVar;
    }

    private final void g() {
        blr blrVar = this.a;
        blrVar.p(null);
        blrVar.n(null);
        this.d = bkn.a;
        blrVar.t(true);
        dfv dfvVar = this.c;
        boolean zI = dfvVar != null ? dfv.i(dfvVar.b) : dfv.i(blrVar.f().b);
        blrVar.q(zI ? bdu.c : bdu.b);
        bed bedVar = blrVar.d;
        if (bedVar != null) {
            bedVar.o(!zI && czz.ay(blrVar, true));
        }
        bed bedVar2 = blrVar.d;
        if (bedVar2 != null) {
            bedVar2.n(!zI && czz.ay(blrVar, false));
        }
        bed bedVar3 = blrVar.d;
        if (bedVar3 != null) {
            bedVar3.l(zI && czz.ay(blrVar, true));
        }
        if (this.b) {
            blrVar.m(blrVar.l);
        }
        blrVar.l = null;
    }

    @Override // defpackage.ben
    public final void a() {
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // defpackage.ben
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10) {
        /*
            r9 = this;
            blr r0 = r9.a
            boolean r1 = r0.v()
            if (r1 == 0) goto Le5
            djv r1 = r0.f()
            java.lang.String r1 = r1.a()
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Le5
        L18:
            long r1 = r0.m
            long r10 = defpackage.a.ai(r1, r10)
            r0.m = r10
            bed r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le2
            bff r10 = r10.d()
            if (r10 == 0) goto Le2
            long r1 = r0.k
            long r3 = r0.m
            long r1 = defpackage.a.ai(r1, r3)
            cja r3 = new cja
            r3.<init>(r1)
            r0.n(r3)
            dfv r1 = r0.l
            r2 = 9
            if (r1 != 0) goto L92
            cja r1 = r0.d()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.d(r3)
            if (r1 != 0) goto L92
            djn r1 = r0.b
            long r3 = r0.k
            r5 = 1
            int r3 = r10.a(r3, r5)
            int r1 = r1.b(r3)
            djn r3 = r0.b
            cja r4 = r0.d()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.a(r6, r5)
            int r10 = r3.b(r10)
            if (r1 != r10) goto L75
            bko r10 = defpackage.bkn.a
            goto L77
        L75:
            bko r10 = defpackage.bkn.b
        L77:
            r6 = r10
            djv r1 = r0.f()
            cja r10 = r0.d()
            r10.getClass()
            cpi r8 = new cpi
            r8.<init>(r2)
            long r2 = r10.a
            r5 = 0
            r7 = 1
            r4 = 0
            long r1 = r0.b(r1, r2, r4, r5, r6, r7, r8)
            goto Ld1
        L92:
            dfv r1 = r0.l
            if (r1 == 0) goto L9d
            long r3 = r1.b
            int r1 = defpackage.dfv.e(r3)
            goto La3
        L9d:
            long r3 = r0.k
            int r1 = r10.a(r3, r11)
        La3:
            cja r3 = r0.d()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.a(r3, r11)
            dfv r3 = r0.l
            if (r3 != 0) goto Lb6
            if (r1 == r10) goto Le5
        Lb6:
            djv r1 = r0.f()
            cja r10 = r0.d()
            r10.getClass()
            bko r6 = r9.d
            cpi r8 = new cpi
            r8.<init>(r2)
            long r2 = r10.a
            r5 = 0
            r7 = 1
            r4 = 0
            long r1 = r0.b(r1, r2, r4, r5, r6, r7, r8)
        Ld1:
            dfv r10 = new dfv
            r10.<init>(r1)
            r9.c = r10
            dfv r10 = r0.l
            boolean r10 = defpackage.dfv.h(r1, r10)
            if (r10 != 0) goto Le2
            r9.b = r11
        Le2:
            r0.t(r11)
        Le5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blp.b(long):void");
    }

    @Override // defpackage.ben
    public final void c(long j, bko bkoVar) {
        long j2;
        bff bffVarD;
        bff bffVarD2;
        blr blrVar = this.a;
        if (blrVar.v() && blrVar.c() == null) {
            blrVar.p(bdt.c);
            blrVar.B = -1;
            this.b = true;
            this.d = bkoVar;
            blrVar.l();
            bed bedVar = blrVar.d;
            if (bedVar == null || (bffVarD2 = bedVar.d()) == null || !bffVarD2.d(j)) {
                j2 = j;
                bed bedVar2 = blrVar.d;
                if (bedVar2 != null && (bffVarD = bedVar2.d()) != null) {
                    int iB = blrVar.b.b(bffVarD.a(j2, true));
                    deu deuVar = blrVar.f().a;
                    long jT = czz.t(iB, iB);
                    long j3 = dfv.a;
                    djv djvVar = new djv(deuVar, jT, (dfv) null);
                    blrVar.j(false);
                    kwp kwpVar = blrVar.y;
                    if (kwpVar != null) {
                        kwpVar.q(0);
                    }
                    blrVar.c.invoke(djvVar);
                    blrVar.o = new dfv(djvVar.b);
                }
                this.b = false;
            } else {
                if (blrVar.f().a().length() == 0) {
                    return;
                }
                blrVar.j(false);
                long jB = blrVar.b(djv.b(blrVar.f(), null, dfv.a, 5), j, true, false, this.d, true, new cpi(0));
                j2 = j;
                blrVar.l = new dfv(jB);
                this.c = new dfv(jB);
            }
            blrVar.q(bdu.a);
            blrVar.k = j2;
            blrVar.n(new cja(j2));
            blrVar.m = 0L;
        }
    }

    @Override // defpackage.ben
    public final void d() {
        g();
    }

    @Override // defpackage.ben
    public final void e() {
    }

    @Override // defpackage.ben
    public final void f() {
    }
}
