package com.bytedance.sdk.openadsdk.core.cq.oa.uef;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
class uef extends View {

    /* renamed from: ab, reason: collision with root package name */
    private float[] f25537ab;
    private int af;
    private float au;
    private Paint bcc;
    private boolean[] bs;
    private float cop;
    private final Path cp;
    private Matrix cq;
    private com.bytedance.adsdk.ugeno.cz.ivm.uef cz;
    private ValueAnimator[] dhk;
    private String[] dj;
    private float dor;
    private final float[] dxx;
    private String[] dz;
    private oa[] etd;
    private final Path fz;
    private int gb;
    private float gem;
    private final RectF gr;
    private final RectF gsd;
    private final AccelerateDecelerateInterpolator gzw;
    private float ivm;
    private long km;
    private final Path ku;
    private int lw;
    private final float[] lz;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25538oa;
    private ValueAnimator[] oib;
    private float[] orq;
    private Paint oyt;
    private int pu;
    private final Path pz;
    private final Runnable rj;
    private float rl;
    private final RectF rt;
    private int sk;
    private float swd;
    private boolean[] sy;
    private float[] tpx;

    /* renamed from: ue, reason: collision with root package name */
    private final RectF f25539ue;
    private int uef;
    private C0086uef[] uqx;
    private float[] wk;
    private Camera wrv;
    private com.bytedance.sdk.openadsdk.core.cq.oa.uef.oa xs;
    private int yo;
    private Handler zjm;

    public static class oa implements Animator.AnimatorListener {

        /* renamed from: oa, reason: collision with root package name */
        private final uef f25540oa;
        private final int uef;

