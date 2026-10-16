package androidx.compose.runtime.tooling;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CompositionGroup extends CompositionData {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.tooling.CompositionGroup$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getGroupSize(CompositionGroup compositionGroup) {
            return 0;
        }

        public static Object $default$getIdentity(CompositionGroup compositionGroup) {
            return null;
        }

        public static int $default$getSlotsSize(CompositionGroup compositionGroup) {
            return 0;
        }

        public static /* synthetic */ CompositionGroup access$find$jd(CompositionGroup compositionGroup, Object obj) {
            return null;
        }

        public static /* synthetic */ int access$getGroupSize$jd(CompositionGroup compositionGroup) {
            return 0;
        }

        public static /* synthetic */ Object access$getIdentity$jd(CompositionGroup compositionGroup) {
            return null;
        }

        public static /* synthetic */ int access$getSlotsSize$jd(CompositionGroup compositionGroup) {
            return 0;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static CompositionGroup find(CompositionGroup compositionGroup, Object obj) {
            return null;
        }

        @Deprecated
        public static int getGroupSize(CompositionGroup compositionGroup) {
            return 0;
        }

        @Deprecated
        public static Object getIdentity(CompositionGroup compositionGroup) {
            return null;
        }

        @Deprecated
        public static int getSlotsSize(CompositionGroup compositionGroup) {
            return 0;
        }
    }

    Iterable<Object> getData();

    int getGroupSize();

    Object getIdentity();

    Object getKey();

    Object getNode();

    int getSlotsSize();

    String getSourceInfo();
}
