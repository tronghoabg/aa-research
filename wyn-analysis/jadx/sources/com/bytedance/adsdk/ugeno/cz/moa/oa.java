package com.bytedance.adsdk.ugeno.cz.moa;

import A0.j;
import N0.a;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* loaded from: classes.dex */
public class oa extends Drawable {

    /* renamed from: ab, reason: collision with root package name */
    private final boolean[] f24705ab;
    private final RectF bcc;
    private boolean bs;
    private Shader.TileMode cq;
    private final Paint cz;
    private ImageView.ScaleType dhk;
    private final RectF dj;
    private boolean dz;
    private final int ivm;
    private final Paint lw;
    private final Bitmap moa;
    private ColorStateList oib;
    private float sy;
    private float wk;
    private Shader.TileMode wrv;
    private final int xs;
    private final RectF yo;
    private final Matrix zjm;
    private final RectF uef = new RectF();

    /* renamed from: oa, reason: collision with root package name */
    private final RectF f24706oa = new RectF();

    /* renamed from: com.bytedance.adsdk.ugeno.cz.moa.oa$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            uef = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uef[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public oa(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.yo = rectF;
        this.bcc = new RectF();
        this.zjm = new Matrix();
        this.dj = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.wrv = tileMode;
        this.cq = tileMode;
        this.dz = true;
        this.wk = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f24705ab = new boolean[]{true, true, true, true};
        this.bs = false;
        this.sy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.oib = ColorStateList.valueOf(-16777216);
        this.dhk = ImageView.ScaleType.FIT_CENTER;
        this.moa = bitmap;
        int width = bitmap.getWidth();
        this.ivm = width;
        int height = bitmap.getHeight();
        this.xs = height;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Paint paint = new Paint();
        this.lw = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.cz = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.oib.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.sy);
    }

    public static Bitmap oa(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static oa uef(Bitmap bitmap) {
        if (bitmap != null) {
            return new oa(bitmap);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.dz) {
            BitmapShader bitmapShader = new BitmapShader(this.moa, this.wrv, this.cq);
            Shader.TileMode tileMode = this.wrv;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.cq == tileMode2) {
                bitmapShader.setLocalMatrix(this.zjm);
            }
            this.lw.setShader(bitmapShader);
            this.dz = false;
        }
        if (this.bs) {
            if (this.sy <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawOval(this.f24706oa, this.lw);
                return;
            } else {
                canvas.drawOval(this.f24706oa, this.lw);
                canvas.drawOval(this.bcc, this.cz);
                return;
            }
        }
        if (!uef(this.f24705ab)) {
            canvas.drawRect(this.f24706oa, this.lw);
            if (this.sy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(this.bcc, this.cz);
                return;
            }
            return;
        }
        float f10 = this.wk;
        if (this.sy <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRoundRect(this.f24706oa, f10, f10, this.lw);
            uef(canvas);
        } else {
            canvas.drawRoundRect(this.f24706oa, f10, f10, this.lw);
            canvas.drawRoundRect(this.bcc, f10, f10, this.cz);
            uef(canvas);
            oa(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.lw.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.lw.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.xs;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.ivm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.oib.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.uef.set(rect);
        uef();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.oib.getColorForState(iArr, 0);
        if (this.cz.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.cz.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.lw.setAlpha(i5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.lw.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.lw.setDither(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.lw.setFilterBitmap(z2);
        invalidateSelf();
    }

    public static Drawable uef(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof oa) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && j.x(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i5), uef(layerDrawable.getDrawable(i5)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapOa = oa(drawable);
        return bitmapOa != null ? new oa(bitmapOa) : drawable;
    }

    private void oa(Canvas canvas) {
        float f10;
        float f11;
        if (oa(this.f24705ab) || this.wk == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.f24706oa;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = this.f24706oa.height() + f13;
        float f14 = this.wk;
        float f15 = this.sy / 2.0f;
        if (this.f24705ab[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.cz);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.cz);
        }
        if (!this.f24705ab[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.cz);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.cz);
            fWidth = fWidth;
        }
        if (this.f24705ab[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.cz);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.cz);
            f11 = fHeight;
        }
        if (this.f24705ab[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.cz);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.cz);
    }

    private void uef() {
        float fWidth;
        float fHeight;
        int i5 = AnonymousClass1.uef[this.dhk.ordinal()];
        if (i5 == 1) {
            this.bcc.set(this.uef);
            RectF rectF = this.bcc;
            float f10 = this.sy;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.zjm.reset();
            this.zjm.setTranslate((int) a.b(this.bcc.width(), this.ivm, 0.5f, 0.5f), (int) a.b(this.bcc.height(), this.xs, 0.5f, 0.5f));
        } else if (i5 == 2) {
            this.bcc.set(this.uef);
            RectF rectF2 = this.bcc;
            float f11 = this.sy;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.zjm.reset();
            float fHeight2 = this.bcc.height() * this.ivm;
            float fWidth2 = this.bcc.width() * this.xs;
            float fWidth3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (fHeight2 > fWidth2) {
                fWidth = this.bcc.height() / this.xs;
                fHeight = 0.0f;
                fWidth3 = (this.bcc.width() - (this.ivm * fWidth)) * 0.5f;
            } else {
                fWidth = this.bcc.width() / this.ivm;
                fHeight = (this.bcc.height() - (this.xs * fWidth)) * 0.5f;
            }
            this.zjm.setScale(fWidth, fWidth);
            Matrix matrix = this.zjm;
            float f12 = this.sy;
            matrix.postTranslate((f12 / 2.0f) + ((int) (fWidth3 + 0.5f)), (f12 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i5 == 3) {
            this.zjm.reset();
            float fMin = (((float) this.ivm) > this.uef.width() || ((float) this.xs) > this.uef.height()) ? Math.min(this.uef.width() / this.ivm, this.uef.height() / this.xs) : 1.0f;
            float fWidth4 = (int) (((this.uef.width() - (this.ivm * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.uef.height() - (this.xs * fMin)) * 0.5f) + 0.5f);
            this.zjm.setScale(fMin, fMin);
            this.zjm.postTranslate(fWidth4, fHeight3);
            this.bcc.set(this.yo);
            this.zjm.mapRect(this.bcc);
            RectF rectF3 = this.bcc;
            float f13 = this.sy;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.zjm.setRectToRect(this.yo, this.bcc, Matrix.ScaleToFit.FILL);
        } else if (i5 == 5) {
            this.bcc.set(this.yo);
            this.zjm.setRectToRect(this.yo, this.uef, Matrix.ScaleToFit.END);
            this.zjm.mapRect(this.bcc);
            RectF rectF4 = this.bcc;
            float f14 = this.sy;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.zjm.setRectToRect(this.yo, this.bcc, Matrix.ScaleToFit.FILL);
        } else if (i5 == 6) {
            this.bcc.set(this.yo);
            this.zjm.setRectToRect(this.yo, this.uef, Matrix.ScaleToFit.START);
            this.zjm.mapRect(this.bcc);
            RectF rectF5 = this.bcc;
            float f15 = this.sy;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.zjm.setRectToRect(this.yo, this.bcc, Matrix.ScaleToFit.FILL);
        } else if (i5 != 7) {
            this.bcc.set(this.yo);
            this.zjm.setRectToRect(this.yo, this.uef, Matrix.ScaleToFit.CENTER);
            this.zjm.mapRect(this.bcc);
            RectF rectF6 = this.bcc;
            float f16 = this.sy;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.zjm.setRectToRect(this.yo, this.bcc, Matrix.ScaleToFit.FILL);
        } else {
            this.bcc.set(this.uef);
            RectF rectF7 = this.bcc;
            float f17 = this.sy;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.zjm.reset();
            this.zjm.setRectToRect(this.yo, this.bcc, Matrix.ScaleToFit.FILL);
        }
        this.f24706oa.set(this.bcc);
        this.dz = true;
    }

    public oa oa(Shader.TileMode tileMode) {
        if (this.cq != tileMode) {
            this.cq = tileMode;
            this.dz = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean oa(boolean[] zArr) {
        for (boolean z2 : zArr) {
            if (z2) {
                return false;
            }
        }
        return true;
    }

    private void uef(Canvas canvas) {
        if (oa(this.f24705ab) || this.wk == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.f24706oa;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.f24706oa.height() + f11;
        float f12 = this.wk;
        if (!this.f24705ab[0]) {
            this.dj.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.dj, this.lw);
        }
        if (!this.f24705ab[1]) {
            this.dj.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.dj, this.lw);
        }
        if (!this.f24705ab[2]) {
            this.dj.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.dj, this.lw);
        }
        if (this.f24705ab[3]) {
            return;
        }
        this.dj.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.dj, this.lw);
    }

    public oa uef(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.wk = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.wk = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            boolean[] zArr = this.f24705ab;
            zArr[0] = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[1] = f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[2] = f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[3] = f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public oa uef(float f10) {
        this.sy = f10;
        this.cz.setStrokeWidth(f10);
        return this;
    }

    public oa uef(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.oib = colorStateList;
        this.cz.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public oa uef(boolean z2) {
        this.bs = z2;
        return this;
    }

    public oa uef(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.dhk != scaleType) {
            this.dhk = scaleType;
            uef();
        }
        return this;
    }

    public oa uef(Shader.TileMode tileMode) {
        if (this.wrv != tileMode) {
            this.wrv = tileMode;
            this.dz = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean uef(boolean[] zArr) {
        for (boolean z2 : zArr) {
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
