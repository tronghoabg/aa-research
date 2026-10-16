package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final View f6202a;

    /* renamed from: b, reason: collision with root package name */
    private int f6203b;

    /* renamed from: c, reason: collision with root package name */
    private int f6204c;

    public j(View view) {
        this.f6202a = view;
    }

    final void a() {
        View view = this.f6202a;
        ViewCompat.offsetTopAndBottom(view, -(view.getTop() - this.f6203b));
        ViewCompat.offsetLeftAndRight(view, -(view.getLeft() - this.f6204c));
    }

    final void b() {
        View view = this.f6202a;
        this.f6203b = view.getTop();
        this.f6204c = view.getLeft();
    }
}
