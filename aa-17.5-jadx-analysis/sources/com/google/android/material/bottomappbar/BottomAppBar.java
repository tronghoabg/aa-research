package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import defpackage.dsf;
import defpackage.dsg;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class BottomAppBar extends Toolbar implements dsf {
    @Override // defpackage.dsf
    public final /* bridge */ /* synthetic */ dsg a() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        throw null;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void u(CharSequence charSequence) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void v(CharSequence charSequence) {
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public Behavior() {
            new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            new WeakReference((BottomAppBar) view);
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            throw null;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            new Rect();
        }
    }
}
