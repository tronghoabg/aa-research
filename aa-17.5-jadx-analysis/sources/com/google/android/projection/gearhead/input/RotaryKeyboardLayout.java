package com.google.android.projection.gearhead.input;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.dsg;
import defpackage.eov;
import defpackage.eox;
import defpackage.mok;
import defpackage.wxj;
import defpackage.wyh;
import defpackage.xcs;
import defpackage.xdb;
import defpackage.xdw;
import defpackage.xdx;
import defpackage.xdz;
import defpackage.xea;
import defpackage.xeb;
import defpackage.xec;
import defpackage.ykd;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class RotaryKeyboardLayout extends FrameLayout {
    public static final yph a = yph.c("GH.RotaryKeyboardView");
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final Animation L;
    private final Animation M;
    private final Animation N;
    private final Animation O;
    private final TimeInterpolator P;
    private Paint Q;
    private Property R;
    private final Runnable S;
    private boolean T;
    private long U;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final ObjectAnimator f;
    public final ObjectAnimator g;
    public xdx h;
    public int i;
    public float j;
    public int k;
    public float l;
    public ImageButton m;
    public ObjectAnimator n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Handler t;
    public HwrView u;
    public xdb v;
    public mok w;
    public ykd x;
    private final int y;
    private final int z;

    public RotaryKeyboardLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.i = 0;
        this.t = new Handler();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wyh.c, i, 0);
        Resources resources = getResources();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(R.dimen.selectedCircleRadius));
        this.C = dimensionPixelSize;
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(R.dimen.keyGroupCircleRadius));
        this.E = resources.getDimensionPixelSize(R.dimen.image_button_radius);
        this.z = resources.getDimensionPixelSize(R.dimen.keySpacingGm3);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.adjacentKeySpacingGm3);
        this.A = dimensionPixelSize2;
        this.B = (dimensionPixelSize + typedArrayObtainStyledAttributes.getDimensionPixelSize(16, resources.getDimensionPixelSize(R.dimen.selectedKeyMargin))) - (dimensionPixelSize2 / 2);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.selectedKeyTextSizeGm3);
        this.F = dimensionPixelSize3;
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(R.dimen.keyGroupSpacing));
        this.K = resources.getDimensionPixelSize(R.dimen.additionalKeySpacingGm3);
        int color = typedArrayObtainStyledAttributes.getColor(17, resources.getColor(R.color.gearhead_sdk_grey_100));
        String string = typedArrayObtainStyledAttributes.getString(3);
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(string == null ? Typeface.DEFAULT : Typeface.create(string, 0));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setTextSize(dimensionPixelSize3);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(string == null ? Typeface.DEFAULT : Typeface.create(string, 0));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(color);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, resources.getDimensionPixelSize(R.dimen.ringKeyTextSize));
        this.G = dimensionPixelSize4;
        paint2.setTextSize(dimensionPixelSize4);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, resources.getDimensionPixelSize(R.dimen.selectedKeygroupTextSize));
        this.H = dimensionPixelSize3 - dimensionPixelSize4;
        this.I = dimensionPixelSize5 - dimensionPixelSize4;
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        Context context3 = getContext();
        int i2 = context3.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize6 = context3.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_margin);
        this.y = Math.round((Math.min(i2 - (dimensionPixelSize6 + dimensionPixelSize6), context3.getResources().getDimensionPixelSize(R.dimen.apps_max_content_width)) / context2.getResources().getDisplayMetrics().density) / 100.0f);
        this.Q = new Paint();
        this.k = 255;
        this.l = 1.0f;
        this.L = AnimationUtils.loadAnimation(getContext(), R.anim.click_enlarge);
        this.M = AnimationUtils.loadAnimation(getContext(), R.anim.click_shrink);
        this.N = AnimationUtils.loadAnimation(getContext(), R.anim.click_enlarge);
        this.O = AnimationUtils.loadAnimation(getContext(), R.anim.click_shrink);
        eov eovVar = new eov();
        eox eoxVar = new eox();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.R = new xdz(this, Float.class);
        xea xeaVar = new xea(this, Integer.class);
        xeb xebVar = new xeb(this, Float.class);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, xeaVar, 255, 0);
        this.f = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(75L);
        objectAnimatorOfInt.setInterpolator(eovVar);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, xebVar, BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        resources.getDrawable(R.drawable.keyboard_fab);
        this.P = eoxVar;
        this.S = new wxj(this, 11, null);
        this.d = new Paint();
        this.e = new Paint();
    }

    private final int j(int i, int i2) {
        return (p(k(i)) || p(k(i2))) ? this.J + this.z : this.z;
    }

    private final xdw k(int i) {
        if (i < 0 || i >= this.h.g()) {
            return null;
        }
        return this.h.h(i);
    }

    private final void l(float f, float f2, float f3, xdw xdwVar, Paint paint, int i, Canvas canvas) {
        int i2;
        float f4;
        Bitmap bitmap;
        int width;
        int height;
        if (xdwVar == null) {
            return;
        }
        int i3 = this.G;
        int iAbs = (int) ((((this.l * this.y) - Math.abs(i)) + 1.0f) * 255.0f);
        if (iAbs < 0) {
            iAbs = 0;
        } else {
            int i4 = this.k;
            if (iAbs > i4) {
                iAbs = i4;
            }
        }
        float fSignum = (i == 0 || this.l <= BitmapDescriptorFactory.HUE_RED) ? f : f + (Math.signum(i) * (this.l - 1.0f) * this.z);
        float f5 = i3;
        float fMax = this.D * Math.max(1.0f - (f3 + f3), BitmapDescriptorFactory.HUE_RED);
        if (xdwVar.a() != null) {
            Paint paint2 = this.d;
            paint2.setAlpha(iAbs);
            Paint paint3 = this.e;
            paint3.setAlpha(iAbs);
            canvas.drawCircle(fSignum, f2, fMax, paint2);
            canvas.drawCircle(fSignum, f2, fMax, paint3);
            i2 = this.I;
        } else {
            i2 = this.H;
        }
        float f6 = (i2 * f3) + f5;
        Drawable drawable = xdwVar.e;
        if (drawable == null) {
            f4 = -1.0f;
        } else if (this.v == null) {
            f4 = -1.0f;
            ((ype) ((ype) a.f()).ai((char) 10150)).u("Cannot apply GM3 theme without color token values.");
        } else {
            f4 = -1.0f;
            if (n(xdwVar)) {
                xdwVar.f(i == 0);
            } else {
                xdb xdbVar = this.v;
                if (i == 0) {
                    drawable.setColorFilter(xdbVar.a, PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.setColorFilter(xdbVar.e, PorterDuff.Mode.SRC_IN);
                }
                xdwVar.e = drawable;
            }
        }
        int i5 = this.E;
        Drawable drawable2 = xdwVar.e;
        if (drawable2 == null) {
            bitmap = null;
        } else {
            boolean z = xdwVar.d;
            int iMax = z ? i5 + i5 : Math.max(drawable2.getIntrinsicWidth(), 1);
            int iMax2 = z ? i5 + i5 : Math.max(xdwVar.e.getIntrinsicHeight(), 1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            xdwVar.e.setBounds(0, 0, iMax, iMax2);
            xdwVar.e.draw(canvas2);
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap != null) {
            float f7 = (f6 / f5) + f4;
            float width2 = bitmap.getWidth();
            float height2 = bitmap.getHeight();
            if (!n(xdwVar)) {
                float f8 = ((f7 * 0.25f) / 0.875f) + 0.75f;
                width = (int) (width2 * f8);
                height = (int) (height2 * f8);
            } else if (i != 0) {
                width = (int) (fMax + fMax);
                height = width;
            } else {
                height = (int) (bitmap.getHeight() * 1.15f);
                width = (int) (bitmap.getWidth() * 1.15f);
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            paint.setAlpha(iAbs);
            canvas.drawBitmap(bitmapCreateScaledBitmap, fSignum - (bitmapCreateScaledBitmap.getWidth() / 2.0f), f2 - (bitmapCreateScaledBitmap.getHeight() / 2.0f), paint);
            return;
        }
        this.Q.set(paint);
        this.Q.setAlpha(iAbs);
        String string = xdwVar.a;
        if (",".equals(string) || ".".equals(string) || "-".equals(string)) {
            this.Q.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (string.equals(",/-")) {
            String[] strArrSplit = string.split("");
            StringBuilder sb = new StringBuilder();
            if (strArrSplit.length > 0) {
                sb.append((CharSequence) strArrSplit[0]);
                for (int i6 = 1; i6 < strArrSplit.length; i6++) {
                    sb.append((CharSequence) " ");
                    sb.append((CharSequence) strArrSplit[i6]);
                }
            }
            string = sb.toString();
        }
        this.Q.setTextSize(f6);
        canvas.drawText(string, fSignum, f2 + (f6 / 3.0f), this.Q);
    }

    private final void m(int i) {
        i(i - this.i);
    }

    private final boolean n(xdw xdwVar) {
        return xdwVar.b == getContext().getResources().getInteger(R.integer.keycode_external_keyboard);
    }

    private static final boolean o(xdw xdwVar) {
        return (xdwVar == null || xdwVar.a() == null) ? false : true;
    }

    private static final boolean p(xdw xdwVar) {
        return xdwVar != null && xdwVar.d();
    }

    public final xdw a() {
        if (this.o) {
            return null;
        }
        return b();
    }

    public final xdw b() {
        xdx xdxVar = this.h;
        if (xdxVar != null && xdxVar.g() != 0 && this.i < this.h.g()) {
            return this.h.h(this.i);
        }
        ((ype) ((ype) a.h()).ai((char) 10152)).u("Cannot get selected key.");
        return null;
    }

    public final void c() {
        Drawable drawable;
        xdx xdxVar = this.h;
        if (xdxVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = xdxVar.l;
            if (i >= arrayList.size()) {
                return;
            }
            xdw xdwVar = (xdw) arrayList.get(i);
            dsg.x(this.v);
            Drawable drawable2 = xdwVar.e;
            Resources resources = getContext().getResources();
            if (drawable2 != null) {
                boolean zB = xdwVar.b();
                boolean zC = xdwVar.c();
                if (n(xdwVar)) {
                    Context context = getContext();
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    Drawable drawable3 = context.getDrawable(R.drawable.external_keyboard_button_gm3_selected_and_enabled_state);
                    dsg.x(drawable3);
                    LayerDrawable layerDrawable = (LayerDrawable) drawable3.mutate();
                    layerDrawable.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.v.a, PorterDuff.Mode.SRC_IN);
                    layerDrawable.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.v.b, PorterDuff.Mode.SRC_IN);
                    Drawable drawable4 = context.getDrawable(R.drawable.external_keyboard_button_gm3_selected_state);
                    dsg.x(drawable4);
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable4.mutate();
                    layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.v.d, PorterDuff.Mode.SRC_IN);
                    layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_oval_overlay).setColorFilter(this.v.a, PorterDuff.Mode.SRC_IN);
                    layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_oval_overlay).setAlpha(31);
                    layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.v.a, PorterDuff.Mode.SRC_IN);
                    Drawable drawable5 = context.getDrawable(R.drawable.external_keyboard_button_gm3_enabled_state);
                    dsg.x(drawable5);
                    LayerDrawable layerDrawable3 = (LayerDrawable) drawable5.mutate();
                    layerDrawable3.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.v.e, PorterDuff.Mode.SRC_IN);
                    layerDrawable3.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.v.d, PorterDuff.Mode.SRC_IN);
                    Drawable drawable6 = context.getDrawable(R.drawable.external_keyboard_button_gm3_default_state);
                    dsg.x(drawable6);
                    LayerDrawable layerDrawable4 = (LayerDrawable) drawable6.mutate();
                    layerDrawable4.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.v.d, PorterDuff.Mode.SRC_IN);
                    layerDrawable4.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.v.e, PorterDuff.Mode.SRC_IN);
                    stateListDrawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, layerDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_selected}, layerDrawable2);
                    stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, layerDrawable3);
                    stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable4);
                    drawable = stateListDrawable;
                } else {
                    int i2 = xdwVar.b;
                    if (i2 == resources.getInteger(R.integer.keycode_done)) {
                        int i3 = xdwVar.c;
                        Resources resources2 = getContext().getResources();
                        int i4 = i3 & 255;
                        drawable = i4 != 2 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? i4 != 7 ? resources2.getDrawable(R.drawable.gs_search_vd_40) : resources2.getDrawable(R.drawable.gs_keyboard_tab_rtl_vd_40) : resources2.getDrawable(R.drawable.gs_done_vd_40) : resources2.getDrawable(R.drawable.gs_keyboard_tab_vd_40) : resources2.getDrawable(R.drawable.gs_send_vd_40) : resources2.getDrawable(R.drawable.gs_arrow_forward_vd_40);
                    } else {
                        drawable = i2 == getContext().getResources().getInteger(R.integer.keycode_mode_change) ? getContext().getDrawable(R.drawable.gs_language_vd_40) : i2 == getContext().getResources().getInteger(R.integer.keycode_delete) ? getContext().getDrawable(R.drawable.gs_backspace_vd_40) : i2 == getContext().getResources().getInteger(R.integer.keycode_space) ? getContext().getDrawable(R.drawable.gs_space_bar_vd_40) : i2 == getContext().getResources().getInteger(R.integer.keycode_call) ? getContext().getDrawable(R.drawable.gs_call_vd_40) : null;
                    }
                }
                xdwVar.e = drawable;
                xdwVar.e(zB);
                xdwVar.f(zC);
            }
            i++;
        }
    }

    public final void d() {
        xdx xdxVar = this.h.k;
        if (xdxVar != null) {
            e(xdxVar, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2;
        RotaryKeyboardLayout rotaryKeyboardLayout = this;
        if (rotaryKeyboardLayout.h == null) {
            ((ype) ((ype) a.h()).ai((char) 10151)).u("RotaryKeyGroup is null!");
            return;
        }
        if (rotaryKeyboardLayout.b() != null) {
            int iRound = Math.round(rotaryKeyboardLayout.j);
            int i = rotaryKeyboardLayout.i - iRound;
            float f3 = rotaryKeyboardLayout.j - iRound;
            float width = rotaryKeyboardLayout.getWidth();
            float height = rotaryKeyboardLayout.getHeight();
            xdx xdxVar = rotaryKeyboardLayout.h;
            int i2 = xdxVar.h;
            int i3 = xdxVar.i;
            int i4 = rotaryKeyboardLayout.y;
            int i5 = i - i4;
            int i6 = i5 + 1;
            if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                i5 = i6;
            }
            int iG = (i + i4) - 1;
            boolean z = false;
            int i7 = i5 < i2 + (-2) ? 0 : i5;
            if ((xdxVar.g() - iG) - 1 < i3 - 1) {
                iG = rotaryKeyboardLayout.h.g() - 1;
            }
            int i8 = iG;
            boolean z2 = i2 > 0 && i7 > 0;
            if (i3 > 0 && i8 < rotaryKeyboardLayout.h.g() - 1) {
                z = true;
            }
            RectF rectF = (z2 || z) ? new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.getWidth(), rotaryKeyboardLayout.getHeight()) : null;
            float f4 = width / 2.0f;
            if (z2) {
                f = 255.0f;
                f2 = 2.0f;
                rectF.left = ((((f4 - rotaryKeyboardLayout.B) + (((255 - rotaryKeyboardLayout.k) * (r6 + 32)) / 255.0f)) - (rotaryKeyboardLayout.A * i4)) - (rotaryKeyboardLayout.J - r5)) + (rotaryKeyboardLayout.K * i2);
            } else {
                f = 255.0f;
                f2 = 2.0f;
            }
            if (z) {
                int i9 = rotaryKeyboardLayout.K;
                rectF.right = f4 + rotaryKeyboardLayout.B + (((i9 - 64) * (255 - rotaryKeyboardLayout.k)) / f) + (rotaryKeyboardLayout.A * i4) + (rotaryKeyboardLayout.J - i9);
            }
            if (rectF != null) {
                canvas.save();
                canvas2 = canvas;
                canvas2.clipRect(rectF);
            } else {
                canvas2 = canvas;
            }
            float f5 = height / f2;
            int i10 = i - 1;
            int iJ = rotaryKeyboardLayout.j(i, i10);
            int i11 = rotaryKeyboardLayout.B;
            float f6 = i11 + iJ;
            float f7 = f4 + (f3 * f6);
            RectF rectF2 = rectF;
            rotaryKeyboardLayout.l(f7, f5, 1.0f - f3, rotaryKeyboardLayout.k(i), rotaryKeyboardLayout.b, 0, canvas2);
            xdw xdwVarK = rotaryKeyboardLayout.k(i10);
            Paint paint = rotaryKeyboardLayout.c;
            float f8 = f7 - f6;
            rotaryKeyboardLayout.l(f8, f5, BitmapDescriptorFactory.HUE_RED, xdwVarK, paint, -1, canvas);
            float f9 = i11;
            float fJ = f8 - (f3 * f9);
            for (int i12 = i - 2; i12 >= i7; i12--) {
                fJ -= rotaryKeyboardLayout.j(i12 + 1, i12);
                rotaryKeyboardLayout.l(fJ, f5, BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.k(i12), paint, i12 - i, canvas);
            }
            float f10 = f4 + f9 + (f3 * iJ);
            int i13 = i + 1;
            while (i13 <= i8) {
                float fJ2 = f10 + rotaryKeyboardLayout.j(i13 - 1, i13);
                rotaryKeyboardLayout.l(fJ2, f5, BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.k(i13), paint, i13 - i, canvas);
                i13++;
                f10 = fJ2;
            }
            if (rectF2 != null) {
                canvas.restore();
            }
            int i14 = rotaryKeyboardLayout.z + rotaryKeyboardLayout.J;
            if (z2) {
                float f11 = rectF2.left;
                for (int i15 = i2 - 1; i15 >= 0; i15--) {
                    rotaryKeyboardLayout.l(f11, f5, BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.h.h(i15), paint, i15 - i4, canvas);
                    f11 -= i14;
                }
            }
            if (z) {
                float f12 = rectF2.right;
                int iG2 = rotaryKeyboardLayout.h.g() - i3;
                while (iG2 < rotaryKeyboardLayout.h.g()) {
                    rotaryKeyboardLayout.l(f12, f5, BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.h.h(iG2), paint, (i4 + iG2) - rotaryKeyboardLayout.h.g(), canvas);
                    f12 += i14;
                    iG2++;
                    rotaryKeyboardLayout = this;
                }
            }
        }
        c();
        super.dispatchDraw(canvas);
    }

    public final void e(xdx xdxVar, boolean z) {
        if (!z) {
            this.h = xdxVar;
            this.i = xdxVar.g;
            invalidate();
            return;
        }
        this.o = true;
        Animation animation = this.O;
        animation.setAnimationListener(new xec(this, xdxVar));
        this.m.startAnimation(this.N);
        this.m.startAnimation(animation);
        this.m.setPressed(true);
        this.m.setPressed(false);
    }

    public final void f() {
        this.m.startAnimation(this.L);
        this.m.startAnimation(this.M);
        this.m.setPressed(true);
        this.m.setPressed(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r7, boolean r8) {
        /*
            r6 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            boolean r2 = r6.T
            if (r8 == r2) goto L13
            long r2 = r6.U
            long r2 = r0 - r2
            r4 = 200(0xc8, double:9.9E-322)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L13
            goto L1b
        L13:
            r6.U = r0
            r6.T = r8
            boolean r8 = r6.r
            if (r8 == 0) goto L1d
        L1b:
            if (r7 <= 0) goto L50
        L1d:
            r8 = 1
            r6.r = r8
            if (r7 != 0) goto L30
            r6.s = r8
            android.os.Handler r0 = r6.t
            java.lang.Runnable r1 = r6.S
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L30:
            xdw r0 = r6.a()
            if (r0 == 0) goto L50
            boolean r1 = r0.b()
            r1 = r1 ^ r8
            boolean r1 = r0.e(r1)
            if (r1 == 0) goto L44
            r6.invalidate()
        L44:
            ykd r6 = r6.x
            int r0 = r0.b
            java.lang.Object r6 = r6.a
            xcs r6 = (defpackage.xcs) r6
            r6.e(r0, r7)
            return r8
        L50:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.projection.gearhead.input.RotaryKeyboardLayout.g(int, boolean):boolean");
    }

    @ResultIgnorabilityUnspecified
    public final boolean h(boolean z) {
        this.r = false;
        if (!this.s || this.T != z) {
            return false;
        }
        this.s = false;
        this.t.removeCallbacks(this.S);
        xdw xdwVarA = a();
        if (xdwVarA == null) {
            return false;
        }
        int i = xdwVarA.b;
        if (i == -4 || xdwVarA.a() == null) {
            ((xcs) this.x.a).f(i, true);
        } else {
            e(xdwVarA.a(), true);
            ((xcs) this.x.a).g();
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean i(int i) {
        int i2 = this.i + i;
        xdx xdxVar = this.h;
        if (xdxVar == null || i2 < 0 || i2 >= xdxVar.g()) {
            return false;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<RotaryKeyboardLayout, Float>) this.R, this.j + i, BitmapDescriptorFactory.HUE_RED);
        this.n = objectAnimatorOfFloat;
        this.i = i2;
        objectAnimatorOfFloat.setDuration(200L);
        this.n.setInterpolator(this.P);
        this.n.setAutoCancel(true);
        this.n.start();
        return true;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.m = (ImageButton) findViewById(R.id.keyboard_btn);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.q) {
            if (this.p && motionEvent.getActionMasked() == 8) {
                i((int) motionEvent.getAxisValue(9));
                return true;
            }
            HwrView hwrView = this.u;
            return hwrView != null && hwrView.onGenericMotionEvent(motionEvent);
        }
        mok mokVar = this.w;
        int action = motionEvent.getAction();
        if (action == 0) {
            mokVar.i = true;
            mokVar.k = false;
            mokVar.j = false;
            mokVar.g = motionEvent.getX();
            mokVar.h = motionEvent.getY();
            mokVar.b.postDelayed(mokVar.e, 200L);
        } else if (action == 1) {
            synchronized (mokVar.f) {
                if (mokVar.i) {
                    if (!mokVar.k) {
                        mokVar.m.b();
                        mokVar.k = true;
                    }
                    ((RotaryKeyboardLayout) mokVar.m.a).h(true);
                }
            }
            if (mokVar.c) {
                mokVar.b.removeCallbacks(mokVar.a);
                mokVar.c = false;
            }
        } else if (action == 2 && !mokVar.j && !mokVar.k) {
            float x = motionEvent.getX() - mokVar.g;
            float y = motionEvent.getY() - mokVar.h;
            if (Math.hypot(x, y) > 15.0d) {
                mokVar.i = false;
                mokVar.b.removeCallbacks(mokVar.e);
            }
            if (Math.abs(x) >= 20.0f) {
                mokVar.j = true;
                mokVar.d = (int) Math.signum(x);
                mokVar.a.run();
            }
            if (!mokVar.j && Math.abs(y) >= 20.0f) {
                synchronized (mokVar.f) {
                    ((xcs) ((RotaryKeyboardLayout) mokVar.m.a).x.a).h();
                }
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        HwrView hwrView = this.u;
        if (hwrView != null) {
            hwrView.c();
        }
        if (i == 23) {
            return g(keyEvent.getRepeatCount(), false);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        HwrView hwrView = this.u;
        if (hwrView != null) {
            hwrView.c();
        }
        if (this.p && this.h != null) {
            if (keyEvent.getKeyCode() == 21) {
                int i2 = this.i;
                if (i2 > 0) {
                    if (o(k(i2 - 1))) {
                        i(-1);
                    } else {
                        int i3 = this.h.h;
                        m(i3 > 1 ? i3 - 1 : 0);
                    }
                }
                return true;
            }
            if (keyEvent.getKeyCode() == 22) {
                if (this.i < this.h.g() - 1) {
                    if (o(k(this.i + 1))) {
                        i(1);
                    } else {
                        xdx xdxVar = this.h;
                        int i4 = xdxVar.i;
                        int iG = xdxVar.g();
                        if (i4 <= 1) {
                            i4 = 1;
                        }
                        m(iG - i4);
                    }
                }
                return true;
            }
            if (keyEvent.getKeyCode() == 23 && h(false)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        this.p = z;
    }

    public RotaryKeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RotaryKeyboardLayout(Context context) {
        this(context, null);
    }
}
