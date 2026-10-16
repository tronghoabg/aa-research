package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HorizontalAlign {
    public static final int $stable = 0;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final HorizontalAlign Start = new HorizontalAlign(TtmlNode.START);
    private static final HorizontalAlign End = new HorizontalAlign(TtmlNode.END);
    private static final HorizontalAlign Center = new HorizontalAlign(TtmlNode.CENTER);

    public HorizontalAlign(String str) {
        this.name = str;
    }

    public final String getName$constraintlayout_compose() {
        return this.name;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final HorizontalAlign getCenter() {
            return HorizontalAlign.Center;
        }

        public final HorizontalAlign getEnd() {
            return HorizontalAlign.End;
        }

        public final HorizontalAlign getStart() {
            return HorizontalAlign.Start;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
