package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class ActionStrip {
    private final List<Action> mActions;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        final List<Action> mActions = new ArrayList();
        final Set<Integer> mAddedActionTypes = new HashSet();

        public Builder addAction(Action action) {
            Objects.requireNonNull(action);
            int type = action.getType();
            if (type != 1 && this.mAddedActionTypes.contains(Integer.valueOf(type))) {
                throw new IllegalArgumentException("Duplicated action types are disallowed: " + action);
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

    public ActionStrip(Builder builder) {
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

    public Action getFirstActionOfType(int i) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i) {
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
