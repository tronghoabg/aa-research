package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1030a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1031b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1032c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1033d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1034e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1035f;

    ab(CheckedTextView checkedTextView) {
        this.f1030a = checkedTextView;
    }

    final ColorStateList a() {
        return this.f1031b;
    }

    final PorterDuff.Mode b() {
        return this.f1032c;
    }

    final void c() {
        CheckedTextView checkedTextView = this.f1030a;
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(checkedTextView);
        if (checkMarkDrawable != null) {
            if (this.f1033d || this.f1034e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1033d) {
                    DrawableCompat.setTintList(drawableMutate, this.f1031b);
                }
                if (this.f1034e) {
                    DrawableCompat.setTintMode(drawableMutate, this.f1032c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    final void d() {
        if (this.f1035f) {
            this.f1035f = false;
        } else {
            this.f1035f = true;
            c();
        }
    }

    final void e(ColorStateList colorStateList) {
        this.f1031b = colorStateList;
        this.f1033d = true;
        c();
    }

    final void f(PorterDuff.Mode mode) {
        this.f1032c = mode;
        this.f1034e = true;
        c();
    }

    final void g(AttributeSet attributeSet) {
        int iF;
        int iF2;
        CheckedTextView checkedTextView = this.f1030a;
        Context context = checkedTextView.getContext();
        int[] iArr = android.support.v7.a.a.f490l;
        gc gcVarN = gc.n(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, gcVarN.h(), R.attr.checkedTextViewStyle, 0);
        try {
            if (gcVarN.s(1) && (iF2 = gcVarN.f(1, 0)) != 0) {
                try {
                    checkedTextView.setCheckMarkDrawable(android.support.a.i.d(checkedTextView.getContext(), iF2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (gcVarN.s(0) && (iF = gcVarN.f(0, 0)) != 0) {
                CheckedTextView checkedTextView2 = this.f1030a;
                checkedTextView2.setCheckMarkDrawable(android.support.a.i.d(checkedTextView2.getContext(), iF));
            }
            if (gcVarN.s(2)) {
                CheckedTextViewCompat.setCheckMarkTintList(this.f1030a, gcVarN.g(2));
            }
            if (gcVarN.s(3)) {
                CheckedTextView checkedTextView3 = this.f1030a;
                int iC = gcVarN.c(3, -1);
                Rect rect = cg.f1231a;
                CheckedTextViewCompat.setCheckMarkTintMode(checkedTextView3, com.waze.c.c.e.h(iC, null));
            }
        } finally {
            gcVarN.q();
        }
    }
}
