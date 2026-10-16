package androidx.activity.compose;

import androidx.navigationevent.NavigationEventInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PredictiveBackHandlerInfo extends NavigationEventInfo {
    private final long compositeKey;
    private final Object owner;

    public PredictiveBackHandlerInfo(Object obj, long j2) {
        this.owner = obj;
        this.compositeKey = j2;
    }

    public static /* synthetic */ PredictiveBackHandlerInfo copy$default(PredictiveBackHandlerInfo predictiveBackHandlerInfo, Object obj, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = predictiveBackHandlerInfo.owner;
        }
        if ((i2 & 2) != 0) {
            j2 = predictiveBackHandlerInfo.compositeKey;
        }
        return predictiveBackHandlerInfo.copy(obj, j2);
    }

    public final Object component1() {
        return this.owner;
    }

    public final long component2() {
        return this.compositeKey;
    }

    public final PredictiveBackHandlerInfo copy(Object obj, long j2) {
        return new PredictiveBackHandlerInfo(obj, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredictiveBackHandlerInfo)) {
            return false;
        }
        PredictiveBackHandlerInfo predictiveBackHandlerInfo = (PredictiveBackHandlerInfo) obj;
        return x.n(this.owner, predictiveBackHandlerInfo.owner) && this.compositeKey == predictiveBackHandlerInfo.compositeKey;
    }

    public final long getCompositeKey() {
        return this.compositeKey;
    }

    public final Object getOwner() {
        return this.owner;
    }

    public int hashCode() {
        return (this.owner.hashCode() * 31) + PredictiveBackHandlerInfo$$ExternalSyntheticBackport0.m(this.compositeKey);
    }

    public String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.owner + ", compositeKey=" + this.compositeKey + ")";
    }
}
