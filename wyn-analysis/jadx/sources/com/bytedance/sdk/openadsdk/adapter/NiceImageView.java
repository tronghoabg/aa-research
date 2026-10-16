package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.ivm.moa;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class NiceImageView extends moa {

    /* renamed from: ab, reason: collision with root package name */
    private int f25267ab;
    private int bcc;
    private float bs;
    private int cq;
    private int cz;
    private RectF dhk;
    private int dj;
    private final Xfermode dz;
    private Path gsd;
    private final Path gzw;
    private int ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25268oa;
    private final float[] oib;
    private final Paint orq;
    private final float[] sy;
    private final RectF tpx;
    private final Context uef;
    private int wk;
    private int wrv;
    private int xs;
    private boolean yo;
    private int zjm;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void moa() {
        if (this.f25268oa) {
            return;
        }
        this.ivm = 0;
    }

    private void oa() {
        if (!this.f25268oa) {
            this.dhk.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.wk, this.f25267ab);
            if (this.yo) {
                this.dhk = this.tpx;
                return;
            }
            return;
        }
        float fMin = Math.min(this.wk, this.f25267ab) / 2.0f;
        this.bs = fMin;
        RectF rectF = this.dhk;
        int i5 = this.wk;
        int i10 = this.f25267ab;
        rectF.set((i5 / 2.0f) - fMin, (i10 / 2.0f) - fMin, (i5 / 2.0f) + fMin, (i10 / 2.0f) + fMin);
    }

    private void uef(Canvas canvas) {
        if (!this.f25268oa) {
            int i5 = this.moa;
            if (i5 > 0) {
                uef(canvas, i5, this.lw, this.tpx, this.sy);
                return;
            }
            return;
        }
        int i10 = this.moa;
        if (i10 > 0) {
            uef(canvas, i10, this.lw, this.bs - (i10 / 2.0f));
        }
        int i11 = this.ivm;
        if (i11 > 0) {
            uef(canvas, i11, this.xs, (this.bs - this.moa) - (i11 / 2.0f));
        }
    }

    private void yo() {
        if (this.f25268oa) {
            return;
        }
        int i5 = 0;
        if (this.bcc <= 0) {
            float[] fArr = this.sy;
            int i10 = this.cz;
            float f10 = i10;
            fArr[1] = f10;
            fArr[0] = f10;
            int i11 = this.zjm;
            float f11 = i11;
            fArr[3] = f11;
            fArr[2] = f11;
            int i12 = this.wrv;
            float f12 = i12;
            fArr[5] = f12;
            fArr[4] = f12;
            int i13 = this.dj;
            float f13 = i13;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.oib;
            int i14 = this.moa;
            float f14 = i10 - (i14 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i11 - (i14 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i12 - (i14 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i13 - (i14 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.sy;
            if (i5 >= fArr3.length) {
                return;
            }
            int i15 = this.bcc;
            fArr3[i5] = i15;
            this.oib[i5] = i15 - (this.moa / 2.0f);
            i5++;
        }
    }

    public void isCircle(boolean z2) {
        this.f25268oa = z2;
        moa();
        oa();
        invalidate();
    }

    public void isCoverSrc(boolean z2) {
        this.yo = z2;
        oa();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.dhk, null, 31);
        if (!this.yo) {
            int i5 = this.wk;
            int i10 = this.moa;
            int i11 = this.ivm;
            int i12 = this.f25267ab;
            canvas.scale((((i5 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i5, (((i12 - (i10 * 2)) - (i11 * 2)) * 1.0f) / i12, i5 / 2.0f, i12 / 2.0f);
        }
        super.onDraw(canvas);
        this.orq.reset();
        this.gzw.reset();
        if (this.f25268oa) {
            this.gzw.addCircle(this.wk / 2.0f, this.f25267ab / 2.0f, this.bs, Path.Direction.CCW);
        } else {
            this.gzw.addRoundRect(this.dhk, this.oib, Path.Direction.CCW);
        }
        this.orq.setAntiAlias(true);
        this.orq.setStyle(Paint.Style.FILL);
        this.orq.setXfermode(this.dz);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.gzw, this.orq);
        } else {
            this.gsd.addRect(this.dhk, Path.Direction.CCW);
            this.gsd.op(this.gzw, Path.Op.DIFFERENCE);
            canvas.drawPath(this.gsd, this.orq);
        }
        this.orq.setXfermode(null);
        int i13 = this.cq;
        if (i13 != 0) {
            this.orq.setColor(i13);
            canvas.drawPath(this.gzw, this.orq);
        }
        canvas.restore();
        uef(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.wk = i5;
        this.f25267ab = i10;
        uef();
        oa();
    }

    public void setBorderColor(int i5) {
        this.lw = i5;
        invalidate();
    }

    public void setBorderWidth(int i5) {
        this.moa = af.oa(this.uef, i5);
        uef(false);
    }

    public void setCornerBottomLeftRadius(int i5) {
        this.dj = af.oa(this.uef, i5);
        uef(true);
    }

    public void setCornerBottomRightRadius(int i5) {
        this.wrv = af.oa(this.uef, i5);
        uef(true);
    }

    public void setCornerRadius(int i5) {
        this.bcc = af.oa(this.uef, i5);
        uef(false);
    }

    public void setCornerTopLeftRadius(int i5) {
        this.cz = af.oa(this.uef, i5);
        uef(true);
    }

    public void setCornerTopRightRadius(int i5) {
        this.zjm = af.oa(this.uef, i5);
        uef(true);
    }

    public void setInnerBorderColor(int i5) {
        this.xs = i5;
        invalidate();
    }

    public void setInnerBorderWidth(int i5) {
        this.ivm = af.oa(this.uef, i5);
        moa();
        invalidate();
    }

    public void setMaskColor(int i5) {
        this.cq = i5;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.lw = -1;
        this.xs = -1;
        this.uef = context;
        this.bcc = af.oa(context, 10.0f);
        this.sy = new float[8];
        this.oib = new float[8];
        this.tpx = new RectF();
        this.dhk = new RectF();
        this.orq = new Paint();
        this.gzw = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.dz = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.dz = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.gsd = new Path();
        }
        yo();
        moa();
    }

    private void uef(Canvas canvas, int i5, int i10, float f10) {
        uef(i5, i10);
        this.gzw.addCircle(this.wk / 2.0f, this.f25267ab / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.gzw, this.orq);
    }

    private void uef(Canvas canvas, int i5, int i10, RectF rectF, float[] fArr) {
        uef(i5, i10);
        this.gzw.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.gzw, this.orq);
    }

    private void uef(int i5, int i10) {
        this.gzw.reset();
        this.orq.setStrokeWidth(i5);
        this.orq.setColor(i10);
        this.orq.setStyle(Paint.Style.STROKE);
    }

    private void uef() {
        if (this.f25268oa) {
            return;
        }
        RectF rectF = this.tpx;
        int i5 = this.moa;
        rectF.set(i5 / 2.0f, i5 / 2.0f, this.wk - (i5 / 2.0f), this.f25267ab - (i5 / 2.0f));
    }

    private void uef(boolean z2) {
        if (z2) {
            this.bcc = 0;
        }
        yo();
        uef();
        invalidate();
    }
}
