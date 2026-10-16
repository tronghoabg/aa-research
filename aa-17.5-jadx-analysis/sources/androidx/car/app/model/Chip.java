package androidx.car.app.model;

import defpackage.rb;
import defpackage.tn;
import defpackage.uf;
import defpackage.uq;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Chip implements uf {
    private final CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final uq mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final ChipStyle mStyle;
    private final CarText mTitle;

    Chip(tn tnVar) {
        CarText carText = tnVar.a;
        this.mTitle = null;
        CarIcon carIcon = tnVar.b;
        this.mStartIcon = null;
        CarIcon carIcon2 = tnVar.c;
        this.mEndIcon = null;
        boolean z = tnVar.d;
        this.mIsSelected = false;
        uq uqVar = tnVar.e;
        this.mOnClickDelegate = null;
        ChipStyle chipStyle = tnVar.f;
        this.mStyle = null;
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

    public uq getOnClickDelegate() {
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

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }
}
