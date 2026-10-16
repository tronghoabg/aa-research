package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.wpc;
import defpackage.wpd;
import defpackage.wpe;
import defpackage.wpf;
import defpackage.wpm;
import defpackage.wpy;
import java.util.List;

/* loaded from: classes3.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements dsf {
    public static final /* synthetic */ int b = 0;

    static {
        new wpc(Float.class);
        new wpd(Float.class);
        new wpe(Float.class);
        new wpf(Float.class);
    }

    @Override // defpackage.dsf
    public final dsg a() {
        throw null;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        throw null;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        throw null;
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        throw null;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends dsg<T> {
        private Rect a;
        private final boolean b;
        private final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wpm.a);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dsj) {
                return ((dsj) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((dsj) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (K(appBarLayout, extendedFloatingActionButton)) {
                Rect rect = this.a;
                if (rect == null) {
                    rect = new Rect();
                    this.a = rect;
                }
                wpy.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.d()) {
                    int i = ExtendedFloatingActionButton.b;
                    throw null;
                }
                int i2 = ExtendedFloatingActionButton.b;
                throw null;
            }
        }

        private final void M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (K(view, extendedFloatingActionButton)) {
                if (view.getTop() >= (extendedFloatingActionButton.getHeight() / 2) + ((dsj) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                    throw null;
                }
                throw null;
            }
        }

        @Override // defpackage.dsg
        public final void c(dsj dsjVar) {
            if (dsjVar.h == 0) {
                dsjVar.h = 80;
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List listA = coordinatorLayout.a(extendedFloatingActionButton);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) listA.get(i2);
                if (view2 instanceof AppBarLayout) {
                    L(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else if (J(view2)) {
                    M(view2, extendedFloatingActionButton);
                }
            }
            coordinatorLayout.j(extendedFloatingActionButton, i);
            return true;
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else if (J(view2)) {
                M(view2, extendedFloatingActionButton);
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean t(View view, Rect rect) {
            return false;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }
}