        public oa(uef uefVar, int i5) {
            this.f25540oa = uefVar;
            this.uef = i5;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25540oa.bs[this.uef] = false;
            this.f25540oa.dhk[this.uef].start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.oa.uef.uef$uef, reason: collision with other inner class name */
    public static class C0086uef implements Animator.AnimatorListener {

        /* renamed from: oa, reason: collision with root package name */
        private final uef f25541oa;
        private final int uef;

        public C0086uef(uef uefVar, int i5) {
            this.f25541oa = uefVar;
            this.uef = i5;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25541oa.sy[this.uef] = false;
            this.f25541oa.dj[this.uef] = this.f25541oa.dz[this.uef];
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public uef(Context context) {
        super(context);
        this.zjm = new Handler(Looper.getMainLooper());
        this.dj = new String[3];
        this.wrv = new Camera();
        this.cq = new Matrix();
        this.dz = new String[3];
        this.wk = new float[3];
        this.f25537ab = new float[3];
        this.bs = new boolean[3];
        this.sy = new boolean[3];
        this.oib = new ValueAnimator[3];
        this.dhk = new ValueAnimator[3];
        this.tpx = new float[3];
        this.orq = new float[3];
        this.gzw = new AccelerateDecelerateInterpolator();
        this.gsd = new RectF();
        this.rt = new RectF();
        this.gr = new RectF();
        this.f25539ue = new RectF();
        this.pz = new Path();
        this.cp = new Path();
        this.ku = new Path();
        this.fz = new Path();
        this.dxx = new float[8];
        this.lz = new float[8];
        this.km = 0L;
        this.rj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.uef.uef.1
            @Override // java.lang.Runnable
            public void run() {
                uef.uef(uef.this);
                uef.this.invalidate();
                if (uef.this.uef > 0) {
                    uef.this.zjm.postDelayed(this, 1000L);
                } else {
                    uef.this.zjm.removeCallbacks(this);
                    uef.this.oa();
                }
            }
        };
        moa();
        lw();
        yo();
    }

    public static /* synthetic */ int uef(uef uefVar) {
        int i5 = uefVar.uef;
        uefVar.uef = i5 - 1;
        return i5;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.moa <= 0 || this.lw <= 0) {
            return;
        }
        this.gsd.set((getWidth() - this.moa) / 2.0f, (getHeight() - this.lw) / 2.0f, (getWidth() + this.moa) / 2.0f, (getHeight() + this.lw) / 2.0f);
        RectF rectF = this.gsd;
        float f10 = this.ivm;
        canvas.drawRoundRect(rectF, f10, f10, this.bcc);
        int i5 = this.uef;
        this.pu = i5 / 3600;
        int i10 = i5 % 3600;
        this.gb = i10;
        this.af = i10 / 60;
        this.sk = i10 % 60;
        this.rl = this.moa;
        this.swd = this.lw;
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        this.gem = width;
        float f11 = this.rl * 3.0f;
        this.cop = f11;
        float f12 = width - f11;
        this.au = f12;
        this.dor = f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f12 / 2.0f : 10.0f;
        uef(this.pu, this.af, this.sk);
        float paddingLeft = getPaddingLeft();
        float fCenterY = this.gsd.centerY();
        float f13 = this.swd;
        uef(canvas, paddingLeft, fCenterY - (f13 / 2.0f), this.rl, f13, String.format("%02d", Integer.valueOf(this.pu)), 0);
        float paddingLeft2 = this.dor + getPaddingLeft() + this.rl;
        float fCenterY2 = this.gsd.centerY();
        float f14 = this.swd;
        uef(canvas, paddingLeft2, fCenterY2 - (f14 / 2.0f), this.rl, f14, String.format("%02d", Integer.valueOf(this.af)), 1);
        float paddingLeft3 = ((this.rl + this.dor) * 2.0f) + getPaddingLeft();
        float fCenterY3 = this.gsd.centerY();
        float f15 = this.swd;
        uef(canvas, paddingLeft3, fCenterY3 - (f15 / 2.0f), this.rl, f15, String.format("%02d", Integer.valueOf(this.sk)), 2);
        uef(canvas, (this.dor / 2.0f) + getPaddingLeft() + this.rl, this.gsd.centerY());
        uef(canvas, ((this.dor * 3.0f) / 2.0f) + (this.rl * 2.0f) + getPaddingLeft(), this.gsd.centerY());
        com.bytedance.sdk.openadsdk.core.cq.oa.uef.oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        com.bytedance.sdk.openadsdk.core.cq.oa.uef.oa oaVar = this.xs;
        if (oaVar == null) {
            super.onMeasure(i5, i10);
            return;
        }
        int[] iArrUef = oaVar.uef(i5, i10);
        if (this.lw > 0) {
            int mode = View.MeasureSpec.getMode(iArrUef[1]);
            int size = View.MeasureSpec.getSize(iArrUef[1]);
            if (mode == 0 || size > this.lw) {
                iArrUef[1] = View.MeasureSpec.makeMeasureSpec(this.lw, 1073741824);
            }
        }
        super.onMeasure(iArrUef[0], iArrUef[1]);
    }

    private void lw() {
        if (this.cz == null) {
            com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar = new com.bytedance.adsdk.ugeno.cz.ivm.uef(getContext());
            this.cz = uefVar;
            this.oyt = uefVar.getPaint();
        }
    }

    private void moa() {
        Paint paint = new Paint();
        this.bcc = paint;
        paint.setColor(this.f25538oa);
        this.bcc.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oa(int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.wk[i5] = fFloatValue;
        this.tpx[i5] = 1.0f - (fFloatValue / (-90.0f));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.km >= 16) {
            invalidate();
            this.km = jCurrentTimeMillis;
        }
    }

    private void yo() {
        this.etd = new oa[3];
        this.uqx = new C0086uef[3];
        for (int i5 = 0; i5 < 3; i5++) {
            this.etd[i5] = new oa(this, i5);
            this.uqx[i5] = new C0086uef(this, i5);
        }
    }

    public void uef(int i5, int i10, int i11, int i12, int i13, float f10) {
        int iMin = Math.min(i5, 360060);
        this.f25538oa = i10;
        this.yo = i11;
        this.moa = i12;
        this.lw = i13;
        this.ivm = f10;
        this.uef = iMin;
        this.zjm.post(this.rj);
        Paint paint = this.bcc;
        if (paint != null) {
            paint.setColor(this.f25538oa);
        }
        float[] fArr = this.dxx;
        float f11 = this.ivm;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.lz;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f11;
        fArr2[6] = f11;
        fArr2[5] = f11;
        fArr2[4] = f11;
        invalidate();
    }

    public void oa() {
        for (int i5 = 0; i5 < 3; i5++) {
            ValueAnimator valueAnimator = this.oib[i5];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.oib[i5].cancel();
            }
            ValueAnimator valueAnimator2 = this.dhk[i5];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.dhk[i5].cancel();
            }
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.cq.oa.uef.oa oaVar) {
        this.xs = oaVar;
    }

