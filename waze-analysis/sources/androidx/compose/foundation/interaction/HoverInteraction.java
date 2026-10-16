package androidx.compose.foundation.interaction;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    /* compiled from: WazeSource */
    public final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    /* compiled from: WazeSource */
    public final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        private final Enter enter;

        public Exit(Enter enter) {
            this.enter = enter;
        }

        public final Enter getEnter() {
            return this.enter;
        }
    }
}
