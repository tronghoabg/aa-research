package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class i<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    private j f6201a;

    public i() {
    }

    protected void aj(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.onLayoutChild(view, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
        aj(coordinatorLayout, v, i2);
        j jVar = this.f6201a;
        if (jVar == null) {
            jVar = new j(v);
            this.f6201a = jVar;
        }
        jVar.b();
        this.f6201a.a();
        return true;
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
