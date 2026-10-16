package androidx.compose.runtime.snapshots;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface StateObject {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.snapshots.StateObject$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static StateRecord $default$mergeRecords(StateObject stateObject, StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
            return null;
        }

        public static /* synthetic */ StateRecord access$mergeRecords$jd(StateObject stateObject, StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static StateRecord mergeRecords(StateObject stateObject, StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
            return null;
        }
    }

    StateRecord getFirstStateRecord();

    StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3);

    void prependStateRecord(StateRecord stateRecord);
}
