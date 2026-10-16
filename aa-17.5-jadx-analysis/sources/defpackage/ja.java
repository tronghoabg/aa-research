package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes2.dex */
public final class ja {
    public PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final CompoundButton d;
    private boolean e;

    public ja(CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(AttributeSet attributeSet, int i) {
        int iQ;
        int iQ2;
        CompoundButton compoundButton = this.d;
        Context context = compoundButton.getContext();
        int[] iArr = fs.m;
        lah lahVarC = lah.C(context, attributeSet, iArr, i, 0);
        ebm.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) lahVarC.a, i, 0);
        try {
            if (lahVarC.y(1) && (iQ2 = lahVarC.q(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ca.e(compoundButton.getContext(), iQ2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (lahVarC.y(0) && (iQ = lahVarC.q(0, 0)) != 0) {
                CompoundButton compoundButton2 = this.d;
                compoundButton2.setButtonDrawable(ca.e(compoundButton2.getContext(), iQ));
            }
            if (lahVarC.y(2)) {
                this.d.setButtonTintList(lahVarC.r(2));
            }
            if (lahVarC.y(3)) {
                CompoundButton compoundButton3 = this.d;
                int iN = lahVarC.n(3, -1);
                Rect rect = ko.a;
                compoundButton3.setButtonTintMode(a.R(iN, null));
            }
        } finally {
            lahVarC.w();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
