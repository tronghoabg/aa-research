package androidx.car.app.navigation.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Destination {
    private final androidx.car.app.model.CarText mAddress;
    private final androidx.car.app.model.CarIcon mImage;
    private final androidx.car.app.model.CarText mName;

    Destination(defpackage.wz wzVar) {
        java.lang.Object obj = wzVar.a;
        this.mName = null;
        java.lang.Object obj2 = wzVar.b;
        this.mAddress = null;
        java.lang.Object obj3 = wzVar.c;
        this.mImage = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.navigation.model.Destination)) {
            return false;
        }
        androidx.car.app.navigation.model.Destination destination = (androidx.car.app.navigation.model.Destination) obj;
        return j$.util.Objects.equals(this.mName, destination.mName) && j$.util.Objects.equals(this.mAddress, destination.mAddress) && j$.util.Objects.equals(this.mImage, destination.mImage);
    }

    public androidx.car.app.model.CarText getAddress() {
        return this.mAddress;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return this.mImage;
    }

    public androidx.car.app.model.CarText getName() {
        return this.mName;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mName, this.mAddress, this.mImage);
    }

    public java.lang.String toString() {
        return "[name: " + androidx.car.app.model.CarText.toShortString(this.mName) + ", address: " + androidx.car.app.model.CarText.toShortString(this.mAddress) + ", image: " + this.mImage + "]";
    }

    private Destination() {
        this.mName = null;
        this.mAddress = null;
        this.mImage = null;
    }
}
