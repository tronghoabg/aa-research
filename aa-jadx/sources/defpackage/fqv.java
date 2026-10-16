package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fqv implements defpackage.fqy {
    public final defpackage.fre a;
    public final defpackage.ftm b;
    private final defpackage.ajfc c;

    public fqv(defpackage.fre freVar, defpackage.ftm ftmVar, defpackage.ajfc ajfcVar) {
        this.a = freVar;
        this.b = ftmVar;
        this.c = ajfcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fqy
    public final java.lang.Object a(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.fqu fquVar;
        defpackage.ajfc ajfcVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (afdkVar instanceof defpackage.fqu) {
            fquVar = (defpackage.fqu) afdkVar;
            int i = fquVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fquVar.d = i - Integer.MIN_VALUE;
            } else {
                fquVar = new defpackage.fqu(this, afdkVar);
            }
        } else {
            fquVar = new defpackage.fqu(this, afdkVar);
        }
        java.lang.Object obj3 = fquVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = fquVar.d;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj3);
                ajfcVar = this.c;
                fquVar.a = ajfcVar;
                fquVar.d = 1;
                if (ajfcVar.e(fquVar) != afdrVar) {
                }
                obj = ajfcVar;
                return afdrVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = fquVar.a;
                try {
                    defpackage.afga.cz(obj3);
                    obj2 = obj2;
                    defpackage.fqw fqwVar = (defpackage.fqw) obj3;
                    ((defpackage.ajfc) obj2).h();
                    return fqwVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.ajfc) obj2).h();
                    throw th;
                }
            }
            java.lang.Object obj4 = fquVar.a;
            defpackage.afga.cz(obj3);
            obj = obj4;
            obj = ajfcVar;
            defpackage.afer aferVar = new defpackage.afer() { // from class: fqr
                @Override // defpackage.afer
                public final java.lang.Object invoke() throws java.lang.Exception {
                    defpackage.fqz fqzVar;
                    boolean z;
                    android.graphics.Bitmap bitmapCreateBitmap;
                    int i3;
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    defpackage.fqv fqvVar = this.a;
                    defpackage.fre freVar = fqvVar.a;
                    defpackage.fqs fqsVar = new defpackage.fqs(freVar.a());
                    defpackage.ajoa ajoaVarB = defpackage.airj.b(fqsVar);
                    options.inJustDecodeBounds = true;
                    android.graphics.BitmapFactory.decodeStream(new defpackage.ajov((defpackage.ajow) ajoaVarB.q()), null, options);
                    java.lang.Exception exc = fqsVar.a;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inJustDecodeBounds = false;
                    android.graphics.Paint paint = defpackage.frb.a;
                    java.lang.String str = options.outMimeType;
                    java.util.Set set = defpackage.frc.a;
                    if (str == null || !defpackage.frc.a.contains(str)) {
                        fqzVar = defpackage.fqz.a;
                    } else {
                        defpackage.enl enlVar = new defpackage.enl(new defpackage.fra(new defpackage.ajov((defpackage.ajow) ajoaVarB.q())));
                        int iB = enlVar.b();
                        boolean z2 = iB == 2 || iB == 7 || iB == 4 || iB == 5;
                        switch (enlVar.b()) {
                            case 3:
                            case 4:
                                i3 = 180;
                                break;
                            case 5:
                            case 8:
                                i3 = 270;
                                break;
                            case 6:
                            case 7:
                                i3 = 90;
                                break;
                            default:
                                i3 = 0;
                                break;
                        }
                        fqzVar = new defpackage.fqz(z2, i3);
                    }
                    java.lang.Exception exc2 = fqsVar.a;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    options.inMutable = false;
                    defpackage.ftm ftmVar = fqvVar.b;
                    options.inPremultiplied = true;
                    boolean z3 = fqzVar.b;
                    android.graphics.Bitmap.Config configBc = ftmVar.b;
                    if (z3 || defpackage.frc.a(fqzVar)) {
                        configBc = defpackage.a.bc(configBc);
                    }
                    if (options.outConfig == android.graphics.Bitmap.Config.RGBA_F16 && configBc != android.graphics.Bitmap.Config.HARDWARE) {
                        configBc = android.graphics.Bitmap.Config.RGBA_F16;
                    }
                    options.inPreferredConfig = configBc;
                    defpackage.a aVarB = freVar.b();
                    if ((aVarB instanceof defpackage.frf) && defpackage.ly.z(ftmVar.d)) {
                        options.inSampleSize = 1;
                        options.inScaled = true;
                        options.inDensity = ((defpackage.frf) aVarB).a;
                        options.inTargetDensity = ftmVar.a.getResources().getDisplayMetrics().densityDpi;
                        z = false;
                    } else if (options.outWidth <= 0 || options.outHeight <= 0) {
                        options.inSampleSize = 1;
                        z = false;
                        options.inScaled = false;
                    } else {
                        int i4 = defpackage.frc.b(fqzVar) ? options.outHeight : options.outWidth;
                        int i5 = defpackage.frc.b(fqzVar) ? options.outWidth : options.outHeight;
                        defpackage.ftx ftxVar = ftmVar.d;
                        int i6 = ftmVar.o;
                        int iG = defpackage.ly.z(ftxVar) ? i4 : defpackage.fug.g(ftxVar.b, i6);
                        int iG2 = defpackage.ly.z(ftxVar) ? i5 : defpackage.fug.g(ftxVar.c, i6);
                        int iHighestOneBit = java.lang.Integer.highestOneBit(i4 / iG);
                        int iHighestOneBit2 = java.lang.Integer.highestOneBit(i5 / iG2);
                        int i7 = i6 - 1;
                        options.inSampleSize = defpackage.afqt.e(i7 != 0 ? java.lang.Math.max(iHighestOneBit, iHighestOneBit2) : java.lang.Math.min(iHighestOneBit, iHighestOneBit2), 1);
                        double d = ((double) iG) / (((double) i4) / ((double) options.inSampleSize));
                        double d2 = ((double) iG2) / (((double) i5) / ((double) options.inSampleSize));
                        double dMin = i7 != 0 ? java.lang.Math.min(d, d2) : java.lang.Math.max(d, d2);
                        if (ftmVar.e) {
                            dMin = defpackage.afqt.o(dMin);
                        }
                        options.inScaled = dMin != 1.0d;
                        if (options.inScaled) {
                            if (dMin > 1.0d) {
                                options.inDensity = defpackage.afhi.j(2.147483647E9d / dMin);
                                options.inTargetDensity = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                            } else {
                                options.inDensity = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                                options.inTargetDensity = defpackage.afhi.j(dMin * 2.147483647E9d);
                            }
                        }
                        z = false;
                    }
                    try {
                        android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(new defpackage.ajov((defpackage.ajow) ajoaVarB), null, options);
                        defpackage.afga.n(ajoaVarB, null);
                        java.lang.Exception exc3 = fqsVar.a;
                        if (exc3 != null) {
                            throw exc3;
                        }
                        if (bitmapDecodeStream == null) {
                            throw new java.lang.IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        }
                        android.content.Context context = fqvVar.b.a;
                        bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        boolean z4 = fqzVar.b;
                        if (z4 || defpackage.frc.a(fqzVar)) {
                            android.graphics.Matrix matrix = new android.graphics.Matrix();
                            float width = bitmapDecodeStream.getWidth() / 2.0f;
                            float height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z4) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (defpackage.frc.a(fqzVar)) {
                                matrix.postRotate(fqzVar.c, width, height);
                            }
                            android.graphics.RectF rectF = new android.graphics.RectF(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            if (rectF.left != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || rectF.top != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                                matrix.postTranslate(-rectF.left, -rectF.top);
                            }
                            if (defpackage.frc.b(fqzVar)) {
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), defpackage.a.bb(bitmapDecodeStream));
                                bitmapCreateBitmap.getClass();
                            } else {
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), defpackage.a.bb(bitmapDecodeStream));
                                bitmapCreateBitmap.getClass();
                            }
                            new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, defpackage.frb.a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                        android.content.res.Resources resources = context.getResources();
                        resources.getClass();
                        return new defpackage.fqw(new android.graphics.drawable.BitmapDrawable(resources, bitmapDecodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z);
                    } catch (java.lang.Throwable th3) {
                        try {
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            defpackage.afga.n(ajoaVarB, th3);
                            throw th4;
                        }
                    }
                }
            };
            fquVar.a = obj;
            fquVar.d = 2;
            java.lang.Object objA = defpackage.ahoc.a(defpackage.afdp.a, new defpackage.fat(aferVar, (defpackage.afdk) null, 3), fquVar);
            if (objA != afdrVar) {
                java.lang.Object obj5 = obj;
                obj3 = objA;
                obj2 = obj5;
                defpackage.fqw fqwVar2 = (defpackage.fqw) obj3;
                ((defpackage.ajfc) obj2).h();
                return fqwVar2;
            }
            obj = ajfcVar;
            return afdrVar;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.ajfc) obj2).h();
            throw th;
        }
    }
}
