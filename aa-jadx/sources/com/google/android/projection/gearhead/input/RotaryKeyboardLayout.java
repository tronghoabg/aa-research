package com.google.android.projection.gearhead.input;

/* JADX INFO: loaded from: classes3.dex */
public class RotaryKeyboardLayout extends android.widget.FrameLayout {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.RotaryKeyboardView");
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
    private final android.view.animation.Animation L;
    private final android.view.animation.Animation M;
    private final android.view.animation.Animation N;
    private final android.view.animation.Animation O;
    private final android.animation.TimeInterpolator P;
    private android.graphics.Paint Q;
    private android.util.Property R;
    private final java.lang.Runnable S;
    private boolean T;
    private long U;
    public final android.graphics.Paint b;
    public final android.graphics.Paint c;
    public final android.graphics.Paint d;
    public final android.graphics.Paint e;
    public final android.animation.ObjectAnimator f;
    public final android.animation.ObjectAnimator g;
    public defpackage.xev h;
    public int i;
    public float j;
    public int k;
    public float l;
    public android.widget.ImageButton m;
    public android.animation.ObjectAnimator n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public android.os.Handler t;
    public com.google.android.projection.gearhead.input.HwrView u;
    public defpackage.xdx v;
    public defpackage.moq w;
    public defpackage.xei x;
    private final int y;
    private final int z;

