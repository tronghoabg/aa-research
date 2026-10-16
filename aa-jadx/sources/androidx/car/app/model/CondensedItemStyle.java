package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CondensedItemStyle {
    private final androidx.car.app.model.Background mBackground;
    private final androidx.car.app.model.Shape mShape;

    private CondensedItemStyle(defpackage.tx txVar) {
        androidx.car.app.model.Shape shape = txVar.a;
        this.mShape = null;
        androidx.car.app.model.Background background = txVar.b;
        this.mBackground = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.CondensedItemStyle)) {
            return false;
        }
        androidx.car.app.model.CondensedItemStyle condensedItemStyle = (androidx.car.app.model.CondensedItemStyle) obj;
        return j$.util.Objects.equals(this.mShape, condensedItemStyle.mShape) && j$.util.Objects.equals(this.mBackground, condensedItemStyle.mBackground);
    }

    public androidx.car.app.model.Background getBackground() {
        return this.mBackground;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mShape, this.mBackground);
    }

    public java.lang.String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ CondensedItemStyle(defpackage.tx txVar, defpackage.ty tyVar) {
        this(txVar);
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
