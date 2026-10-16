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
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class CondensedItem implements Item {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_SMALL = 2;
    private final boolean mIndexable;
    private final CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final OnClickDelegate mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CondensedItemStyle mStyle;
    private final CarText mText;
    private final CarText mTitle;
    private final CarIcon mTrailingImage;
    private final int mTrailingImageType;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CondensedItemImageType {
    }

    private CondensedItem(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mText = builder.mText;
        this.mLeadingImage = builder.mLeadingImage;
        this.mLeadingImageType = builder.mLeadingImageType;
        this.mTrailingImage = builder.mTrailingImage;
        this.mTrailingImageType = builder.mTrailingImageType;
        this.mStyle = builder.mStyle;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mProgressBar = builder.mProgressBar;
        this.mIndexable = builder.mIndexable;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItem)) {
            return false;
        }
        CondensedItem condensedItem = (CondensedItem) obj;
        if (Objects.equals(this.mTitle, condensedItem.mTitle) && Objects.equals(this.mText, condensedItem.mText) && Objects.equals(this.mLeadingImage, condensedItem.mLeadingImage) && this.mLeadingImageType == condensedItem.mLeadingImageType && Objects.equals(this.mTrailingImage, condensedItem.mTrailingImage) && this.mTrailingImageType == condensedItem.mTrailingImageType && Objects.equals(this.mStyle, condensedItem.mStyle)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(condensedItem.mOnClickDelegate == null)) && this.mIndexable == condensedItem.mIndexable && Objects.equals(this.mProgressBar, condensedItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getLeadingImage() {
        return this.mLeadingImage;
    }

    public int getLeadingImageType() {
        return this.mLeadingImageType;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CondensedItemStyle getStyle() {
        return this.mStyle;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public CarIcon getTrailingImage() {
        return this.mTrailingImage;
    }

    public int getTrailingImageType() {
        return this.mTrailingImageType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mLeadingImage, Integer.valueOf(this.mLeadingImageType), this.mTrailingImage, Integer.valueOf(this.mTrailingImageType), this.mStyle, this.mOnClickDelegate, this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public String toString() {
        return "CondensedItem { title: " + this.mTitle + ", text: " + this.mText + ", leadingImage: " + this.mLeadingImage + ", leadingImageType: " + this.mLeadingImageType + ", trailingImage: " + this.mTrailingImage + ", trailingImageType: " + this.mTrailingImageType + ", style: " + this.mStyle + ", onClickDelegate: " + this.mOnClickDelegate + ", progressBar: " + this.mProgressBar + " }";
    }

    /* compiled from: WazeSource */
    @RequiresCarApi(9)
    public final class Builder {
        CarIcon mLeadingImage;
        OnClickDelegate mOnClickDelegate;
        CarProgressBar mProgressBar;
        CondensedItemStyle mStyle;
        CarText mText;
        CarText mTitle;
        CarIcon mTrailingImage;
        int mLeadingImageType = 2;
        int mTrailingImageType = 2;
        boolean mIndexable = true;

        public CondensedItem build() {
            if (this.mTitle == null && this.mText == null && this.mLeadingImage == null && this.mTrailingImage == null) {
                throw new IllegalStateException("At least one of title, text, leading image, or trailing image must be set");
            }
            if (this.mText == null || this.mProgressBar == null) {
                return new CondensedItem(this);
            }
            throw new IllegalStateException("Both text and progress bar cannot be set on CondensedItem");
        }

        public Builder setIndexable(boolean z) {
            this.mIndexable = z;
            return this;
        }

        public Builder setLeadingImage(CarIcon carIcon, int i2) {
            CarIconConstraints.UNCONSTRAINED.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mLeadingImage = carIcon;
            this.mLeadingImageType = i2;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create((OnClickListener) Objects.requireNonNull(onClickListener));
            return this;
        }

        public Builder setProgressBar(CarProgressBar carProgressBar) {
            this.mProgressBar = (CarProgressBar) Objects.requireNonNull(carProgressBar);
            return this;
        }

        public Builder setStyle(CondensedItemStyle condensedItemStyle) {
            this.mStyle = (CondensedItemStyle) Objects.requireNonNull(condensedItemStyle);
            return this;
        }

        public Builder setText(CarText carText) {
            CarTextConstraints.TEXT_WITH_COLORS_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mText = carText;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            CarText carTextCreate = CarText.create((CharSequence) Objects.requireNonNull(charSequence));
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carTextCreate);
            this.mTitle = carTextCreate;
            return this;
        }

        public Builder setTrailingImage(CarIcon carIcon, int i2) {
            CarIconConstraints.UNCONSTRAINED.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mTrailingImage = carIcon;
            this.mTrailingImageType = i2;
            return this;
        }

        public Builder setText(CharSequence charSequence) {
            setText(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            return this;
        }

        public Builder setLeadingImage(CarIcon carIcon) {
            setLeadingImage((CarIcon) Objects.requireNonNull(carIcon), 2);
            return this;
        }

        public Builder setTrailingImage(CarIcon carIcon) {
            setTrailingImage((CarIcon) Objects.requireNonNull(carIcon), 2);
            return this;
        }

        public Builder setTitle(CarText carText) {
            CarTextConstraints.TEXT_AND_ICON.validateOrThrow((CarText) Objects.requireNonNull(carText));
            this.mTitle = carText;
            return this;
        }
    }

    private CondensedItem() {
        this.mTitle = null;
        this.mText = null;
        this.mLeadingImage = null;
        this.mLeadingImageType = 2;
        this.mTrailingImage = null;
        this.mTrailingImageType = 2;
        this.mStyle = null;
        this.mOnClickDelegate = null;
        this.mProgressBar = null;
        this.mIndexable = true;
    }
}
