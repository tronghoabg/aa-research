package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Banner implements defpackage.uk {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_SMALL = 2;
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final java.util.List<androidx.car.app.model.Action> mBelowActions;
    private final androidx.car.app.model.BannerElement mLeadingElement;
    private final defpackage.uv mOnClickDelegate;
    private final androidx.car.app.model.BannerStyle mStyle;
    private final androidx.car.app.model.CarText mSubtitle;
    private final androidx.car.app.model.CarText mTitle;
    private final java.util.List<androidx.car.app.model.BannerElement> mTrailingElements;

    Banner(defpackage.tk tkVar) {
        java.lang.Object obj = tkVar.a;
        this.mTitle = null;
        java.lang.Object obj2 = tkVar.b;
        this.mSubtitle = null;
        java.lang.Object obj3 = tkVar.c;
        this.mOnClickDelegate = null;
        java.lang.Object obj4 = tkVar.d;
        this.mStyle = null;
        java.lang.Object obj5 = tkVar.e;
        this.mLeadingElement = null;
        java.lang.Object obj6 = tkVar.f;
        this.mTrailingElements = j$.util.DesugarCollections.unmodifiableList(null);
        java.lang.Object obj7 = tkVar.g;
        this.mBelowActions = j$.util.DesugarCollections.unmodifiableList(null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Banner)) {
            return false;
        }
        androidx.car.app.model.Banner banner = (androidx.car.app.model.Banner) obj;
        if (j$.util.Objects.equals(this.mTitle, banner.mTitle) && j$.util.Objects.equals(this.mSubtitle, banner.mSubtitle)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(banner.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mStyle, banner.mStyle) && j$.util.Objects.equals(this.mLeadingElement, banner.mLeadingElement) && j$.util.Objects.equals(this.mTrailingElements, banner.mTrailingElements) && j$.util.Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                return true;
            }
        }
        return false;
    }

    public java.util.List<androidx.car.app.model.Action> getBelowActions() {
        return this.mBelowActions;
    }

    public androidx.car.app.model.BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public defpackage.uv getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.BannerStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getSubtitle() {
        return this.mSubtitle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public java.util.List<androidx.car.app.model.BannerElement> getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mTitle, this.mSubtitle, java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Banner { title: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(androidx.car.app.model.CarText.toShortString(this.mSubtitle));
        sb.append(", has click listener: ");
        sb.append(this.mOnClickDelegate != null);
        sb.append(", style: ");
        sb.append(this.mStyle);
        sb.append(", leading element: ");
        sb.append(this.mLeadingElement);
        sb.append(", trailing elements: ");
        sb.append(this.mTrailingElements);
        sb.append(", below actions: ");
        sb.append(this.mBelowActions);
        sb.append(" }");
        return sb.toString();
    }

    private Banner() {
        this.mTitle = null;
        this.mSubtitle = null;
        this.mOnClickDelegate = null;
        this.mStyle = null;
        this.mLeadingElement = null;
        this.mTrailingElements = java.util.Collections.EMPTY_LIST;
        this.mBelowActions = java.util.Collections.EMPTY_LIST;
    }
}
