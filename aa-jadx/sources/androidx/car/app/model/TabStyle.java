package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class TabStyle {
    private final androidx.car.app.model.Shape mShape;

    private TabStyle(defpackage.we weVar) {
        java.lang.Object obj = weVar.a;
        this.mShape = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.TabStyle) {
            return j$.util.Objects.equals(this.mShape, ((androidx.car.app.model.TabStyle) obj).mShape);
        }
        return false;
    }

    public androidx.car.app.model.Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mShape);
    }

    public java.lang.String toString() {
        return "TabStyle { shape: " + this.mShape + " }";
    }

    /* synthetic */ TabStyle(defpackage.we weVar, defpackage.wf wfVar) {
        this(weVar);
    }

    private TabStyle() {
        this.mShape = null;
    }
}
