package com.waze.ab;

import android.view.GestureDetector;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f13789a;

    j(l lVar) {
        Objects.requireNonNull(lVar);
        this.f13789a = lVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (f3 <= 5000.0f) {
            return false;
        }
        l lVar = this.f13789a;
        if (!lVar.f13802a.f13798i) {
            return false;
        }
        lVar.dismiss();
        return false;
    }
}
