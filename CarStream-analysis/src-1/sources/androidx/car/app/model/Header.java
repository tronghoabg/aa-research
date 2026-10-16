package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class Header {
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        final List<Action> mEndHeaderActions = new ArrayList();
        Action mStartHeaderAction;
        CarText mTitle;

        public Builder addEndHeaderAction(Action action) {
            List<Action> list = this.mEndHeaderActions;
            Objects.requireNonNull(action);
            list.add(action);
            return this;
        }

        public Header build() {
            if (CarText.isNullOrEmpty(this.mTitle) && this.mStartHeaderAction == null) {
                throw new IllegalStateException("Either the title or start header action must be set");
            }
            return new Header(this);
        }

        public Builder setStartHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mStartHeaderAction = action;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            return setTitle(CarText.create(charSequence));
        }

        public Builder setTitle(CarText carText) {
            Objects.requireNonNull(carText);
            this.mTitle = carText;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carText);
            return this;
        }
    }

    public Header(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mStartHeaderAction = builder.mStartHeaderAction;
        this.mEndHeaderActions = CollectionUtils.unmodifiableCopy(builder.mEndHeaderActions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mEndHeaderActions, this.mStartHeaderAction);
    }

    public String toString() {
        return "Header: " + this.mTitle;
    }

    private Header() {
        this.mTitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
    }
}
