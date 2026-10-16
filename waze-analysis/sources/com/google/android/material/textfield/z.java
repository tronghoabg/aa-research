package com.google.android.material.textfield;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f6920a;

    z(ab abVar) {
        Objects.requireNonNull(abVar);
        this.f6920a = abVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6920a.I();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6920a.J();
    }
}
