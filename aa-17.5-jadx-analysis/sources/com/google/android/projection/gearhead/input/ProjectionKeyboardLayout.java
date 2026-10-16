package com.google.android.projection.gearhead.input;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.jzr;
import defpackage.jzs;
import defpackage.kfl;
import defpackage.ldz;
import defpackage.leh;
import defpackage.lgp;
import defpackage.oct;
import defpackage.xao;
import defpackage.xdb;
import defpackage.xdo;
import defpackage.xdp;
import defpackage.ype;
import defpackage.yph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ProjectionKeyboardLayout extends GridLayout {
    public static final yph a = yph.c("GH.PrKeyboardLayout");
    public final boolean b;
    public xdp c;
    public View d;
    public View e;
    public int f;
    public long g;
    public xdo h;
    public xdb i;
    public int j;
    public ajmd k;
    private final boolean l;
    private final Context m;
    private final View.OnClickListener n;
    private final View.OnLongClickListener o;

    public ProjectionKeyboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        leh.a();
        this.b = true;
        this.l = ldz.a().b();
        this.n = new xao(this, 18);
        this.o = new jzr(this, 9);
        setAlignmentMode(0);
        this.m = context;
    }

    private final Drawable f(Drawable drawable, int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        int dimensionPixelSize2 = (dimensionPixelSize / 2) + getResources().getDimensionPixelSize(R.dimen.rail_coolwalk_status_bar_focus_drawable_inset);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(dimensionPixelSize, this.i.b);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, gradientDrawable});
        layerDrawable.setLayerInset(1, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        return layerDrawable;
    }

    private final void g(View view, xdo xdoVar, int i, int i2) {
        view.setId(xdoVar.a);
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.height = xdoVar.f;
        layoutParams.width = xdoVar.g;
        layoutParams.setGravity(17);
        layoutParams.columnSpec = GridLayout.spec(i2, xdoVar.c);
        layoutParams.rowSpec = GridLayout.spec(i);
        xdp xdpVar = this.c;
        int i3 = xdpVar.f;
        int i4 = xdpVar.g;
        layoutParams.setMargins(i4, i3, i4, i3);
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(this.n);
        view.setOnKeyListener(new jzs(this, 6, null));
        view.setOnLongClickListener(this.o);
        view.setTag(xdoVar);
        view.setBackground(xdoVar.h);
        if (xdoVar.a() == -8) {
            this.d = view;
        } else if (xdoVar.a() == -1) {
            this.e = view;
        }
    }

    public final Bundle a() {
        int id = -1;
        if (!isInTouchMode() && hasFocus()) {
            id = findFocus().getId();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_FOCUS_VIEW_ID", id);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v56, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.google.android.projection.gearhead.input.ProjectionKeyboardLayout] */
    /* JADX WARN: Type inference failed for: r2v72, types: [android.graphics.drawable.Drawable] */
    public final void b() throws Resources.NotFoundException {
        int iMax;
        int[] iArr;
        Iterator it;
        Drawable drawable;
        StateListDrawable stateListDrawable;
        xdp xdpVar = this.c;
        xdpVar.getClass();
        xdpVar.b.getClass();
        this.k.getClass();
        int id = hasFocus() ? findFocus().getId() : -1;
        View view = this.d;
        int i = 0;
        boolean zIsSelected = view != null ? view.isSelected() : false;
        this.e = null;
        this.d = null;
        removeAllViews();
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        Iterator it2 = arrayList.iterator();
        int iMax2 = 0;
        while (it2.hasNext()) {
            int i2 = i;
            for (xdo xdoVar : ((oct) it2.next()).C()) {
                i2 += xdoVar.c;
                if (!this.b || this.i == null) {
                    it = it2;
                } else {
                    Drawable drawable2 = xdoVar.h;
                    if (!(drawable2 instanceof InsetDrawable) || !(((InsetDrawable) drawable2).getDrawable() instanceof RippleDrawable)) {
                        it = it2;
                    } else if (xdoVar.i) {
                        Context context = this.m;
                        InsetDrawable insetDrawable = (InsetDrawable) new InsetDrawable(context.getDrawable(R.drawable.gearhead_rectangle_round_corner_empty_background), i).mutate();
                        Drawable drawable3 = insetDrawable.getDrawable();
                        drawable3.getClass();
                        RippleDrawable rippleDrawable = (RippleDrawable) drawable3;
                        rippleDrawable.setColor(ColorStateList.valueOf(this.i.a));
                        Drawable drawableFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.foreground_ring);
                        Drawable drawable4 = context.getDrawable(R.drawable.gearhead_material_rectangle_round_corner_focus_ring_hovered);
                        drawable4.getClass();
                        GradientDrawable gradientDrawable = (GradientDrawable) drawable4.mutate();
                        gradientDrawable.setColor(this.i.d);
                        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_hovered), this.i.a);
                        Drawable drawable5 = context.getDrawable(R.drawable.gearhead_material_rectangle_round_corner_focus_ring_focused);
                        drawable5.getClass();
                        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable5.mutate();
                        gradientDrawable2.setColor(this.i.d);
                        gradientDrawable2.setStroke(getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused), this.i.a);
                        StateListDrawable stateListDrawable2 = (StateListDrawable) drawableFindDrawableByLayerId;
                        it = it2;
                        stateListDrawable2.addState(new int[]{android.R.attr.state_hovered, android.R.attr.state_window_focused}, gradientDrawable);
                        stateListDrawable2.addState(new int[]{android.R.attr.state_focused, android.R.attr.state_window_focused}, gradientDrawable2);
                        xdoVar.h = insetDrawable;
                    } else {
                        it = it2;
                        int iMax3 = Math.max((xdoVar.f - xdoVar.g) / 2, 0);
                        int iMax4 = Math.max((xdoVar.g - xdoVar.f) / 2, 0);
                        Context context2 = this.m;
                        InsetDrawable insetDrawable2 = (InsetDrawable) new InsetDrawable(context2.getDrawable(R.drawable.gearhead_oval_empty_focus_background), iMax4, iMax3, iMax4, iMax3).mutate();
                        Drawable drawable6 = insetDrawable2.getDrawable();
                        drawable6.getClass();
                        RippleDrawable rippleDrawable2 = (RippleDrawable) drawable6;
                        rippleDrawable2.setColor(ColorStateList.valueOf(this.i.a));
                        Drawable drawableFindDrawableByLayerId2 = rippleDrawable2.findDrawableByLayerId(R.id.foreground_ring);
                        Drawable drawable7 = context2.getDrawable(R.drawable.gearhead_material_oval_focus_ring_hovered);
                        drawable7.getClass();
                        GradientDrawable gradientDrawable3 = (GradientDrawable) drawable7.mutate();
                        boolean z = xdoVar.a() == context2.getResources().getInteger(R.integer.keycode_done);
                        int i3 = z ? 0 : this.i.a;
                        xdb xdbVar = this.i;
                        int i4 = z ? xdbVar.a : xdbVar.d;
                        gradientDrawable3.setColor(i4);
                        boolean z2 = z;
                        gradientDrawable3.setStroke(getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_hovered), i3);
                        Drawable drawable8 = context2.getDrawable(R.drawable.gearhead_material_oval_focus_ring_focused);
                        drawable8.getClass();
                        GradientDrawable gradientDrawable4 = (GradientDrawable) drawable8.mutate();
                        gradientDrawable4.setColor(i4);
                        gradientDrawable4.setStroke(getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused), i3);
                        GradientDrawable gradientDrawableF = gradientDrawable4;
                        GradientDrawable gradientDrawableF2 = gradientDrawable3;
                        if (z2) {
                            gradientDrawableF = f(gradientDrawable4, R.dimen.gearhead_inner_focus_ring_stroke_width_focused);
                            gradientDrawableF2 = f(gradientDrawable3, R.dimen.gearhead_inner_focus_ring_stroke_width_hovered);
                        }
                        StateListDrawable stateListDrawable3 = (StateListDrawable) drawableFindDrawableByLayerId2;
                        stateListDrawable3.addState(new int[]{android.R.attr.state_hovered, android.R.attr.state_window_focused}, gradientDrawableF2);
                        stateListDrawable3.addState(new int[]{android.R.attr.state_focused, android.R.attr.state_window_focused}, gradientDrawableF);
                        xdoVar.h = insetDrawable2;
                    }
                    if (!xdoVar.b.isEmpty()) {
                        Resources resources = this.m.getResources();
                        if (!xdoVar.b.isEmpty() || xdoVar.a() == resources.getInteger(R.integer.keycode_populate_replacement_key)) {
                            if (xdoVar.a() == resources.getInteger(R.integer.keycode_symbols_switch) && xdoVar.a == R.id.key_alpha) {
                                xdoVar.n = 20;
                            } else {
                                int i5 = xdoVar.a;
                                if (i5 == R.id.key_comma || i5 == R.id.key_period || i5 == R.id.key_dash) {
                                    xdoVar.n = 32;
                                }
                            }
                            if (!kfl.l()) {
                                if (xdoVar.a() == resources.getInteger(R.integer.keycode_symbols_switch) && xdoVar.a == R.id.key_symbols) {
                                    xdoVar.o = resources.getFont(R.font.google_sans_mono);
                                } else {
                                    xdoVar.o = resources.getFont(R.font.google_sans);
                                }
                            }
                            int[][] iArr2 = {new int[]{android.R.attr.state_hovered}, new int[]{android.R.attr.state_focused}, new int[0]};
                            int i6 = this.i.a;
                            xdoVar.m = new ColorStateList(iArr2, new int[]{i6, i6, (xdoVar.b.length() == 1 && Character.isLetter(xdoVar.b.charAt(0))) ? this.i.e : this.i.f});
                        }
                    } else if (xdoVar.e != null) {
                        Context context3 = this.m;
                        Resources resources2 = context3.getResources();
                        Drawable drawable9 = xdoVar.e;
                        if ((drawable9 instanceof LayerDrawable) && xdoVar.a() == resources2.getInteger(R.integer.keycode_done)) {
                            int i7 = xdoVar.p & 255;
                            drawable = i7 != 2 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? i7 != 7 ? resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_search_gm3) : resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_previous_gm3) : resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_done_gm3) : resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_next_gm3) : resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_send_gm3) : resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_go_gm3);
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            layerDrawable.findDrawableByLayerId(R.id.key_oval_background).setTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_hovered}, new int[]{android.R.attr.state_focused}, new int[0]}, new int[]{0, 0, this.i.a}));
                            layerDrawable.findDrawableByLayerId(R.id.key_icon).setColorFilter(this.i.b, PorterDuff.Mode.SRC_IN);
                        } else {
                            if (xdoVar.a() == resources2.getInteger(R.integer.keycode_external_keyboard)) {
                                stateListDrawable = new StateListDrawable();
                                Drawable drawable10 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_external_selected_state_gm3);
                                drawable10.getClass();
                                LayerDrawable layerDrawable2 = (LayerDrawable) drawable10.mutate();
                                layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.i.e, PorterDuff.Mode.SRC_IN);
                                layerDrawable2.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.i.d, PorterDuff.Mode.SRC_IN);
                                Drawable drawable11 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_external_default_state_gm3);
                                drawable11.getClass();
                                LayerDrawable layerDrawable3 = (LayerDrawable) drawable11.mutate();
                                layerDrawable3.findDrawableByLayerId(R.id.key_external_keyboard_oval).setColorFilter(this.i.d, PorterDuff.Mode.SRC_IN);
                                layerDrawable3.findDrawableByLayerId(R.id.key_external_keyboard_icon).setColorFilter(this.i.e, PorterDuff.Mode.SRC_IN);
                                stateListDrawable.addState(new int[]{android.R.attr.state_selected}, layerDrawable2);
                                stateListDrawable.addState(StateSet.WILD_CARD, layerDrawable3);
                            } else if (xdoVar.a() == resources2.getInteger(R.integer.keycode_space)) {
                                if (drawable9 instanceof StateListDrawable) {
                                    stateListDrawable = new StateListDrawable();
                                    xdoVar.h = null;
                                    Drawable drawable12 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_spacebar_gm3);
                                    drawable12.getClass();
                                    Drawable drawableMutate = drawable12.mutate();
                                    drawableMutate.setColorFilter(this.i.a, PorterDuff.Mode.SRC_IN);
                                    Drawable drawable13 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_spacebar_gm3);
                                    drawable13.getClass();
                                    Drawable drawableMutate2 = drawable13.mutate();
                                    drawableMutate2.setColorFilter(this.i.f, PorterDuff.Mode.SRC_IN);
                                    stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawableMutate);
                                    stateListDrawable.addState(StateSet.WILD_CARD, drawableMutate2);
                                } else {
                                    drawable = resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_ja_space_bar_gm3);
                                    drawable.getClass();
                                    drawable.setColorFilter(this.i.e, PorterDuff.Mode.SRC_IN);
                                }
                            } else if (xdoVar.a() == resources2.getInteger(R.integer.keycode_shift)) {
                                stateListDrawable = new StateListDrawable();
                                Drawable drawable14 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_shift_gm3);
                                drawable14.getClass();
                                Drawable drawableMutate3 = drawable14.mutate();
                                drawableMutate3.getClass();
                                drawableMutate3.setColorFilter(this.i.a, PorterDuff.Mode.SRC_IN);
                                Drawable drawable15 = context3.getDrawable(R.drawable.ic_gearhead_projection_keyboard_shift_gm3);
                                drawable15.getClass();
                                Drawable drawableMutate4 = drawable15.mutate();
                                drawableMutate4.getClass();
                                drawableMutate4.setColorFilter(this.i.f, PorterDuff.Mode.SRC_IN);
                                stateListDrawable.addState(new int[]{android.R.attr.state_selected}, drawableMutate3);
                                stateListDrawable.addState(StateSet.WILD_CARD, drawableMutate4);
                            } else {
                                if (xdoVar.a() == resources2.getInteger(R.integer.keycode_mode_change)) {
                                    drawable9 = resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_globe_gm3);
                                } else if (xdoVar.a() == resources2.getInteger(R.integer.keycode_close_popup_keyboard) || xdoVar.a() == resources2.getInteger(R.integer.keycode_symbols_switch)) {
                                    drawable9 = resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_arrow_back_gm3);
                                } else if (xdoVar.a() == resources2.getInteger(R.integer.keycode_delete)) {
                                    drawable9 = resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_backspace_gm3);
                                } else if (xdoVar.a() == resources2.getInteger(R.integer.keycode_hide_keyboard)) {
                                    drawable9 = resources2.getDrawable(R.drawable.ic_gearhead_projection_keyboard_hide_gm3);
                                }
                                drawable9.getClass();
                                drawable9.setColorFilter(this.i.e, PorterDuff.Mode.SRC_IN);
                                drawable = drawable9;
                            }
                            drawable = stateListDrawable;
                        }
                        xdoVar.e = drawable;
                    }
                }
                it2 = it;
                i = 0;
            }
            iMax2 = Math.max(iMax2, i2);
            i = 0;
        }
        setRowCount(size);
        setColumnCount(iMax2);
        int[] iArr3 = new int[size];
        boolean z3 = this.l;
        if (z3) {
            iMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Iterator it3 = ((oct) arrayList.get(i8)).C().iterator();
                int i9 = 0;
                while (it3.hasNext()) {
                    i9 += ((xdo) it3.next()).c;
                }
                iArr3[i8] = i9;
                iMax = Math.max(iMax, i9);
            }
        } else {
            iMax = 0;
        }
        for (int i10 = 0; i10 < size; i10++) {
            List listC = ((oct) arrayList.get(i10)).C();
            int size2 = listC.size();
            int i11 = z3 ? (iMax - iArr3[i10]) / 2 : 0;
            int i12 = 0;
            while (i12 < size2) {
                xdo xdoVar2 = (xdo) listC.get(i12);
                if (xdoVar2.a() != -21 && (!xdoVar2.e() || lgp.a().i())) {
                    Drawable drawable16 = xdoVar2.e;
                    Context context4 = this.m;
                    iArr = iArr3;
                    if (drawable16 == null) {
                        TextView textView = new TextView(context4);
                        textView.setText(xdoVar2.b);
                        textView.setTextAppearance(xdoVar2.j);
                        textView.setGravity(17);
                        textView.setFocusable(true);
                        if (this.b) {
                            ColorStateList colorStateList = xdoVar2.m;
                            if (colorStateList != null) {
                                textView.setTextColor(colorStateList);
                            }
                            textView.setTypeface(xdoVar2.o);
                            textView.setTextSize(xdoVar2.n);
                            int i13 = this.j;
                            if (i13 == 0) {
                                throw null;
                            }
                            if (i13 == 2) {
                                textView.setFocusable(false);
                                textView.setEnabled(false);
                                textView.setAlpha(0.125f);
                            }
                        }
                        g(textView, xdoVar2, i10, i11);
                        addView(textView);
                    } else {
                        ImageView imageView = new ImageView(context4);
                        imageView.setImageDrawable(xdoVar2.e);
                        imageView.setFocusable(true);
                        g(imageView, xdoVar2, i10, i11);
                        if (this.b) {
                            int i14 = this.j;
                            if (i14 == 0) {
                                throw null;
                            }
                            if (i14 == 2 && !xdoVar2.e() && !xdoVar2.d() && !xdoVar2.c()) {
                                imageView.setFocusable(false);
                                imageView.setEnabled(false);
                                imageView.setAlpha(0.125f);
                            }
                        }
                        addView(imageView);
                        i11 += xdoVar2.c;
                        i12++;
                        iArr3 = iArr;
                    }
                } else {
                    Space space = new Space(this.m);
                    space.setFocusable(false);
                    g(space, xdoVar2, i10, i11);
                    addView(space);
                    iArr = iArr3;
                }
                i11 += xdoVar2.c;
                i12++;
                iArr3 = iArr;
            }
        }
        if (id != -1) {
            e(id);
        }
        c(zIsSelected);
    }

    public final void c(boolean z) {
        this.d.setSelected(z);
    }

    public final void d(xdp xdpVar) throws Resources.NotFoundException {
        this.c = xdpVar;
        b();
    }

    public final void e(int i) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            ((ype) a.l().ai((char) 10144)).w("View with requested view id not found. Id: %d", i);
        } else {
            viewFindViewById.requestFocus();
        }
    }

    @Override // android.widget.GridLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMax;
        if (!this.l) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            xdp xdpVar = this.c;
            if (xdpVar == null) {
                iMax = 0;
            } else {
                ArrayList arrayList = xdpVar.c;
                int i3 = xdpVar.g;
                Iterator it = arrayList.iterator();
                iMax = 0;
                while (it.hasNext()) {
                    Iterator it2 = ((oct) it.next()).C().iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        i4 += ((xdo) it2.next()).g + i3 + i3;
                    }
                    iMax = Math.max(iMax, i4);
                }
            }
            float f = 1.0f;
            if (iMax > size && size > 0) {
                f = size / iMax;
            }
            int i5 = this.c.g;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                xdo xdoVar = (xdo) childAt.getTag();
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = (int) (xdoVar.g * f);
                int i7 = (int) (i5 * f);
                layoutParams.leftMargin = i7;
                layoutParams.rightMargin = i7;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setClickable(z);
        }
    }

    public ProjectionKeyboardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProjectionKeyboardLayout(Context context) {
        this(context, null);
    }
}
