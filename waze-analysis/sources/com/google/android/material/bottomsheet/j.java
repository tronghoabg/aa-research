package com.google.android.material.bottomsheet;

import android.view.View;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BottomSheetBehavior f6295a;

    /* renamed from: b, reason: collision with root package name */
    private int f6296b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6297c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f6298d;

    /* synthetic */ j(BottomSheetBehavior bottomSheetBehavior) {
        Objects.requireNonNull(bottomSheetBehavior);
        this.f6295a = bottomSheetBehavior;
        this.f6298d = new i(this);
    }

    final void b(int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f6295a;
        WeakReference weakReference = bottomSheetBehavior.f6279l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6296b = i2;
        if (this.f6297c) {
            return;
        }
        ((View) bottomSheetBehavior.f6279l.get()).postOnAnimation(this.f6298d);
        this.f6297c = true;
    }
}
