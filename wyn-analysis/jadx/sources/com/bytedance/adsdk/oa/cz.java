package com.bytedance.adsdk.oa;

import A7.AbstractC0279p0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.oa.lw.orq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class cz extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: ab, reason: collision with root package name */
    private Map<String, Typeface> f24533ab;
    private Matrix af;
    private boolean bcc;
    private boolean bs;
    private Canvas cp;
    private String cq;
    private oa cz;
    private com.bytedance.adsdk.oa.yo.yo.oa dhk;
    private final ValueAnimator.AnimatorUpdateListener dj;
    private Paint dxx;
    private moa dz;
    private RectF fz;
    private Matrix gb;
    private boolean gr;
    private boolean gsd;
    private boolean gzw;
    private boolean ivm;
    private RectF km;
    private Rect ku;
    private final com.bytedance.adsdk.oa.ivm.yo lw;
    private Rect lz;
    private xs moa;

    /* renamed from: oa, reason: collision with root package name */
    yo f24534oa;
    private boolean oib;
    private boolean orq;
    private Rect oyt;
    private RectF pu;
    private Bitmap pz;
    private boolean rl;
    private oib rt;
    private View sk;
    private boolean sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private final Matrix f24535ue;
    String uef;
    private com.bytedance.adsdk.oa.oa.uef wk;
    private com.bytedance.adsdk.oa.oa.oa wrv;
    private boolean xs;
    dhk yo;
    private final ArrayList<uef> zjm;

    public enum oa {
        NONE,
        PLAY,
        RESUME
    }

    public interface uef {
        void uef(xs xsVar);
    }

    public cz() {
        com.bytedance.adsdk.oa.ivm.yo yoVar = new com.bytedance.adsdk.oa.ivm.yo();
        this.lw = yoVar;
        this.ivm = true;
        this.xs = false;
        this.bcc = false;
        this.cz = oa.NONE;
        this.zjm = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.cz.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (cz.this.dhk != null) {
                    cz.this.dhk.uef(cz.this.lw.ivm());
                }
            }
        };
        this.dj = animatorUpdateListener;
        this.sy = false;
        this.oib = true;
        this.tpx = 255;
        this.rt = oib.AUTOMATIC;
        this.gr = false;
        this.f24535ue = new Matrix();
        this.rl = false;
        yoVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean dxx() {
        return this.ivm || this.xs;
    }

    private void fz() {
        xs xsVar = this.moa;
        if (xsVar == null) {
            return;
        }
        this.gr = this.rt.uef(Build.VERSION.SDK_INT, xsVar.uef(), xsVar.oa());
    }

    private boolean gb() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    private Context km() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.bytedance.adsdk.oa.oa.oa lz() {
        com.bytedance.adsdk.oa.oa.oa oaVar = this.wrv;
        if (oaVar != null && !oaVar.uef(km())) {
            this.wrv = null;
        }
        if (this.wrv == null) {
            this.wrv = new com.bytedance.adsdk.oa.oa.oa(getCallback(), this.cq, this.dz, this.moa.ab());
        }
        return this.wrv;
    }

    private com.bytedance.adsdk.oa.oa.uef oyt() {
        if (getCallback() == null) {
            return null;
        }
        if (this.wk == null) {
            com.bytedance.adsdk.oa.oa.uef uefVar = new com.bytedance.adsdk.oa.oa.uef(getCallback(), this.f24534oa);
            this.wk = uefVar;
            String str = this.uef;
            if (str != null) {
                uefVar.uef(str);
            }
        }
        return this.wk;
    }

    private void pu() {
        if (this.cp != null) {
            return;
        }
        this.cp = new Canvas();
        this.pu = new RectF();
        this.gb = new Matrix();
        this.af = new Matrix();
        this.ku = new Rect();
        this.fz = new RectF();
        this.dxx = new com.bytedance.adsdk.oa.uef.uef();
        this.lz = new Rect();
        this.oyt = new Rect();
        this.km = new RectF();
    }

    public float ab() {
        return this.lw.zjm();
    }

    public sy bcc() {
        xs xsVar = this.moa;
        if (xsVar != null) {
            return xsVar.yo();
        }
        return null;
    }

    public void bs() {
        this.lw.removeAllUpdateListeners();
        this.lw.addUpdateListener(this.dj);
    }

    public float cp() {
        return this.lw.ivm();
    }

    public void cq() {
        if (this.dhk == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.7
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.cq();
                }
            });
            return;
        }
        fz();
        if (dxx() || tpx() == 0) {
            if (isVisible()) {
                this.lw.dz();
                this.cz = oa.NONE;
            } else {
                this.cz = oa.RESUME;
            }
        }
        if (dxx()) {
            return;
        }
        yo((int) (ab() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? dz() : wk()));
        this.lw.wrv();
        if (isVisible()) {
            return;
        }
        this.cz = oa.NONE;
    }

    public boolean cz() {
        return this.gsd;
    }

    public int dhk() {
        return this.lw.getRepeatMode();
    }

    public void dj() {
        if (this.dhk == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.6
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.dj();
                }
            });
            return;
        }
        fz();
        if (dxx() || tpx() == 0) {
            if (isVisible()) {
                this.lw.dj();
                this.cz = oa.NONE;
            } else {
                this.cz = oa.PLAY;
            }
        }
        if (dxx()) {
            return;
        }
        yo((int) (ab() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? dz() : wk()));
        this.lw.wrv();
        if (isVisible()) {
            return;
        }
        this.cz = oa.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        lw.uef("Drawable#draw");
        try {
            if (this.gr) {
                uef(canvas, this.dhk);
            } else {
                uef(canvas);
            }
        } catch (Throwable unused) {
        }
        this.rl = false;
        lw.oa("Drawable#draw");
    }

    public float dz() {
        return this.lw.wk();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.tpx;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        xs xsVar = this.moa;
        if (xsVar == null) {
            return -1;
        }
        return xsVar.moa().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        xs xsVar = this.moa;
        if (xsVar == null) {
            return -1;
        }
        return xsVar.moa().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public xs gr() {
        return this.moa;
    }

    public dhk gsd() {
        return this.yo;
    }

    public boolean gzw() {
        if (isVisible()) {
            return this.lw.isRunning();
        }
        oa oaVar = this.cz;
        return oaVar == oa.PLAY || oaVar == oa.RESUME;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.rl) {
            return;
        }
        this.rl = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return orq();
    }

    public oib ivm() {
        return this.gr ? oib.SOFTWARE : oib.HARDWARE;
    }

    public RectF ku() {
        return this.pu;
    }

    public boolean lw() {
        return this.sy;
    }

    public String moa() {
        return this.cq;
    }

    public int oib() {
        return (int) this.lw.xs();
    }

    public boolean orq() {
        com.bytedance.adsdk.oa.ivm.yo yoVar = this.lw;
        if (yoVar == null) {
            return false;
        }
        return yoVar.isRunning();
    }

    public void pz() {
        this.zjm.clear();
        this.lw.cq();
        if (isVisible()) {
            return;
        }
        this.cz = oa.NONE;
    }

    public boolean rt() {
        return this.f24533ab == null && this.yo == null && this.moa.dz().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.tpx = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z10);
        if (z2) {
            oa oaVar = this.cz;
            if (oaVar == oa.PLAY) {
                dj();
                return visible;
            }
            if (oaVar == oa.RESUME) {
                cq();
                return visible;
            }
        } else {
            if (this.lw.isRunning()) {
                pz();
                this.cz = oa.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.cz = oa.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        dj();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        wrv();
    }

    public void sy() {
        this.lw.removeAllListeners();
    }

    public int tpx() {
        return this.lw.getRepeatCount();
    }

    public void ue() {
        this.zjm.clear();
        this.lw.cancel();
        if (isVisible()) {
            return;
        }
        this.cz = oa.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public float wk() {
        return this.lw.ab();
    }

    public void wrv() {
        this.zjm.clear();
        this.lw.wrv();
        if (isVisible()) {
            return;
        }
        this.cz = oa.NONE;
    }

    public boolean xs() {
        return this.gr;
    }

    public boolean yo() {
        return this.oib;
    }

    public void zjm() {
        if (this.lw.isRunning()) {
            this.lw.cancel();
            if (!isVisible()) {
                this.cz = oa.NONE;
            }
        }
        this.moa = null;
        this.dhk = null;
        this.wrv = null;
        this.lw.bcc();
        invalidateSelf();
    }

    public void ivm(boolean z2) {
        this.bcc = z2;
    }

    public void lw(boolean z2) {
        this.gsd = z2;
    }

    public void moa(boolean z2) {
        if (this.gzw == z2) {
            return;
        }
        this.gzw = z2;
        com.bytedance.adsdk.oa.yo.yo.oa oaVar = this.dhk;
        if (oaVar != null) {
            oaVar.uef(z2);
        }
    }

    public com.bytedance.adsdk.oa.yo.yo.oa oa() {
        return this.dhk;
    }

    public void uef(View view) {
        this.sk = view;
    }

    public void xs(boolean z2) {
        this.xs = z2;
    }

    public void yo(boolean z2) {
        this.orq = z2;
        xs xsVar = this.moa;
        if (xsVar != null) {
            xsVar.oa(z2);
        }
    }

    public void bcc(boolean z2) {
        this.lw.yo(z2);
    }

    public zjm ivm(String str) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            return null;
        }
        return xsVar.ab().get(str);
    }

    public void lw(int i5) {
        this.lw.setRepeatCount(i5);
    }

    public void oa(boolean z2) {
        this.sy = z2;
    }

    public View uef() {
        return this.sk;
    }

    public void xs(String str) {
        this.uef = str;
        com.bytedance.adsdk.oa.oa.uef uefVarOyt = oyt();
        if (uefVarOyt != null) {
            uefVarOyt.uef(str);
        }
    }

    public Bitmap lw(String str) {
        com.bytedance.adsdk.oa.oa.oa oaVarLz = lz();
        if (oaVarLz != null) {
            return oaVarLz.uef(str);
        }
        return null;
    }

    public void oa(final int i5) {
        if (this.moa == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.10
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.oa(i5);
                }
            });
        } else {
            this.lw.oa(i5 + 0.99f);
        }
    }

    public void uef(boolean z2, Context context) {
        if (this.bs == z2) {
            return;
        }
        this.bs = z2;
        if (this.moa != null) {
            uef(context);
        }
    }

    public void yo(final String str) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.13
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar2) {
                    cz.this.yo(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oa.yo.ivm ivmVarYo = xsVar.yo(str);
        if (ivmVarYo != null) {
            oa((int) (ivmVarYo.uef + ivmVarYo.f24608oa));
            return;
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("Cannot find marker with name ", str, "."));
    }

    public void moa(final String str) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.2
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar2) {
                    cz.this.moa(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oa.yo.ivm ivmVarYo = xsVar.yo(str);
        if (ivmVarYo != null) {
            int i5 = (int) ivmVarYo.uef;
            uef(i5, ((int) ivmVarYo.f24608oa) + i5);
            return;
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("Cannot find marker with name ", str, "."));
    }

    public void oa(final float f10) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.11
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar2) {
                    cz.this.oa(f10);
                }
            });
        } else {
            this.lw.oa(com.bytedance.adsdk.oa.ivm.lw.uef(xsVar.ivm(), this.moa.xs(), f10));
        }
    }

    public void uef(boolean z2) {
        if (z2 != this.oib) {
            this.oib = z2;
            com.bytedance.adsdk.oa.yo.yo.oa oaVar = this.dhk;
            if (oaVar != null) {
                oaVar.oa(z2);
            }
            invalidateSelf();
        }
    }

    public void oa(final String str) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.12
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar2) {
                    cz.this.oa(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.oa.yo.ivm ivmVarYo = xsVar.yo(str);
        if (ivmVarYo != null) {
            uef((int) ivmVarYo.uef);
            return;
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("Cannot find marker with name ", str, "."));
    }

    public void uef(String str) {
        this.cq = str;
    }

    public boolean uef(xs xsVar, Context context) {
        if (this.moa == xsVar) {
            return false;
        }
        this.rl = true;
        zjm();
        this.moa = xsVar;
        uef(context);
        this.lw.uef(xsVar);
        moa(this.lw.getAnimatedFraction());
        Iterator it = new ArrayList(this.zjm).iterator();
        while (it.hasNext()) {
            uef uefVar = (uef) it.next();
            if (uefVar != null) {
                uefVar.uef(xsVar);
            }
            it.remove();
        }
        this.zjm.clear();
        xsVar.oa(this.orq);
        fz();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void yo(float f10) {
        this.lw.yo(f10);
    }

    public void yo(final int i5) {
        if (this.moa == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.4
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.yo(i5);
                }
            });
        } else {
            this.lw.uef(i5);
        }
    }

    public void moa(final float f10) {
        if (this.moa == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.5
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.moa(f10);
                }
            });
            return;
        }
        lw.uef("Drawable#setProgress");
        this.lw.uef(this.moa.uef(f10));
        lw.oa("Drawable#setProgress");
    }

    public void oa(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lw.removeUpdateListener(animatorUpdateListener);
    }

    public void oa(Animator.AnimatorListener animatorListener) {
        this.lw.removeListener(animatorListener);
    }

    private void oa(int i5, int i10) {
        Bitmap bitmap = this.pz;
        if (bitmap != null && bitmap.getWidth() >= i5 && this.pz.getHeight() >= i10) {
            if (this.pz.getWidth() > i5 || this.pz.getHeight() > i10) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.pz, 0, 0, i5, i10);
                this.pz = bitmapCreateBitmap;
                this.cp.setBitmap(bitmapCreateBitmap);
                this.rl = true;
                return;
            }
            return;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i5, i10, Bitmap.Config.ARGB_8888);
        this.pz = bitmapCreateBitmap2;
        this.cp.setBitmap(bitmapCreateBitmap2);
        this.rl = true;
    }

    public void moa(int i5) {
        this.lw.setRepeatMode(i5);
    }

    public void uef(oib oibVar) {
        this.rt = oibVar;
        fz();
    }

    private void uef(Context context) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            return;
        }
        com.bytedance.adsdk.oa.yo.yo.oa oaVar = new com.bytedance.adsdk.oa.yo.yo.oa(this, orq.uef(xsVar), xsVar.cq(), xsVar, context);
        this.dhk = oaVar;
        if (this.gzw) {
            oaVar.uef(true);
        }
        this.dhk.oa(this.oib);
    }

    public void uef(final int i5) {
        if (this.moa == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.8
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.uef(i5);
                }
            });
        } else {
            this.lw.uef(i5);
        }
    }

    public void uef(final float f10) {
        xs xsVar = this.moa;
        if (xsVar == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.9
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar2) {
                    cz.this.uef(f10);
                }
            });
        } else {
            uef((int) com.bytedance.adsdk.oa.ivm.lw.uef(xsVar.ivm(), this.moa.xs(), f10));
        }
    }

    public void uef(final int i5, final int i10) {
        if (this.moa == null) {
            this.zjm.add(new uef() { // from class: com.bytedance.adsdk.oa.cz.3
                @Override // com.bytedance.adsdk.oa.cz.uef
                public void uef(xs xsVar) {
                    cz.this.uef(i5, i10);
                }
            });
        } else {
            this.lw.uef(i5, i10 + 0.99f);
        }
    }

    public void uef(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lw.addUpdateListener(animatorUpdateListener);
    }

    public void uef(Animator.AnimatorListener animatorListener) {
        this.lw.addListener(animatorListener);
    }

    public void uef(Boolean bool) {
        this.ivm = bool.booleanValue();
    }

    public void uef(moa moaVar) {
        this.dz = moaVar;
        com.bytedance.adsdk.oa.oa.oa oaVar = this.wrv;
        if (oaVar != null) {
            oaVar.uef(moaVar);
        }
    }

    public void uef(yo yoVar) {
        this.f24534oa = yoVar;
        com.bytedance.adsdk.oa.oa.uef uefVar = this.wk;
        if (uefVar != null) {
            uefVar.uef(yoVar);
        }
    }

    public void uef(Map<String, Typeface> map) {
        if (map == this.f24533ab) {
            return;
        }
        this.f24533ab = map;
        invalidateSelf();
    }

    public void uef(dhk dhkVar) {
        this.yo = dhkVar;
    }

    public Bitmap uef(String str, Bitmap bitmap) {
        com.bytedance.adsdk.oa.oa.oa oaVarLz = lz();
        if (oaVarLz == null) {
            return null;
        }
        Bitmap bitmapUef = oaVarLz.uef(str, bitmap);
        invalidateSelf();
        return bitmapUef;
    }

    public Typeface uef(com.bytedance.adsdk.oa.yo.yo yoVar) {
        Map<String, Typeface> map = this.f24533ab;
        if (map != null) {
            String strUef = yoVar.uef();
            if (map.containsKey(strUef)) {
                return map.get(strUef);
            }
            String strOa = yoVar.oa();
            if (map.containsKey(strOa)) {
                return map.get(strOa);
            }
            String str = yoVar.uef() + "-" + yoVar.yo();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.oa.oa.uef uefVarOyt = oyt();
        if (uefVarOyt != null) {
            return uefVarOyt.uef(yoVar);
        }
        return null;
    }

    private void uef(Canvas canvas) {
        com.bytedance.adsdk.oa.yo.yo.oa oaVar = this.dhk;
        xs xsVar = this.moa;
        if (oaVar == null || xsVar == null) {
            return;
        }
        this.f24535ue.reset();
        if (!getBounds().isEmpty()) {
            this.f24535ue.preScale(r2.width() / xsVar.moa().width(), r2.height() / xsVar.moa().height());
            this.f24535ue.preTranslate(r2.left, r2.top);
        }
        oaVar.uef(canvas, this.f24535ue, this.tpx);
    }

    private void uef(Canvas canvas, com.bytedance.adsdk.oa.yo.yo.oa oaVar) {
        if (this.moa == null || oaVar == null) {
            return;
        }
        pu();
        canvas.getMatrix(this.gb);
        canvas.getClipBounds(this.ku);
        uef(this.ku, this.fz);
        this.gb.mapRect(this.fz);
        uef(this.fz, this.ku);
        if (this.oib) {
            this.pu.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            oaVar.uef(this.pu, (Matrix) null, false);
        }
        this.gb.mapRect(this.pu);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        uef(this.pu, fWidth, fHeight);
        if (!gb()) {
            RectF rectF = this.pu;
            Rect rect = this.ku;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.pu.width());
        int iCeil2 = (int) Math.ceil(this.pu.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        oa(iCeil, iCeil2);
        if (this.rl) {
            this.f24535ue.set(this.gb);
            this.f24535ue.preScale(fWidth, fHeight);
            Matrix matrix = this.f24535ue;
            RectF rectF2 = this.pu;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.pz.eraseColor(0);
            oaVar.uef(this.cp, this.f24535ue, this.tpx);
            this.gb.invert(this.af);
            this.af.mapRect(this.km, this.pu);
            uef(this.km, this.oyt);
        }
        this.lz.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.pz, this.lz, this.oyt, this.dxx);
    }

    private void uef(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void uef(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void uef(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
