package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class SectionHeader {
    public static final int IMAGE_TYPE_LARGE = 2;
    public static final int IMAGE_TYPE_SMALL = 1;
    private final androidx.car.app.model.CarIcon mEndIcon;
    private final defpackage.uv mOnClickDelegate;
    private final androidx.car.app.model.CarIcon mStartIcon;
    private final int mStartIconType;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;

    private SectionHeader() {
        this.mTitle = androidx.car.app.model.CarText.create("");
        this.mSubtitle = null;
        this.mStartIcon = null;
        this.mStartIconType = 1;
        this.mEndIcon = null;
        this.mOnClickDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.SectionHeader)) {
            return false;
        }
        androidx.car.app.model.SectionHeader sectionHeader = (androidx.car.app.model.SectionHeader) obj;
        if (j$.util.Objects.equals(this.mTitle, sectionHeader.mTitle) && j$.util.Objects.equals(this.mSubtitle, sectionHeader.mSubtitle) && j$.util.Objects.equals(this.mStartIcon, sectionHeader.mStartIcon) && this.mStartIconType == sectionHeader.mStartIconType && j$.util.Objects.equals(this.mEndIcon, sectionHeader.mEndIcon)) {
            if ((this.mOnClickDelegate == null) == (sectionHeader.mOnClickDelegate == null)) {
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

    public int getStartIconType() {
        return this.mStartIconType;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mSubtitle, this.mStartIcon, java.lang.Integer.valueOf(this.mStartIconType), this.mEndIcon, java.lang.Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionHeader { title: ");
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

    SectionHeader(defpackage.vv vvVar) {
        java.lang.Object obj = vvVar.a;
        throw null;
    }
}
