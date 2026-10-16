package androidx.car.app.model;

import defpackage.rb;
import defpackage.tf;
import defpackage.uf;
import defpackage.uq;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public final class Banner implements uf {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_SMALL = 2;
    private static final int MAX_TRAILING_ELEMENTS = 2;
    private final List<Action> mBelowActions;
    private final BannerElement mLeadingElement;
    private final uq mOnClickDelegate;
    private final BannerStyle mStyle;
    private final CarText mSubtitle;
    private final CarText mTitle;
    private final List<BannerElement> mTrailingElements;

    Banner(tf tfVar) {
        Object obj = tfVar.a;
        this.mTitle = null;
        Object obj2 = tfVar.b;
        this.mSubtitle = null;
        Object obj3 = tfVar.c;
        this.mOnClickDelegate = null;
        Object obj4 = tfVar.d;
        this.mStyle = null;
        Object obj5 = tfVar.e;
        this.mLeadingElement = null;
        Object obj6 = tfVar.f;
        this.mTrailingElements = DesugarCollections.unmodifiableList(null);
        Object obj7 = tfVar.g;
        this.mBelowActions = DesugarCollections.unmodifiableList(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (Objects.equals(this.mTitle, banner.mTitle) && Objects.equals(this.mSubtitle, banner.mSubtitle)) {
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(banner.mOnClickDelegate == null)) && Objects.equals(this.mStyle, banner.mStyle) && Objects.equals(this.mLeadingElement, banner.mLeadingElement) && Objects.equals(this.mTrailingElements, banner.mTrailingElements) && Objects.equals(this.mBelowActions, banner.mBelowActions)) {
                return true;
            }
        }
        return false;
    }

    public List<Action> getBelowActions() {
        return this.mBelowActions;
    }

    public BannerElement getLeadingElement() {
        return this.mLeadingElement;
    }

    public uq getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public BannerStyle getStyle() {
        return this.mStyle;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public List<BannerElement> getTrailingElements() {
        return this.mTrailingElements;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mSubtitle, Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle, this.mLeadingElement, this.mTrailingElements, this.mBelowActions);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Banner { title: ");
        sb.append(CarText.toShortString(this.mTitle));
        sb.append(", subtitle: ");
        sb.append(CarText.toShortString(this.mSubtitle));
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
        this.mTrailingElements = Collections.EMPTY_LIST;
        this.mBelowActions = Collections.EMPTY_LIST;
    }
}