    public RotaryKeyboardLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.t = new android.os.Handler();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wzd.c, i, 0);
        android.content.res.Resources resources = getResources();
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.selectedCircleRadius));
        this.C = dimensionPixelSize;
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.keyGroupCircleRadius));
        this.E = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.image_button_radius);
        this.z = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.keySpacingGm3);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.adjacentKeySpacingGm3);
        this.A = dimensionPixelSize2;
        this.B = (dimensionPixelSize + typedArrayObtainStyledAttributes.getDimensionPixelSize(16, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.selectedKeyMargin))) - (dimensionPixelSize2 / 2);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.selectedKeyTextSizeGm3);
        this.F = dimensionPixelSize3;
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.keyGroupSpacing));
        this.K = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.additionalKeySpacingGm3);
        int color = typedArrayObtainStyledAttributes.getColor(17, resources.getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_grey_100));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(3);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTypeface(string == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(string, 0));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(color);
        paint.setTextSize(dimensionPixelSize3);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setTypeface(string == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(string, 0));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(color);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.ringKeyTextSize));
        this.G = dimensionPixelSize4;
        paint2.setTextSize(dimensionPixelSize4);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.selectedKeygroupTextSize));
        this.H = dimensionPixelSize3 - dimensionPixelSize4;
        this.I = dimensionPixelSize5 - dimensionPixelSize4;
        typedArrayObtainStyledAttributes.recycle();
        android.content.Context context2 = getContext();
        android.content.Context context3 = getContext();
        int i2 = context3.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize6 = context3.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_card_margin);
        this.y = java.lang.Math.round((java.lang.Math.min(i2 - (dimensionPixelSize6 + dimensionPixelSize6), context3.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.apps_max_content_width)) / context2.getResources().getDisplayMetrics().density) / 100.0f);
        this.Q = new android.graphics.Paint();
        this.k = 255;
        this.l = 1.0f;
        this.L = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.google.android.projection.gearhead.R.anim.click_enlarge);
        this.M = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.google.android.projection.gearhead.R.anim.click_shrink);
        this.N = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.google.android.projection.gearhead.R.anim.click_enlarge);
        this.O = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.google.android.projection.gearhead.R.anim.click_shrink);
        defpackage.epb epbVar = new defpackage.epb();
        defpackage.epd epdVar = new defpackage.epd();
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        this.R = new defpackage.xey(this, java.lang.Float.class);
        defpackage.xez xezVar = new defpackage.xez(this, java.lang.Integer.class);
        defpackage.xfa xfaVar = new defpackage.xfa(this, java.lang.Float.class);
        android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(this, xezVar, 255, 0);
        this.f = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(75L);
        objectAnimatorOfInt.setInterpolator(epbVar);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, xfaVar, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        resources.getDrawable(com.google.android.projection.gearhead.R.drawable.keyboard_fab);
        this.P = epdVar;
        this.S = new defpackage.wuj(this, 20, null);
        this.d = new android.graphics.Paint();
        this.e = new android.graphics.Paint();
    }

    private final int j(int i, int i2) {
        return (p(k(i)) || p(k(i2))) ? this.J + this.z : this.z;
    }

    private final defpackage.xeu k(int i) {
        if (i < 0 || i >= this.h.g()) {
            return null;
        }
        return this.h.h(i);
    }

    private final void l(float f, float f2, float f3, defpackage.xeu xeuVar, android.graphics.Paint paint, int i, android.graphics.Canvas canvas) {
        int i2;
        float f4;
        android.graphics.Bitmap bitmap;
        int i3;
        int height;
        if (xeuVar == null) {
            return;
        }
        int i4 = this.G;
        int iAbs = (int) ((((this.l * this.y) - java.lang.Math.abs(i)) + 1.0f) * 255.0f);
        if (iAbs < 0) {
            iAbs = 0;
        } else {
            int i5 = this.k;
            if (iAbs > i5) {
                iAbs = i5;
            }
        }
        float fSignum = (i == 0 || this.l <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) ? f : f + (java.lang.Math.signum(i) * (this.l - 1.0f) * this.z);
        float f5 = i4;
        float fMax = this.D * java.lang.Math.max(1.0f - (f3 + f3), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        if (xeuVar.a() != null) {
            android.graphics.Paint paint2 = this.d;
            paint2.setAlpha(iAbs);
            android.graphics.Paint paint3 = this.e;
            paint3.setAlpha(iAbs);
            canvas.drawCircle(fSignum, f2, fMax, paint2);
            canvas.drawCircle(fSignum, f2, fMax, paint3);
            i2 = this.I;
        } else {
            i2 = this.H;
        }
        float f6 = (i2 * f3) + f5;
        android.graphics.drawable.Drawable drawable = xeuVar.e;
        if (drawable == null) {
            f4 = -1.0f;
        } else if (this.v == null) {
            f4 = -1.0f;
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10178)).u("Cannot apply GM3 theme without color token values.");
        } else {
            f4 = -1.0f;
            if (n(xeuVar)) {
                xeuVar.f(i == 0);
            } else {
                defpackage.xdx xdxVar = this.v;
                if (i == 0) {
                    drawable.setColorFilter(xdxVar.a, android.graphics.PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.setColorFilter(xdxVar.e, android.graphics.PorterDuff.Mode.SRC_IN);
                }
                xeuVar.e = drawable;
            }
        }
        int i6 = this.E;
        android.graphics.drawable.Drawable drawable2 = xeuVar.e;
        if (drawable2 == null) {
            bitmap = null;
        } else {
            boolean z = xeuVar.d;
            int iMax = z ? i6 + i6 : java.lang.Math.max(drawable2.getIntrinsicWidth(), 1);
            int iMax2 = z ? i6 + i6 : java.lang.Math.max(xeuVar.e.getIntrinsicHeight(), 1);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMax, iMax2, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
            xeuVar.e.setBounds(0, 0, iMax, iMax2);
            xeuVar.e.draw(canvas2);
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap != null) {
            float f7 = (f6 / f5) + f4;
            float width = bitmap.getWidth();
            float height2 = bitmap.getHeight();
            if (!n(xeuVar)) {
                float f8 = ((f7 * 0.25f) / 0.875f) + 0.75f;
                i3 = (int) (width * f8);
                height = (int) (height2 * f8);
            } else if (i != 0) {
                i3 = (int) (fMax + fMax);
                height = i3;
            } else {
                float width2 = bitmap.getWidth();
                height = (int) (bitmap.getHeight() * 1.15f);
                i3 = (int) (width2 * 1.15f);
            }
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i3, height, true);
            paint.setAlpha(iAbs);
            canvas.drawBitmap(bitmapCreateScaledBitmap, fSignum - (bitmapCreateScaledBitmap.getWidth() / 2.0f), f2 - (bitmapCreateScaledBitmap.getHeight() / 2.0f), paint);
            return;
        }
        this.Q.set(paint);
        this.Q.setAlpha(iAbs);
        java.lang.String string = xeuVar.a;
        if (",".equals(string) || ".".equals(string) || "-".equals(string)) {
            this.Q.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        }
        if (string.equals(",/-")) {
            java.lang.String[] strArrSplit = string.split("");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (strArrSplit.length > 0) {
                sb.append((java.lang.CharSequence) strArrSplit[0]);
                for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                    sb.append((java.lang.CharSequence) " ");
                    sb.append((java.lang.CharSequence) strArrSplit[i7]);
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

    private final boolean n(defpackage.xeu xeuVar) {
        return xeuVar.b == getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.keycode_external_keyboard);
    }

    private static final boolean o(defpackage.xeu xeuVar) {
        return (xeuVar == null || xeuVar.a() == null) ? false : true;
    }

    private static final boolean p(defpackage.xeu xeuVar) {
        return xeuVar != null && xeuVar.d();
    }

    public final defpackage.xeu a() {
        if (this.o) {
            return null;
        }
        return b();
    }

    public final defpackage.xeu b() {
        defpackage.xev xevVar = this.h;
        if (xevVar != null && xevVar.g() != 0 && this.i < this.h.g()) {
            return this.h.h(this.i);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10180)).u("Cannot get selected key.");
        return null;
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable;
        defpackage.xev xevVar = this.h;
        if (xevVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = xevVar.l;
            if (i >= arrayList.size()) {
                return;
            }
            defpackage.xeu xeuVar = (defpackage.xeu) arrayList.get(i);
            defpackage.ebl.s(this.v);
            android.graphics.drawable.Drawable drawable2 = xeuVar.e;
            android.content.res.Resources resources = getContext().getResources();
            if (drawable2 != null) {
                boolean zB = xeuVar.b();
                boolean zC = xeuVar.c();
                if (n(xeuVar)) {
                    android.content.Context context = getContext();
                    android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                    android.graphics.drawable.Drawable drawable3 = context.getDrawable(com.google.android.projection.gearhead.R.drawable.external_keyboard_button_gm3_selected_and_enabled_state);
                    defpackage.ebl.s(drawable3);
                    android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable3.mutate();
                    layerDrawable.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval).setColorFilter(this.v.a, android.graphics.PorterDuff.Mode.SRC_IN);
                    layerDrawable.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_icon).setColorFilter(this.v.b, android.graphics.PorterDuff.Mode.SRC_IN);
                    android.graphics.drawable.Drawable drawable4 = context.getDrawable(com.google.android.projection.gearhead.R.drawable.external_keyboard_button_gm3_selected_state);
                    defpackage.ebl.s(drawable4);
                    android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawable4.mutate();
                    layerDrawable2.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval).setColorFilter(this.v.d, android.graphics.PorterDuff.Mode.SRC_IN);
                    layerDrawable2.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval_overlay).setColorFilter(this.v.a, android.graphics.PorterDuff.Mode.SRC_IN);
                    layerDrawable2.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval_overlay).setAlpha(31);
                    layerDrawable2.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_icon).setColorFilter(this.v.a, android.graphics.PorterDuff.Mode.SRC_IN);
                    android.graphics.drawable.Drawable drawable5 = context.getDrawable(com.google.android.projection.gearhead.R.drawable.external_keyboard_button_gm3_enabled_state);
                    defpackage.ebl.s(drawable5);
                    android.graphics.drawable.LayerDrawable layerDrawable3 = (android.graphics.drawable.LayerDrawable) drawable5.mutate();
                    layerDrawable3.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval).setColorFilter(this.v.e, android.graphics.PorterDuff.Mode.SRC_IN);
                    layerDrawable3.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_icon).setColorFilter(this.v.d, android.graphics.PorterDuff.Mode.SRC_IN);
                    android.graphics.drawable.Drawable drawable6 = context.getDrawable(com.google.android.projection.gearhead.R.drawable.external_keyboard_button_gm3_default_state);
                    defpackage.ebl.s(drawable6);
                    android.graphics.drawable.LayerDrawable layerDrawable4 = (android.graphics.drawable.LayerDrawable) drawable6.mutate();
                    layerDrawable4.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_oval).setColorFilter(this.v.d, android.graphics.PorterDuff.Mode.SRC_IN);
                    layerDrawable4.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.key_external_keyboard_icon).setColorFilter(this.v.e, android.graphics.PorterDuff.Mode.SRC_IN);
                    stateListDrawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, layerDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_selected}, layerDrawable2);
                    stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, layerDrawable3);
                    stateListDrawable.addState(android.util.StateSet.WILD_CARD, layerDrawable4);
                    drawable = stateListDrawable;
                } else {
                    int i2 = xeuVar.b;
                    if (i2 == resources.getInteger(com.google.android.projection.gearhead.R.integer.keycode_done)) {
                        int i3 = xeuVar.c;
                        android.content.res.Resources resources2 = getContext().getResources();
                        int i4 = i3 & 255;
                        if (i4 == 2) {
                            drawable = resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_arrow_forward_vd_40);
                        } else if (i4 == 4) {
                            drawable = resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_send_vd_40);
                        } else if (i4 == 5) {
                            drawable = resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_keyboard_tab_vd_40);
                        } else if (i4 != 6) {
                            drawable = i4 != 7 ? resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_search_vd_40) : resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_keyboard_tab_rtl_vd_40);
                        } else {
                            drawable = resources2.getDrawable(com.google.android.projection.gearhead.R.drawable.gs_done_vd_40);
                        }
                    } else if (i2 == getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.keycode_mode_change)) {
                        drawable = getContext().getDrawable(com.google.android.projection.gearhead.R.drawable.gs_language_vd_40);
                    } else if (i2 == getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.keycode_delete)) {
                        drawable = getContext().getDrawable(com.google.android.projection.gearhead.R.drawable.gs_backspace_vd_40);
                    } else if (i2 == getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.keycode_space)) {
                        drawable = getContext().getDrawable(com.google.android.projection.gearhead.R.drawable.gs_space_bar_vd_40);
                    } else {
                        drawable = i2 == getContext().getResources().getInteger(com.google.android.projection.gearhead.R.integer.keycode_call) ? getContext().getDrawable(com.google.android.projection.gearhead.R.drawable.gs_call_vd_40) : null;
                    }
                }
                xeuVar.e = drawable;
                xeuVar.e(zB);
                xeuVar.f(zC);
            }
            i++;
        }
    }

    public final void d() {
        defpackage.xev xevVar = this.h.k;
        if (xevVar != null) {
            e(xevVar, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.Canvas canvas2;
        com.google.android.projection.gearhead.input.RotaryKeyboardLayout rotaryKeyboardLayout = this;
        if (rotaryKeyboardLayout.h == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10179)).u("RotaryKeyGroup is null!");
            return;
        }
        if (rotaryKeyboardLayout.b() != null) {
            int iRound = java.lang.Math.round(rotaryKeyboardLayout.j);
            int i = rotaryKeyboardLayout.i - iRound;
            float f = rotaryKeyboardLayout.j - iRound;
            float width = rotaryKeyboardLayout.getWidth();
            float height = rotaryKeyboardLayout.getHeight();
            defpackage.xev xevVar = rotaryKeyboardLayout.h;
            int i2 = xevVar.h;
            int i3 = xevVar.i;
            int i4 = rotaryKeyboardLayout.y;
            int i5 = i - i4;
            int i6 = i5 + 1;
            if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                i5 = i6;
            }
            int iG = (i + i4) - 1;
            boolean z = false;
            int i7 = i5 < i2 + (-2) ? 0 : i5;
            if ((xevVar.g() - iG) - 1 < i3 - 1) {
                iG = rotaryKeyboardLayout.h.g() - 1;
            }
            int i8 = iG;
            boolean z2 = i2 > 0 && i7 > 0;
            if (i3 > 0 && i8 < rotaryKeyboardLayout.h.g() - 1) {
                z = true;
            }
            android.graphics.RectF rectF = (z2 || z) ? new android.graphics.RectF(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.getWidth(), rotaryKeyboardLayout.getHeight()) : null;
            float f2 = width / 2.0f;
            if (z2) {
                int i9 = rotaryKeyboardLayout.K;
                int i10 = i9 * i2;
                rectF.left = ((((f2 - rotaryKeyboardLayout.B) + (((255 - rotaryKeyboardLayout.k) * (i10 + 32)) / 255.0f)) - (rotaryKeyboardLayout.A * i4)) - (rotaryKeyboardLayout.J - i9)) + i10;
            }
            if (z) {
                int i11 = rotaryKeyboardLayout.K;
                rectF.right = f2 + rotaryKeyboardLayout.B + (((i11 - 64) * (255 - rotaryKeyboardLayout.k)) / 255.0f) + (rotaryKeyboardLayout.A * i4) + (rotaryKeyboardLayout.J - i11);
            }
            if (rectF != null) {
                canvas.save();
                canvas2 = canvas;
                canvas2.clipRect(rectF);
            } else {
                canvas2 = canvas;
            }
            float f3 = height / 2.0f;
            int i12 = i - 1;
            int iJ = rotaryKeyboardLayout.j(i, i12);
            int i13 = rotaryKeyboardLayout.B;
            float f4 = i13 + iJ;
            float f5 = f2 + (f * f4);
            android.graphics.RectF rectF2 = rectF;
            rotaryKeyboardLayout.l(f5, f3, 1.0f - f, rotaryKeyboardLayout.k(i), rotaryKeyboardLayout.b, 0, canvas2);
            defpackage.xeu xeuVarK = rotaryKeyboardLayout.k(i12);
            android.graphics.Paint paint = rotaryKeyboardLayout.c;
            float f6 = f5 - f4;
            rotaryKeyboardLayout.l(f6, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, xeuVarK, paint, -1, canvas);
            float f7 = i13;
            float fJ = f6 - (f * f7);
            for (int i14 = i - 2; i14 >= i7; i14--) {
                fJ -= rotaryKeyboardLayout.j(i14 + 1, i14);
                rotaryKeyboardLayout.l(fJ, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.k(i14), paint, i14 - i, canvas);
            }
            float f8 = f2 + f7 + (f * iJ);
            int i15 = i + 1;
            while (i15 <= i8) {
                float fJ2 = f8 + rotaryKeyboardLayout.j(i15 - 1, i15);
                rotaryKeyboardLayout.l(fJ2, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.k(i15), paint, i15 - i, canvas);
                i15++;
                f8 = fJ2;
            }
            if (rectF2 != null) {
                canvas.restore();
            }
            int i16 = rotaryKeyboardLayout.z + rotaryKeyboardLayout.J;
            if (z2) {
                float f9 = rectF2.left;
                for (int i17 = i2 - 1; i17 >= 0; i17--) {
                    rotaryKeyboardLayout.l(f9, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.h.h(i17), paint, i17 - i4, canvas);
                    f9 -= i16;
                }
            }
            if (z) {
                float f10 = rectF2.right;
                int iG2 = rotaryKeyboardLayout.h.g() - i3;
                while (iG2 < rotaryKeyboardLayout.h.g()) {
                    rotaryKeyboardLayout.l(f10, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, rotaryKeyboardLayout.h.h(iG2), paint, (i4 + iG2) - rotaryKeyboardLayout.h.g(), canvas);
                    f10 += i16;
                    iG2++;
                    rotaryKeyboardLayout = this;
                }
            }
        }
        c();
        super.dispatchDraw(canvas);
    }

    public final void e(defpackage.xev xevVar, boolean z) {
        if (!z) {
            this.h = xevVar;
            this.i = xevVar.g;
            invalidate();
            return;
        }
        this.o = true;
        android.view.animation.Animation animation = this.O;
        animation.setAnimationListener(new defpackage.xfb(this, xevVar));
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

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[DONT_INVERT] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean g(int i, boolean z) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        if (z == this.T || jUptimeMillis - this.U >= 200) {
            this.U = jUptimeMillis;
            this.T = z;
            if (this.r) {
                if (i <= 0) {
                    return false;
                }
            }
        } else if (i <= 0) {
            return false;
        }
        this.r = true;
        if (i == 0) {
            this.s = true;
            this.t.postDelayed(this.S, android.view.ViewConfiguration.getLongPressTimeout());
        }
        defpackage.xeu xeuVarA = a();
        if (xeuVarA == null) {
            return false;
        }
        if (xeuVarA.e(!xeuVarA.b())) {
            invalidate();
        }
        ((defpackage.xdo) this.x.a).e(xeuVarA.b, i);
        return true;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean h(boolean z) {
        this.r = false;
        if (!this.s || this.T != z) {
            return false;
        }
        this.s = false;
        this.t.removeCallbacks(this.S);
        defpackage.xeu xeuVarA = a();
        if (xeuVarA == null) {
            return false;
        }
        int i = xeuVarA.b;
        if (i == -4 || xeuVarA.a() == null) {
            ((defpackage.xdo) this.x.a).f(i, true);
        } else {
            e(xeuVarA.a(), true);
            ((defpackage.xdo) this.x.a).g();
        }
        return true;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean i(int i) {
        int i2 = this.i + i;
        defpackage.xev xevVar = this.h;
        if (xevVar == null || i2 < 0 || i2 >= xevVar.g()) {
            return false;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.google.android.projection.gearhead.input.RotaryKeyboardLayout, java.lang.Float>) this.R, this.j + i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
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
        this.m = (android.widget.ImageButton) findViewById(com.google.android.projection.gearhead.R.id.keyboard_btn);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (!this.q) {
            if (this.p && motionEvent.getActionMasked() == 8) {
                i((int) motionEvent.getAxisValue(9));
                return true;
            }
            com.google.android.projection.gearhead.input.HwrView hwrView = this.u;
            return hwrView != null && hwrView.onGenericMotionEvent(motionEvent);
        }
        defpackage.moq moqVar = this.w;
        int action = motionEvent.getAction();
        if (action == 0) {
            moqVar.i = true;
            moqVar.k = false;
            moqVar.j = false;
            moqVar.g = motionEvent.getX();
            moqVar.h = motionEvent.getY();
            moqVar.b.postDelayed(moqVar.e, 200L);
        } else if (action == 1) {
            synchronized (moqVar.f) {
                if (moqVar.i) {
                    if (!moqVar.k) {
                        moqVar.m.d();
                        moqVar.k = true;
                    }
                    ((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) moqVar.m.a).h(true);
                }
            }
            if (moqVar.c) {
                moqVar.b.removeCallbacks(moqVar.a);
                moqVar.c = false;
            }
        } else if (action == 2 && !moqVar.j && !moqVar.k) {
            float x = motionEvent.getX() - moqVar.g;
            float y = motionEvent.getY() - moqVar.h;
            if (java.lang.Math.hypot(x, y) > 15.0d) {
                moqVar.i = false;
                moqVar.b.removeCallbacks(moqVar.e);
            }
            if (java.lang.Math.abs(x) >= 20.0f) {
                moqVar.j = true;
                moqVar.d = (int) java.lang.Math.signum(x);
                moqVar.a.run();
            }
            if (!moqVar.j && java.lang.Math.abs(y) >= 20.0f) {
                synchronized (moqVar.f) {
                    ((defpackage.xdo) ((com.google.android.projection.gearhead.input.RotaryKeyboardLayout) moqVar.m.a).x.a).h();
                }
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        com.google.android.projection.gearhead.input.HwrView hwrView = this.u;
        if (hwrView != null) {
            hwrView.c();
        }
        if (i == 23) {
            return g(keyEvent.getRepeatCount(), false);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        com.google.android.projection.gearhead.input.HwrView hwrView = this.u;
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
                        defpackage.xev xevVar = this.h;
                        int i4 = xevVar.i;
                        int iG = xevVar.g();
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

    public RotaryKeyboardLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RotaryKeyboardLayout(android.content.Context context) {
        this(context, null);
    }
}
