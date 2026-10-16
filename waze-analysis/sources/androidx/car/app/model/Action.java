package androidx.car.app.model;

import androidx.camera.core.CameraInfo;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
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

    @RequiresCarApi(8)
    public static final int TYPE_MEDIA_PLAYBACK = 65542;

    @RequiresCarApi(8)
    public static final Action MEDIA_PLAYBACK = new Action(TYPE_MEDIA_PLAYBACK);

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionFlag {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    private Action(int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i2;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    static boolean isStandardActionType(int i2) {
        return (i2 & 65536) != 0;
    }

    public static String typeToString(int i2) {
        if (i2 == 1) {
            return "CUSTOM";
        }
        switch (i2) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case 65540:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            case TYPE_MEDIA_PLAYBACK /* 65542 */:
                return "MEDIA_PLAYBACK";
            default:
                return CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
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
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(action.mOnClickDelegate == null)) && Objects.equals(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
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

    /* compiled from: WazeSource */
    public final class Builder {
        CarColor mBackgroundColor;
        int mFlags;
        CarIcon mIcon;
        boolean mIsEnabled;
        OnClickDelegate mOnClickDelegate;
        CarText mTitle;
        int mType;

        @RequiresCarApi(2)
        public Builder(Action action) {
            this.mIsEnabled = true;
            this.mBackgroundColor = CarColor.DEFAULT;
            this.mType = 1;
            this.mFlags = 0;
            Objects.requireNonNull(action);
            this.mType = action.getType();
            this.mIcon = action.getIcon();
            this.mTitle = action.getTitle();
            this.mOnClickDelegate = action.getOnClickDelegate();
            CarColor backgroundColor = action.getBackgroundColor();
            this.mBackgroundColor = backgroundColor == null ? CarColor.DEFAULT : backgroundColor;
            this.mFlags = action.getFlags();
            this.mIsEnabled = action.isEnabled();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.car.app.model.Action build() {
            /*
                r3 = this;
                int r0 = r3.mType
                boolean r0 = androidx.car.app.model.Action.isStandardActionType(r0)
                if (r0 != 0) goto L23
                androidx.car.app.model.CarIcon r0 = r3.mIcon
                if (r0 != 0) goto L23
                androidx.car.app.model.CarText r0 = r3.mTitle
                if (r0 == 0) goto L1b
                java.lang.String r0 = r0.toString()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L1b
                goto L23
            L1b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "An action must have either an icon or a title"
                r3.<init>(r0)
                throw r3
            L23:
                int r0 = r3.mType
                r1 = 65538(0x10002, float:9.1838E-41)
                if (r0 == r1) goto L30
                r1 = 65539(0x10003, float:9.184E-41)
                if (r0 != r1) goto L46
                r0 = r1
            L30:
                androidx.car.app.model.OnClickDelegate r1 = r3.mOnClickDelegate
                if (r1 != 0) goto Lb2
                androidx.car.app.model.CarIcon r0 = r3.mIcon
                if (r0 != 0) goto Laa
                androidx.car.app.model.CarText r0 = r3.mTitle
                if (r0 == 0) goto L46
                java.lang.String r0 = r0.toString()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Laa
            L46:
                int r0 = r3.mType
                r1 = 65540(0x10004, float:9.1841E-41)
                if (r0 != r1) goto L5a
                androidx.car.app.model.OnClickDelegate r0 = r3.mOnClickDelegate
                if (r0 != 0) goto L52
                goto L82
            L52:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "An on-click listener can't be set on the pan mode action"
                r3.<init>(r0)
                throw r3
            L5a:
                r1 = 65541(0x10005, float:9.1843E-41)
                if (r0 != r1) goto L82
                androidx.car.app.model.OnClickDelegate r0 = r3.mOnClickDelegate
                if (r0 != 0) goto L7a
                androidx.car.app.model.CarText r0 = r3.mTitle
                if (r0 == 0) goto L82
                java.lang.String r0 = r0.toString()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L72
                goto L82
            L72:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "A title can't be set on the standard compose action"
                r3.<init>(r0)
                throw r3
            L7a:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "An on-click listener can't be set on the compose action"
                r3.<init>(r0)
                throw r3
            L82:
                int r0 = r3.mType
                r1 = 65542(0x10006, float:9.1844E-41)
                if (r0 != r1) goto La4
                androidx.car.app.model.CarIcon r0 = r3.mIcon
                if (r0 != 0) goto L9c
                androidx.car.app.model.CarText r0 = r3.mTitle
                if (r0 == 0) goto La4
                java.lang.String r0 = r0.toString()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L9c
                goto La4
            L9c:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "MEDIA_PLAYBACK actions cannot have icons or titles"
                r3.<init>(r0)
                throw r3
            La4:
                androidx.car.app.model.Action r0 = new androidx.car.app.model.Action
                r0.<init>(r3)
                return r0
            Laa:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "An icon or title can't be set on the standard back or app-icon action"
                r3.<init>(r0)
                throw r3
            Lb2:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "An on-click listener can't be set on an action of type %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.car.app.model.Action.Builder.build():androidx.car.app.model.Action");
        }

        public Builder setBackgroundColor(CarColor carColor) {
            CarColorConstraints.UNCONSTRAINED.validateOrThrow((CarColor) Objects.requireNonNull(carColor));
            this.mBackgroundColor = carColor;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setEnabled(boolean z) {
            this.mIsEnabled = z;
            return this;
        }

        @RequiresCarApi(4)
        public Builder setFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
            return this;
        }

        public Builder setIcon(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mIcon = carIcon;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            return this;
        }

        public Builder setTitle(CarText carText) {
            this.mTitle = (CarText) Objects.requireNonNull(carText);
            return this;
        }

        public Builder() {
            this.mIsEnabled = true;
            this.mBackgroundColor = CarColor.DEFAULT;
            this.mType = 1;
            this.mFlags = 0;
        }
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

    Action(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mIcon = builder.mIcon;
        this.mBackgroundColor = builder.mBackgroundColor;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mType = builder.mType;
        this.mFlags = builder.mFlags;
        this.mIsEnabled = builder.mIsEnabled;
    }
}
