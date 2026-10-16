package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyLayoutCacheWindow {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$calculateAheadWindow(LazyLayoutCacheWindow lazyLayoutCacheWindow, Density density, int i2) {
            return 0;
        }

        public static int $default$calculateBehindWindow(LazyLayoutCacheWindow lazyLayoutCacheWindow, Density density, int i2) {
            return 0;
        }
    }

    int calculateAheadWindow(Density density, int i2);

    int calculateBehindWindow(Density density, int i2);
}
