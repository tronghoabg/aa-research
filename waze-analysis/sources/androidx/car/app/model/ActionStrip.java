package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class ActionStrip {
    private final List<Action> mActions;

    /* compiled from: WazeSource */
    public final class Builder {
        final List<Action> mActions = new ArrayList();
        final Set<Integer> mAddedActionTypes = new HashSet();

        public Builder addAction(Action action) {
            int type = ((Action) Objects.requireNonNull(action)).getType();
            if (type != 1 && this.mAddedActionTypes.contains(Integer.valueOf(type))) {
                java.util.Objects.toString(action);
                throw new IllegalArgumentException("Duplicated action types are disallowed: ".concat(String.valueOf(action)));
            }
            CarText title = action.getTitle();
            if (title != null) {
                CarTextConstraints.CONSERVATIVE.validateOrThrow(title);
            }
            this.mAddedActionTypes.add(Integer.valueOf(type));
            this.mActions.add(action);
            return this;
        }

        public ActionStrip build() {
            if (this.mActions.isEmpty()) {
                throw new IllegalStateException("Action strip must contain at least one action");
            }
            return new ActionStrip(this);
        }
    }

    ActionStrip(Builder builder) {
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List<Action> getActions() {
        return CollectionUtils.emptyIfNull(this.mActions);
    }

    public Action getFirstActionOfType(int i2) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i2) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
