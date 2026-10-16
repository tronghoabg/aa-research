package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nby {
    private final float a;
    private final int b;
    private final int c;

    public nby(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final void a(java.lang.String str, defpackage.cgf cgfVar, boolean z, int i, defpackage.bve bveVar, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        defpackage.bve bveVar2;
        int i7;
        boolean z4;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        boolean z5;
        defpackage.cgf cgfVar5;
        int i8;
        java.lang.String str2;
        int i9;
        defpackage.dgd dgdVarW;
        int i10;
        int i11 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1591791800);
        if (i11 == 0) {
            i4 = (true != bveVarC.C(str) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i5 != 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                if (true != bveVarC.D(z)) {
                    i6 = 128;
                } else {
                    i6 = 256;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            if ((i2 & 24576) == 0) {
                if (true != bveVarC.C(this)) {
                    i10 = 8192;
                } else {
                    i10 = 16384;
                }
                i4 |= i10;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i4 & 1)) {
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i2 & 1) != 0 || bveVarC.F()) {
                    if (i12 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    z5 = z & z2;
                    cgfVar5 = cgfVar4;
                    i8 = this.c;
                } else {
                    bveVarC.s();
                    i8 = i;
                    z5 = z;
                    cgfVar5 = cgfVar2;
                }
                bveVarC.l();
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                defpackage.cgf cgfVarY = defpackage.dai.y(cgfVar5, "title");
                if (!z5 || defpackage.dlr.a(this.a, 280.0f) < 0) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                int i13 = this.b;
                if (defpackage.lem.a.a().b()) {
                    bveVarC.v(-335160632);
                    dgdVarW = defpackage.dgd.w(defpackage.bxi.p(bveVarC).h, defpackage.gvt.e(bveVarC).T(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214);
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-335043204);
                    dgdVarW = defpackage.bxi.p(bveVarC).h;
                    bwcVar.Y(false);
                }
                bveVar2 = bveVarC;
                defpackage.brv.b(str2, cgfVarY, 0L, 0L, null, 0L, new defpackage.dlb(i8), 0L, i13, false, i9, 0, defpackage.myx.c(dgdVarW), bveVar2, 0, 0, 109564);
                i7 = i8;
                z4 = z5;
                cgfVar3 = cgfVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                i7 = i;
                z4 = z;
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nbx(this, str, cgfVar3, z4, i7, i2, i3);
            }
        }
        i4 |= 48;
        cgfVar2 = cgfVar;
        i5 = i3 & 4;
        if (i5 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (true != bveVarC.D(z)) {
                i6 = 128;
            } else {
                i6 = 256;
            }
            i4 |= i6;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            if (true != bveVarC.C(this)) {
                i10 = 8192;
            } else {
                i10 = 16384;
            }
            i4 |= i10;
        }
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i4 & 1)) {
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 = z & z2;
                cgfVar5 = cgfVar4;
                i8 = this.c;
            } else {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 = z & z2;
                cgfVar5 = cgfVar4;
                i8 = this.c;
            }
            bveVarC.l();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            defpackage.cgf cgfVarY2 = defpackage.dai.y(cgfVar5, "title");
            if (z5) {
                i9 = 1;
            } else {
                i9 = 1;
            }
            int i14 = this.b;
            if (defpackage.lem.a.a().b()) {
                bveVarC.v(-335160632);
                dgdVarW = defpackage.dgd.w(defpackage.bxi.p(bveVarC).h, defpackage.gvt.e(bveVarC).T(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-335043204);
                dgdVarW = defpackage.bxi.p(bveVarC).h;
                bwcVar.Y(false);
            }
            bveVar2 = bveVarC;
            defpackage.brv.b(str2, cgfVarY2, 0L, 0L, null, 0L, new defpackage.dlb(i8), 0L, i14, false, i9, 0, defpackage.myx.c(dgdVarW), bveVar2, 0, 0, 109564);
            i7 = i8;
            z4 = z5;
            cgfVar3 = cgfVar5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            i7 = i;
            z4 = z;
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nbx(this, str, cgfVar3, z4, i7, i2, i3);
        }
    }
}
