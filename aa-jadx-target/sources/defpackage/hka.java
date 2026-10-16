package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hka {
    public static final defpackage.hka a = new defpackage.hka();
    private static final java.util.Map b = new java.util.LinkedHashMap();

    public static final void b(defpackage.afie afieVar, defpackage.affi affiVar) {
        afieVar.getClass();
        b.put(afieVar, new defpackage.ccz(-2138582647, true, new dxt(affiVar, 3)));
    }

    public final void a(hkd hkdVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        hkdVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-217446702);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(hkdVar) : bveVarC.E(hkdVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.C(this) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            defpackage.affi affiVar = (defpackage.affi) b.get(defpackage.afgw.b(hkdVar.getClass()));
            if (affiVar == null) {
                java.lang.Class<?> cls = hkdVar.getClass();
                java.util.Objects.toString(cls);
                throw new java.lang.NullPointerException("No registered composable for ".concat(java.lang.String.valueOf(cls)));
            }
            affiVar.invoke(hkdVar, cgfVar, bveVarC, java.lang.Integer.valueOf(i3 & 126));
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.dmq(this, hkdVar, cgfVar2, i, i2, 6);
        }
    }
}
