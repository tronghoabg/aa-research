package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Background {
    public static final androidx.car.app.model.Background TRANSPARENT;
    private final androidx.car.app.model.CarColor mColor;
    private final androidx.car.app.model.CarIcon mImage;

    static {
        defpackage.ti tiVar = new defpackage.ti();
        androidx.car.app.model.CarColor carColorCreateCustom = androidx.car.app.model.CarColor.createCustom(0, 0);
        defpackage.wn.a.a(carColorCreateCustom);
        tiVar.b = carColorCreateCustom;
        if (tiVar.b == null) {
            throw new java.lang.IllegalStateException("Background must have exactly one property set: either Image or Color.");
        }
        TRANSPARENT = new androidx.car.app.model.Background(tiVar);
    }

    public Background(defpackage.ti tiVar) {
        this.mColor = tiVar.b;
        androidx.car.app.model.CarIcon carIcon = tiVar.a;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Background)) {
            return false;
        }
        androidx.car.app.model.Background background = (androidx.car.app.model.Background) obj;
        return j$.util.Objects.equals(this.mImage, background.mImage) && j$.util.Objects.equals(this.mColor, background.mColor);
    }

    public androidx.car.app.model.CarColor getColor() {
        return this.mColor;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.mImage);
    }

    public java.lang.String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + "]";
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
