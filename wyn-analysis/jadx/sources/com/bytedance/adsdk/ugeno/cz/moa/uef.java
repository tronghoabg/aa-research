package com.bytedance.adsdk.ugeno.cz.moa;

import N0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.uef.bcc;
import com.bytedance.adsdk.ugeno.uef.xs;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class uef extends ImageView implements IAnimation, xs {

    /* renamed from: oa, reason: collision with root package name */
    static final /* synthetic */ boolean f24707oa = true;

    /* renamed from: ab, reason: collision with root package name */
    private int f24708ab;
    private float bcc;
    private ImageView.ScaleType bs;
    private Bitmap cp;
    private boolean cq;
    private ColorFilter cz;
    private moa dhk;
    private Drawable dj;
    private boolean dz;
    private float gr;
    private Path gsd;
    private float gzw;
    private Drawable ivm;
    private final RectF ku;
    private final float[] lw;
    private Shader.TileMode oib;
    private boolean orq;
    private Canvas pz;
    private Paint rt;
    private Shader.TileMode sy;
    private bcc tpx;

    /* renamed from: ue, reason: collision with root package name */
    private float f24709ue;
    private int wk;
    private boolean wrv;
    private ColorStateList xs;
    private float yo;
    private boolean zjm;
    public static final Shader.TileMode uef = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] moa = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: com.bytedance.adsdk.ugeno.cz.moa.uef$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            uef = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uef[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public uef(Context context) {
        super(context);
        this.lw = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.xs = ColorStateList.valueOf(-16777216);
        this.bcc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.cz = null;
        this.zjm = false;
        this.wrv = false;
        this.cq = false;
        this.dz = false;
        Shader.TileMode tileMode = uef;
        this.sy = tileMode;
        this.oib = tileMode;
        this.orq = false;
        this.gzw = 50.0f;
        this.ku = new RectF();
        this.tpx = new bcc(this);
    }

    private void moa() {
        Drawable drawable = this.dj;
        if (drawable == null || !this.zjm) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.dj = drawableMutate;
        if (this.wrv) {
            drawableMutate.setColorFilter(this.cz);
        }
    }

    private Drawable oa() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i5 = this.f24708ab;
        if (i5 != 0) {
            try {
                drawable = resources.getDrawable(i5);
            } catch (Exception e7) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f24708ab, e7);
                this.f24708ab = 0;
            }
        }
        return oa.uef(drawable);
    }

    private Drawable uef() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i5 = this.wk;
        if (i5 != 0) {
            try {
                drawable = resources.getDrawable(i5);
            } catch (Exception e7) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.wk, e7);
                this.wk = 0;
            }
        }
        return oa.uef(drawable);
    }

    private void yo() {
        uef(this.dj, this.bs);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.oa(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.xs.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.xs;
    }

    public float getBorderRadius() {
        return this.tpx.uef();
    }

    public float getBorderWidth() {
        return this.bcc;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.lw;
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (float f10 : fArr) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.uef.xs
    public float getRipple() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getRubIn() {
        return this.tpx.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.bs;
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getShine() {
        return this.tpx.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.xs
    public float getStretch() {
        return this.tpx.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.sy;
    }

    public Shader.TileMode getTileModeY() {
        return this.oib;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.bcc();
        }
        Canvas canvas = this.pz;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        Bitmap bitmap = this.cp;
        if (bitmap != null) {
            bitmap.recycle();
            this.pz = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.orq || (canvas2 = this.pz) == null || this.cp == null) {
            super.onDraw(canvas);
        } else {
            super.onDraw(canvas2);
            this.pz.drawPath(this.gsd, this.rt);
            canvas.drawBitmap(this.cp, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        }
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.uef(canvas, this);
            this.dhk.uef(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.uef(i5, i10, i11, i12);
        }
        super.onLayout(z2, i5, i10, i11, i12);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.dhk;
        if (moaVar == null) {
            super.onMeasure(i5, i10);
        } else {
            int[] iArrUef = moaVar.uef(i5, i10);
            super.onMeasure(iArrUef[0], iArrUef[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.dhk;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i11);
        }
        if (i5 <= 0 || i10 <= 0 || !this.orq) {
            return;
        }
        this.cp = Bitmap.createBitmap(i5, i10, Bitmap.Config.ARGB_8888);
        this.pz = new Canvas(this.cp);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iWidth;
        if (!this.orq) {
            return super.onTouchEvent(motionEvent);
        }
        this.dhk.xs();
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.gsd.moveTo(x5, y10);
            this.gr = x5;
            this.f24709ue = y10;
            HashMap map = new HashMap();
            map.put("state", 1);
            this.dhk.uef("eraseState", map);
        } else if (action == 1) {
            this.gsd.computeBounds(this.ku, true);
            try {
                iWidth = (int) (((this.ku.width() * this.ku.height()) / (getWidth() * getHeight())) * 100.0f);
            } catch (Exception unused) {
                iWidth = 0;
            }
            HashMap map2 = new HashMap();
            a.p(2, map2, "state", iWidth, "percent");
            this.dhk.uef("eraseState", map2);
        } else if (action == 2 && x5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x5 < getWidth() && y10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y10 < getHeight()) {
            float f10 = this.gr;
            float f11 = this.f24709ue;
            this.gsd.quadTo(f10, f11, (f10 + x5) / 2.0f, (f11 + y10) / 2.0f);
            this.gr = x5;
            this.f24709ue = y10;
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        ColorDrawable colorDrawable = new ColorDrawable(i5);
        this.ivm = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.ivm = drawable;
        uef(true);
        super.setBackgroundDrawable(this.ivm);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) throws Resources.NotFoundException {
        if (this.f24708ab != i5) {
            this.f24708ab = i5;
            Drawable drawableOa = oa();
            this.ivm = drawableOa;
            setBackgroundDrawable(drawableOa);
        }
    }

    public void setBorderColor(int i5) {
        setBorderColor(ColorStateList.valueOf(i5));
    }

    public void setBorderRadius(float f10) {
        bcc bccVar = this.tpx;
        if (bccVar != null) {
            bccVar.uef(f10);
        }
    }

    public void setBorderWidth(int i5) {
        setBorderWidth(getResources().getDimension(i5));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.cz != colorFilter) {
            this.cz = colorFilter;
            this.wrv = true;
            this.zjm = true;
            moa();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        uef(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i5) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i5);
        uef(dimension, dimension, dimension, dimension);
    }

    public void setEraseEnabled(boolean z2) {
        if (z2) {
            this.gsd = new Path();
            Paint paint = new Paint();
            this.rt = paint;
            paint.setAntiAlias(true);
            this.rt.setDither(true);
            this.rt.setStyle(Paint.Style.STROKE);
            this.rt.setStrokeWidth(this.gzw * 2.0f);
            this.rt.setStrokeCap(Paint.Cap.ROUND);
            this.rt.setStrokeJoin(Paint.Join.ROUND);
            this.rt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.rt.setColor(0);
            this.orq = true;
        } else {
            this.orq = false;
        }
        postInvalidate();
    }

    public void setEraseRadius(float f10) {
        this.gzw = f10;
        Paint paint = this.rt;
        if (paint != null) {
            paint.setStrokeWidth(f10 * 2.0f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.wk = 0;
        this.dj = oa.uef(bitmap);
        yo();
        super.setImageDrawable(this.dj);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.wk = 0;
        this.dj = oa.uef(drawable);
        yo();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        if (this.wk != i5) {
            this.wk = i5;
            this.dj = uef();
            yo();
            super.setImageDrawable(this.dj);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z2) {
        this.cq = z2;
        yo();
        uef(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.yo = f10;
        bcc bccVar = this.tpx;
        if (bccVar != null) {
            bccVar.oa(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        bcc bccVar = this.tpx;
        if (bccVar != null) {
            bccVar.lw(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f24707oa && scaleType == null) {
            throw new AssertionError();
        }
        if (this.bs != scaleType) {
            this.bs = scaleType;
            int i5 = AnonymousClass1.uef[scaleType.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            yo();
            uef(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        bcc bccVar = this.tpx;
        if (bccVar != null) {
            bccVar.yo(f10);
        }
    }

    public void setStretch(float f10) {
        bcc bccVar = this.tpx;
        if (bccVar != null) {
            bccVar.moa(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.sy == tileMode) {
            return;
        }
        this.sy = tileMode;
        yo();
        uef(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.oib == tileMode) {
            return;
        }
        this.oib = tileMode;
        yo();
        uef(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.xs.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.xs = colorStateList;
        yo();
        uef(false);
        if (this.bcc > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.bcc == f10) {
            return;
        }
        this.bcc = f10;
        yo();
        uef(false);
        invalidate();
    }

    private void uef(boolean z2) {
        if (this.dz) {
            if (z2) {
                this.ivm = oa.uef(this.ivm);
            }
            uef(this.ivm, ImageView.ScaleType.FIT_XY);
        }
    }

    private void uef(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof oa) {
            oa oaVar = (oa) drawable;
            oaVar.uef(scaleType).uef(this.bcc).uef(this.xs).uef(this.cq).uef(this.sy).oa(this.oib);
            float[] fArr = this.lw;
            if (fArr != null) {
                oaVar.uef(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            moa();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i5 = 0; i5 < numberOfLayers; i5++) {
                uef(layerDrawable.getDrawable(i5), scaleType);
            }
        }
    }

    public void uef(float f10, float f11, float f12, float f13) {
        float[] fArr = this.lw;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        yo();
        uef(false);
        invalidate();
    }

    public void uef(moa moaVar) {
        this.dhk = moaVar;
    }
}
