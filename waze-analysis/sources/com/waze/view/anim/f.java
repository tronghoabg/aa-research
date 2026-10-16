package com.waze.view.anim;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f44977a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44978b;

    f(View view, int i2) {
        this.f44978b = i2;
        this.f44977a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f44978b;
        View view = this.f44977a;
        if (i2 != 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(4);
        }
    }
}
