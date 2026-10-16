package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class GridItem implements Item {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;
    private final Badge mBadge;
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final OnClickDelegate mOnClickDelegate;
    private final CarText mText;
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        Badge mBadge;
        CarIcon mImage;
        int mImageType = 2;
        boolean mIndexable = true;
        boolean mIsLoading;
        OnClickDelegate mOnClickDelegate;
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
            if (carIcon != null || this.mBadge == null) {
                return new GridItem(this);
            }
            throw new IllegalStateException("A badge can only be set when a grid item image is also provided");
        }

        public Builder setImage(CarIcon carIcon) {
            Objects.requireNonNull(carIcon);
            return setImage(carIcon, 2);
        }

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

        public Builder setText(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mText = carTextCreate;
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(carTextCreate);
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

        public Builder setImage(CarIcon carIcon, Badge badge) {
            Objects.requireNonNull(badge);
            this.mBadge = badge;
            Objects.requireNonNull(carIcon);
            return setImage(carIcon);
        }

        public Builder setText(CarText carText) {
            Objects.requireNonNull(carText);
            this.mText = carText;
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow(carText);
            return this;
        }

        public Builder setImage(CarIcon carIcon, int i, Badge badge) {
            Objects.requireNonNull(badge);
            this.mBadge = badge;
            Objects.requireNonNull(carIcon);
            return setImage(carIcon, i);
        }

        public Builder setTitle(CarText carText) {
            if (carText == null) {
                this.mTitle = null;
                return this;
            }
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carText);
            this.mTitle = carText;
            return this;
        }

        public Builder setImage(CarIcon carIcon, int i) {
            CarIconConstraints carIconConstraints = CarIconConstraints.UNCONSTRAINED;
            Objects.requireNonNull(carIcon);
            carIconConstraints.validateOrThrow(carIcon);
            this.mImage = carIcon;
            this.mImageType = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface GridItemImageType {
    }

    public GridItem(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mTitle = builder.mTitle;
        this.mText = builder.mText;
        this.mImage = builder.mImage;
        this.mImageType = builder.mImageType;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mBadge = builder.mBadge;
        this.mIndexable = builder.mIndexable;
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
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable) {
                return true;
            }
        }
        return false;
    }

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

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, Boolean.valueOf(this.mIndexable));
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + "]";
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
    }
}
