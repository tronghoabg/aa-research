package com.google.android.material.bottomsheet;

import androidx.customview.widget.ViewDragHelper;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f6294a;

    i(j jVar) {
        Objects.requireNonNull(jVar);
        this.f6294a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f6294a;
        jVar.f6297c = false;
        BottomSheetBehavior bottomSheetBehavior = jVar.f6295a;
        ViewDragHelper viewDragHelper = bottomSheetBehavior.f6276i;
        if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
            jVar.b(jVar.f6296b);
        } else if (bottomSheetBehavior.f6275h == 2) {
            bottomSheetBehavior.y(jVar.f6296b);
        }
    }
}
