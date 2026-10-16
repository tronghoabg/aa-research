package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nfy {
    public static final yph a = yph.c("GH.EducationManager");
    public final List b;
    public final nfw c;

    public nfy(List list) {
        nfw nfwVar = new nfw();
        this.b = list;
        this.c = nfwVar;
    }

    public static nfy a() {
        return (nfy) mki.a.i(nfy.class);
    }

    public final void b(eqa eqaVar, nfx nfxVar) {
        if (eqaVar.getLifecycle().a() == eps.a) {
            ((ype) nfw.a.l().ai((char) 5261)).u("Observer added but LifecycleOwner already DESTROYED");
            return;
        }
        nfw nfwVar = this.c;
        nfv nfvVar = new nfv(nfwVar, eqaVar, nfxVar);
        nfwVar.b.add(nfvVar);
        eqaVar.getLifecycle().c(nfvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (((java.lang.Boolean) defpackage.kgq.c(new defpackage.kym(5), "GH.EducationManager", defpackage.yzz.USER_EDUCATION_SETTINGS, defpackage.yzy.Ma, true, "Error getting cutouts", new java.lang.Object[0])).booleanValue() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.nga r10) {
        /*
            r9 = this;
            yph r0 = defpackage.nfy.a
            java.lang.String r1 = "Trigger opportunity %s"
            r2 = 5266(0x1492, float:7.379E-42)
            defpackage.a.bQ(r0, r1, r10, r2)
            defpackage.lej.a()
            boolean r1 = defpackage.acrz.k()
            if (r1 != 0) goto L13
            goto L52
        L13:
            kio r1 = defpackage.kio.b()
            boolean r1 = r1.r()
            if (r1 != 0) goto L1e
            goto L65
        L1e:
            lhm r1 = defpackage.lbh.d()
            boolean r1 = r1.g()
            if (r1 == 0) goto L5e
            lhm r1 = defpackage.lbh.d()
            boolean r1 = r1.i()
            if (r1 == 0) goto L33
            goto L5e
        L33:
            kym r2 = new kym
            r1 = 5
            r2.<init>(r1)
            yzz r4 = defpackage.yzz.USER_EDUCATION_SETTINGS
            yzy r5 = defpackage.yzy.Ma
            r1 = 0
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r3 = "GH.EducationManager"
            r6 = 1
            java.lang.String r7 = "Error getting cutouts"
            java.lang.Object r1 = defpackage.kgq.c(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L52
            goto L65
        L52:
            mgw r0 = new mgw
            r1 = 9
            r2 = 0
            r0.<init>(r9, r10, r1, r2)
            defpackage.szp.u(r0)
            return
        L5e:
            java.lang.String r9 = "Education not allowed while not in lifetime"
            r1 = 5265(0x1491, float:7.378E-42)
            defpackage.a.bE(r0, r9, r1)
        L65:
            yop r9 = r0.f()
            java.lang.String r0 = "User Education not currently supported. Ignoring %s"
            r1 = 5267(0x1493, float:7.38E-42)
            defpackage.a.bF(r9, r0, r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfy.c(nga):void");
    }
}
