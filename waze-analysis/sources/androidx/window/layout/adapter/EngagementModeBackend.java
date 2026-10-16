package androidx.window.layout.adapter;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowEngagementInfo;
import androidx.window.layout.util.EngagementModeHelper;
import androidx.window.layout.util.InputHelper;
import h.g.b.x;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface EngagementModeBackend {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.adapter.EngagementModeBackend$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = EngagementModeBackend.Companion;
        }

        public static EngagementModeBackend getInstance(Context context) {
            return EngagementModeBackend.Companion.getInstance(context);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private static volatile EngagementModeBackend globalInstance;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ReentrantLock globalLock = new ReentrantLock();

        private Companion() {
        }

        public final EngagementModeBackend getInstance(Context context) {
            x.f(context, "context");
            if (globalInstance == null) {
                ReentrantLock reentrantLock = globalLock;
                reentrantLock.lock();
                try {
                    if (globalInstance == null) {
                        globalInstance = new EngagementModeBackendApi0(EngagementModeHelper.Companion.getInstance(), new InputDeviceTracker(InputHelper.Companion.getInstance(context)));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            EngagementModeBackend engagementModeBackend = globalInstance;
            x.c(engagementModeBackend);
            return engagementModeBackend;
        }
    }

    void addEngagementLayoutChangeCallback(Context context, Executor executor, Consumer<WindowEngagementInfo.EngagementMode> consumer);

    WindowEngagementInfo.EngagementMode engagementMode(Context context);

    void removeEngagementLayoutChangeCallback(Consumer<WindowEngagementInfo.EngagementMode> consumer);
}
