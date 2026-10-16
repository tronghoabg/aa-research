package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$getContentType(LazyLayoutItemProvider lazyLayoutItemProvider, int i2) {
            return null;
        }

        public static int $default$getIndex(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
            return -1;
        }
    }

    void Item(int i2, Object obj, Composer composer, int i3);

    Object getContentType(int i2);

    int getIndex(Object obj);

    int getItemCount();

    Object getKey(int i2);
}
