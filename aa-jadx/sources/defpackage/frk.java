package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class frk implements defpackage.fqy {
    public final defpackage.fre a;
    public final defpackage.ftm b;

    public frk(defpackage.fre freVar, defpackage.ftm ftmVar) {
        this.a = freVar;
        this.b = ftmVar;
    }

    @Override // defpackage.fqy
    public final java.lang.Object a(defpackage.afdk afdkVar) {
        return defpackage.ahoc.a(defpackage.afdp.a, new defpackage.fat(new defpackage.afer() { // from class: fri
            @Override // defpackage.afer
            public final java.lang.Object invoke() throws java.io.IOException {
                float fB;
                float fA;
                defpackage.afau afauVar;
                int iK;
                int iK2;
                android.graphics.Picture pictureF;
                float fG;
                defpackage.frk frkVar = this.a;
                defpackage.ajoa ajoaVarA = frkVar.a.a();
                try {
                    java.io.InputStream inputStreamL = ajoaVarA.l();
                    int i = defpackage.iix.f;
                    defpackage.iix iixVarB = new defpackage.ijq().b(inputStreamL);
                    defpackage.afga.n(ajoaVarA, null);
                    defpackage.ihy ihyVar = iixVarB.a;
                    if (ihyVar == null) {
                        throw new java.lang.IllegalArgumentException("SVG document is empty");
                    }
                    defpackage.igw igwVar = ihyVar.w;
                    android.graphics.RectF rectF = igwVar != null ? new android.graphics.RectF(igwVar.a, igwVar.b, igwVar.a(), igwVar.b()) : null;
                    if (rectF != null) {
                        fB = rectF.width();
                        fA = rectF.height();
                    } else {
                        fB = iixVarB.b();
                        fA = iixVarB.a();
                    }
                    defpackage.ftm ftmVar = frkVar.b;
                    int i2 = ftmVar.o;
                    defpackage.ftx ftxVar = ftmVar.d;
                    if (defpackage.ly.z(ftxVar)) {
                        afauVar = new defpackage.afau(java.lang.Float.valueOf(fB > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? fB : 512.0f), java.lang.Float.valueOf(fA > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? fA : 512.0f));
                    } else {
                        afauVar = new defpackage.afau(java.lang.Float.valueOf(defpackage.ly.A(ftxVar.b, i2)), java.lang.Float.valueOf(defpackage.ly.A(ftxVar.c, i2)));
                    }
                    float fFloatValue = ((java.lang.Number) afauVar.a).floatValue();
                    float fFloatValue2 = ((java.lang.Number) afauVar.b).floatValue();
                    if (fB <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fA <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        iK = defpackage.afhi.k(fFloatValue);
                        iK2 = defpackage.afhi.k(fFloatValue2);
                        iixVarB.e("100%");
                        iixVarB.d("100%");
                    } else {
                        float f = fFloatValue / fB;
                        float f2 = fFloatValue2 / fA;
                        float fMin = i2 + (-1) != 0 ? java.lang.Math.min(f, f2) : java.lang.Math.max(f, f2);
                        iixVarB.e(fB + "px");
                        iixVarB.d(fA + "px");
                        float fA2 = iixVarB.a();
                        float fB2 = iixVarB.b();
                        iK2 = (int) (fMin * fA);
                        iK = (int) (fMin * fB);
                        if (fA2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && fB2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                            float f3 = fA2 * fMin;
                            defpackage.ihy ihyVar2 = iixVarB.a;
                            if (ihyVar2 == null) {
                                throw new java.lang.IllegalArgumentException("SVG document is empty");
                            }
                            ihyVar2.d = new defpackage.ihi(f3);
                            ihyVar2.c = new defpackage.ihi(fB2 * fMin);
                            iixVarB.e *= fMin;
                        }
                    }
                    if (rectF == null && fB > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && fA > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        defpackage.ihy ihyVar3 = iixVarB.a;
                        if (ihyVar3 == null) {
                            throw new java.lang.IllegalArgumentException("SVG document is empty");
                        }
                        ihyVar3.w = new defpackage.igw(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fB, fA);
                    }
                    android.graphics.Bitmap.Config config = ftmVar.b;
                    if (config == android.graphics.Bitmap.Config.HARDWARE) {
                        config = android.graphics.Bitmap.Config.ARGB_8888;
                    }
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iK, iK2, config);
                    bitmapCreateBitmap.getClass();
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                    defpackage.ihy ihyVar4 = iixVarB.a;
                    defpackage.ihi ihiVar = ihyVar4.c;
                    if (ihiVar != null) {
                        float f4 = iixVarB.b;
                        float fG2 = ihiVar.g();
                        defpackage.igw igwVar2 = ihyVar4.w;
                        if (igwVar2 != null) {
                            fG = (igwVar2.d * fG2) / igwVar2.c;
                        } else {
                            defpackage.ihi ihiVar2 = ihyVar4.d;
                            fG = ihiVar2 != null ? ihiVar2.g() : fG2;
                        }
                        pictureF = iixVarB.f((int) java.lang.Math.ceil(fG2), (int) java.lang.Math.ceil(fG));
                    } else {
                        pictureF = iixVarB.f(defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE);
                    }
                    pictureF.draw(canvas);
                    android.content.res.Resources resources = ftmVar.a.getResources();
                    resources.getClass();
                    return new defpackage.fqw(new android.graphics.drawable.BitmapDrawable(resources, bitmapCreateBitmap), true);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.afga.n(ajoaVarA, th);
                        throw th2;
                    }
                }
            }
        }, (defpackage.afdk) null, 3), afdkVar);
    }
}
