package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbl {
    public static final defpackage.bvm k;
    public static final defpackage.bvm l;
    public static final defpackage.bvm m;
    public static final defpackage.bvm n;
    public static final defpackage.bvm o;
    public static final defpackage.bvm p;
    public static final defpackage.bvm q;
    public static final defpackage.bvm r;
    public static final defpackage.bvm s;
    private static final defpackage.bvm z;
    public static final defpackage.bvm a = new defpackage.byu(new defpackage.con(9));
    private static final defpackage.bvm t = new defpackage.byu(defpackage.con.a);
    private static final defpackage.bvm u = new defpackage.byu(defpackage.con.a);
    private static final defpackage.bvm v = new defpackage.byu(new defpackage.cew("LocalAutofillTree", 17));
    private static final defpackage.bvm w = new defpackage.byu(defpackage.con.a);
    private static final defpackage.bvm x = new defpackage.byu(new defpackage.cew("LocalClipboardManager", 17));
    public static final defpackage.bvm b = new defpackage.byu(new defpackage.cew("LocalClipboard", 17));
    public static final defpackage.bvm c = new defpackage.byu(new defpackage.cew("LocalGraphicsContext", 17));
    public static final defpackage.bvm d = new defpackage.byu(new defpackage.cew("LocalDensity", 17));
    public static final defpackage.bvm e = new defpackage.byu(new defpackage.cew("LocalFocusManager", 17));
    private static final defpackage.bvm y = new defpackage.byu(new defpackage.cew("LocalFontLoader", 17));
    public static final defpackage.bvm f = new defpackage.byu(new defpackage.cew("LocalFontFamilyResolver", 17));
    public static final defpackage.bvm g = new defpackage.byu(new defpackage.cew("LocalHapticFeedback", 17));
    public static final defpackage.bvm h = new defpackage.byu(new defpackage.cew("LocalInputModeManager", 17));
    public static final defpackage.bvm i = new defpackage.byu(new defpackage.cew("LocalLayoutDirection", 17));
    public static final defpackage.bvm j = new defpackage.byu(new defpackage.cew("LocalProvidableLocaleList", 17));

    static {
        new defpackage.bvo(new defpackage.cyw(5));
        z = new defpackage.byu(defpackage.con.a);
        k = new defpackage.byu(defpackage.con.a);
        l = new defpackage.byu(new defpackage.cew("LocalTextToolbar", 17));
        int i2 = 6;
        m = new defpackage.byt(new defpackage.cyw(i2));
        n = new defpackage.byu(new defpackage.cew("LocalViewConfiguration", 17));
        o = new defpackage.byu(new defpackage.cew("LocalWindowInfo", 17));
        p = new defpackage.byu(new defpackage.con(i2));
        q = new defpackage.byu(defpackage.con.a);
        r = new defpackage.bvv(defpackage.bxv.c, new defpackage.con(7));
        s = new defpackage.byu(new defpackage.con(8));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    public static final void a(defpackage.cyu cyuVar, defpackage.affg affgVar, defpackage.bve bveVar, int i2) {
        int i3;
        boolean z2;
        java.lang.Object objS;
        boolean z3;
        java.lang.Object objS2;
        boolean z4;
        java.lang.Object objS3;
        java.lang.Object objS4;
        int i4 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(915119540);
        int i5 = 2;
        int i6 = 4;
        int i7 = 1;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? bveVarC.C(cyuVar) : bveVarC.E(cyuVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        int i8 = 0;
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            bveVarC.v(-2125775525);
            defpackage.bxk[] bxkVarArr = new defpackage.bxk[23];
            defpackage.czz czzVar = (defpackage.czz) cyuVar;
            bxkVarArr[0] = t.b(czzVar.P().t);
            bxkVarArr[1] = u.b(czzVar.u);
            bxkVarArr[2] = w.b(czzVar.Q);
            int i9 = 3;
            bxkVarArr[3] = v.b(czzVar.V);
            bxkVarArr[4] = x.b(cyuVar.G());
            bxkVarArr[5] = b.b(czzVar.P().s);
            bxkVarArr[6] = d.b(cyuVar.r());
            bxkVarArr[7] = e.b(czzVar.J);
            bxkVarArr[8] = y.c(czzVar.P().o);
            bxkVarArr[9] = f.c(cyuVar.J());
            bxkVarArr[10] = g.b(czzVar.P().u);
            int i10 = i3 & 14;
            defpackage.bvm bvmVar = h;
            boolean z5 = i10 == 4 || ((i3 & 8) != 0 && bveVarC.E(cyuVar));
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS5 = bwcVar.S();
            if (z5 || objS5 == defpackage.bvd.a) {
                objS5 = new defpackage.dbj(cyuVar, i7);
                bwcVar.ad(objS5);
            }
            bxkVarArr[11] = new defpackage.bxk(bvmVar, null, false, null, (defpackage.affc) objS5, false);
            bxkVarArr[12] = i.b(cyuVar.s());
            defpackage.bvm bvmVar2 = z;
            if (i10 != 4) {
                if ((i3 & 8) == 0 || !bveVarC.E(cyuVar)) {
                    z2 = false;
                }
                objS = bwcVar.S();
                if (z2 || objS == defpackage.bvd.a) {
                    objS = new defpackage.dbj(cyuVar, i8);
                    bwcVar.ad(objS);
                }
                bxkVarArr[13] = new defpackage.bxk(bvmVar2, null, false, null, (defpackage.affc) objS, false);
                defpackage.bvm bvmVar3 = k;
                if (i10 != 4 || ((i3 & 8) != 0 && bveVarC.E(cyuVar))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objS2 = bwcVar.S();
                if (z3 || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.dbj(cyuVar, i5);
                    bwcVar.ad(objS2);
                }
                bxkVarArr[14] = new defpackage.bxk(bvmVar3, null, false, null, (defpackage.affc) objS2, false);
                defpackage.bvm bvmVar4 = l;
                if (i10 != 4 || ((i3 & 8) != 0 && bveVarC.E(cyuVar))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objS3 = bwcVar.S();
                if (z4 || objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.dbj(cyuVar, i9);
                    bwcVar.ad(objS3);
                }
                bxkVarArr[15] = new defpackage.bxk(bvmVar4, null, false, null, (defpackage.affc) objS3, false);
                bxkVarArr[16] = m.b(cyuVar.K());
                bxkVarArr[17] = n.b(cyuVar.q());
                bxkVarArr[18] = o.b(czzVar.P().i);
                defpackage.bvm bvmVar5 = q;
                if (i10 != 4 && ((i3 & 8) == 0 || !bveVarC.E(cyuVar))) {
                    i7 = 0;
                }
                objS4 = bwcVar.S();
                if (i7 == 0 || objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.dbj(cyuVar, i6);
                    bwcVar.ad(objS4);
                }
                bxkVarArr[19] = new defpackage.bxk(bvmVar5, null, false, null, (defpackage.affc) objS4, false);
                bxkVarArr[20] = c.b(czzVar.P);
                bxkVarArr[21] = defpackage.cdl.a.b(czzVar.h);
                bxkVarArr[22] = j.b((defpackage.dkl) czzVar.t.a());
                defpackage.dai.aB(bxkVarArr, affgVar, bveVarC, (i3 & 112) | 8);
                bwcVar.Y(false);
            } else {
                i10 = 4;
            }
            z2 = true;
            objS = bwcVar.S();
            if (z2) {
                objS = new defpackage.dbj(cyuVar, i8);
                bwcVar.ad(objS);
            } else {
                objS = new defpackage.dbj(cyuVar, i8);
                bwcVar.ad(objS);
            }
            bxkVarArr[13] = new defpackage.bxk(bvmVar2, null, false, null, (defpackage.affc) objS, false);
            defpackage.bvm bvmVar6 = k;
            if (i10 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            objS2 = bwcVar.S();
            if (z3) {
                objS2 = new defpackage.dbj(cyuVar, i5);
                bwcVar.ad(objS2);
            } else {
                objS2 = new defpackage.dbj(cyuVar, i5);
                bwcVar.ad(objS2);
            }
            bxkVarArr[14] = new defpackage.bxk(bvmVar6, null, false, null, (defpackage.affc) objS2, false);
            defpackage.bvm bvmVar7 = l;
            if (i10 != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            objS3 = bwcVar.S();
            if (z4) {
                objS3 = new defpackage.dbj(cyuVar, i9);
                bwcVar.ad(objS3);
            } else {
                objS3 = new defpackage.dbj(cyuVar, i9);
                bwcVar.ad(objS3);
            }
            bxkVarArr[15] = new defpackage.bxk(bvmVar7, null, false, null, (defpackage.affc) objS3, false);
            bxkVarArr[16] = m.b(cyuVar.K());
            bxkVarArr[17] = n.b(cyuVar.q());
            bxkVarArr[18] = o.b(czzVar.P().i);
            defpackage.bvm bvmVar8 = q;
            if (i10 != 4) {
                i7 = 0;
            }
            objS4 = bwcVar.S();
            if (i7 == 0) {
                objS4 = new defpackage.dbj(cyuVar, i6);
                bwcVar.ad(objS4);
            } else {
                objS4 = new defpackage.dbj(cyuVar, i6);
                bwcVar.ad(objS4);
            }
            bxkVarArr[19] = new defpackage.bxk(bvmVar8, null, false, null, (defpackage.affc) objS4, false);
            bxkVarArr[20] = c.b(czzVar.P);
            bxkVarArr[21] = defpackage.cdl.a.b(czzVar.h);
            bxkVarArr[22] = j.b((defpackage.dkl) czzVar.t.a());
            defpackage.dai.aB(bxkVarArr, affgVar, bveVarC, (i3 & 112) | 8);
            bwcVar.Y(false);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.dbk(cyuVar, affgVar, i2, i8);
        }
    }
}
