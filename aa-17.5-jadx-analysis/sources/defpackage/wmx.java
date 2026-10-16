package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wmx extends wue implements Drawable.Callback, wqo {
    private ColorStateList D;
    private ColorStateList E;
    private float F;
    private ColorStateList G;
    private float H;
    private boolean I;
    private Drawable J;
    private ColorStateList K;
    private float L;
    private boolean M;
    private Drawable N;
    private ColorStateList O;
    private float P;
    private boolean Q;
    private Drawable R;
    private ColorStateList S;
    private float T;
    private float U;
    private float V;
    private float W;
    private final Context X;
    private final Paint Y;
    private final Paint.FontMetrics Z;
    private final RectF aa;
    private final PointF ab;
    private final Path ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private int aj;
    private int ak;
    private ColorFilter al;
    private PorterDuffColorFilter am;
    private ColorStateList an;
    private PorterDuff.Mode ao;
    private int[] ap;
    private WeakReference aq;
    private boolean ar;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public boolean e;
    public Drawable f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final wqp l;
    public TextUtils.TruncateAt m;
    public boolean n;
    public int o;
    public static final int[] a = {R.attr.state_enabled};
    private static final ShapeDrawable C = new ShapeDrawable(new OvalShape());

    private wmx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.F = -1.0f;
        this.Y = new Paint(1);
        this.Z = new Paint.FontMetrics();
        this.aa = new RectF();
        this.ab = new PointF();
        this.ac = new Path();
        this.ak = 255;
        this.ao = PorterDuff.Mode.SRC_IN;
        this.aq = new WeakReference(null);
        K(context);
        this.X = context;
        wqp wqpVar = new wqp(this);
        this.l = wqpVar;
        this.d = "";
        wqpVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        s(iArr);
        this.n = true;
        C.setTint(-1);
    }

    private final float Z() {
        Drawable drawable = this.ai ? this.R : this.J;
        float f = this.L;
        return (f > BitmapDescriptorFactory.HUE_RED || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final ColorFilter aa() {
        ColorFilter colorFilter = this.al;
        return colorFilter != null ? colorFilter : this.am;
    }

    private final void ab(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f) {
            drawable.setTintList(this.O);
            if (drawable.isStateful()) {
                drawable.setState(this.ap);
                return;
            }
            return;
        }
        Drawable drawable2 = this.J;
        if (drawable == drawable2 && this.M) {
            drawable2.setTintList(this.K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private final void ac(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (ah() || ag()) {
            float f = this.h + this.T;
            float fZ = Z();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + fZ;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - fZ;
            }
            Drawable drawable = this.ai ? this.R : this.J;
            float fCeil = this.L;
            if (fCeil <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
                fCeil = (float) Math.ceil(woy.E(this.X, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.bottom = rectF.top + fCeil;
        }
    }

    private final boolean ad() {
        return this.Q && this.R != null && this.g;
    }

    private static boolean ae(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean af(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.D;
        int iA = A(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ad) : 0);
        boolean state = true;
        if (this.ad != iA) {
            this.ad = iA;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.E;
        int iA2 = A(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ae) : 0);
        if (this.ae != iA2) {
            this.ae = iA2;
            zOnStateChange = true;
        }
        int iD = dvd.d(iA2, iA);
        if ((this.af != iD) | (D() == null)) {
            this.af = iD;
            O(ColorStateList.valueOf(iD));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.G;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ag) : 0;
        if (this.ag != colorForState) {
            this.ag = colorForState;
            zOnStateChange = true;
        }
        wte wteVar = this.l.e;
        int colorForState2 = (wteVar == null || (colorStateList = wteVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.ah);
        if (this.ah != colorForState2) {
            this.ah = colorForState2;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int i = 0;
            while (true) {
                if (i >= state2.length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.g) {
                    z = true;
                }
            }
        }
        if (this.ai == z || this.R == null) {
            z2 = false;
        } else {
            float fB = b();
            this.ai = z;
            if (fB != b()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.an;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.aj) : 0;
        if (this.aj != colorForState3) {
            this.aj = colorForState3;
            this.am = woy.c(this, this.an, this.ao);
        } else {
            state = zOnStateChange;
        }
        if (r(this.J)) {
            state |= this.J.setState(iArr);
        }
        if (r(this.R)) {
            state |= this.R.setState(iArr);
        }
        if (r(this.f)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            state |= this.f.setState(iArr3);
        }
        if (r(this.N)) {
            state |= this.N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            i();
        }
        return state;
    }

    private final boolean ag() {
        return this.Q && this.R != null && this.ai;
    }

    private final boolean ah() {
        return this.I && this.J != null;
    }

    private final boolean ai() {
        return this.e && this.f != null;
    }

    private static final void aj(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wmx g(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmx.g(android.content.Context, android.util.AttributeSet, int, int):wmx");
    }

    public static boolean r(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float b() {
        return (ah() || ag()) ? this.T + Z() + this.U : BitmapDescriptorFactory.HUE_RED;
    }

    public final float c() {
        return ai() ? this.V + this.P + this.W : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.ak) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.ak);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        if (!this.ar) {
            Paint paint = this.Y;
            paint.setColor(this.ad);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.aa;
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, e(), e(), paint);
        }
        if (!this.ar) {
            Paint paint2 = this.Y;
            paint2.setColor(this.ae);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(aa());
            RectF rectF2 = this.aa;
            rectF2.set(bounds);
            canvas2.drawRoundRect(rectF2, e(), e(), paint2);
        }
        if (this.ar) {
            super.draw(canvas);
        }
        if (this.H <= BitmapDescriptorFactory.HUE_RED || this.ar) {
            f = 2.0f;
        } else {
            Paint paint3 = this.Y;
            paint3.setColor(this.ag);
            paint3.setStyle(Paint.Style.STROKE);
            if (!this.ar) {
                paint3.setColorFilter(aa());
            }
            RectF rectF3 = this.aa;
            f = 2.0f;
            rectF3.set(bounds.left + (this.H / 2.0f), bounds.top + (this.H / 2.0f), bounds.right - (this.H / 2.0f), bounds.bottom - (this.H / 2.0f));
            float f2 = this.F - (this.H / 2.0f);
            canvas2.drawRoundRect(rectF3, f2, f2, paint3);
        }
        Paint paint4 = this.Y;
        paint4.setColor(0);
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF4 = this.aa;
        rectF4.set(bounds);
        if (this.ar) {
            RectF rectF5 = new RectF(bounds);
            Path path = this.ac;
            H(rectF5, path);
            super.I(canvas2, paint4, path, this.p.a.a(), this.z, F());
        } else {
            canvas2.drawRoundRect(rectF4, e(), e(), paint4);
        }
        if (ah()) {
            ac(bounds, rectF4);
            float f3 = rectF4.left;
            float f4 = rectF4.top;
            canvas2.translate(f3, f4);
            this.J.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.J.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (ag()) {
            ac(bounds, rectF4);
            float f5 = rectF4.left;
            float f6 = rectF4.top;
            canvas2.translate(f5, f6);
            this.R.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.R.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.n && this.d != null) {
            PointF pointF = this.ab;
            pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float fB = this.h + b() + this.i;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fB;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fB;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                wqp wqpVar = this.l;
                Paint.FontMetrics fontMetrics = this.Z;
                wqpVar.a.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF4.setEmpty();
            if (this.d != null) {
                float fB2 = this.h + b() + this.i;
                float fC = this.k + c() + this.j;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fB2;
                    rectF4.right = bounds.right - fC;
                } else {
                    rectF4.left = bounds.left + fC;
                    rectF4.right = bounds.right - fB2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            wqp wqpVar2 = this.l;
            if (wqpVar2.e != null) {
                TextPaint textPaint = wqpVar2.a;
                textPaint.drawableState = getState();
                wqpVar2.e.c(this.X, textPaint, wqpVar2.b);
            }
            TextPaint textPaint2 = wqpVar2.a;
            textPaint2.setTextAlign(align);
            boolean z = Math.round(wqpVar2.a(this.d.toString())) > Math.round(rectF4.width());
            if (z) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF4);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.d;
            if (z && this.m != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF4.width(), this.m);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z) {
                canvas2.restoreToCount(i2);
            }
        }
        if (ai()) {
            rectF4.setEmpty();
            if (ai()) {
                float f7 = this.k + this.W;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.P;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.P;
                }
                rectF4.top = bounds.exactCenterY() - (this.P / f);
                rectF4.bottom = rectF4.top + this.P;
            }
            float f8 = rectF4.left;
            float f9 = rectF4.top;
            canvas2.translate(f8, f9);
            this.f.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.N.setBounds(this.f.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.ak < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final float e() {
        return this.ar ? x() : this.F;
    }

    public final Drawable f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return dth.b(drawable);
        }
        return null;
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ak;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.al;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.h + b() + this.i + this.l.a(this.d.toString()) + this.j + c() + this.k), this.o);
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.ar) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        } else {
            outline.setRoundRect(bounds, this.F);
            outline2 = outline;
        }
        outline2.setAlpha(this.ak / 255.0f);
    }

    public final wte h() {
        return this.l.e;
    }

    protected final void i() {
        wmw wmwVar = (wmw) this.aq.get();
        if (wmwVar != null) {
            wmwVar.e();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (ae(this.D) || ae(this.E) || ae(this.G)) {
            return true;
        }
        wte wteVar = this.l.e;
        return !(wteVar == null || (colorStateList = wteVar.k) == null || !colorStateList.isStateful()) || ad() || r(this.J) || r(this.R) || ae(this.an);
    }

    @Override // defpackage.wqo
    public final void j() {
        i();
        invalidateSelf();
    }

    public final void k(boolean z) {
        if (this.Q != z) {
            boolean zAg = ag();
            this.Q = z;
            boolean zAg2 = ag();
            if (zAg != zAg2) {
                Drawable drawable = this.R;
                if (zAg2) {
                    ab(drawable);
                } else {
                    aj(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void l(boolean z) {
        if (this.I != z) {
            boolean zAh = ah();
            this.I = z;
            boolean zAh2 = ah();
            if (zAh != zAh2) {
                Drawable drawable = this.J;
                if (zAh2) {
                    ab(drawable);
                } else {
                    aj(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void m(boolean z) {
        if (this.e != z) {
            boolean zAi = ai();
            this.e = z;
            boolean zAi2 = ai();
            if (zAi != zAi2) {
                Drawable drawable = this.f;
                if (zAi2) {
                    ab(drawable);
                } else {
                    aj(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void n(wmw wmwVar) {
        this.aq = new WeakReference(wmwVar);
    }

    public final void o(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.l.c = true;
        invalidateSelf();
        i();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ah()) {
            zOnLayoutDirectionChanged |= this.J.setLayoutDirection(i);
        }
        if (ag()) {
            zOnLayoutDirectionChanged |= this.R.setLayoutDirection(i);
        }
        if (ai()) {
            zOnLayoutDirectionChanged |= this.f.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (ah()) {
            zOnLevelChange |= this.J.setLevel(i);
        }
        if (ag()) {
            zOnLevelChange |= this.R.setLevel(i);
        }
        if (ai()) {
            zOnLevelChange |= this.f.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.ar) {
            super.onStateChange(iArr);
        }
        return af(iArr, this.ap);
    }

    public final void p(wte wteVar) {
        wqp wqpVar = this.l;
        if (wqpVar.e != wteVar) {
            wqpVar.e = wteVar;
            if (wteVar != null) {
                Context context = this.X;
                TextPaint textPaint = wqpVar.a;
                wtf wtfVar = wqpVar.b;
                wteVar.d(context, textPaint, wtfVar);
                wqo wqoVar = (wqo) wqpVar.d.get();
                if (wqoVar != null) {
                    textPaint.drawableState = wqoVar.getState();
                }
                wteVar.c(context, textPaint, wtfVar);
                wqpVar.c = true;
            }
            wqo wqoVar2 = (wqo) wqpVar.d.get();
            if (wqoVar2 != null) {
                wqoVar2.j();
                wqoVar2.onStateChange(wqoVar2.getState());
            }
        }
    }

    public final void q(int i) {
        p(new wte(this.X, i));
    }

    public final boolean s(int[] iArr) {
        if (Arrays.equals(this.ap, iArr)) {
            return false;
        }
        this.ap = iArr;
        if (ai()) {
            return af(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ak != i) {
            this.ak = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.al != colorFilter) {
            this.al = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.an != colorStateList) {
            this.an = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.wue, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.ao != mode) {
            this.ao = mode;
            this.am = woy.c(this, this.an, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (ah()) {
            visible |= this.J.setVisible(z, z2);
        }
        if (ag()) {
            visible |= this.R.setVisible(z, z2);
        }
        if (ai()) {
            visible |= this.f.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
