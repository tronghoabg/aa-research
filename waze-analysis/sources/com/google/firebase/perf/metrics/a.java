package com.google.firebase.perf.metrics;

import android.view.ViewTreeObserver;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppStartTrace f10507a;

    /* synthetic */ a(AppStartTrace appStartTrace) {
        Objects.requireNonNull(appStartTrace);
        this.f10507a = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.f10507a.y++;
    }
}
