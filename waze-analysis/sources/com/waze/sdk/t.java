package com.waze.sdk;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f35405a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35406b;

    t(u uVar, View view) {
        this.f35405a = view;
        Objects.requireNonNull(uVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f35406b) {
            return;
        }
        this.f35406b = true;
        this.f35405a.performClick();
    }
}
