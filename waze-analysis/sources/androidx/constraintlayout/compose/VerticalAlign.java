package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class VerticalAlign {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final VerticalAlign Top = new VerticalAlign("top");
    private static final VerticalAlign Bottom = new VerticalAlign("bottom");
    private static final VerticalAlign Center = new VerticalAlign(TtmlNode.CENTER);
    private static final VerticalAlign Baseline = new VerticalAlign("baseline");

    public VerticalAlign(String str) {
        this.name = str;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final VerticalAlign getBaseline() {
            return VerticalAlign.Baseline;
        }

        public final VerticalAlign getBottom() {
            return VerticalAlign.Bottom;
        }

        public final VerticalAlign getCenter() {
            return VerticalAlign.Center;
        }

        public final VerticalAlign getTop() {
            return VerticalAlign.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
