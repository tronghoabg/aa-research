package androidx.car.app.model;

import defpackage.rb;
import defpackage.uq;
import defpackage.vo;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class SectionHeader {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final CarIcon mEndIcon;
    private final uq mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final int mStartIconType;
    private final CarText mSubtitle;
    private final CarText mTitle;

    private SectionHeader() {
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mStartIcon = null;
        this.mStartIconType = 1;
        this.mEndIcon = null;
        this.mOnClickDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        if (Objects.equals(this.mTitle, sectionHeader.mTitle) && Objects.equals(this.mSubtitle, sectionHeader.mSubtitle) && Objects.equals(this.mStartIcon, sectionHeader.mStartIcon) && this.mStartIconType == sectionHeader.mStartIconType && Objects.equals(this.mEndIcon, sectionHeader.mEndIcon)) {
            if ((this.mOnClickDelegate == null) == (sectionHeader.mOnClickDelegate == null)) {
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

    public int getStartIconType() {
        return this.mStartIconType;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, this.mStartIcon, Integer.valueOf(this.mStartIconType), this.mEndIcon, Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionHeader { title: ");
        sb.append(this.mTitle);
        sb.append(", subtitle: ");
        sb.append(this.mSubtitle);
        sb.append(", startIcon: ");
        sb.append(this.mStartIcon);
        sb.append(", startIconType: ");
        sb.append(this.mStartIconType);
        sb.append(", endIcon: ");
        sb.append(this.mEndIcon);
        sb.append(", hasClickListener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(" }");
        return sb.toString();
    }

    SectionHeader(vo voVar) {
        Object obj = voVar.a;
        throw null;
    }
}
