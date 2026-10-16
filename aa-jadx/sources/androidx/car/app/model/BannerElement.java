package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class BannerElement {
    public static final int TYPE_ACTION = 1;
    public static final int TYPE_IMAGE = 2;
    private final androidx.car.app.model.Action mAction;
    private final androidx.car.app.model.CarIcon mImage;
    private final int mImageType;
    private final int mType;

    private BannerElement() {
        this.mType = 1;
        this.mImageType = 2;
        this.mAction = null;
        this.mImage = null;
    }

    public static androidx.car.app.model.BannerElement createForAction(androidx.car.app.model.Action action) {
        action.getClass();
        return new androidx.car.app.model.BannerElement(1, action, null);
    }

    public static androidx.car.app.model.BannerElement createForImageType(androidx.car.app.model.CarIcon carIcon, int i) {
        carIcon.getClass();
        return new androidx.car.app.model.BannerElement(2, i, null, carIcon);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.BannerElement)) {
            return false;
        }
        androidx.car.app.model.BannerElement bannerElement = (androidx.car.app.model.BannerElement) obj;
        return this.mType == bannerElement.mType && this.mImageType == bannerElement.mImageType && j$.util.Objects.equals(this.mAction, bannerElement.mAction) && j$.util.Objects.equals(this.mImage, bannerElement.mImage);
    }

    public androidx.car.app.model.Action getAction() {
        return this.mAction;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public int getImageType() {
        return this.mImageType;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mType), java.lang.Integer.valueOf(this.mImageType), this.mAction, this.mImage);
    }

    public java.lang.String toString() {
        return "BannerElement { type: " + this.mType + ", imageType: " + this.mImageType + ", action: " + this.mAction + ", image: " + this.mImage + " }";
    }

    private BannerElement(int i, int i2, androidx.car.app.model.Action action, androidx.car.app.model.CarIcon carIcon) {
        this.mType = i;
        this.mImageType = i2;
        this.mAction = action;
        this.mImage = carIcon;
    }

    private BannerElement(int i, androidx.car.app.model.Action action, androidx.car.app.model.CarIcon carIcon) {
        this.mType = i;
        this.mImageType = 2;
        this.mAction = action;
        this.mImage = carIcon;
    }
}
