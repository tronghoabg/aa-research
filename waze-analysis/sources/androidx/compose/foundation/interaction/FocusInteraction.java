package androidx.compose.foundation.interaction;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusInteraction extends Interaction {

    /* compiled from: WazeSource */
    public final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: WazeSource */
    public final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;
        private final Focus focus;

        public Unfocus(Focus focus) {
            this.focus = focus;
        }

        public final Focus getFocus() {
            return this.focus;
        }
    }
}
