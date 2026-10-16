package androidx.compose.foundation.lazy.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutCacheWindowKt {
    public static final LazyLayoutCacheWindow LazyLayoutCacheWindow(float f2, float f3) {
        return new FractionLazyLayoutCacheWindow(f2, f3);
    }

    public static /* synthetic */ LazyLayoutCacheWindow LazyLayoutCacheWindow$default(float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return LazyLayoutCacheWindow(f2, f3);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA, reason: not valid java name */
    public static final LazyLayoutCacheWindow m2931LazyLayoutCacheWindowYgX7TsA(float f2, float f3) {
        return new DpLazyLayoutCacheWindow(f2, f3, null);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ LazyLayoutCacheWindow m2932LazyLayoutCacheWindowYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2931LazyLayoutCacheWindowYgX7TsA(f2, f3);
    }
}
