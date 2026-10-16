package com.waze.map.isolated;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.waze.map.ed;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements ed {

    /* renamed from: a, reason: collision with root package name */
    private Rect f29247a = new Rect();

    @Override // com.waze.map.ed
    public final void a(Window window) {
        h.g.b.x.f(window, "activityWindow");
        Rect rect = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect);
        Insets insets = WindowInsetsCompat.toWindowInsetsCompat(window.getDecorView().getRootWindowInsets(), window.getDecorView()).getInsets(16);
        h.g.b.x.c(insets);
        Rect rect2 = new Rect(rect.left + insets.left, rect.top + insets.top, rect.right - insets.right, rect.bottom - insets.bottom);
        if (h.g.b.x.n(this.f29247a, rect2)) {
            return;
        }
        this.f29247a = rect2;
        com.waze.shared_infra.i.h.a("updateFromWindow() safeArea{" + rect2 + "} fullscreen{" + rect + "} osGesturesInsets{" + insets + "}");
    }

    @Override // com.waze.map.gc
    public final boolean b(MotionEvent motionEvent, View view) {
        h.g.b.x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(view, "view");
        if (this.f29247a.isEmpty()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = ((int) motionEvent.getRawX()) + iArr[0];
        int rawY = ((int) motionEvent.getRawY()) + iArr[1];
        boolean zContains = this.f29247a.contains(rawX, rawY);
        boolean z = !zContains;
        if (!zContains) {
            com.waze.shared_infra.i.h.j("detected motion event under system insets! safeArea{" + this.f29247a + "} event{x:" + rawX + ", y:" + rawY + "}");
        }
        return z;
    }
}
