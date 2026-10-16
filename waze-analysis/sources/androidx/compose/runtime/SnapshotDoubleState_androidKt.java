package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotDoubleState_androidKt {
    public static final MutableDoubleState createSnapshotMutableDoubleState(double d2) {
        return new ParcelableSnapshotMutableDoubleState(d2);
    }
}
