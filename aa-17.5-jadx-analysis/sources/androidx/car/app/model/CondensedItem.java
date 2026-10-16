package androidx.car.app.model;

import defpackage.rb;
import defpackage.tq;
import defpackage.tr;
import defpackage.uf;
import defpackage.uq;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class CondensedItem implements uf {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 3;
    public static final int IMAGE_TYPE_SMALL = 2;
    private final boolean mIndexable;
    private final CarIcon mLeadingImage;
    private final int mLeadingImageType;
    private final uq mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CondensedItemStyle mStyle;
    private final CarText mText;
    private final CarText mTitle;
    private final CarIcon mTrailingImage;
    private final int mTrailingImageType;

    private CondensedItem(tq tqVar) {
        CarText carText = tqVar.a;
        this.mTitle = null;
        CarText carText2 = tqVar.b;
        this.mText = null;
        CarIcon carIcon = tqVar.c;
        this.mLeadingImage = null;
        int i = tqVar.d;
        this.mLeadingImageType = 0;
        CarIcon carIcon2 = tqVar.e;
        this.mTrailingImage = null;
        int i2 = tqVar.f;
        this.mTrailingImageType = 0;
        CondensedItemStyle condensedItemStyle = tqVar.g;
        this.mStyle = null;
        uq uqVar = tqVar.h;
        this.mOnClickDelegate = null;
        CarProgressBar carProgressBar = tqVar.i;
        this.mProgressBar = null;
        boolean z = tqVar.j;
        this.mIndexable = false;
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

    public uq getOnClickDelegate() {
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

    /* synthetic */ CondensedItem(tq tqVar, tr trVar) {
        this(tqVar);
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
