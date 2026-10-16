package com.google.android.material.snackbar;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f6750a;

    f(o oVar) {
        Objects.requireNonNull(oVar);
        this.f6750a = oVar;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        o oVar = this.f6750a;
        oVar.t = windowInsetsCompat.getSystemWindowInsetBottom();
        oVar.u = windowInsetsCompat.getSystemWindowInsetLeft();
        oVar.v = windowInsetsCompat.getSystemWindowInsetRight();
        oVar.E();
        return windowInsetsCompat;
    }
}
