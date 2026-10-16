package androidx.activity.compose;

import androidx.navigationevent.NavigationEventInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BackHandlerInfo extends NavigationEventInfo {
    private final long compositeKey;
    private final Object owner;

    public BackHandlerInfo(Object obj, long j2) {
        this.owner = obj;
        this.compositeKey = j2;
    }

    public static /* synthetic */ BackHandlerInfo copy$default(BackHandlerInfo backHandlerInfo, Object obj, long j2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = backHandlerInfo.owner;
        }
        if ((i2 & 2) != 0) {
            j2 = backHandlerInfo.compositeKey;
        }
        return backHandlerInfo.copy(obj, j2);
    }

    public final Object component1() {
        return this.owner;
    }

    public final long component2() {
        return this.compositeKey;
    }

    public final BackHandlerInfo copy(Object obj, long j2) {
        return new BackHandlerInfo(obj, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackHandlerInfo)) {
            return false;
        }
        BackHandlerInfo backHandlerInfo = (BackHandlerInfo) obj;
        return x.n(this.owner, backHandlerInfo.owner) && this.compositeKey == backHandlerInfo.compositeKey;
    }

    public final long getCompositeKey() {
        return this.compositeKey;
    }

    public final Object getOwner() {
        return this.owner;
    }

    public int hashCode() {
        return (this.owner.hashCode() * 31) + BackHandlerInfo$$ExternalSyntheticBackport0.m(this.compositeKey);
    }

    public String toString() {
        return "BackHandlerInfo(owner=" + this.owner + ", compositeKey=" + this.compositeKey + ")";
    }
}
