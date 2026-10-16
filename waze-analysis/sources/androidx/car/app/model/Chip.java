package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarIconConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class Chip implements Item {
    private final CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final OnClickDelegate mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final ChipStyle mStyle;
    private final CarText mTitle;

    Chip(Builder builder) {
        this.mTitle = builder.mTitle;
        this.mStartIcon = builder.mStartIcon;
        this.mEndIcon = builder.mEndIcon;
        this.mIsSelected = builder.mIsSelected;
        this.mOnClickDelegate = builder.mOnClickDelegate;
        this.mStyle = builder.mStyle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chip)) {
            return false;
        }
        Chip chip = (Chip) obj;
        if (Objects.equals(this.mTitle, chip.mTitle) && Objects.equals(this.mStartIcon, chip.mStartIcon) && Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(chip.mOnClickDelegate == null)) && Objects.equals(this.mStyle, chip.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public OnClickDelegate getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mStartIcon, this.mEndIcon, Boolean.valueOf(this.mIsSelected), Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle);
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + "}";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        CarIcon mEndIcon;
        boolean mIsSelected;
        OnClickDelegate mOnClickDelegate;
        CarIcon mStartIcon;
        ChipStyle mStyle;
        CarText mTitle;

        public Chip build() {
            if (this.mTitle == null && this.mStartIcon == null && this.mEndIcon == null) {
                throw new IllegalStateException("A title, start icon, or end icon must be set for the chip");
            }
            if (this.mOnClickDelegate != null) {
                return new Chip(this);
            }
            throw new IllegalStateException("An OnClickListener must be set");
        }

        public Builder setEndIcon(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mEndIcon = carIcon;
            return this;
        }

        public Builder setOnClickListener(OnClickListener onClickListener) {
            this.mOnClickDelegate = OnClickDelegateImpl.create((OnClickListener) Objects.requireNonNull(onClickListener));
            return this;
        }

        public Builder setSelected(boolean z) {
            this.mIsSelected = z;
            return this;
        }

        public Builder setStartIcon(CarIcon carIcon) {
            CarIconConstraints.DEFAULT.validateOrThrow((CarIcon) Objects.requireNonNull(carIcon));
            this.mStartIcon = carIcon;
            return this;
        }

        public Builder setStyle(ChipStyle chipStyle) {
            this.mStyle = (ChipStyle) Objects.requireNonNull(chipStyle);
            return this;
        }

        public Builder setTitle(CarText carText) {
            CarText carText2 = (CarText) Objects.requireNonNull(carText);
            if (carText2.isEmpty()) {
                throw new IllegalArgumentException("The title cannot be null or empty");
            }
            CarTextConstraints.TEXT_WITH_COLORS.validateOrThrow(carText2);
            this.mTitle = carText2;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            setTitle(CarText.create((CharSequence) Objects.requireNonNull(charSequence)));
            return this;
        }
    }

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }
}
