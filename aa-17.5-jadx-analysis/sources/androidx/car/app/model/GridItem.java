package androidx.car.app.model;

import defpackage.rb;
import defpackage.tw;
import defpackage.uf;
import defpackage.uq;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class GridItem implements uf {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;
    private final Badge mBadge;
    private final CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final uq mOnClickDelegate;
    private final CarProgressBar mProgressBar;
    private final CarText mText;
    private final CarText mTitle;

    public GridItem(tw twVar) {
        boolean z = twVar.f;
        this.mIsLoading = false;
        this.mTitle = twVar.a;
        this.mText = twVar.b;
        this.mImage = twVar.c;
        this.mImageType = twVar.d;
        this.mOnClickDelegate = twVar.e;
        this.mBadge = twVar.g;
        boolean z2 = twVar.h;
        this.mIndexable = true;
        CarProgressBar carProgressBar = twVar.i;
        this.mProgressBar = null;
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
            if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(gridItem.mOnClickDelegate == null)) && Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable && Objects.equals(this.mProgressBar, gridItem.mProgressBar)) {
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

    public uq getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, Integer.valueOf(this.mImageType), Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", text: " + CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + ", progressBar: " + this.mProgressBar + "]";
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
        this.mProgressBar = null;
    }
}
