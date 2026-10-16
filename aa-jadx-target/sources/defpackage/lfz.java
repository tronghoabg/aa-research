package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfz {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AppIconFactory");
    public final int b;
    private final int c;
    private final int d;
    private final defpackage.lgc e;
    private final android.graphics.Path f;
    private final android.graphics.Rect g = new android.graphics.Rect();
    private final android.graphics.Canvas h = new android.graphics.Canvas();
    private final android.graphics.Bitmap i;
    private final android.graphics.Paint j;

    public lfz(android.content.Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165345);
        this.c = dimensionPixelSize;
        int[] iArr = {120, 160, 213, 240, 320, 480, 640};
        int i = 640;
        for (int i2 = 6; i2 >= 0; i2--) {
            int i3 = iArr[i2];
            if ((i3 * 48.0f) / 160.0f >= dimensionPixelSize) {
                i = i3;
            }
        }
        this.b = i;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.d = displayMetrics.densityDpi;
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3892)).R("AppIconFactory(): iconSize=%d, iconDpi=%d, displayMetrics=%s", java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(i), displayMetrics);
        int i4 = this.c;
        int i5 = i4 + i4;
        this.e = new defpackage.lgc(i5, displayMetrics.density);
        this.f = defpackage.lfx.a.a().a(1);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i5, i5, android.graphics.Bitmap.Config.ARGB_8888);
        this.i = bitmapCreateBitmap;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.j = paint;
        paint.setShader(new android.graphics.BitmapShader(bitmapCreateBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, boolean z, int i, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.ComponentName componentName) {
        boolean[] zArr;
        android.graphics.drawable.Drawable lggVar;
        android.graphics.drawable.Drawable shapeDrawable;
        float fWidth;
        android.graphics.Rect rect = this.g;
        rect.set(drawable.getBounds());
        android.graphics.Bitmap bitmap = this.i;
        bitmap.eraseColor(0);
        android.graphics.Canvas canvas = this.h;
        canvas.setBitmap(bitmap);
        if (ep$.ExternalSyntheticApiModelOutline1.m(drawable)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3897)).y("using adaptive icon layers (componentName=%s)", componentName);
            int i2 = this.c;
            drawable.setBounds(0, 0, i2, i2);
            android.graphics.drawable.AdaptiveIconDrawable adaptiveIconDrawableM = ep$.ExternalSyntheticApiModelOutline1.m(drawable);
            shapeDrawable = ep$.ExternalSyntheticApiModelOutline1.m(adaptiveIconDrawableM);
            if (componentName != null && componentName.getPackageName().equals("com.spotify.music")) {
                shapeDrawable = new android.graphics.drawable.ShapeDrawable();
                shapeDrawable.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_IN);
                shapeDrawable.setBounds(0, 0, i2, i2);
            }
            lggVar = ep$.ExternalSyntheticApiModelOutline1.m$1(adaptiveIconDrawableM);
            rect = rect;
            canvas = canvas;
        } else {
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3895)).y("scaling icon to fit (componentName=%s)", componentName);
            boolean[] zArr2 = new boolean[1];
            if (z) {
                defpackage.lgc lgcVar = this.e;
                android.graphics.Path path = this.f;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    if (intrinsicWidth <= 0 || intrinsicWidth > lgcVar.a) {
                        intrinsicWidth = lgcVar.a;
                    }
                    if (intrinsicHeight <= 0 || intrinsicHeight > lgcVar.a) {
                        intrinsicHeight = lgcVar.a;
                    }
                } else {
                    int i3 = lgcVar.a;
                    if (intrinsicWidth > i3 || intrinsicHeight > i3) {
                        int iMax = java.lang.Math.max(intrinsicWidth, intrinsicHeight);
                        intrinsicWidth = (intrinsicWidth * i3) / iMax;
                        intrinsicHeight = (i3 * intrinsicHeight) / iMax;
                    }
                }
                android.graphics.Bitmap bitmap2 = lgcVar.b;
                bitmap2.eraseColor(0);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(lgcVar.d);
                byte[] bArr = lgcVar.g;
                java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                byteBufferWrap.rewind();
                bitmap2.copyPixelsToBuffer(byteBufferWrap);
                int i4 = lgcVar.a;
                zArr = zArr2;
                int i5 = i4 + 1;
                int i6 = -1;
                int i7 = 0;
                int i8 = -1;
                int iMax2 = -1;
                int i9 = 0;
                while (i7 < intrinsicHeight) {
                    int i10 = i7;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = 0;
                    while (i13 < intrinsicWidth) {
                        int i14 = i13;
                        if ((bArr[i9] & 255) > 40) {
                            if (i12 == -1) {
                                i12 = i14;
                            }
                            i11 = i14;
                        }
                        i9++;
                        i13 = i14 + 1;
                    }
                    i9 += i4 - intrinsicWidth;
                    lgcVar.i[i10] = i12;
                    lgcVar.j[i10] = i11;
                    if (i12 != -1) {
                        if (i8 == -1) {
                            i8 = i10;
                        }
                        int iMin = java.lang.Math.min(i5, i12);
                        iMax2 = java.lang.Math.max(iMax2, i11);
                        i5 = iMin;
                        i6 = i10;
                    }
                    i7 = i10 + 1;
                }
                if (i8 == -1) {
                    fWidth = 1.0f;
                } else if (iMax2 == -1) {
                    fWidth = 1.0f;
                } else {
                    float[] fArr = lgcVar.i;
                    defpackage.lgc.a(fArr, 1, i8, i6);
                    float[] fArr2 = lgcVar.j;
                    defpackage.lgc.a(fArr2, -1, i8, i6);
                    android.graphics.Rect rect2 = lgcVar.k;
                    rect2.left = i5;
                    rect2.right = iMax2;
                    rect2.top = i8;
                    rect2.bottom = i6;
                    if (java.lang.Math.abs((rect2.width() / rect2.height()) - 1.0f) <= 0.05f) {
                        android.graphics.Bitmap bitmap3 = lgcVar.c;
                        bitmap3.eraseColor(0);
                        android.graphics.Canvas canvas2 = lgcVar.n;
                        canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, lgcVar.m);
                        android.graphics.Matrix matrix = lgcVar.l;
                        matrix.reset();
                        matrix.setScale(rect2.width(), rect2.height());
                        matrix.postTranslate(rect2.left, rect2.top);
                        android.graphics.Path path2 = new android.graphics.Path();
                        path.transform(matrix, path2);
                        canvas2.drawPath(path2, lgcVar.e);
                        canvas2.drawPath(path2, lgcVar.f);
                        int[] iArr = lgcVar.h;
                        int iWidth = rect2.width();
                        int iHeight = rect2.height();
                        bitmap3.getPixels(iArr, 0, iWidth, rect2.left, rect2.top, iWidth, iHeight);
                        int i15 = 0;
                        for (int i16 = 0; i16 < iWidth * iHeight; i16++) {
                            if (android.graphics.Color.alpha(iArr[i16]) > 40) {
                                i15++;
                            }
                        }
                        if (i15 / (rect2.width() * rect2.height()) < 0.005f) {
                            zArr[0] = true;
                            fWidth = intrinsicWidth / rect2.width();
                        }
                    }
                    float f = 0.0f;
                    for (int i17 = 0; i17 < intrinsicHeight; i17++) {
                        float f2 = fArr[i17];
                        if (f2 > -1.0f) {
                            f += (fArr2[i17] - f2) + 1.0f;
                        }
                    }
                    float f3 = f / (((i6 + 1) - i8) * ((iMax2 + 1) - i5));
                    float f4 = f3 < 0.7853982f ? 0.6597222f : ((1.0f - f3) * 0.040449437f) + 0.6510417f;
                    float f5 = f / (intrinsicWidth * intrinsicHeight);
                    fWidth = f5 > f4 ? ((float) java.lang.Math.sqrt(f4 / f5)) * 0.8f : 0.8f;
                }
                lggVar = new lgg(drawable, fWidth);
            } else {
                zArr = zArr2;
                lggVar = drawable;
            }
            int i18 = this.c;
            lggVar.setBounds(0, 0, i18, i18);
            if (zArr[0]) {
                shapeDrawable = null;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3896)).y("icon was not circular (componentName=%s)", componentName);
                shapeDrawable = new android.graphics.drawable.ShapeDrawable();
                shapeDrawable.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
                shapeDrawable.setBounds(0, 0, i18, i18);
            }
        }
        if (colorStateList != null) {
            lggVar.setTintList(colorStateList);
            lggVar.setTintMode(mode);
        }
        android.graphics.Canvas canvas3 = canvas;
        if (shapeDrawable != null) {
            shapeDrawable.draw(canvas3);
        }
        if (lggVar != null) {
            lggVar.draw(canvas3);
        }
        drawable.setBounds(rect);
        int i19 = this.c;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i19, i19, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(this.d);
        canvas3.setBitmap(bitmapCreateBitmap);
        canvas3.drawPath(defpackage.lfx.a.a().a(i19), this.j);
        canvas3.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
