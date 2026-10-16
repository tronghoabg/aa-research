package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdu implements defpackage.cds {
    public static final defpackage.cdz d = new defpackage.cdz(new defpackage.abw(11), new defpackage.bwy(3));
    public final java.util.Map a;
    public defpackage.cdv b;
    public final defpackage.aau c;
    private final defpackage.affc e;

    public cdu(java.util.Map map) {
        this.a = map;
        long[] jArr = defpackage.aav.a;
        this.c = new defpackage.aau(6);
        this.e = new defpackage.bjm(this, 18);
    }

    @Override // defpackage.cds
    public final void c(java.lang.Object obj, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(533563200);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(this) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            bveVarC.L(obj);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj2 = defpackage.bvd.a;
            if (objS == obj2) {
                defpackage.affc affcVar = this.e;
                if (!((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bl(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                java.util.Map map = (java.util.Map) this.a.get(obj);
                defpackage.bvm bvmVar = defpackage.cdx.a;
                defpackage.cdy cdyVar = new defpackage.cdy(new defpackage.cdw(map, affcVar));
                bwcVar.ad(cdyVar);
                objS = cdyVar;
            }
            defpackage.cdy cdyVar2 = (defpackage.cdy) objS;
            defpackage.dai.aB(new defpackage.bxk[]{defpackage.cdx.a.b(cdyVar2), defpackage.fbp.a.b(cdyVar2)}, affgVar, bveVarC, (i2 & 112) | 8);
            defpackage.afbk afbkVar = defpackage.afbk.a;
            boolean zE = bveVarC.E(this) | bveVarC.E(obj) | bveVarC.E(cdyVar2);
            java.lang.Object objS2 = bwcVar.S();
            if (zE || objS2 == obj2) {
                defpackage.acn acnVar = new defpackage.acn((java.lang.Object) this, obj, (java.lang.Object) cdyVar2, 13, (char[]) null);
                bwcVar.ad(acnVar);
                objS2 = acnVar;
            }
            defpackage.bvx.c(afbkVar, (defpackage.affc) objS2, bveVarC);
            bveVarC.q();
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(this, obj, affgVar, i, 8, null);
        }
    }

    public cdu() {
        this((byte[]) null);
    }

    public /* synthetic */ cdu(byte[] bArr) {
        this(new java.util.LinkedHashMap());
    }
}
