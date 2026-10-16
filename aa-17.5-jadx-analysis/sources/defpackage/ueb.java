package defpackage;

/* loaded from: classes3.dex */
public abstract class ueb implements udx {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/RenderOpInfoImpl");

    public static ueb ao(abcs abcsVar, int i, trt trtVar, ucr ucrVar) {
        return ap(abcsVar, null, null, i, false, trtVar, ucrVar, null, null, (abcsVar.b & 2) != 0, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ueb ap(defpackage.abcs r24, defpackage.ujq r25, defpackage.wnq r26, int r27, boolean r28, defpackage.trt r29, defpackage.ucr r30, defpackage.abcs r31, defpackage.udw r32, boolean r33, long r34) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ueb.ap(abcs, ujq, wnq, int, boolean, trt, ucr, abcs, udw, boolean, long):ueb");
    }

    public abstract boolean M();

    @Override // defpackage.udx
    public int O() {
        throw null;
    }

    @Override // defpackage.udx
    public abdl P() {
        throw null;
    }

    @Override // defpackage.udx
    public tql Q() {
        throw null;
    }

    @Override // defpackage.udx
    public final int T() {
        return n().h;
    }

    @Override // defpackage.udx
    public final int U() {
        ujq ujqVarK = k();
        if (ujqVarK == null || (ujqVarK.b & 16) == 0) {
            return -1;
        }
        return ujqVarK.g;
    }

    @Override // defpackage.udx
    public final int V() {
        ujq ujqVarK = k();
        if (ujqVarK == null) {
            return 0;
        }
        return ujqVarK.e;
    }

    @Override // defpackage.udx
    public final udx W(abcs abcsVar) {
        abcs abcsVarM = m();
        ujq ujqVarK = k();
        wnq wnqVarS = S();
        int iC = c();
        boolean zM = M();
        trt trtVarG = g();
        ucr ucrVarH = h();
        if (abcsVarM == null) {
            abcsVarM = n();
        }
        return ap(abcsVar, ujqVarK, wnqVarS, iC, zM, trtVarG, ucrVarH, abcsVarM, i(), (abcsVar.b & 2) != 0, -1L);
    }

    @Override // defpackage.udx
    public final udx X() {
        udz udzVarJ = j();
        udzVarJ.H = null;
        return udzVarJ.a();
    }

    @Override // defpackage.udx
    public final abgl Y() {
        ujq ujqVarK = k();
        if (ujqVarK == null) {
            return null;
        }
        abgl abglVarB = abgl.b(ujqVarK.f);
        return abglVarB == null ? abgl.UNKNOWN : abglVarB;
    }

    @Override // defpackage.udx
    public final boolean Z(float f) {
        return f >= b() && f < a();
    }

    @Override // defpackage.udx
    public final boolean aa() {
        return uqf.c(T(), 8);
    }

    @Override // defpackage.udx
    public final boolean ab() {
        return N() == 20;
    }

    @Override // defpackage.udx
    public final boolean ac() {
        return N() == 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // defpackage.udx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ad() {
        /*
            r4 = this;
            boolean r0 = r4.ae()
            r1 = 1
            if (r0 != 0) goto L72
            boolean r0 = r4.w()
            if (r0 == 0) goto L37
            abcs r0 = r4.n()
            abnh r2 = defpackage.abbf.ae
            r0.j(r2)
            abnl r0 = r0.w
            abnu r3 = r2.d
            java.lang.Object r0 = r0.j(r3)
            if (r0 != 0) goto L23
            java.lang.Object r0 = r2.b
            goto L27
        L23:
            java.lang.Object r0 = r2.c(r0)
        L27:
            abbb r0 = (defpackage.abbb) r0
            int r0 = r0.b
            if (r0 != r1) goto L72
            abcs r0 = r4.n()
            int r0 = r0.b
            r0 = r0 & 8
            if (r0 == 0) goto L72
        L37:
            boolean r0 = r4.C()
            if (r0 != 0) goto L72
            boolean r0 = r4.K()
            if (r0 != 0) goto L72
            boolean r0 = r4.v()
            if (r0 != 0) goto L72
            boolean r0 = r4.u()
            if (r0 != 0) goto L72
            boolean r0 = r4.af()
            if (r0 != 0) goto L72
            int r0 = r4.N()
            r2 = 2
            if (r0 != r2) goto L5d
            goto L72
        L5d:
            int r0 = r4.N()
            r2 = 5
            if (r0 == r2) goto L72
            boolean r0 = r4.D()
            if (r0 != 0) goto L72
            boolean r4 = r4.z()
            if (r4 != 0) goto L72
            r4 = 0
            return r4
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ueb.ad():boolean");
    }

    @Override // defpackage.udx
    public final boolean ae() {
        if (!M()) {
            return k() == null;
        }
        abdl abdlVarP = P();
        abnh abnhVar = abhe.a;
        abdlVarP.j(abnhVar);
        abnl abnlVar = abdlVarP.w;
        abnu abnuVar = abnhVar.d;
        if (abnlVar.m(abnuVar)) {
            abdl abdlVarP2 = P();
            abdlVarP2.j(abnhVar);
            Object objJ = abdlVarP2.w.j(abnuVar);
            if ((((abhd) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.udx
    public final boolean af() {
        return N() == 6;
    }

    @Override // defpackage.udx
    public final boolean ag() {
        return N() == 3;
    }

    @Override // defpackage.udx
    public final boolean ah() {
        return aj() && !uqf.c(T(), 16);
    }

    @Override // defpackage.udx
    public final boolean ai() {
        return (aj() && uqf.c(T(), 2)) ? false : true;
    }

    @Override // defpackage.udx
    public final boolean aj() {
        return uqf.c(T(), 1);
    }

    @Override // defpackage.udx
    public final boolean ak() {
        return aj() && !uqf.c(T(), 2);
    }

    @Override // defpackage.udx
    public final boolean al() {
        return uqf.c(T(), 16);
    }

    @Override // defpackage.udx
    public final boolean am() {
        return N() == 17;
    }

    @Override // defpackage.udx
    public final boolean an() {
        return N() == 19;
    }

    public abstract long e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof udx)) {
            return false;
        }
        udx udxVar = (udx) obj;
        return d() == udxVar.d() && n().equals(udxVar.n());
    }

    public abstract trt g();

    public final int hashCode() {
        return (((((int) (d() ^ (d() >>> 32))) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + n().hashCode();
    }

    public abstract udz j();

    public abstract ujq k();
}
