package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class Row implements Item {

    @RequiresCarApi(8)
    public static final int IMAGE_TYPE_EXTRA_SMALL = 8;
    public static final int IMAGE_TYPE_ICON = 4;
    public static final int IMAGE_TYPE_LARGE = 2;

    @RequiresCarApi(8)
    public static final int IMAGE_TYPE_MEDIUM = 16;
    public static final int IMAGE_TYPE_SMALL = 1;
    public static final int NO_DECORATION = -1;
    private static final String YOUR_BOAT = "🚣";
    private final List<Action> mActions;
    private final CarIcon mEndImage;
    private final CarIcon mImage;
    private final boolean mIndexable;
    private final boolean mIsBrowsable;
    private final boolean mIsEnabled;
    private final Metadata mMetadata;
    private final int mNumericDecoration;
    private final OnClickDelegate mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final int mRowEndImageType;
    private final int mRowImageType;
    private final List<CarText> mTexts;
    private final CarText mTitle;
    private final Toggle mToggle;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RowImageType {
    }

    Row(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mTexts = CollectionUtils.unmodifiableCopy(builder.mTexts);
        this.mImage = builder.mImage;
        this.mEndImage = builder.mEndImage;
        this.mActions = CollectionUtils.unmodifiableCopy(builder.mActions);
        this.mNumericDecoration = builder.mDecoration;
        this.mToggle = builder.mToggle;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mMetadata = builder.mMetadata;
        this.mIsBrowsable = builder.mIsBrowsable;
        this.mRowImageType = builder.mRowImageType;
        this.mRowEndImageType = builder.mRowEndImageType;
        this.mIsEnabled = builder.mIsEnabled;
        this.mIndexable = builder.mIndexable;
        this.mProgressBar = builder.mProgressBar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        if (Objects.equals(this.mTitle, row.mTitle) && Objects.equals(this.mTexts, row.mTexts) && Objects.equals(this.mImage, row.mImage) && Objects.equals(this.mEndImage, row.mEndImage) && Objects.equals(this.mToggle, row.mToggle)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(row.mOnClickDelegate == null)) && Objects.equals(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType && this.mRowEndImageType == row.mRowEndImageType && this.mIsEnabled == row.isEnabled() && this.mIndexable == row.mIndexable && Objects.equals(this.mProgressBar, row.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    @RequiresCarApi(6)
    public List<Action> getActions() {
        return this.mActions;
    }

    @RequiresCarApi(8)
    public CarIcon getEndImage() {
        return this.mEndImage;
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

    @RequiresCarApi(9)
    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    @RequiresCarApi(8)
    public int getRowEndImageType() {
        return this.mRowEndImageType;
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
        return Objects.hash(this.mTitle, this.mTexts, this.mImage, this.mEndImage, this.mToggle, Boolean.valueOf(this.mOnClickDelegate == null), this.mMetadata, Boolean.valueOf(this.mIsBrowsable), Integer.valueOf(this.mRowImageType), Integer.valueOf(this.mRowEndImageType), Boolean.valueOf(this.mIsEnabled), Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isBrowsable() {
        return this.mIsBrowsable;
    }

    @RequiresCarApi(5)
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    @RequiresCarApi(8)
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
        sb.append(", endImage: ");
        sb.append(this.mEndImage);
        sb.append(", isBrowsable: ");
        sb.append(this.mIsBrowsable);
        sb.append(", isEnabled: ");
        sb.append(this.mIsEnabled);
        sb.append(", progressBar: ");
        sb.append(this.mProgressBar);
        sb.append("]");
        return sb.toString();
    }

    public CharSequence yourBoat() {
        return YOUR_BOAT;
    }

    public Row row() {
        return this;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        CarIcon mEndImage;
        CarIcon mImage;
        boolean mIsBrowsable;
        OnClickDelegate mOnClickDelegate;
        CarProgressBar mProgressBar;
        CarText mTitle;
        Toggle mToggle;
        boolean mIsEnabled = true;
        final List<CarText> mTexts = new ArrayList();
        final List<Action> mActions = new ArrayList();
        int mDecoration = -1;
        Metadata mMetadata = Metadata.EMPTY_METADATA;
        int mRowImageType = 1;
        int mRowEndImageType = 1;
        boolean mIndexable = true;

        @RequiresCarApi(6)
        public Builder addAction(Action action) {
            ArrayList arrayList = new ArrayList(this.mActions);
            arrayList.add((Action) Objects.requireNonNull(action));
            ActionsConstraints.ACTIONS_CONSTRAINTS_ROW.validateOrThrow(arrayList);
            this.mActions.add(action);
            return this;
        }

        public Builder addText(CharSequence charSequence) {
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            this.mTexts.add(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
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
                if (this.mEndImage != null) {
                    throw new IllegalStateException("A browsable row must not have an end image set");
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
                if (this.mEndImage != null) {
                    throw new IllegalStateException("If a row contains a toggle, it must not have an end image set");
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

        @RequiresCarApi(8)
        public Builder setEndImage(CarIcon carIcon, int i2) {
            CarIconConstraints.UNCONSTRAINED.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mEndImage = carIcon;
            this.mRowEndImageType = i2;
            return this;
        }

        public Builder setImage(CarIcon carIcon, int i2) {
            CarIconConstraints.UNCONSTRAINED.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mImage = carIcon;
            this.mRowImageType = i2;
            return this;
        }

        @RequiresCarApi(8)
        public Builder setIndexable(boolean z) {
            this.mIndexable = z;
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            this.mMetadata = metadata;
            return this;
        }

        @RequiresCarApi(6)
        public Builder setNumericDecoration(int i2) {
            if (i2 < 0 && i2 != -1) {
                throw new IllegalArgumentException(String.format("Decoration should be positive, zero, or equal to NO_DECORATION. Instead, was %d", Integer.valueOf(i2)));
            }
            this.mDecoration = i2;
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

        @RequiresCarApi(9)
        public Builder setProgressBar(CarProgressBar carProgressBar) {
            this.mProgressBar = (CarProgressBar) Objects.requireNonNull(carProgressBar);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            CarText carTextCreate = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            if (carTextCreate.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            this.mTitle = carTextCreate;
            return this;
        }

        public Builder setToggle(Toggle toggle) {
            this.mToggle = (Toggle) Objects.requireNonNull(toggle);
            return this;
        }

        @RequiresCarApi(8)
        public Builder setEndImage(CarIcon carIcon) {
            setEndImage((CarIcon) Objects.requireNonNull(carIcon), 1);
            return this;
        }

        public Builder setImage(CarIcon carIcon) {
            setImage((CarIcon) Objects.requireNonNull(carIcon), 1);
            return this;
        }

        public Builder addText(CarText carText) {
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mTexts.add(carText);
            return this;
        }

        public Builder setTitle(CarText carText) {
            if (!((CarText) Objects.requireNonNull(carText)).isEmpty()) {
                CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carText);
                this.mTitle = carText;
                return this;
            }
            throw new IllegalArgumentException("The title cannot be null or empty");
        }
    }

    private Row() {
        this.mTitle = null;
        this.mTexts = Collections.EMPTY_LIST;
        this.mImage = null;
        this.mEndImage = null;
        this.mActions = Collections.EMPTY_LIST;
        this.mNumericDecoration = -1;
        this.mToggle = null;
        this.mOnClickDelegate = null;
        this.mMetadata = Metadata.EMPTY_METADATA;
        this.mIsBrowsable = false;
        this.mRowImageType = 1;
        this.mRowEndImageType = 1;
        this.mIsEnabled = true;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
