package androidx.compose.ui.graphics.vector;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface VectorConfig {
    <T> T getOrDefault(VectorProperty<T> vectorProperty, T t);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorConfig$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$getOrDefault(VectorConfig vectorConfig, VectorProperty vectorProperty, Object obj) {
            return obj;
        }

        public static /* synthetic */ Object access$getOrDefault$jd(VectorConfig vectorConfig, VectorProperty vectorProperty, Object obj) {
            return obj;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t) {
            return t;
        }
    }
}
