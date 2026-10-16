package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class Row implements Item {
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final String YOUR_BOAT = "🚣";
    private final List<Action> mActions;
    private final CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final Metadata mMetadata;
    private final int mNumericDecoration;
    private final OnClickDelegate mOnClickDelegate;
    private final int mRowImageType;
    private final List<CarText> mTexts;
    private final CarText mTitle;
    private final Toggle mToggle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarIcon mImage;
        boolean mIsBrowsable;
        OnClickDelegate mOnClickDelegate;
        CarText mTitle;
        Toggle mToggle;
        boolean mIsEnabled = true;
        final List<CarText> mTexts = new ArrayList();
        final List<Action> mActions = new ArrayList();
        int mDecoration = -1;
        Metadata mMetadata = Metadata.EMPTY_METADATA;
        int mRowImageType = 1;
        boolean mIndexable = true;

        @RequiresCarApi(6)
        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            Objects.requireNonNull(action);
            arrayList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_ROW.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public Builder addText(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(CarText.create(charSequence));
            this.mTexts.add(CarText.create(charSequence));
            return this;
        }

        public Row build() {
            if (this.mTitle == null) {
                throw new IllegalStateException("A title must be set on the row");
            }
            if (this.mIsBrowsable) {
                if (this.mToggle != null) {
                    throw new IllegalStateException("A browsable row must not have a toggle set");
                }
                if (this.mOnClickDelegate == null) {
                    throw new IllegalStateException("A browsable row must have its onClickListener set");
                }
                if (!this.mActions.isEmpty()) {
                    throw new IllegalStateException("A browsable row must not have a secondary action set");
                }
            }
            if (this.mToggle != null) {
                if (this.mOnClickDelegate != null) {
                    throw new IllegalStateException("If a row contains a toggle, it must not have an onClickListener set");
                }
                if (this.mDecoration != -1) {
                    throw new IllegalStateException("If a row contains a toggle, it must not have a numeric decoration set");
                }
                if (!this.mActions.isEmpty()) {
                    throw new IllegalStateException("If a row contains a toggle, it must not have a secondary action set");
                }
            }
            return new Row(this);
        }

        public Builder setBrowsable(boolean z) {
            this.mIsBrowsable = z;
            return this;
        }

        @RequiresCarApi(5)
        public Builder setEnabled(boolean z) {
            this.mIsEnabled = z;
            return this;
        }

        public Builder setImage(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            return setImage(carIcon, 1);
        }

        public Builder setIndexable(boolean z) {
            this.mIndexable = z;
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            this.mMetadata = metadata;
            return this;
        }

        @RequiresCarApi(6)
        public Builder setNumericDecoration(int i) {
            if (i < 0 && i != -1) {
                throw new IllegalArgumentException(String.format("Decoration should be positive, zero, or equal to NO_DECORATION. Instead, was %d", Integer.valueOf(i)));
            }
            this.mDecoration = i;
            return this;
        }

        public Builder setOnClickDelegate(OnClickDelegate onClickDelegate) {
            this.mOnClickDelegate = onClickDelegate;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create(onClickListener);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            if (carTextCreate.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            this.mTitle = carTextCreate;
            return this;
        }

        public Builder setToggle(Toggle toggle) {
            Objects.requireNonNull(toggle);
            this.mToggle = toggle;
            return this;
        }

        public Builder setImage(CarIcon carIcon, int i) {
            CarIconConstraints carIconConstraints = CarIconConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mImage = carIcon;
            this.mRowImageType = i;
            return this;
        }

        public Builder addText(CarText carText) {
            CarTextConstraints carTextConstraints = CarTextConstraints.TEXT_WITH_COLORS_AND_ICON;
            Objects.requireNonNull(carText);
            carTextConstraints.validateOrThrow(carText);
            this.mTexts.add(carText);
            return this;
        }

        public Builder setTitle(CarText carText) {
            Objects.requireNonNull(carText);
            if (!carText.isEmpty()) {
                CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carText);
                this.mTitle = carText;
                return this;
            }
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RowImageType {
    }

    public Row(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mTexts = CollectionUtils.unmodifiableCopy(builder.mTexts);
        this.mImage = builder.mImage;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mNumericDecoration = builder.mDecoration;
        this.mToggle = builder.mToggle;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mMetadata = builder.mMetadata;
        this.mIsBrowsable = builder.mIsBrowsable;
        this.mRowImageType = builder.mRowImageType;
        this.mIsEnabled = builder.mIsEnabled;
        this.mIndexable = builder.mIndexable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        if (Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mToggle, row.mToggle)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(row.mOnClickDelegate == null)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable) {
                return true;
            }
        }
        return false;
    }

    @RequiresCarApi(6)
    public List<Action> getActions() {
        return this.mActions;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public Metadata getMetadata() {
        return this.mMetadata;
    }

    @RequiresCarApi(6)
    public int getNumericDecoration() {
        return this.mNumericDecoration;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public int getRowImageType() {
        return this.mRowImageType;
    }

    public List<CarText> getTexts() {
        return CollectionUtils.emptyIfNull(this.mTexts);
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public Toggle getToggle() {
        return this.mToggle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mTexts, this.mImage, this.mToggle, Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, Boolean.valueOf(this.mIsBrowsable), Integer.valueOf(this.mRowImageType), Boolean.valueOf(this.mIsEnabled), Boolean.valueOf(this.mIndexable));
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    @RequiresCarApi(5)
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", text count: ");
        List<CarText> list = this.mTexts;
        sb.append(list != null ? list.size() : 0);
        sb.append(", image: ");
        sb.append(this.mImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append("]");
        return sb.toString();
    }

    public CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    private Row() {
        this.mTitle = null;
        List list = Collections.EMPTY_LIST;
        this.mTexts = list;
        this.mImage = null;
        this.mActions = list;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
    }

    public Row row() {
        return this;
    }
}
