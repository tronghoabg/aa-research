package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SwipeSide {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final SwipeSide Top = new SwipeSide("top");
    private static final SwipeSide Left = new SwipeSide(TtmlNode.LEFT);
    private static final SwipeSide Right = new SwipeSide(TtmlNode.RIGHT);
    private static final SwipeSide Bottom = new SwipeSide("bottom");
    private static final SwipeSide Middle = new SwipeSide("middle");
    private static final SwipeSide Start = new SwipeSide(TtmlNode.START);
    private static final SwipeSide End = new SwipeSide(TtmlNode.END);

    public SwipeSide(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SwipeSide getBottom() {
            return SwipeSide.Bottom;
        }

        public final SwipeSide getEnd() {
            return SwipeSide.End;
        }

        public final SwipeSide getLeft() {
            return SwipeSide.Left;
        }

        public final SwipeSide getMiddle() {
            return SwipeSide.Middle;
        }

        public final SwipeSide getRight() {
            return SwipeSide.Right;
        }

        public final SwipeSide getStart() {
            return SwipeSide.Start;
        }

        public final SwipeSide getTop() {
            return SwipeSide.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
