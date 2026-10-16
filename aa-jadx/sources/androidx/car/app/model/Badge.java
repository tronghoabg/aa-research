package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class Badge {
    private final androidx.car.app.model.CarColor mDotColor;
    private final boolean mHasDot;
    private final androidx.car.app.model.CarIcon mIcon;
    private final androidx.car.app.model.CarColor mIconBackgroundColor;

    public Badge(defpackage.tj tjVar) {
        this.mHasDot = tjVar.a;
        this.mDotColor = (androidx.car.app.model.CarColor) tjVar.b;
        this.mIcon = (androidx.car.app.model.CarIcon) tjVar.c;
        java.lang.Object obj = tjVar.d;
        this.mIconBackgroundColor = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Badge)) {
            return false;
        }
        androidx.car.app.model.Badge badge = (androidx.car.app.model.Badge) obj;
        return this.mHasDot == badge.mHasDot && j$.util.Objects.equals(this.mDotColor, badge.mDotColor) && j$.util.Objects.equals(this.mIcon, badge.mIcon) && j$.util.Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor);
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public androidx.car.app.model.CarColor getDotColor() {
        return this.mDotColor;
    }

    public androidx.car.app.model.CarIcon getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public java.lang.String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + "]";
    }

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }
}
