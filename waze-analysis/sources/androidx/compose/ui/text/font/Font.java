package androidx.compose.ui.text.font;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.Font$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* compiled from: WazeSource */
    public interface ResourceLoader {
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    int mo10603getLoadingStrategyPKNRLFQ();

    /* renamed from: getStyle-_-LCdwA */
    int mo10613getStyle_LCdwA();

    FontWeight getWeight();
}
