package androidx.navigationevent;

import h.g.b.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEvent {
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
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SwipeEdge {
    }

    public /* synthetic */ NavigationEvent(int i2, float f2, float f3, float f4, long j2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 2 : i2, (i3 & 2) != 0 ? 0.0f : f2, (i3 & 4) != 0 ? 0.0f : f3, (i3 & 8) != 0 ? 0.0f : f4, (i3 & 16) != 0 ? 0L : j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NavigationEvent navigationEvent = (NavigationEvent) obj;
            return this.touchX == navigationEvent.touchX && this.touchY == navigationEvent.touchY && this.progress == navigationEvent.progress && this.swipeEdge == navigationEvent.swipeEdge && this.frameTimeMillis == navigationEvent.frameTimeMillis;
        }
        return false;
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

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.touchX) * 31) + Float.floatToIntBits(this.touchY)) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.swipeEdge) * 31) + NavigationEvent$$ExternalSyntheticBackport0.m(this.frameTimeMillis);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ", frameTimeMillis=" + this.frameTimeMillis + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public NavigationEvent(int i2) {
        this(i2, 0.0f, 0.0f, 0.0f, 0L, 30, null);
    }

    public NavigationEvent(int i2, float f2) {
        this(i2, f2, 0.0f, 0.0f, 0L, 28, null);
    }

    public NavigationEvent(int i2, float f2, float f3) {
        this(i2, f2, f3, 0.0f, 0L, 24, null);
    }

    public NavigationEvent(int i2, float f2, float f3, float f4) {
        this(i2, f2, f3, f4, 0L, 16, null);
    }

    public NavigationEvent(int i2, float f2, float f3, float f4, long j2) {
        this.swipeEdge = i2;
        this.progress = f2;
        this.touchX = f3;
        this.touchY = f4;
        this.frameTimeMillis = j2;
    }

    public NavigationEvent() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }
}
