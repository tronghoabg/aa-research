package androidx.compose.ui.text.android.selection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SegmentFinder {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DONE = -1;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DONE = -1;

        private Companion() {
        }
    }

    int nextEndBoundary(int i2);

    int nextStartBoundary(int i2);

    int previousEndBoundary(int i2);

    int previousStartBoundary(int i2);
}
