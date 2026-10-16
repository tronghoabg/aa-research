package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fxj {
    public static final void a(fxk fxkVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        long jC;
        defpackage.ckd ckdVar;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-361305016);
        if (i4 == 0) {
            i3 = i | (true != ((i & 8) == 0 ? bveVarC.C(fxkVar) : bveVarC.E(fxkVar)) ? 2 : 4);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            hkf hkfVar = fxkVar.c;
            if (hkfVar == null) {
                bveVarC.v(-449551634);
                ((defpackage.bwc) bveVarC).Y(false);
                ckdVar = null;
            } else {
                bveVarC.v(-449551633);
                defpackage.ckd ckdVar2 = new defpackage.ckd(fww.g(hkfVar.b(bveVarC), 0L, 2, bveVarC, 10));
                if (ckdVar2.a == 16) {
                    ckdVar2 = null;
                }
                if (ckdVar2 == null) {
                    bveVarC.v(1031634050);
                    jC = defpackage.gvt.e(bveVarC).C();
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(1031625804);
                    ((defpackage.bwc) bveVarC).Y(false);
                    jC = ckdVar2.a;
                }
                ((defpackage.bwc) bveVarC).Y(false);
                ckdVar = new defpackage.ckd(jC);
            }
            f(new gah((gfq) null, (fzw) null, fxkVar.b), cgfVar, ckdVar, bveVarC, (i3 & 112) | 8);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(fxkVar, cgfVar2, i, i2, 0);
        }
    }

    public static final fxh b(fwi fwiVar, gfa gfaVar, defpackage.afer aferVar, gcy gcyVar) {
        gcw gcwVarC;
        if (gcyVar != null) {
            hmb hmbVar = hmb.a;
            hmbVar.getClass();
            gcwVarC = gcx.c(gcyVar, gfaVar, hmbVar);
        } else {
            gcwVarC = null;
        }
        gam gamVar = fwiVar.b;
        gbm gbmVarD = gamVar != null ? fyh.d(gamVar, (hce) null) : null;
        androidx.car.app.model.CarColor carColor = fwiVar.e;
        fxh fxhVar = new fxh(gcwVarC, gbmVarD, aferVar != null ? new fke(aferVar, 20) : null, fwiVar.d, carColor != null ? hag.k(carColor, gfaVar.d().g()) : null, fwiVar.f, (hkf) null);
        hag.j(fxhVar, fwiVar);
        return fxhVar;
    }

    public static final fxx c(fwl fwlVar, gfa gfaVar, defpackage.afer aferVar, gcy gcyVar) {
        fxd fxkVar;
        fwlVar.getClass();
        if (fwlVar instanceof fwk) {
            fwk fwkVar = (fwk) fwlVar;
            fwg fwgVar = fwkVar.a;
            long jB = fwgVar.b();
            long j = defpackage.afqt.k(new aitq(fwgVar.a()), new aitq(0L), new aitq(jB)).c;
            fxh fxhVarB = b(fwkVar.b, gfaVar, aferVar, gcyVar);
            ghi ghiVarL = gfaVar.l(ghi.class);
            fxkVar = new fxd(fxhVarB, jB, j, ghiVarL != null ? ghiVarL.d : fwgVar.b, aferVar != null ? new fke(aferVar, 20) : null);
        } else if (fwlVar instanceof fwi) {
            fxkVar = b((fwi) fwlVar, gfaVar, aferVar, gcyVar);
        } else {
            if (!(fwlVar instanceof fwj)) {
                throw new defpackage.afas();
            }
            fwj fwjVar = (fwj) fwlVar;
            gbm gbmVarD = fyh.d(fwjVar.a, (hce) null);
            androidx.car.app.model.CarColor carColor = fwjVar.b;
            fxkVar = new fxk(gbmVarD, carColor != null ? hag.k(carColor, gfaVar.d().g()) : null);
        }
        hag.j(fxkVar, fwlVar);
        return fxkVar;
    }

    public static final java.util.List d(java.util.List list, gfa gfaVar) {
        list.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.afga.ai();
            }
            gfa gfaVar2 = gfaVar;
            arrayList.add(fvv.d((fwe) obj, gfaVar2, i == 0 ? fxg.e : fxg.b, false, i == 0 ? fwr.e : fwr.c, (hly) null, (fwo) null, false, 0, 244));
            i = i2;
            gfaVar = gfaVar2;
        }
        return arrayList;
    }

    public static /* synthetic */ fxx e(fwl fwlVar, gfa gfaVar, gcy gcyVar, int i) {
        defpackage.afer aferVarD = (i & 2) != 0 ? fwlVar.d() : null;
        if ((i & 4) != 0) {
            gcyVar = fwlVar.c();
        }
        return c(fwlVar, gfaVar, aferVarD, gcyVar);
    }

    public static final void f(gah gahVar, defpackage.cgf cgfVar, defpackage.ckd ckdVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1366213624);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(gahVar) : bveVarC.E(gahVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(ckdVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            long jH = defpackage.ckd.h(defpackage.bxi.n(bveVarC).B, 0.5f);
            defpackage.gaw gawVar = (defpackage.gaw) bveVarC.f(defpackage.gbp.a);
            bveVarC.v(-1328676580);
            defpackage.cgf cgfVarI = defpackage.awj.i(cgfVar, ckdVar != null ? 48.0f : 56.0f);
            if (ckdVar == null) {
                boolean zE = bveVarC.E(gawVar) | bveVarC.B(jH);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (zE || objS == defpackage.bvd.a) {
                    objS = new fzy(gawVar, jH, 0);
                    bwcVar.ad(objS);
                }
                cgfVarI = defpackage.dai.ak(cgfVarI, (defpackage.affc) objS);
            }
            ((defpackage.bwc) bveVarC).Y(false);
            fxy.c(gahVar, 56.0f, defpackage.asq.H(cgfVarI, 4.0f), (defpackage.cfu) null, (defpackage.csr) null, ckdVar, (defpackage.cld) null, true, false, (defpackage.affg) null, bveVarC, (i2 & 14) | 12582968 | ((i2 << 9) & 458752), 0, 1880);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf((java.lang.Object) gahVar, cgfVar, (java.lang.Object) ckdVar, i, 11);
        }
    }

    public static final void g(android.graphics.drawable.Drawable drawable, defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-622866133);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(drawable) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cfuVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(csrVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.z(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(ckeVar) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS2;
            boolean zC = bveVarC.C(context) | bveVarC.C(drawable);
            boolean z = (i2 & 7168) == 2048;
            java.lang.Object objS3 = bwcVar.S();
            if ((zC | z) || objS3 == obj) {
                ftg ftgVar = new ftg(context);
                ftgVar.a = drawable;
                if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                    ftgVar.g(new defpackage.kqe[]{new defpackage.kqe(csrVar)});
                }
                objS3 = ftgVar.a();
                bwcVar.ad(objS3);
            }
            fti ftiVar = (fti) objS3;
            defpackage.cgf cgfVarY = defpackage.dai.y(cgfVar, "PainterFallback");
            defpackage.cne cneVarN = n(bwxVar);
            defpackage.cne cneVarN2 = n(bwxVar);
            java.lang.Object objS4 = bwcVar.S();
            if (objS4 == obj) {
                objS4 = new defpackage.fzs(bwxVar, 2);
                bwcVar.ad(objS4);
            }
            defpackage.dtf.h(ftiVar, cgfVarY, cneVarN, cneVarN2, null, (defpackage.affc) objS4, cfuVar, csrVar, f, ckeVar, 0, bveVarC, ((i2 << 21) & 1879048192) | 12619824, (i2 >> 9) & 1022);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new fzx(drawable, cgfVar, cfuVar, csrVar, f, ckeVar, i, 0);
        }
    }

    public static final defpackage.cgf h(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        cgfVar.getClass();
        affcVar.getClass();
        return defpackage.tn.g(cgfVar, new dnh(affcVar, 9));
    }

    public static final defpackage.cgf i(defpackage.cgf cgfVar, defpackage.cit citVar, defpackage.cit citVar2, defpackage.cit citVar3, defpackage.cit citVar4) {
        cgfVar.getClass();
        return h(cgfVar, new gbf(citVar2, citVar, citVar3, citVar4, 3));
    }

    public static final defpackage.bna j() {
        float f = giw.c.g;
        return new defpackage.bna(f, f, f, f, giw.a.g);
    }

    public static final defpackage.bmv k() {
        defpackage.avv avvVar = defpackage.bms.a;
        float f = giw.c.g;
        return defpackage.bms.a(f, f, f, f, giw.a.g, 0);
    }

    public static final void l(defpackage.afer aferVar) {
        aiut aiutVar = aivl.a;
        ahoc.d(ahoi.b(ajdt.a), (defpackage.afdo) null, 0, new git(aferVar, (defpackage.afdk) null), 3);
    }

    public static boolean m(java.util.List list, java.util.List list2, int i) {
        java.util.List listO = o(list);
        java.util.List listO2 = o(list2);
        if (listO.size() != listO2.size()) {
            gnb.c("CarApp.H.Dis", "REFRESH check failed. Different item list sizes. Old: %d. New: %d", new java.lang.Object[]{java.lang.Integer.valueOf(listO.size()), java.lang.Integer.valueOf(listO2.size())});
            return false;
        }
        for (int i2 = 0; i2 < listO.size(); i2++) {
            androidx.car.app.model.Row row = (uk) listO.get(i2);
            androidx.car.app.model.Row row2 = (uk) listO2.get(i2);
            if (row.getClass() != row2.getClass()) {
                gnb.c("CarApp.H.Dis", "REFRESH check failed. Different item types at index %d. Old: %s. New: %s", new java.lang.Object[]{java.lang.Integer.valueOf(i2), row.getClass(), row2.getClass()});
                return false;
            }
            if (i == 2) {
                if (row instanceof androidx.car.app.model.Row) {
                    androidx.car.app.model.Row row3 = row;
                    androidx.car.app.model.Row row4 = row2;
                    androidx.car.app.model.Toggle toggle = row3.getToggle();
                    androidx.car.app.model.Toggle toggle2 = row4.getToggle();
                    if ((toggle == null || toggle2 == null || toggle.isChecked() == toggle2.isChecked()) && !p(row3.getTitle(), row4.getTitle())) {
                        gnb.c("CarApp.H.Dis", "REFRESH check failed. Different row titles at index %d. Old: %s. New: %s", new java.lang.Object[]{java.lang.Integer.valueOf(i2), row3.getTitle(), row4.getTitle()});
                        return false;
                    }
                } else if (row instanceof androidx.car.app.model.GridItem) {
                    androidx.car.app.model.GridItem gridItem = (androidx.car.app.model.GridItem) row;
                    androidx.car.app.model.GridItem gridItem2 = (androidx.car.app.model.GridItem) row2;
                    if (!p(gridItem.getTitle(), gridItem2.getTitle())) {
                        gnb.c("CarApp.H.Dis", "REFRESH check failed. Different grid item titles at index %d. Old: %s. New: %s", new java.lang.Object[]{java.lang.Integer.valueOf(i2), gridItem.getTitle(), gridItem2.getTitle()});
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    private static final defpackage.cne n(defpackage.bwx bwxVar) {
        return (defpackage.cne) bwxVar.a();
    }

    private static java.util.List o(java.util.List list) {
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.hmj(1));
        int i = defpackage.ygw.d;
        return (java.util.List) streamFilter.collect(defpackage.yds.a);
    }

    private static boolean p(androidx.car.app.model.CarText carText, androidx.car.app.model.CarText carText2) {
        if (carText == null || carText2 == null) {
            return carText == null && carText2 == null;
        }
        return j$.util.Objects.equals(carText.toString(), carText2.toString());
    }
}
