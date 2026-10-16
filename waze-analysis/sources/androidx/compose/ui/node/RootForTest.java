package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface RootForTest {

    /* compiled from: WazeSource */
    public interface UncaughtExceptionHandler {
        void onUncaughtException(Throwable th);
    }

    void forceAccessibilityForTesting(boolean z);

    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    TextInputService getTextInputService();

    void measureAndLayoutForTest();

    boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent);

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo10137sendKeyEventZmokQxo(KeyEvent keyEvent);

    void setAccessibilityEventBatchIntervalMillis(long j2);

    void setUncaughtExceptionHandler(UncaughtExceptionHandler uncaughtExceptionHandler);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.RootForTest$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$sendIndirectPointerEvent(RootForTest rootForTest, IndirectPointerEvent indirectPointerEvent) {
            return false;
        }

        public static /* synthetic */ void getTextInputService$annotations() {
        }

        public static void $default$measureAndLayoutForTest(RootForTest rootForTest) {
        }

        public static void $default$forceAccessibilityForTesting(RootForTest rootForTest, boolean z) {
        }

        public static void $default$setAccessibilityEventBatchIntervalMillis(RootForTest rootForTest, long j2) {
        }

        public static void $default$setUncaughtExceptionHandler(RootForTest rootForTest, UncaughtExceptionHandler uncaughtExceptionHandler) {
        }
    }
}
