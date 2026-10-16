package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngr {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.EducationManager");
    public final java.util.List b;
    public final defpackage.ngp c;

    public ngr(java.util.List list) {
        defpackage.ngp ngpVar = new defpackage.ngp();
        this.b = list;
        this.c = ngpVar;
    }

    public static defpackage.ngr a() {
        return (defpackage.ngr) defpackage.mkp.a.i(defpackage.ngr.class);
    }

    public final void b(defpackage.eqg eqgVar, ngq ngqVar) {
        if (eqgVar.getLifecycle().a() == defpackage.epx.a) {
            ((defpackage.yqj) defpackage.ngp.a.l().ai((char) 5263)).u("Observer added but LifecycleOwner already DESTROYED");
            return;
        }
        defpackage.ngp ngpVar = this.c;
        defpackage.ngo ngoVar = new defpackage.ngo(ngpVar, eqgVar, ngqVar);
        ngpVar.b.add(ngoVar);
        eqgVar.getLifecycle().c(ngoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (((java.lang.Boolean) defpackage.kgu.c(new defpackage.kyr(5), "GH.EducationManager", defpackage.zbe.USER_EDUCATION_SETTINGS, defpackage.zbd.Me, true, "Error getting cutouts", new java.lang.Object[0])).booleanValue() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(ngt r10) {
        /*
            r9 = this;
            yqm r0 = defpackage.ngr.a
            java.lang.String r1 = "Trigger opportunity %s"
            r2 = 5268(0x1494, float:7.382E-42)
            defpackage.a.bP(r0, r1, r10, r2)
            defpackage.leo.a()
            boolean r1 = defpackage.actb.j()
            if (r1 != 0) goto L13
            goto L52
        L13:
            kit r1 = defpackage.kit.b()
            boolean r1 = r1.r()
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            lht r1 = defpackage.ler.c()
            boolean r1 = r1.g()
            if (r1 == 0) goto L5e
            lht r1 = defpackage.ler.c()
            boolean r1 = r1.i()
            if (r1 == 0) goto L33
            goto L5e
        L33:
            kyr r2 = new kyr
            r1 = 5
            r2.<init>(r1)
            zbe r4 = defpackage.zbe.USER_EDUCATION_SETTINGS
            zbd r5 = defpackage.zbd.Me
            r1 = 0
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r3 = "GH.EducationManager"
            r6 = 1
            java.lang.String r7 = "Error getting cutouts"
            java.lang.Object r1 = defpackage.kgu.c(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L52
            goto L65
        L52:
            mbx r0 = new mbx
            r1 = 11
            r2 = 0
            r0.<init>(r9, r10, r1, r2)
            defpackage.tna.i(r0)
            return
        L5e:
            java.lang.String r9 = "Education not allowed while not in lifetime"
            r1 = 5267(0x1493, float:7.38E-42)
            defpackage.a.bD(r0, r9, r1)
        L65:
            ypu r9 = r0.f()
            java.lang.String r0 = "User Education not currently supported. Ignoring %s"
            r1 = 5269(0x1495, float:7.383E-42)
            defpackage.a.bE(r9, r0, r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngr.c(ngt):void");
    }
}
