package androidx.compose.ui.contentcapture;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ContentCaptureManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean isEnabled = true;

        private Companion() {
        }

        public final boolean isEnabled() {
            return isEnabled;
        }

        public final void setEnabled(boolean z) {
            isEnabled = z;
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }
}
