package androidx.compose.runtime.tooling;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CompositionData {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.tooling.CompositionData$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CompositionGroup $default$find(CompositionData compositionData, Object obj) {
            return null;
        }
    }

    CompositionGroup find(Object obj);

    Iterable<CompositionGroup> getCompositionGroups();

    boolean isEmpty();
}
