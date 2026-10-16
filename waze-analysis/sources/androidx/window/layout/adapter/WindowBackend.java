package androidx.window.layout.adapter;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.SupportedPosture;
import androidx.window.layout.WindowLayoutInfo;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowBackend {

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.adapter.WindowBackend$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$hasRegisteredListeners(WindowBackend windowBackend) {
            return false;
        }

        public static /* synthetic */ void getSupportedPostures$annotations() {
        }
    }

    WindowLayoutInfo getCurrentWindowLayoutInfo(Context context);

    List<SupportedPosture> getSupportedPostures();

    boolean hasRegisteredListeners();

    void registerLayoutChangeCallback(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer);

    void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer);
}
