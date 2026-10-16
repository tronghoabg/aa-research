package androidx.compose.foundation.interaction;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    /* compiled from: WazeSource */
    public final class Cancel implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Cancel(Press press) {
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }

    /* compiled from: WazeSource */
    public final class Release implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Release(Press press) {
            this.press = press;
        }

        public final Press getPress() {
            return this.press;
        }
    }

    /* compiled from: WazeSource */
    public final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        private Press(long j2) {
            this.pressPosition = j2;
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name */
        public final long m2381getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        public /* synthetic */ Press(long j2, o oVar) {
            this(j2);
        }
    }
}
