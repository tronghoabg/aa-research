package com.waze.sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag f35227a;

    public af(ag agVar) {
        this.f35227a = agVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        h.g.b.x.f(motionEvent2, "e2");
        if (motionEvent != null) {
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > Math.abs(y)) {
                    if (Math.abs(x) > 100.0f) {
                        Math.abs(f2);
                    }
                    return false;
                }
                if (Math.abs(y) <= 100.0f || Math.abs(f3) <= 100.0f || y > 0.0f) {
                    return false;
                }
                return this.f35227a.a();
            } catch (Exception e2) {
                this.f35227a.f35228a.c("Failed to parse onFling gesture", e2);
            }
        }
        return false;
    }
}
