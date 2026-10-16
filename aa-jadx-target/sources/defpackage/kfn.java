package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kfn {
    public static void a() {
    }

    public static android.graphics.Bitmap b(android.graphics.drawable.Drawable drawable, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("width and height must be > 0");
        }
        if (drawable == null) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static android.graphics.Bitmap c(android.graphics.Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i != -1) {
            while (bitmap.getWidth() >= i + i && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) {
                bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true);
            }
        } else {
            i = -1;
        }
        if (android.util.Log.isLoggable("GH.BitmapUtils", 4)) {
            android.util.Log.i("GH.BitmapUtils", java.lang.String.format("Resized from %dx%d to %dx%d for requested width: %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Integer.valueOf(i)));
        }
        return bitmap;
    }

    public static android.graphics.Bitmap d(android.graphics.Bitmap bitmap, int i, int i2) {
        float height;
        float width;
        if (bitmap == null || (bitmap.getHeight() == i2 && bitmap.getWidth() == i)) {
            return bitmap;
        }
        if (bitmap.getHeight() > i2) {
            height = i2 / bitmap.getHeight();
        } else {
            height = 1.0f;
        }
        if (bitmap.getWidth() > i) {
            width = i / bitmap.getWidth();
        } else {
            width = 1.0f;
        }
        if (height <= width) {
            height = width;
        }
        int iCeil = (int) java.lang.Math.ceil(bitmap.getWidth() * height);
        int iCeil2 = (int) java.lang.Math.ceil(bitmap.getHeight() * height);
        android.graphics.Bitmap bitmapCreateScaledBitmap = height < 0.5f ? android.graphics.Bitmap.createScaledBitmap(bitmap, iCeil + iCeil, iCeil2 + iCeil2, true) : bitmap;
        if (height == 1.0f) {
            return bitmapCreateScaledBitmap;
        }
        android.graphics.Bitmap bitmapCreateScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iCeil, iCeil2, true);
        if (bitmapCreateScaledBitmap == bitmap) {
            return bitmapCreateScaledBitmap2;
        }
        bitmapCreateScaledBitmap.recycle();
        return bitmapCreateScaledBitmap2;
    }

    public static android.graphics.Bitmap e(android.graphics.Bitmap bitmap, android.graphics.Path path, int i) {
        if (bitmap == null) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        canvas.drawPath(path, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, rzb] */
    public static defpackage.ygw f(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.xyn xynVar) {
        defpackage.ysr.bk(xynVar.f(), "resetHandler must be present");
        defpackage.koa koaVar = new defpackage.koa(context, scheduledExecutorService, xynVar.b());
        int i = defpackage.ygw.d;
        java.lang.Object[] objArr = {koaVar};
        defpackage.ysr.B(objArr, 1);
        return new defpackage.ymx(objArr, 1);
    }

    public static defpackage.knh g() {
        return (defpackage.knh) defpackage.mkp.a.i(defpackage.knh.class);
    }

    public static final defpackage.nne h() {
        return new defpackage.nne(new com.google.android.apps.auto.components.graphics.icon.GhIcon(8), null, null, null, false, new defpackage.nhn(6));
    }

    public static final void i(defpackage.cgf cgfVar, final defpackage.nne nneVar, final boolean z, boolean z2, defpackage.bve bveVar, final int i, final int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        boolean z3;
        final boolean z4;
        final defpackage.cgf cgfVar3;
        long jK;
        defpackage.bve bveVarC = bveVar.c(-1869301495);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(nneVar) : bveVarC.E(nneVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != bveVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        int i5 = i2 & 8;
        boolean z5 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            defpackage.cgf cgfVar4 = i4 != 0 ? defpackage.cgf.e : cgfVar2;
            final boolean z6 = z2 | (!z5);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS;
            final defpackage.bys bysVarB = defpackage.aef.b(true != ((java.lang.Boolean) bwxVar.a()).booleanValue() ? 1.0f : 0.95f, null, "iconScale", null, bveVarC, 3072, 22);
            int i6 = i3 & 112;
            final defpackage.cld cldVar = defpackage.lfx.c;
            boolean z7 = i6 == 32 || ((i3 & 64) != 0 && bveVarC.C(nneVar));
            boolean z8 = (i3 & 7168) == 2048;
            java.lang.Object objS2 = bwcVar.S();
            int i7 = 3;
            if ((z8 | z7) || objS2 == obj) {
                objS2 = new defpackage.nng(new defpackage.bcp(z6, nneVar, 2), null, new defpackage.bcp(z6, bwxVar, i7), new defpackage.njw(bwxVar, 4));
                bwcVar.ad(objS2);
            }
            final defpackage.gja gjaVarA = ((defpackage.nng) objS2).a(nneVar, null, bveVarC, 2);
            if (defpackage.kfp.i(bveVarC).V()) {
                float fD = defpackage.ckd.d(-4294967296L);
                float fC = defpackage.ckd.c(-4294967296L);
                float fB = defpackage.ckd.b(-4294967296L);
                float[] fArr = defpackage.clr.a;
                jK = defpackage.cjv.k(fD, fC, fB, 0.25f, defpackage.clr.y[0]);
            } else {
                float fD2 = defpackage.ckd.d(-72057594037927936L);
                float fC2 = defpackage.ckd.c(-72057594037927936L);
                float fB2 = defpackage.ckd.b(-72057594037927936L);
                float[] fArr2 = defpackage.clr.a;
                jK = defpackage.cjv.k(fD2, fC2, fB2, 0.05f, defpackage.clr.y[0]);
            }
            final long j = jK;
            final boolean z9 = z3;
            defpackage.cgf cgfVar5 = cgfVar4;
            defpackage.kil.b(defpackage.dai.as(-1392609272, true, new defpackage.cvi(nneVar, 15), bveVarC), cgfVar5, 0.0f, 0L, 0L, null, 0L, defpackage.dai.as(603342049, true, new defpackage.affg() { // from class: nnc
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.ktl ktlVarJ;
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i8 = iIntValue & 3;
                    if (bveVar2.I(i8 != 2, iIntValue & 1)) {
                        final defpackage.cld cldVar2 = cldVar;
                        defpackage.cgf chuVar = defpackage.cgf.e;
                        chuVar.getClass();
                        if (defpackage.lee.a.a().b()) {
                            long j2 = j;
                            if (j2 == 16) {
                                j2 = -72057594037927936L;
                            }
                            chuVar = new defpackage.chu(cldVar2, new defpackage.cnh(3.0f, 0.0f, 0L, j2, 1.0f));
                        }
                        defpackage.cgf cgfVar6 = chuVar;
                        final boolean z10 = z9;
                        if (z10) {
                            bveVar2.v(-274817912);
                            defpackage.afar afarVar = defpackage.ktl.a;
                            ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar2, 255);
                            bveVar2.o();
                        } else {
                            bveVar2.v(-274755323);
                            defpackage.afar afarVar2 = defpackage.ktl.e;
                            long jA = defpackage.kud.a(((defpackage.ktj) afarVar2.a()).a, bveVar2);
                            long j3 = ((defpackage.ktj) afarVar2.a()).b;
                            bveVar2.v(1551263020);
                            bveVar2.o();
                            defpackage.kua kuaVar = ((defpackage.ktj) afarVar2.a()).c;
                            long jA2 = defpackage.kua.a(bveVar2);
                            long j4 = ((defpackage.ktj) afarVar2.a()).d;
                            bveVar2.v(1551263020);
                            bveVar2.o();
                            long j5 = ((defpackage.ktj) afarVar2.a()).e;
                            bveVar2.v(1551263020);
                            bveVar2.o();
                            long j6 = ((defpackage.ktj) afarVar2.a()).f;
                            bveVar2.v(1551263020);
                            bveVar2.o();
                            long j7 = ((defpackage.ktj) afarVar2.a()).g;
                            bveVar2.v(1551263020);
                            bveVar2.o();
                            defpackage.ktl ktlVar = new defpackage.ktl(jA, 0L, 0L, jA2, 0L, 0L, 0L, 0L);
                            bveVar2.o();
                            ktlVarJ = ktlVar;
                        }
                        defpackage.ktf ktfVar = z10 ? defpackage.ktf.c : defpackage.ktf.e;
                        defpackage.gja gjaVar = gjaVarA;
                        java.lang.Object objG = bveVar2.g();
                        if (objG == defpackage.bvd.a) {
                            objG = new defpackage.nhn(5);
                            bveVar2.x(objG);
                        }
                        defpackage.ask askVar = gjaVar.e;
                        final defpackage.bys bysVar = bysVarB;
                        final defpackage.nne nneVar2 = nneVar;
                        final boolean z11 = z6;
                        defpackage.khg.k((defpackage.afer) objG, cgfVar6, ktfVar, z11, false, cldVar2, null, ktlVarJ, null, null, null, askVar, false, null, defpackage.dai.as(-91055494, true, new defpackage.affh() { // from class: nnb
                            @Override // defpackage.affh
                            public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                                float f;
                                defpackage.bve bveVar3 = (defpackage.bve) obj5;
                                int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                                ((defpackage.awd) obj4).getClass();
                                int i9 = iIntValue2 & 17;
                                if (bveVar3.I(i9 != 16, iIntValue2 & 1)) {
                                    java.lang.Object objG2 = bveVar3.g();
                                    java.lang.Object obj7 = defpackage.bvd.a;
                                    if (objG2 == obj7) {
                                        defpackage.ksk kskVar = defpackage.nmr.a;
                                        objG2 = new defpackage.dlr(4.0f);
                                        bveVar3.x(objG2);
                                    }
                                    boolean z12 = z10;
                                    float f2 = ((defpackage.dlr) objG2).a;
                                    java.lang.Object objG3 = bveVar3.g();
                                    if (objG3 == obj7) {
                                        if (z12) {
                                            f = (defpackage.ktf.c.h - ((f2 + f2) + 0.0f)) + 0.0f;
                                        } else {
                                            f = defpackage.lee.a.a().b() ? defpackage.ktf.e.h : defpackage.ktf.e.i;
                                        }
                                        defpackage.dlr dlrVar = new defpackage.dlr(f);
                                        bveVar3.x(dlrVar);
                                        objG3 = dlrVar;
                                    }
                                    defpackage.bys bysVar2 = bysVar;
                                    defpackage.cld cldVar3 = cldVar2;
                                    float f3 = ((defpackage.dlr) objG3).a;
                                    bveVar3.v(-1604965696);
                                    defpackage.cgf cgfVarA = new defpackage.awi(f3, f3, f3, f3, true).a(new defpackage.atj(true));
                                    float fFloatValue = ((java.lang.Number) bysVar2.a()).floatValue();
                                    defpackage.cgf cgfVarU = defpackage.bzd.u(cgfVarA, fFloatValue, fFloatValue);
                                    if (z12) {
                                        long jZ = defpackage.kfp.i(bveVar3).z();
                                        float fD3 = defpackage.ckd.d(jZ);
                                        float fC3 = defpackage.ckd.c(jZ);
                                        float fB3 = defpackage.ckd.b(jZ);
                                        float[] fArr3 = defpackage.clr.a;
                                        long jK2 = defpackage.cjv.k(fD3, fC3, fB3, 0.5f, defpackage.clr.y[(int) (jZ & 63)]);
                                        cgfVarU.getClass();
                                        cldVar3.getClass();
                                        cgfVarU = defpackage.afw.D(defpackage.edd.k(cgfVarU, f2), f2, jK2, cldVar3).a(new defpackage.avr(f2, f2, f2, f2));
                                    }
                                    defpackage.nne nneVar3 = nneVar2;
                                    boolean z13 = z11;
                                    bveVar3.o();
                                    defpackage.cgf cgfVarH = defpackage.cjv.h(cgfVarU, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar3, true, 0, 1042431);
                                    defpackage.ckf ckfVar = (!z13 || nneVar3.e) ? new defpackage.ckf(new float[]{0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}) : null;
                                    defpackage.gjv gjvVar = nneVar3.d;
                                    if (gjvVar != null) {
                                        bveVar3.v(1786130460);
                                        java.lang.Object objG4 = bveVar3.g();
                                        if (objG4 == obj7) {
                                            objG4 = new nli(5);
                                            bveVar3.x(objG4);
                                        }
                                        defpackage.kzi.o(gjvVar, cgfVarH, null, null, 0.0f, ckfVar, null, null, null, (defpackage.affc) objG4, bveVar3, 0, 6, 956);
                                        bveVar3.o();
                                    } else {
                                        bveVar3.v(1786307966);
                                        defpackage.ca.bb(defpackage.lgo.f(nneVar3.a, 0.0f, bveVar3, 3), null, cgfVarH, null, null, 0.0f, ckfVar, bveVar3, 56, 56);
                                        bveVar3.o();
                                    }
                                } else {
                                    bveVar3.s();
                                }
                                return defpackage.afbk.a;
                            }
                        }, bveVar2), bveVar2, 6, 196608, 30544);
                    } else {
                        bveVar2.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVarC, ((i3 << 3) & 112) | 12607494, 108);
            bveVarC = bveVarC;
            z4 = z6;
            cgfVar3 = cgfVar5;
        } else {
            bveVarC.s();
            z4 = z2;
            cgfVar3 = cgfVar2;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nnd
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    defpackage.kfn.i(cgfVar3, nneVar, z, z4, bveVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void j(defpackage.cgf cgfVar, defpackage.nne nneVar, boolean z, boolean z2, final defpackage.afer aferVar, boolean z3, final boolean z4, java.lang.String str, boolean z5, defpackage.bve bveVar, final int i, final int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        final java.lang.String str2;
        defpackage.nne nneVar2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final defpackage.cgf cgfVar3;
        final boolean z9;
        aferVar.getClass();
        int i4 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(1846014216);
        if (i4 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? bveVarC.C(nneVar) : bveVarC.E(nneVar)) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z10 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z) ? 128 : 256;
        }
        int i6 = i2 & 8;
        boolean z11 = i6 == 0;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 8192 : 16384;
        }
        int i7 = i2 & 32;
        boolean z12 = i7 == 0;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != bveVarC.D(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.D(z4) ? 524288 : 1048576;
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 12582912) == 0) {
                i3 |= true != bveVarC.C(str2) ? 4194304 : 8388608;
            }
        }
        int i9 = i2 & 256;
        boolean z13 = i9 == 0;
        if (i9 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != bveVarC.D(z5) ? 33554432 : 67108864;
        }
        if (bveVarC.I((38347923 & i3) != 38347922, i3 & 1)) {
            defpackage.cgf cgfVar4 = i4 != 0 ? defpackage.cgf.e : cgfVar2;
            final boolean z14 = z10 & z;
            boolean z15 = z11 & z2;
            final boolean z16 = z12 & z3;
            if (i8 != 0) {
                str2 = "hotseat";
            }
            final java.lang.String str3 = str2;
            final boolean z17 = (!z13) | z5;
            if (nneVar == null) {
                defpackage.bxl bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new oao(cgfVar4, z14, z15, aferVar, z16, z4, str3, z17, i, i2, 1);
                    return;
                }
                return;
            }
            if (nneVar.a.b == 8 && nneVar.d == null && !z15) {
                defpackage.bxl bxlVarJ2 = bveVarC.J();
                if (bxlVarJ2 != null) {
                    bxlVarJ2.c = new nmw(cgfVar4, nneVar, z14, aferVar, z16, z4, str3, z17, i, i2);
                    return;
                }
                return;
            }
            nneVar2 = nneVar;
            defpackage.agn agnVarP = defpackage.afw.p(nneVar2, "HotseatAnimation", bveVarC, ((i3 >> 3) & 14) | 56, 0);
            java.lang.Object objE = agnVarP.e();
            java.lang.Object objG = agnVarP.g();
            boolean zC = ((57344 & i3) == 16384) | bveVarC.C(agnVarP);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.nna(agnVarP, aferVar, null);
                bwcVar.ad(objS);
            }
            defpackage.bvx.f(objE, objG, (defpackage.affg) objS, bveVarC);
            int i10 = 3670016 & i3;
            java.lang.Object objS2 = bwcVar.S();
            if (i10 == 1048576 || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.nmx(z4, 0);
                bwcVar.ad(objS2);
            }
            defpackage.affc affcVar = (defpackage.affc) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == defpackage.bvd.a) {
                objS3 = new defpackage.nkn(4);
                bwcVar.ad(objS3);
            }
            final defpackage.cgf cgfVar5 = cgfVar4;
            cgfVar3 = cgfVar5;
            defpackage.ca.U(agnVarP, null, affcVar, null, (defpackage.affc) objS3, defpackage.dai.as(-260011610, true, new defpackage.affi() { // from class: nmy
                @Override // defpackage.affi
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.nne nneVar3 = (defpackage.nne) obj2;
                    defpackage.bve bveVar2 = (defpackage.bve) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    ((defpackage.abn) obj).getClass();
                    nneVar3.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? bveVar2.C(nneVar3) : bveVar2.E(nneVar3)) ? 16 : 32;
                    }
                    if (bveVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        boolean z18 = z16;
                        defpackage.cgf cgfVarA = cgfVar5.a(new defpackage.dci(str3));
                        if (z18) {
                            float f = defpackage.gjr.P0.k;
                            cgfVarA = cgfVarA.a(new defpackage.avr(f, f, f, f));
                        }
                        defpackage.kfn.i(cgfVarA, nneVar3, z14, z17, bveVar2, (iIntValue & 112) | 64, 0);
                    } else {
                        bveVar2.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVarC, 221184, 5);
            str2 = str3;
            z9 = z14;
            z7 = z17;
            z8 = z16;
            z6 = z15;
        } else {
            nneVar2 = nneVar;
            bveVarC.s();
            z6 = z2;
            z7 = z5;
            z8 = z3;
            cgfVar3 = cgfVar2;
            z9 = z;
        }
        defpackage.bxl bxlVarJ3 = bveVarC.J();
        if (bxlVarJ3 != null) {
            final defpackage.nne nneVar3 = nneVar2;
            bxlVarJ3.c = new defpackage.affg() { // from class: nmz
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar6 = cgfVar3;
                    defpackage.nne nneVar4 = nneVar3;
                    boolean z18 = z9;
                    boolean z19 = z6;
                    defpackage.afer aferVar2 = aferVar;
                    int i11 = i;
                    int i12 = i11 | 1;
                    int i13 = 306783378 & i12;
                    int i14 = i13 + i13;
                    int i15 = 613566756 & i12;
                    defpackage.kfn.j(cgfVar6, nneVar4, z18, z19, aferVar2, z8, z4, str2, z7, (defpackage.bve) obj, i13 | (i15 >> 1) | (i12 & (-920350135)) | (i14 & i15), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final defpackage.ktl k(boolean z, defpackage.bve bveVar, int i) {
        long jB;
        defpackage.afar afarVar = defpackage.ktl.a;
        if (((z ? 1 : 0) & (i ^ 1)) != 0) {
            bveVar.v(-615695437);
            defpackage.kry kryVar = defpackage.kry.q;
            defpackage.ksw kswVar = defpackage.ksx.a;
            jB = defpackage.ksx.b(defpackage.kfp.i(bveVar), kryVar);
            ((defpackage.bwc) bveVar).Y(false);
        } else {
            bveVar.v(-615644194);
            ((defpackage.bwc) bveVar).Y(false);
            jB = 0;
        }
        return defpackage.kgu.g(jB, 0L, 0L, 0L, bveVar, 254);
    }

    public static final defpackage.ktz l(boolean z, defpackage.bve bveVar, int i) {
        long j;
        long jK;
        defpackage.afar afarVar = defpackage.ktz.a;
        if (((z ? 1 : 0) & (i ^ 1)) != 0) {
            bveVar.v(-328534590);
            j = defpackage.ksx.j(defpackage.kry.q, bveVar);
            ((defpackage.bwc) bveVar).Y(false);
        } else {
            bveVar.v(-328483347);
            ((defpackage.bwc) bveVar).Y(false);
            j = defpackage.cjv.j(0);
        }
        long j2 = j;
        long j3 = defpackage.ksx.j(defpackage.kry.s, bveVar);
        long j4 = defpackage.ksx.j(defpackage.kry.u, bveVar);
        if (defpackage.lem.a.a().b()) {
            bveVar.v(-328241857);
            jK = defpackage.ksx.j(defpackage.kry.o, bveVar);
            ((defpackage.bwc) bveVar).Y(false);
        } else {
            bveVar.v(-328187452);
            jK = defpackage.ksx.k(defpackage.krz.a, bveVar);
            ((defpackage.bwc) bveVar).Y(false);
        }
        return defpackage.jxh.g(j2, j3, j4, jK, bveVar, 29950);
    }

    public static final defpackage.bsd m() {
        return new defpackage.bsd(defpackage.bcw.b(8.0f), defpackage.bcw.b(8.0f), defpackage.bcw.b(8.0f));
    }
}
