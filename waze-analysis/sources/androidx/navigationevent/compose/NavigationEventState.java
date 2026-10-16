package androidx.navigationevent.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import androidx.navigationevent.NavigationEventTransitionState;
import h.a.i;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventState<T extends NavigationEventInfo> {
    public static final int $stable = 0;
    private final MutableState backInfo$delegate;
    private final MutableState currentInfo$delegate;
    private final MutableState forwardInfo$delegate;
    private NavigationEventHandler<? extends NavigationEventInfo> sourceHandler;
    private final MutableState transitionState$delegate;

    public NavigationEventState(T t, List<? extends T> list, List<? extends T> list2) {
        this.transitionState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(NavigationEventTransitionState.Idle.INSTANCE, null, 2, null);
        this.backInfo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list, null, 2, null);
        this.currentInfo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.forwardInfo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(list2, null, 2, null);
    }

    public final List<T> getBackInfo() {
        return (List) this.backInfo$delegate.getValue();
    }

    public final T getCurrentInfo() {
        return (T) this.currentInfo$delegate.getValue();
    }

    public final List<T> getForwardInfo() {
        return (List) this.forwardInfo$delegate.getValue();
    }

    public final NavigationEventHandler<? extends NavigationEventInfo> getSourceHandler$navigationevent_compose() {
        return this.sourceHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NavigationEventTransitionState getTransitionState() {
        return (NavigationEventTransitionState) this.transitionState$delegate.getValue();
    }

    public final void setBackInfo$navigationevent_compose(List<? extends T> list) {
        this.backInfo$delegate.setValue(list);
    }

    public final void setCurrentInfo$navigationevent_compose(T t) {
        this.currentInfo$delegate.setValue(t);
    }

    public final void setForwardInfo$navigationevent_compose(List<? extends T> list) {
        this.forwardInfo$delegate.setValue(list);
    }

    public final void setSourceHandler$navigationevent_compose(NavigationEventHandler<? extends NavigationEventInfo> navigationEventHandler) {
        this.sourceHandler = navigationEventHandler;
    }

    public final void setTransitionState$navigationevent_compose(NavigationEventTransitionState navigationEventTransitionState) {
        this.transitionState$delegate.setValue(navigationEventTransitionState);
    }

    public /* synthetic */ NavigationEventState(NavigationEventInfo navigationEventInfo, List list, List list2, int i2, o oVar) {
        this(navigationEventInfo, (i2 & 2) != 0 ? i.h() : list, (i2 & 4) != 0 ? i.h() : list2);
    }
}
