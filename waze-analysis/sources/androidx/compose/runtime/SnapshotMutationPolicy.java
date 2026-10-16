package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.SnapshotMutationPolicy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$merge(SnapshotMutationPolicy snapshotMutationPolicy, Object obj, Object obj2, Object obj3) {
            return null;
        }

        public static /* synthetic */ Object access$merge$jd(SnapshotMutationPolicy snapshotMutationPolicy, Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <T> T merge(SnapshotMutationPolicy<T> snapshotMutationPolicy, T t, T t2, T t3) {
            return null;
        }
    }

    boolean equivalent(T t, T t2);

    T merge(T t, T t2, T t3);
}
