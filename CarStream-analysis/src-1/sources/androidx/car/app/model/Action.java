package androidx.car.app.model;

import android.text.TextUtils;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Action {

    @RequiresCarApi(5)
    public static final int FLAG_DEFAULT = 4;

    @RequiresCarApi(5)
    public static final int FLAG_IS_PERSISTENT = 2;

    @RequiresCarApi(4)
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_PAN = 65540;
    static final int TYPE_STANDARD = 65536;
    private final CarColor mBackgroundColor;
    private final int mFlags;
    private final CarIcon mIcon;
    private final boolean mIsEnabled;
    private final OnClickDelegate mOnClickDelegate;
    private final CarText mTitle;
    private final int mType;
    public static final int TYPE_APP_ICON = 65538;
    public static final Action APP_ICON = new Action(TYPE_APP_ICON);

    @RequiresCarApi(7)
    public static final int TYPE_COMPOSE_MESSAGE = 65541;

    @RequiresCarApi(7)
    public static final Action COMPOSE_MESSAGE = new Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;
    public static final Action BACK = new Action(TYPE_BACK);
    public static final Action PAN = new Action(65540);

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionFlag {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarColor mBackgroundColor;
        int mFlags;
        CarIcon mIcon;
        boolean mIsEnabled;
        OnClickDelegate mOnClickDelegate;
        CarText mTitle;
        int mType;

        public Builder() {
            this.mIsEnabled = true;
            this.mBackgroundColor = CarColor.DEFAULT;
            this.mType = 1;
            this.mFlags = 0;
        }

        public Action build() {
            CarText carText;
            CarText carText2;
            if (!Action.isStandardActionType(this.mType) && this.mIcon == null && ((carText2 = this.mTitle) == null || TextUtils.isEmpty(carText2.toString()))) {
                throw new IllegalStateException("An action must have either an icon or a title");
            }
            int i = this.mType;
            if (i == 65538 || i == 65539) {
                if (this.mOnClickDelegate != null) {
                    throw new IllegalStateException(ad.b(i, "An on-click listener can't be set on an action of type "));
                }
                if (this.mIcon != null || ((carText = this.mTitle) != null && !TextUtils.isEmpty(carText.toString()))) {
                    throw new IllegalStateException("An icon or title can't be set on the standard back or app-icon action");
                }
            }
            int i2 = this.mType;
            if (i2 == 65540 && this.mOnClickDelegate != null) {
                throw new IllegalStateException("An on-click listener can't be set on the pan mode action");
            }
            if (i2 == 65541) {
                if (this.mOnClickDelegate != null) {
                    throw new IllegalStateException("An on-click listener can't be set on the compose action");
                }
                CarText carText3 = this.mTitle;
                if (carText3 != null && !TextUtils.isEmpty(carText3.toString())) {
                    throw new IllegalStateException("A title can't be set on the standard compose action");
                }
            }
            return new Action(this);
        }

        public Builder setBackgroundColor(CarColor carColor) {
            CarColorConstraints carColorConstraints = CarColorConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carColor);
            carColorConstraints.validateOrThrow(carColor);
            this.mBackgroundColor = carColor;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setEnabled(boolean z) {
            this.mIsEnabled = z;
            return this;
        }

        @RequiresCarApi(4)
        public Builder setFlags(int i) {
            this.mFlags = i | this.mFlags;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints carIconConstraints = CarIconConstraints.DEFAULT;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mIcon = carIcon;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mTitle = CarText.create(charSequence);
            return this;
        }

        public Builder setTitle(CarText carText) {
            Objects.requireNonNull(carText);
            this.mTitle = carText;
            return this;
        }

        @RequiresCarApi(2)
        public Builder(Action action) {
            this.mIsEnabled = true;
            CarColor carColor = CarColor.DEFAULT;
            this.mBackgroundColor = carColor;
            this.mType = 1;
            this.mFlags = 0;
            Objects.requireNonNull(action);
            this.mType = action.getType();
            this.mIcon = action.getIcon();
            this.mTitle = action.getTitle();
            this.mOnClickDelegate = action.getOnClickDelegate();
            CarColor backgroundColor = action.getBackgroundColor();
            this.mBackgroundColor = backgroundColor != null ? backgroundColor : carColor;
            this.mFlags = action.getFlags();
            this.mIsEnabled = action.isEnabled();
        }
    }

    private Action(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public static boolean isStandardActionType(int i) {
        return (i & 65536) != 0;
    }

    public static String typeToString(int i) {
        if (i == 1) {
            return "CUSTOM";
        }
        switch (i) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case 65540:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(action.mOnClickDelegate == null)) && Integer.valueOf(this.mFlags).equals(Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @RequiresCarApi(4)
    public int getFlags() {
        return this.mFlags;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Integer.valueOf(this.mType), Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(this.mIcon == null), Boolean.valueOf(this.mIsEnabled));
    }

    @RequiresCarApi(5)
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", icon: " + this.mIcon + ", bkg: " + this.mBackgroundColor + ", isEnabled: " + this.mIsEnabled + "]";
    }

    public Action(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mIcon = builder.mIcon;
        this.mBackgroundColor = builder.mBackgroundColor;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mType = builder.mType;
        this.mFlags = builder.mFlags;
        this.mIsEnabled = builder.mIsEnabled;
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
