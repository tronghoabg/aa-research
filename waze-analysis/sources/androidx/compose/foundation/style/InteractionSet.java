package androidx.compose.foundation.style;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.interaction.Interaction;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class InteractionSet<T extends Interaction> {
    private Object setOrValue;

    public final void add(T t) {
        Object obj = this.setOrValue;
        if (obj == null) {
            this.setOrValue = t;
        } else if (obj instanceof MutableScatterSet) {
            ((MutableScatterSet) obj).add(t);
        } else {
            if (x.n(obj, t)) {
                return;
            }
            this.setOrValue = ScatterSetKt.mutableScatterSetOf((Interaction) obj, t);
        }
    }

    public final boolean isNotEmpty() {
        return this.setOrValue != null;
    }

    public final void remove(T t) {
        Object obj = this.setOrValue;
        if (x.n(obj, t)) {
            this.setOrValue = null;
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            mutableScatterSet.remove(t);
            int size = mutableScatterSet.getSize();
            if (size == 0) {
                this.setOrValue = null;
            } else {
                if (size != 1) {
                    return;
                }
                this.setOrValue = mutableScatterSet.first();
            }
        }
    }
}
