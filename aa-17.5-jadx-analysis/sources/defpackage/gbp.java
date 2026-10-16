package defpackage;

/* loaded from: classes2.dex */
public final class gbp {
    public static final ary a;
    public static final arz b;

    static {
        ary aryVar = new ary();
        a = aryVar;
        b = new arz(aryVar);
    }

    public static final void a(String str, afec afecVar, afec afecVar2, ieb iebVar, asf asfVar, bux buxVar, int i) {
        int i2;
        afec afecVar3;
        bux buxVar2;
        bvv bvvVar;
        str.getClass();
        afecVar.getClass();
        afecVar2.getClass();
        iebVar.getClass();
        asfVar.getClass();
        bux buxVarC = buxVar.c(-308001541);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(1) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            afecVar3 = afecVar2;
            i2 |= true != buxVarC.E(afecVar3) ? 1024 : 2048;
        } else {
            afecVar3 = afecVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(iebVar) : buxVarC.E(iebVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(asfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.D(false) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.D(false) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            gku gkuVar = (gku) buxVarC.f(gfn.a);
            affq affqVar = new affq();
            affv affvVar = new affv();
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 896) == 256;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            boolean z3 = z | z2;
            byte[] bArr = null;
            if (z3 || objS == buw.a) {
                objS = new fnv(str, afecVar, 15, bArr);
                bvvVar2.ad(objS);
            }
            afec afecVar4 = (afec) objS;
            bvq.g(afak.a, new myu(iebVar, asfVar, affvVar, affqVar, gkuVar, (afck) null, 1), buxVarC);
            Object objS2 = bvvVar2.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new kbx(gkuVar, asfVar, 1);
                bvvVar = bvvVar2;
                bvvVar.ad(objS2);
            } else {
                bvvVar = bvvVar2;
            }
            bvq.c(affvVar.a, new cib((Object) affvVar, objS2, (Object) gkuVar, 11, (char[]) null), buxVarC);
            int i3 = i2 & 29360128;
            Object objS3 = bvvVar.S();
            if (i3 == 8388608 || objS3 == obj) {
                objS3 = new gah(5);
                bvvVar.ad(objS3);
            }
            buxVar2 = buxVarC;
            dmj.b((afec) objS3, das.d(ca.bf(cfy.e, false, null), "search_hacky_editable"), new lkh(affvVar, afecVar4, afecVar3, gkuVar, str, affqVar, 1), buxVar2, 0, 0);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(str, afecVar, afecVar2, iebVar, asfVar, i, 0);
        }
    }
}
