package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC1879a implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f28486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1880b f28487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f28488c;

    public ViewOnAttachStateChangeListenerC1879a(FrameLayout frameLayout, C1880b c1880b, FrameLayout frameLayout2) {
        this.f28486a = frameLayout;
        this.f28487b = c1880b;
        this.f28488c = frameLayout2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC3340k.e(view, "view");
        this.f28486a.removeOnAttachStateChangeListener(this);
        C1880b.a(this.f28487b, this.f28488c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC3340k.e(view, "view");
    }
}
