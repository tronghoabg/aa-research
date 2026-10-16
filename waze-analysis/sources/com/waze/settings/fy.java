package com.waze.settings;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fy implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f37285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.br f37286b;

    public fy(View view, kotlinx.coroutines.br brVar) {
        this.f37285a = view;
        this.f37286b = brVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h.g.b.x.f(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h.g.b.x.f(view, "view");
        this.f37285a.removeOnAttachStateChangeListener(this);
        this.f37286b.s(null);
    }
}
