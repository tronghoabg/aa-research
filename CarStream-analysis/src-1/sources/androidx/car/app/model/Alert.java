package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes.dex */
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final List<Action> mActions;
    private final AlertCallbackDelegate mCallbackDelegate;
    private final long mDuration;
    private final CarIcon mIcon;
    private final int mId;
    private final CarText mSubtitle;
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        List<Action> mActions;
        AlertCallbackDelegate mCallbackDelegate;
        long mDuration;
        CarIcon mIcon;
        int mId;
        CarText mSubtitle;
        CarText mTitle;

        public Builder(int i, CarText carText, long j) {
            if (j <= 0) {
                throw new IllegalArgumentException("Duration should be a positive number.");
            }
            this.mId = i;
            Objects.requireNonNull(carText);
            this.mTitle = carText;
            this.mDuration = j;
            this.mActions = new ArrayList(2);
        }

        public Builder addAction(Action action) {
            if (this.mActions.size() >= 2) {
                throw new IllegalStateException("Cannot add more than 2 actions.");
            }
            this.mActions.add(action);
            return this;
        }

        public Alert build() {
            return new Alert(this);
        }

        public Builder setCallback(AlertCallback alertCallback) {
            Objects.requireNonNull(alertCallback);
            this.mCallbackDelegate = AlertCallbackDelegateImpl.create(alertCallback);
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints carIconConstraints = CarIconConstraints.DEFAULT;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mIcon = carIcon;
            return this;
        }

        public Builder setSubtitle(CarText carText) {
            Objects.requireNonNull(carText);
            this.mSubtitle = carText;
            return this;
        }
    }

    public Alert(Builder builder) {
        this.mId = builder.mId;
        this.mTitle = builder.mTitle;
        this.mSubtitle = builder.mSubtitle;
        this.mIcon = builder.mIcon;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mDuration = builder.mDuration;
        this.mCallbackDelegate = builder.mCallbackDelegate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public AlertCallbackDelegate getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + "]";
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}
