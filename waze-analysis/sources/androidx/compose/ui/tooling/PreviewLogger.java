package androidx.compose.ui.tooling;

import android.util.Log;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreviewLogger {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void logError$ui_tooling$default(Companion companion, String str, Throwable th, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                th = null;
            }
            companion.logError$ui_tooling(str, th);
        }

        public static /* synthetic */ void logWarning$ui_tooling$default(Companion companion, String str, Throwable th, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                th = null;
            }
            companion.logWarning$ui_tooling(str, th);
        }

        public final void logError$ui_tooling(String str, Throwable th) {
            Log.e("PreviewLogger", str, th);
        }

        public final void logWarning$ui_tooling(String str, Throwable th) {
            Log.w("PreviewLogger", str, th);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
