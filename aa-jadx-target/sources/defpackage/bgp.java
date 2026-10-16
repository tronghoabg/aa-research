package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bgp extends defpackage.affy implements defpackage.afer {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(java.lang.Object obj, int i) {
        super(0, obj, defpackage.bhs.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
        this.a = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Code duplicated, block: B:121:0x0168 A[EDGE_INSN: B:121:0x0168->B:92:0x0168 BREAK  A[LOOP:4: B:81:0x0136->B:91:0x0165], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0165 A[LOOP:4: B:81:0x0136->B:91:0x0165, LOOP_END] */
    @Override // defpackage.afer
    public final /* synthetic */ java.lang.Object invoke() throws afbj {
        defpackage.cyg cygVar;
        long j;
        android.view.contentcapture.ContentCaptureSession contentCaptureSessionM;
        int i = this.a;
        if (i == 0) {
            return ((defpackage.bhs) this.receiver).b();
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(((defpackage.akb) this.receiver).e.k(7));
        }
        if (i != 2) {
            if (i != 3) {
                return java.lang.Boolean.valueOf(((defpackage.mku) this.receiver).g("key_settings_use_phone_wallpaper", true));
            }
            android.view.View view = (android.view.View) this.receiver;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                bgp$.ExternalSyntheticApiModelOutline0.m(view, 1);
            }
            if (android.os.Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM = alh$.ExternalSyntheticApiModelOutline0.m(view)) == null) {
                return null;
            }
            return new defpackage.bil(contentCaptureSessionM, view);
        }
        defpackage.cif cifVar = (defpackage.cif) this.receiver;
        defpackage.cik cikVar = (defpackage.cik) cifVar.b;
        defpackage.cjc cjcVarB = cikVar.b();
        long j2 = -9187201950435737472L;
        if (cjcVarB == null) {
            defpackage.aaw aawVar = (defpackage.aaw) cifVar.d;
            java.lang.Object[] objArr = aawVar.b;
            long[] jArr = aawVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j3 = jArr[i2];
                    if ((((~j3) << 7) & j3 & j2) != j2) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i4 = 0;
                        while (i4 < i3) {
                            if ((j3 & 255) < 128) {
                                ((defpackage.cic) objArr[(i2 << 3) + i4]).dC(defpackage.cja.d);
                            }
                            j3 >>= 8;
                            i4++;
                            j2 = j2;
                        }
                        j = j2;
                        if (i3 != 8) {
                            break;
                        }
                    } else {
                        j = j2;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    j2 = j;
                }
            }
        } else if (cjcVarB.A) {
            if (((defpackage.aaw) cifVar.c).a(cjcVarB)) {
                cjcVarB.i();
            }
            defpackage.cja cjaVarG = cjcVarB.g();
            if (!cjcVarB.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cjcVarB.q;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarB);
            int i5 = 0;
            while (cxlVarR != null) {
                if ((cxlVarR.v.f.s & 5120) != 0) {
                    while (cgeVar != null) {
                        int i6 = cgeVar.r;
                        if ((i6 & 5120) != 0) {
                            if ((i6 & 1024) != 0) {
                                i5++;
                            }
                            if (cgeVar instanceof defpackage.cic) {
                                defpackage.aaw aawVar2 = (defpackage.aaw) cifVar.d;
                                if (aawVar2.a(cgeVar)) {
                                    if (i5 <= 1) {
                                        ((defpackage.cic) cgeVar).dC(cjaVarG);
                                    } else {
                                        ((defpackage.cic) cgeVar).dC(defpackage.cja.b);
                                    }
                                    aawVar2.l(cgeVar);
                                }
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
            defpackage.aaw aawVar3 = (defpackage.aaw) cifVar.d;
            java.lang.Object[] objArr2 = aawVar3.b;
            long[] jArr2 = aawVar3.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i7 = 0;
                while (true) {
                    long j4 = jArr2[i7];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length2) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j4 & 255) < 128) {
                                ((defpackage.cic) objArr2[(i7 << 3) + i9]).dC(defpackage.cja.d);
                            }
                            j4 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                        if (i7 != length2) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        if (cikVar.b() == null || cikVar.l() == defpackage.cja.d) {
            cikVar.e();
        }
        ((defpackage.aaw) cifVar.c).d();
        ((defpackage.aaw) cifVar.d).d();
        cifVar.a = false;
        return defpackage.afbk.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, defpackage.akb.class, "requestFocus", "requestFocus()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(java.lang.Object obj, int i, char[] cArr) {
        super(0, obj, defpackage.cif.class, "invalidateNodes", "invalidateNodes()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, defpackage.mku.class, "usePhoneWallpaper", "usePhoneWallpaper()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgp(java.lang.Object obj, int i, short[] sArr) {
        super(0, obj, defpackage.dai.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
        this.a = i;
    }
}
