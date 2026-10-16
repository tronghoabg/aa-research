package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.navigationevent.NavigationEvent;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BackEventCompat {
    public static final Companion Companion = new Companion(null);
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_NONE = 2;
    public static final int EDGE_RIGHT = 1;
    private final long frameTimeMillis;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SwipeEdge {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        x.f(backEvent, "backEvent");
    }

    public final long getFrameTimeMillis() {
        return this.frameTimeMillis;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    public final BackEvent toBackEvent() {
        int i2 = Build.VERSION.SDK_INT;
        float f2 = this.touchX;
        return i2 >= 36 ? new BackEvent(f2, this.touchY, this.progress, this.swipeEdge, this.frameTimeMillis) : new BackEvent(f2, this.touchY, this.progress, this.swipeEdge);
    }

    public final NavigationEvent toNavigationEvent() {
        return new NavigationEvent(this.swipeEdge, this.progress, this.touchX, this.touchY, this.frameTimeMillis);
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ", frameTimeMillis=" + this.frameTimeMillis + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BackEventCompat(float f2, float f3, float f4, int i2, long j2) {
        this.touchX = f2;
        this.touchY = f3;
        this.progress = f4;
        this.swipeEdge = i2;
        this.frameTimeMillis = j2;
    }

    public /* synthetic */ BackEventCompat(float f2, float f3, float f4, int i2, long j2, int i3, o oVar) {
        this(f2, f3, f4, i2, (i3 & 16) != 0 ? 0L : j2);
    }

    public BackEventCompat(float f2, float f3, float f4, int i2) {
        this(f2, f3, f4, i2, 0L, 16, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(NavigationEvent navigationEvent) {
        this(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge(), navigationEvent.getFrameTimeMillis());
        x.f(navigationEvent, "navigationEvent");
    }
}
