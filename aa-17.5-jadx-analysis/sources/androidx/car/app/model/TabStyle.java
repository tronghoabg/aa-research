package androidx.car.app.model;

import defpackage.rb;
import defpackage.vx;
import defpackage.vy;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class TabStyle {
    private final Shape mShape;

    private TabStyle(vx vxVar) {
        Object obj = vxVar.a;
        this.mShape = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabStyle) {
            return Objects.equals(this.mShape, ((TabStyle) obj).mShape);
        }
        return false;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape);
    }

    public String toString() {
        return "TabStyle { shape: " + this.mShape + " }";
    }

    /* synthetic */ TabStyle(vx vxVar, vy vyVar) {
        this(vxVar);
    }

    private TabStyle() {
        this.mShape = null;
    }
}
