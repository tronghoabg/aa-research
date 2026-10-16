package androidx.car.app.navigation.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Lane {
    private final List<LaneDirection> mDirections;

    /* compiled from: WazeSource */
    public final class Builder {
        private final List<LaneDirection> mDirections = new ArrayList();

        public Builder addDirection(LaneDirection laneDirection) {
            this.mDirections.add((LaneDirection) Objects.requireNonNull(laneDirection));
            return this;
        }

        public Lane build() {
            return new Lane(this.mDirections);
        }
    }

    Lane(List<LaneDirection> list) {
        this.mDirections = CollectionUtils.unmodifiableCopy(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lane) {
            return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
        }
        return false;
    }

    public List<LaneDirection> getDirections() {
        return CollectionUtils.emptyIfNull(this.mDirections);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[direction count: ");
        List<LaneDirection> list = this.mDirections;
        sb.append(list != null ? list.size() : 0);
        sb.append("]");
        return sb.toString();
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
