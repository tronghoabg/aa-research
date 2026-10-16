package com.waze.navbar;

import android.view.ViewTreeObserver;
import com.waze.view.navbar.NavBarText;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NavBarText f30871a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f30872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f30873c;

    d(f fVar, NavBarText navBarText, boolean z) {
        this.f30871a = navBarText;
        this.f30872b = z;
        Objects.requireNonNull(fVar);
        this.f30873c = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f30871a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f30873c.j(this.f30872b);
    }
}