    private void uef(Canvas canvas, float f10, float f11, float f12, float f13, String str, int i5) {
        this.rt.set(f10, f11, f12 + f10, f13 + f11);
        float fCenterY = this.rt.centerY();
        float fCenterY2 = this.rt.centerY() - ((this.cz.getPaint().ascent() + this.cz.getPaint().descent()) / 2.0f);
        RectF rectF = this.gr;
        RectF rectF2 = this.rt;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.pz.reset();
        Path path = this.pz;
        RectF rectF3 = this.gr;
        float[] fArr = this.dxx;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.bcc.setColor(this.f25538oa);
        canvas.drawPath(this.pz, this.bcc);
        this.oyt.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.rt.centerX(), fCenterY2, this.oyt);
        RectF rectF4 = this.f25539ue;
        RectF rectF5 = this.rt;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.cp.reset();
        this.cp.addRoundRect(this.f25539ue, this.lz, direction);
        this.bcc.setColor(this.yo);
        canvas.drawPath(this.cp, this.bcc);
        canvas.drawText(str, this.rt.centerX(), fCenterY2, this.cz.getPaint());
        boolean z2 = this.bs[i5];
        if (z2 || this.sy[i5]) {
            if (z2) {
                canvas.save();
                this.cq.reset();
                this.wrv.save();
                this.wrv.rotateX(this.wk[i5]);
                this.wrv.getMatrix(this.cq);
                this.cq.preTranslate(-this.rt.centerX(), -fCenterY);
                this.cq.postTranslate(this.rt.centerX(), fCenterY);
                canvas.concat(this.cq);
                this.ku.reset();
                this.ku.addRoundRect(this.gr, this.dxx, direction);
                this.bcc.setColor(this.f25538oa);
                canvas.drawPath(this.ku, this.bcc);
                int alpha = this.oyt.getAlpha();
                this.oyt.setAlpha((int) (this.tpx[i5] * 255.0f));
                canvas.drawText(this.dj[i5], this.rt.centerX(), fCenterY2, this.oyt);
                this.oyt.setAlpha(alpha);
                this.wrv.restore();
                canvas.restore();
            }
            if (this.sy[i5]) {
                canvas.save();
                this.cq.reset();
                this.wrv.save();
                this.wrv.rotateX(this.f25537ab[i5]);
                this.wrv.getMatrix(this.cq);
                this.cq.preTranslate(-this.rt.centerX(), -fCenterY);
                this.cq.postTranslate(this.rt.centerX(), fCenterY);
                canvas.concat(this.cq);
                this.fz.reset();
                this.fz.addRoundRect(this.f25539ue, this.lz, direction);
                this.bcc.setColor(this.yo);
                canvas.drawPath(this.fz, this.bcc);
                int alpha2 = this.oyt.getAlpha();
                this.oyt.setAlpha((int) (this.orq[i5] * 255.0f));
                canvas.drawText(this.dz[i5], this.rt.centerX(), fCenterY2, this.oyt);
                this.oyt.setAlpha(alpha2);
                this.wrv.restore();
                canvas.restore();
            }
        }
    }

    private void uef(Canvas canvas, float f10, float f11) {
        canvas.drawText(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, f10, f11 - ((this.oyt.ascent() + this.oyt.descent()) / 2.0f), this.oyt);
    }

    private void uef(int i5, int i10, int i11) {
        String str = this.dj[0];
        String str2 = String.format("%02d", Integer.valueOf(i5));
        if (!str2.equals(str) && !this.bs[0] && !this.sy[0] && str != null) {
            uef(0, str, str2);
        }
        String str3 = this.dj[1];
        String str4 = String.format("%02d", Integer.valueOf(i10));
        if (!str4.equals(str3) && !this.bs[1] && !this.sy[1] && str3 != null) {
            uef(1, str3, str4);
        }
        String str5 = this.dj[2];
        String str6 = String.format("%02d", Integer.valueOf(i11));
        if (!str6.equals(str5) && !this.bs[2] && !this.sy[2] && str5 != null) {
            uef(2, str5, str6);
        }
        String[] strArr = this.dj;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void uef(final int i5, String str, String str2) {
        this.dj[i5] = str;
        this.dz[i5] = str2;
        final int i10 = 1;
        this.bs[i5] = true;
        this.sy[i5] = true;
        this.wk[i5] = 0.0f;
        this.f25537ab[i5] = 90.0f;
        this.tpx[i5] = 1.0f;
        this.orq[i5] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.oib;
        ValueAnimator valueAnimator = valueAnimatorArr[i5];
        if (valueAnimator == null) {
            valueAnimatorArr[i5] = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
            this.oib[i5].setDuration(250L);
            this.oib[i5].setInterpolator(this.gzw);
            final int i11 = 0;
            this.oib[i5].addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.uef.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ uef f25534b;

                {
                    this.f25534b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i11) {
                        case 0:
                            this.f25534b.oa(i5, valueAnimator2);
                            break;
                        default:
                            this.f25534b.uef(i5, valueAnimator2);
                            break;
                    }
                }
            });
            this.oib[i5].addListener(this.etd[i5]);
        } else {
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.dhk;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i5];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i5] = ValueAnimator.ofFloat(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.dhk[i5].setDuration(250L);
            this.dhk[i5].setInterpolator(this.gzw);
            this.dhk[i5].addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.uef.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ uef f25534b;

                {
                    this.f25534b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            this.f25534b.oa(i5, valueAnimator22);
                            break;
                        default:
                            this.f25534b.uef(i5, valueAnimator22);
                            break;
                    }
                }
            });
            this.dhk[i5].addListener(this.uqx[i5]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.oib[i5].isRunning()) {
            this.oib[i5].cancel();
        }
        if (this.dhk[i5].isRunning()) {
            this.dhk[i5].cancel();
        }
        this.oib[i5].start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uef(int i5, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f25537ab[i5] = fFloatValue;
        this.orq[i5] = (fFloatValue + 90.0f) / 90.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.km >= 16) {
            invalidate();
            this.km = jCurrentTimeMillis;
        }
    }

    public com.bytedance.adsdk.ugeno.cz.ivm.uef uef() {
        return this.cz;
    }

    public void uef(com.bytedance.adsdk.ugeno.cz.ivm.uef uefVar) {
        this.cz = uefVar;
    }
}
