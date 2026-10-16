package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes5.dex */
public final class A implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f37077a;

    /* renamed from: b, reason: collision with root package name */
    public z f37078b;

    public A(View view, z zVar) {
        this.f37077a = view;
        this.f37078b = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        z zVar = this.f37078b;
        if (zVar == null) {
            return;
        }
        zVar.run();
        this.f37078b = null;
        this.f37077a.post(new z(this, 1));
    }
}
