package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class GridItem implements defpackage.uk {
    public static final int IMAGE_TYPE_ICON = 1;
    public static final int IMAGE_TYPE_LARGE = 2;
    private final androidx.car.app.model.Badge mBadge;
    private final androidx.car.app.model.CarIcon mImage;
    private final int mImageType;
    private final boolean mIndexable;
    private final boolean mIsLoading;
    private final defpackage.uv mOnClickDelegate;
    private final androidx.car.app.model.CarProgressBar mProgressBar;
    private final androidx.car.app.model.CarText mText;
    private final androidx.car.app.model.CarText mTitle;

    public GridItem(defpackage.ub ubVar) {
        boolean z = ubVar.f;
        this.mIsLoading = false;
        this.mTitle = ubVar.a;
        this.mText = ubVar.b;
        this.mImage = ubVar.c;
        this.mImageType = ubVar.d;
        this.mOnClickDelegate = ubVar.e;
        this.mBadge = ubVar.g;
        boolean z2 = ubVar.h;
        this.mIndexable = true;
        androidx.car.app.model.CarProgressBar carProgressBar = ubVar.i;
        this.mProgressBar = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.GridItem)) {
            return false;
        }
        androidx.car.app.model.GridItem gridItem = (androidx.car.app.model.GridItem) obj;
        if (this.mIsLoading == gridItem.mIsLoading && j$.util.Objects.equals(this.mTitle, gridItem.mTitle) && j$.util.Objects.equals(this.mText, gridItem.mText) && j$.util.Objects.equals(this.mImage, gridItem.mImage)) {
            if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(gridItem.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mBadge, gridItem.mBadge) && this.mImageType == gridItem.mImageType && this.mIndexable == gridItem.mIndexable && j$.util.Objects.equals(this.mProgressBar, gridItem.mProgressBar)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Badge getBadge() {
        return this.mBadge;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public defpackage.uv getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public androidx.car.app.model.CarText getText() {
        return this.mText;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.mIsLoading), this.mTitle, this.mImage, java.lang.Integer.valueOf(this.mImageType), java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mBadge, java.lang.Boolean.valueOf(this.mIndexable), this.mProgressBar);
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "[title: " + androidx.car.app.model.CarText.toShortString(this.mTitle) + ", text: " + androidx.car.app.model.CarText.toShortString(this.mText) + ", image: " + this.mImage + ", isLoading: " + this.mIsLoading + ", badge: " + this.mBadge + ", progressBar: " + this.mProgressBar + "]";
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
