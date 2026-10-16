package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.focus.FocusRingDrawable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f6847a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f6848b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f6849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, Context context, int i2, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i2, strArr);
        Objects.requireNonNull(aiVar);
        this.f6847a = aiVar;
        ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{aiVar.f6858i.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f6849c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.compositeColors(aiVar.f6858i.getColorForState(iArr3, 0), aiVar.f6857h), ColorUtils.compositeColors(aiVar.f6858i.getColorForState(iArr2, 0), aiVar.f6857h), aiVar.f6857h});
        }
        this.f6848b = colorStateList2;
    }

    private final boolean a() {
        return this.f6847a.f6857h != 0;
    }

    private final boolean b() {
        return this.f6847a.f6858i != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            ai aiVar = this.f6847a;
            ColorDrawable colorDrawable = null;
            if (aiVar.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable2 = new ColorDrawable(aiVar.f6857h);
                ColorStateList colorStateList = this.f6849c;
                if (colorStateList != null) {
                    colorDrawable2.setTintList(this.f6848b);
                    ?? rippleDrawable = new RippleDrawable(colorStateList, colorDrawable2, null);
                    FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(getContext(), rippleDrawable);
                    if (focusRingDrawableC != null) {
                        focusRingDrawableC.i(aiVar.f6852c);
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
