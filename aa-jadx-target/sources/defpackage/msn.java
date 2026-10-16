package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msn extends defpackage.kmn {
    private float a = 0.0f;
    private java.util.EnumSet b;
    private defpackage.cjj c;

    public msn() {
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.msm.class);
        enumSetNoneOf.getClass();
        this.b = enumSetNoneOf;
        this.c = defpackage.cjj.a;
    }

    @Override // defpackage.kmn
    public final void a(defpackage.bve bveVar, int i) {
        int i2;
        defpackage.msn msnVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1787748071);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            msnVar = this;
            msnVar.b(defpackage.awj.c(defpackage.cgf.e, 1.0f), this.a, this.b, this.c, bveVarC, ((i2 << 15) & 458752) | 390);
        } else {
            msnVar = this;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(msnVar, i, 9);
        }
    }

    public final void b(defpackage.cgf cgfVar, float f, java.util.EnumSet enumSet, defpackage.cjj cjjVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-33916316);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.B(-72057594037927936L) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(enumSet) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(cjjVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            boolean zE = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | bveVarC.E(enumSet);
            boolean z = (i2 & 896) == 256;
            java.lang.Object objS = bwcVar.S();
            if ((z | zE) || objS == defpackage.bvd.a) {
                objS = new defpackage.bab(f, cjjVar, enumSet, 3);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVar, (defpackage.affc) objS, bveVarC, i2 & 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new had(this, cgfVar, f, enumSet, cjjVar, i, 2);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getFloat("extra_corner_radius");
            java.util.ArrayList<java.lang.Integer> integerArrayList = arguments.getIntegerArrayList("extra_rounded_corners");
            if (integerArrayList != null) {
                java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.msm.class);
                enumSetNoneOf.getClass();
                this.b = enumSetNoneOf;
                java.util.Iterator<java.lang.Integer> it = integerArrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    java.lang.Integer next = it.next();
                    java.util.EnumSet enumSet = this.b;
                    defpackage.afef afefVar = defpackage.msm.e;
                    next.getClass();
                    enumSet.add(afefVar.get(next.intValue()));
                }
            }
            this.c = new defpackage.cjj(arguments.getFloat("extra_inset_left", 0.0f), arguments.getFloat("extra_inset_top", 0.0f), arguments.getFloat("extra_inset_right", 0.0f), arguments.getFloat("extra_inset_bottom", 0.0f));
        }
    }
}
