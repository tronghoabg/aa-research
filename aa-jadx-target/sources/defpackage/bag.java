package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bag implements defpackage.cdv, defpackage.cds {
    public final defpackage.aaw a;
    private final defpackage.cdv b;
    private final defpackage.cds c;

    public bag(defpackage.cdv cdvVar, java.util.Map map, defpackage.cds cdsVar) {
        defpackage.aun aunVar = new defpackage.aun(cdvVar, 19);
        defpackage.bvm bvmVar = defpackage.cdx.a;
        this.b = new defpackage.cdw(map, aunVar);
        this.c = cdsVar;
        defpackage.aaw aawVar = defpackage.aax.a;
        this.a = new defpackage.aaw(6);
    }

    @Override // defpackage.cdv
    public final java.lang.Object a(java.lang.String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[LOOP:0: B:5:0x000d->B:18:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[EDGE_INSN: B:22:0x0053->B:19:0x0053 BREAK  A[LOOP:0: B:5:0x000d->B:18:0x0050], SYNTHETIC] */
    @Override // defpackage.cdv
    public final java.util.Map b() {
        int i;
        defpackage.aaw aawVar = this.a;
        java.lang.Object[] objArr = aawVar.b;
        long[] jArr = aawVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            defpackage.cdu cduVar = (defpackage.cdu) this.c;
                            if (cduVar.c.i(obj) == null) {
                                cduVar.a.remove(obj);
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return this.b.b();
    }

    @Override // defpackage.cds
    public final void c(java.lang.Object obj, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-858296452);
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
            this.c.c(obj, affgVar, bveVarC, i2 & 126);
            boolean zE = bveVarC.E(this) | bveVarC.E(obj);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.ajy(this, obj, 15, null);
                bwcVar.ad(objS);
            }
            defpackage.bvx.c(obj, (defpackage.affc) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(this, obj, affgVar, i, 2, null);
        }
    }

    @Override // defpackage.cdv
    public final boolean d(java.lang.Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.cdv
    public final defpackage.rqj e(java.lang.String str, defpackage.afer aferVar) {
        return this.b.e(str, aferVar);
    }
}
