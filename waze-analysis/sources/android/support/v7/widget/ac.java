package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f1036a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1037b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1038c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1039d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1040e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1041f;

    ac(CompoundButton compoundButton) {
        this.f1036a = compoundButton;
    }

    final ColorStateList a() {
        return this.f1037b;
    }

    final PorterDuff.Mode b() {
        return this.f1038c;
    }

    final void c() {
        CompoundButton compoundButton = this.f1036a;
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        if (buttonDrawable != null) {
            if (this.f1039d || this.f1040e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1039d) {
                    DrawableCompat.setTintList(drawableMutate, this.f1037b);
                }
                if (this.f1040e) {
                    DrawableCompat.setTintMode(drawableMutate, this.f1038c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void d(AttributeSet attributeSet, int i2) {
        int iF;
        int iF2;
        CompoundButton compoundButton = this.f1036a;
        Context context = compoundButton.getContext();
        int[] iArr = android.support.v7.a.a.m;
        gc gcVarN = gc.n(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), iArr, attributeSet, gcVarN.h(), i2, 0);
        try {
            if (gcVarN.s(1) && (iF2 = gcVarN.f(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(android.support.a.i.d(compoundButton.getContext(), iF2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (gcVarN.s(0) && (iF = gcVarN.f(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.f1036a;
                compoundButton2.setButtonDrawable(android.support.a.i.d(compoundButton2.getContext(), iF));
            }
            if (gcVarN.s(2)) {
                CompoundButtonCompat.setButtonTintList(this.f1036a, gcVarN.g(2));
            }
            if (gcVarN.s(3)) {
                CompoundButton compoundButton3 = this.f1036a;
                int iC = gcVarN.c(3, -1);
                Rect rect = cg.f1231a;
                CompoundButtonCompat.setButtonTintMode(compoundButton3, com.waze.c.c.e.h(iC, null));
            }
        } finally {
            gcVarN.q();
        }
    }

    final void e() {
        if (this.f1041f) {
            this.f1041f = false;
        } else {
            this.f1041f = true;
            c();
        }
    }

    final void f(ColorStateList colorStateList) {
        this.f1037b = colorStateList;
        this.f1039d = true;
        c();
    }

    final void g(PorterDuff.Mode mode) {
        this.f1038c = mode;
        this.f1040e = true;
        c();
    }
}
