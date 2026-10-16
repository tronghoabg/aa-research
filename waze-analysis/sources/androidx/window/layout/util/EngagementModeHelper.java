package androidx.window.layout.util;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface EngagementModeHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final EngagementModeHelper getInstance() {
            return new EngagementModeHelperImpl(null, 1, 0 == true ? 1 : 0);
        }
    }

    boolean hasLargeEnoughDisplay(Context context);
}
