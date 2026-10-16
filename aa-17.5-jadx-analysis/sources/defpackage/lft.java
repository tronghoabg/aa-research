package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.DisplayMetrics;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lft {
    public static final yph a = yph.c("GH.AppIconFactory");
    public final int b;
    private final int c;
    private final int d;
    private final lfw e;
    private final Path f;
    private final Rect g = new Rect();
    private final Canvas h = new Canvas();
    private final Bitmap i;
    private final Paint j;

    public lft(Context context) throws Resources.NotFoundException {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.app_icon_size);
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
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.d = displayMetrics.densityDpi;
        ((ype) ((ype) a.f()).ai(3889)).R("AppIconFactory(): iconSize=%d, iconDpi=%d, displayMetrics=%s", Integer.valueOf(this.c), Integer.valueOf(i), displayMetrics);
        int i4 = this.c;
        int i5 = i4 + i4;
        this.e = new lfw(i5, displayMetrics.density);
        this.f = lfr.a.a().a(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
        this.i = bitmapCreateBitmap;
        Paint paint = new Paint();
        this.j = paint;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        paint.setAntiAlias(true);
    }

    public final Bitmap a(Drawable drawable, boolean z, int i, ColorStateList colorStateList, PorterDuff.Mode mode, ComponentName componentName) {
        Rect rect;
        yph yphVar;
        Canvas canvas;
        boolean[] zArr;
        Drawable lgaVar;
        Drawable shapeDrawable;
        float fWidth;
        int i2;
        float[] fArr;
        Rect rect2 = this.g;
        rect2.set(drawable.getBounds());
        Bitmap bitmap = this.i;
        bitmap.eraseColor(0);
        Canvas canvas2 = this.h;
        canvas2.setBitmap(bitmap);
        if (ep$$ExternalSyntheticApiModelOutline1.m303m((Object) drawable)) {
            ((ype) ((ype) a.f()).ai((char) 3894)).y("using adaptive icon layers (componentName=%s)", componentName);
            int i3 = this.c;
            drawable.setBounds(0, 0, i3, i3);
            AdaptiveIconDrawable adaptiveIconDrawableM = ep$$ExternalSyntheticApiModelOutline1.m((Object) drawable);
            shapeDrawable = adaptiveIconDrawableM.getBackground();
            if (componentName != null && componentName.getPackageName().equals("com.spotify.music")) {
                shapeDrawable = new ShapeDrawable();
                shapeDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                shapeDrawable.setBounds(0, 0, i3, i3);
            }
            lgaVar = adaptiveIconDrawableM.getForeground();
            rect = rect2;
            canvas = canvas2;
        } else {
            yph yphVar2 = a;
            ((ype) ((ype) yphVar2.f()).ai((char) 3892)).y("scaling icon to fit (componentName=%s)", componentName);
            boolean[] zArr2 = new boolean[1];
            if (z) {
                lfw lfwVar = this.e;
                Path path = this.f;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    if (intrinsicWidth <= 0 || intrinsicWidth > lfwVar.a) {
                        intrinsicWidth = lfwVar.a;
                    }
                    if (intrinsicHeight <= 0 || intrinsicHeight > lfwVar.a) {
                        intrinsicHeight = lfwVar.a;
                    }
                } else {
                    int i4 = lfwVar.a;
                    if (intrinsicWidth > i4 || intrinsicHeight > i4) {
                        int iMax = Math.max(intrinsicWidth, intrinsicHeight);
                        intrinsicWidth = (intrinsicWidth * i4) / iMax;
                        intrinsicHeight = (i4 * intrinsicHeight) / iMax;
                    }
                }
                Bitmap bitmap2 = lfwVar.b;
                bitmap2.eraseColor(0);
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(lfwVar.d);
                byte[] bArr = lfwVar.g;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.rewind();
                bitmap2.copyPixelsToBuffer(byteBufferWrap);
                int i5 = lfwVar.a;
                yphVar = yphVar2;
                rect = rect2;
                canvas = canvas2;
                zArr = zArr2;
                int i6 = i5 + 1;
                int i7 = -1;
                int i8 = 0;
                int i9 = -1;
                int iMax2 = -1;
                int i10 = 0;
                while (i8 < intrinsicHeight) {
                    int i11 = i8;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    while (i14 < intrinsicWidth) {
                        int i15 = i14;
                        if ((bArr[i10] & 255) > 40) {
                            if (i13 == -1) {
                                i13 = i15;
                            }
                            i12 = i15;
                        }
                        i10++;
                        i14 = i15 + 1;
                    }
                    i10 += i5 - intrinsicWidth;
                    lfwVar.i[i11] = i13;
                    lfwVar.j[i11] = i12;
                    if (i13 != -1) {
                        if (i9 == -1) {
                            i9 = i11;
                        }
                        int iMin = Math.min(i6, i13);
                        iMax2 = Math.max(iMax2, i12);
                        i6 = iMin;
                        i7 = i11;
                    }
                    i8 = i11 + 1;
                }
                if (i9 == -1) {
                    fWidth = 1.0f;
                } else if (iMax2 == -1) {
                    fWidth = 1.0f;
                } else {
                    float[] fArr2 = lfwVar.i;
                    lfw.a(fArr2, 1, i9, i7);
                    float[] fArr3 = lfwVar.j;
                    lfw.a(fArr3, -1, i9, i7);
                    Rect rect3 = lfwVar.k;
                    rect3.left = i6;
                    rect3.right = iMax2;
                    rect3.top = i9;
                    rect3.bottom = i7;
                    if (Math.abs((rect3.width() / rect3.height()) - 1.0f) > 0.05f) {
                        i2 = i7;
                        fArr = fArr2;
                    } else {
                        Bitmap bitmap3 = lfwVar.c;
                        i2 = i7;
                        bitmap3.eraseColor(0);
                        Canvas canvas3 = lfwVar.n;
                        fArr = fArr2;
                        canvas3.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lfwVar.m);
                        Matrix matrix = lfwVar.l;
                        matrix.reset();
                        matrix.setScale(rect3.width(), rect3.height());
                        matrix.postTranslate(rect3.left, rect3.top);
                        Path path2 = new Path();
                        path.transform(matrix, path2);
                        canvas3.drawPath(path2, lfwVar.e);
                        canvas3.drawPath(path2, lfwVar.f);
                        int[] iArr = lfwVar.h;
                        int iWidth = rect3.width();
                        int iHeight = rect3.height();
                        bitmap3.getPixels(iArr, 0, iWidth, rect3.left, rect3.top, iWidth, iHeight);
                        int i16 = 0;
                        for (int i17 = 0; i17 < iWidth * iHeight; i17++) {
                            if (Color.alpha(iArr[i17]) > 40) {
                                i16++;
                            }
                        }
                        if (i16 / (rect3.width() * rect3.height()) < 0.005f) {
                            zArr[0] = true;
                            fWidth = intrinsicWidth / rect3.width();
                        }
                    }
                    float f = BitmapDescriptorFactory.HUE_RED;
                    for (int i18 = 0; i18 < intrinsicHeight; i18++) {
                        float f2 = fArr[i18];
                        if (f2 > -1.0f) {
                            f += (fArr3[i18] - f2) + 1.0f;
                        }
                    }
                    float f3 = f / (((i2 + 1) - i9) * ((iMax2 + 1) - i6));
                    fWidth = f / (intrinsicWidth * intrinsicHeight) > (f3 < 0.7853982f ? 0.6597222f : ((1.0f - f3) * 0.040449437f) + 0.6510417f) ? ((float) Math.sqrt(r3 / r2)) * 0.8f : 0.8f;
                }
                lgaVar = new lga(drawable, fWidth);
            } else {
                rect = rect2;
                yphVar = yphVar2;
                canvas = canvas2;
                zArr = zArr2;
                lgaVar = drawable;
            }
            int i19 = this.c;
            lgaVar.setBounds(0, 0, i19, i19);
            if (zArr[0]) {
                shapeDrawable = null;
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 3893)).y("icon was not circular (componentName=%s)", componentName);
                shapeDrawable = new ShapeDrawable();
                shapeDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                shapeDrawable.setBounds(0, 0, i19, i19);
            }
        }
        if (colorStateList != null) {
            lgaVar.setTintList(colorStateList);
            lgaVar.setTintMode(mode);
        }
        Canvas canvas4 = canvas;
        if (shapeDrawable != null) {
            shapeDrawable.draw(canvas4);
        }
        if (lgaVar != null) {
            lgaVar.draw(canvas4);
        }
        drawable.setBounds(rect);
        int i20 = this.c;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i20, i20, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(this.d);
        canvas4.setBitmap(bitmapCreateBitmap);
        canvas4.drawPath(lfr.a.a().a(i20), this.j);
        canvas4.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
