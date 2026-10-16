package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2867c extends kc.m {

    /* renamed from: g, reason: collision with root package name */
    public C2865a f37092g;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2865a c2865a = this.f37092g;
        if (c2865a != null) {
            io.flutter.view.l lVar = c2865a.f37090a;
            if (lVar == null ? false : lVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
