package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Action {
    public static final int FLAG_DEFAULT = 4;
    public static final int FLAG_IS_PERSISTENT = 2;
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_CUSTOM = 1;
    static final int TYPE_STANDARD = 65536;
    private final androidx.car.app.model.CarColor mBackgroundColor;
    private final int mFlags;
    private final androidx.car.app.model.CarIcon mIcon;
    private final boolean mIsEnabled;
    private final defpackage.uv mOnClickDelegate;
    private final androidx.car.app.model.CarText mTitle;
    private final int mType;
    public static final int TYPE_APP_ICON = 65538;
    public static final androidx.car.app.model.Action APP_ICON = new androidx.car.app.model.Action(TYPE_APP_ICON);
    public static final int TYPE_COMPOSE_MESSAGE = 65541;
    public static final androidx.car.app.model.Action COMPOSE_MESSAGE = new androidx.car.app.model.Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;
    public static final androidx.car.app.model.Action BACK = new androidx.car.app.model.Action(TYPE_BACK);
    public static final int TYPE_PAN = 65540;
    public static final androidx.car.app.model.Action PAN = new androidx.car.app.model.Action(TYPE_PAN);
    public static final int TYPE_MEDIA_PLAYBACK = 65542;
    public static final androidx.car.app.model.Action MEDIA_PLAYBACK = new androidx.car.app.model.Action(TYPE_MEDIA_PLAYBACK);

    private Action(int i) {
        if (i == 1) {
            throw new java.lang.IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = androidx.car.app.model.CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public static boolean isStandardActionType(int i) {
        return (i & TYPE_STANDARD) != 0;
    }

    public static java.lang.String typeToString(int i) {
        if (i == 1) {
            return "CUSTOM";
        }
        switch (i) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case TYPE_PAN /* 65540 */:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            case TYPE_MEDIA_PLAYBACK /* 65542 */:
                return "MEDIA_PLAYBACK";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Action)) {
            return false;
        }
        androidx.car.app.model.Action action = (androidx.car.app.model.Action) obj;
        if (j$.util.Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && j$.util.Objects.equals(this.mIcon, action.mIcon)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(action.mOnClickDelegate == null)) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.mFlags), java.lang.Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public defpackage.uv getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, java.lang.Integer.valueOf(this.mType), java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(this.mIcon == null), java.lang.Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    public java.lang.String toString() {
        return "[type: " + typeToString(this.mType) + ", icon: " + this.mIcon + ", bkg: " + this.mBackgroundColor + ", isEnabled: " + this.mIsEnabled + "]";
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = androidx.car.app.model.CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public Action(defpackage.tb tbVar) {
        this.mTitle = tbVar.b;
        this.mIcon = tbVar.c;
        this.mBackgroundColor = tbVar.e;
        this.mOnClickDelegate = tbVar.d;
        this.mType = tbVar.f;
        this.mFlags = tbVar.g;
        this.mIsEnabled = tbVar.a;
    }
}
