package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class GridItem implements Item {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;
    private final Badge mBadge;
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final OnClickDelegate mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CarText mText;
    private final CarText mTitle;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface GridItemImageType {
    }

    GridItem(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mText = builder.mText;
        this.mImage = builder.mImage;
        this.mImageType = builder.mImageType;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mBadge = builder.mBadge;
        this.mIndexable = builder.mIndexable;
        this.mProgressBar = builder.mProgressBar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        if (this.mIsLoading == gridItem.mIsLoading && Objects.equals(this.mTitle, gridItem.mTitle) && Objects.equals(this.mText, gridItem.mText) && Objects.equals(this.mImage, gridItem.mImage)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable && Objects.equals(this.mProgressBar, gridItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    @RequiresCarApi(8)
    public Badge getBadge() {
        return this.mBadge;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    @RequiresCarApi(9)
    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    @RequiresCarApi(8)
    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + ", progressBar: " + this.mProgressBar + "]";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        Badge mBadge;
        CarIcon mImage;
        int mImageType = 2;
        boolean mIndexable = true;
        boolean mIsLoading;
        OnClickDelegate mOnClickDelegate;
        CarProgressBar mProgressBar;
        CarText mText;
        CarText mTitle;

        public GridItem build() {
            boolean z = this.mIsLoading;
            CarIcon carIcon = this.mImage;
            if (z == (carIcon != null)) {
                throw new IllegalStateException("When a grid item is loading, the image must not be set and vice versa");
            }
            if (z && this.mOnClickDelegate != null) {
                throw new IllegalStateException("The click listener must not be set on the grid item when it is loading");
            }
            if (carIcon == null && this.mBadge != null) {
                throw new IllegalStateException("A badge can only be set when a grid item image is also provided");
            }
            if (this.mText == null || this.mProgressBar == null) {
                return new GridItem(this);
            }
            throw new IllegalStateException("Both text and progress bar cannot be set on GridItem");
        }

        public Builder setImage(CarIcon carIcon, int i2) {
            CarIconConstraints.UNCONSTRAINED.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mImage = carIcon;
            this.mImageType = i2;
            return this;
        }

        @RequiresCarApi(8)
        public Builder setIndexable(boolean z) {
            this.mIndexable = z;
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
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

        public Builder setText(CarText carText) {
            this.mText = (CarText) Objects.requireNonNull(carText);
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(this.mText);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            if (charSequence == null) {
                this.mTitle = null;
                return this;
            }
            CarText carTextCreate = CarText.create(charSequence);
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            this.mTitle = carTextCreate;
            return this;
        }

        public Builder setImage(CarIcon carIcon) {
            setImage((CarIcon) Objects.requireNonNull(carIcon), 2);
            return this;
        }

        public Builder setText(CharSequence charSequence) {
            setText(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            return this;
        }

        @RequiresCarApi(8)
        public Builder setImage(CarIcon carIcon, int i2, Badge badge) {
            Objects.requireNonNull(badge);
            this.mBadge = badge;
            setImage((CarIcon) Objects.requireNonNull(carIcon), i2);
            return this;
        }

        public Builder setTitle(CarText carText) {
            if (carText == null) {
                carText = null;
            } else {
                CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carText);
            }
            this.mTitle = carText;
            return this;
        }

        @RequiresCarApi(8)
        public Builder setImage(CarIcon carIcon, Badge badge) {
            Objects.requireNonNull(badge);
            this.mBadge = badge;
            setImage((CarIcon) Objects.requireNonNull(carIcon));
            return this;
        }
    }

    private GridItem() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
        this.mImageType = 2;
        this.mOnClickDelegate = null;
        this.mBadge = null;
        this.mIndexable = true;
        this.mProgressBar = null;
    }
}
