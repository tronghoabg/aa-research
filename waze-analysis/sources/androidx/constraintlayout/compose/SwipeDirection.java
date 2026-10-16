package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SwipeDirection {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final SwipeDirection Up = new SwipeDirection("up");
    private static final SwipeDirection Down = new SwipeDirection("down");
    private static final SwipeDirection Left = new SwipeDirection(TtmlNode.LEFT);
    private static final SwipeDirection Right = new SwipeDirection(TtmlNode.RIGHT);
    private static final SwipeDirection Start = new SwipeDirection(TtmlNode.START);
    private static final SwipeDirection End = new SwipeDirection(TtmlNode.END);
    private static final SwipeDirection Clockwise = new SwipeDirection("clockwise");
    private static final SwipeDirection Counterclockwise = new SwipeDirection("anticlockwise");

    public SwipeDirection(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SwipeDirection getClockwise() {
            return SwipeDirection.Clockwise;
        }

        public final SwipeDirection getCounterclockwise() {
            return SwipeDirection.Counterclockwise;
        }

        public final SwipeDirection getDown() {
            return SwipeDirection.Down;
        }

        public final SwipeDirection getEnd() {
            return SwipeDirection.End;
        }

        public final SwipeDirection getLeft() {
            return SwipeDirection.Left;
        }

        public final SwipeDirection getRight() {
            return SwipeDirection.Right;
        }

        public final SwipeDirection getStart() {
            return SwipeDirection.Start;
        }

        public final SwipeDirection getUp() {
            return SwipeDirection.Up;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
