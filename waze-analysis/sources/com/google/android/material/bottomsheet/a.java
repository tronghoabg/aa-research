package com.google.android.material.bottomsheet;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f6280a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6282c;

    a(BottomSheetBehavior bottomSheetBehavior, View view, int i2) {
        this.f6280a = view;
        this.f6281b = i2;
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6282c = bottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6282c.X(this.f6280a, this.f6281b, false);
    }
}
