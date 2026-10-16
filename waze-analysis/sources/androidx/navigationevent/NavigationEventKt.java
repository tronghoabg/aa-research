package androidx.navigationevent;

import android.os.Build;
import android.window.BackEvent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventKt {
    public static final BackEvent toBackEvent(NavigationEvent navigationEvent) {
        x.f(navigationEvent, "<this>");
        return Build.VERSION.SDK_INT >= 36 ? new BackEvent(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge(), navigationEvent.getFrameTimeMillis()) : new BackEvent(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge());
    }

    public static final NavigationEvent toNavigationEvent(BackEvent backEvent) {
        x.f(backEvent, "<this>");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new NavigationEvent(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
