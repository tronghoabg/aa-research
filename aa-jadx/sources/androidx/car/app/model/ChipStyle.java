package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ChipStyle {
    private final androidx.car.app.model.CarColor mBackgroundColor;
    private final androidx.car.app.model.CarColor mContentColor;
    private final androidx.car.app.model.CarColor mOutlineColor;
    private final androidx.car.app.model.Shape mShape;

    ChipStyle(defpackage.tu tuVar) {
        java.lang.Object obj = tuVar.a;
        this.mBackgroundColor = null;
        java.lang.Object obj2 = tuVar.b;
        this.mContentColor = null;
        java.lang.Object obj3 = tuVar.c;
        this.mOutlineColor = null;
        java.lang.Object obj4 = tuVar.d;
        this.mShape = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.ChipStyle)) {
            return false;
        }
        androidx.car.app.model.ChipStyle chipStyle = (androidx.car.app.model.ChipStyle) obj;
        return j$.util.Objects.equals(this.mBackgroundColor, chipStyle.mBackgroundColor) && j$.util.Objects.equals(this.mContentColor, chipStyle.mContentColor) && j$.util.Objects.equals(this.mOutlineColor, chipStyle.mOutlineColor) && j$.util.Objects.equals(this.mShape, chipStyle.mShape);
    }

    public androidx.car.app.model.CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public androidx.car.app.model.CarColor getContentColor() {
        return this.mContentColor;
    }

    public androidx.car.app.model.CarColor getOutlineColor() {
        return this.mOutlineColor;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mBackgroundColor, this.mContentColor, this.mOutlineColor, this.mShape);
    }

    public java.lang.String toString() {
        return "ChipStyle{backgroundColor=" + this.mBackgroundColor + ", contentColor=" + this.mContentColor + ", outlineColor=" + this.mOutlineColor + ", shape=" + this.mShape + "}";
    }

    private ChipStyle() {
        this.mBackgroundColor = null;
        this.mContentColor = null;
        this.mOutlineColor = null;
        this.mShape = null;
    }
}
