package androidx.navigationevent;

import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NavigationEventTransitionState {
    public static final Companion Companion = new Companion(null);
    public static final int TRANSITIONING_BACK = -1;
    public static final int TRANSITIONING_FORWARD = 1;
    public static final int TRANSITIONING_UNKNOWN = 0;

    /* compiled from: WazeSource */
    @Target({ElementType.METHOD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
    }

    /* compiled from: WazeSource */
    public final class Idle extends NavigationEventTransitionState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public String toString() {
            return "Idle()";
        }
    }

    /* compiled from: WazeSource */
    public final class InProgress extends NavigationEventTransitionState {
        private final int direction;
        private final NavigationEvent latestEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(NavigationEvent navigationEvent, int i2) {
            super(null);
            x.f(navigationEvent, "latestEvent");
            this.latestEvent = navigationEvent;
            this.direction = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            InProgress inProgress = (InProgress) obj;
            return this.direction == inProgress.direction && x.n(this.latestEvent, inProgress.latestEvent);
        }

        public final int getDirection() {
            return this.direction;
        }

        public final NavigationEvent getLatestEvent() {
            return this.latestEvent;
        }

        public int hashCode() {
            return (this.direction * 31) + this.latestEvent.hashCode();
        }

        public String toString() {
            return "InProgress(latestEvent=" + this.latestEvent + ", direction=" + this.direction + ")";
        }
    }

    private NavigationEventTransitionState() {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ NavigationEventTransitionState(o oVar) {
        this();
    }
}
