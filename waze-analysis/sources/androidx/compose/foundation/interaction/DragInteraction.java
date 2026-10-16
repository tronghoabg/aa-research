package androidx.compose.foundation.interaction;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    /* compiled from: WazeSource */
    public final class Cancel implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Cancel(Start start) {
            this.start = start;
        }

        public final Start getStart() {
            return this.start;
        }
    }

    /* compiled from: WazeSource */
    public final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: WazeSource */
    public final class Stop implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Stop(Start start) {
            this.start = start;
        }

        public final Start getStart() {
            return this.start;
        }
    }
}
