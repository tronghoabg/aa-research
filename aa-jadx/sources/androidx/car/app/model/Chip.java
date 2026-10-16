package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Chip implements defpackage.uk {
    private final androidx.car.app.model.CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final defpackage.uv mOnClickDelegate;
    private final androidx.car.app.model.CarIcon mStartIcon;
    private final androidx.car.app.model.ChipStyle mStyle;
    private final androidx.car.app.model.CarText mTitle;

    Chip(defpackage.ts tsVar) {
        androidx.car.app.model.CarText carText = tsVar.a;
        this.mTitle = null;
        androidx.car.app.model.CarIcon carIcon = tsVar.b;
        this.mStartIcon = null;
        androidx.car.app.model.CarIcon carIcon2 = tsVar.c;
        this.mEndIcon = null;
        boolean z = tsVar.d;
        this.mIsSelected = false;
        defpackage.uv uvVar = tsVar.e;
        this.mOnClickDelegate = null;
        androidx.car.app.model.ChipStyle chipStyle = tsVar.f;
        this.mStyle = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Chip)) {
            return false;
        }
        androidx.car.app.model.Chip chip = (androidx.car.app.model.Chip) obj;
        if (j$.util.Objects.equals(this.mTitle, chip.mTitle) && j$.util.Objects.equals(this.mStartIcon, chip.mStartIcon) && j$.util.Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(chip.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mStyle, chip.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public defpackage.uv getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public androidx.car.app.model.ChipStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mStartIcon, this.mEndIcon, java.lang.Boolean.valueOf(this.mIsSelected), java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle);
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public java.lang.String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + "}";
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
