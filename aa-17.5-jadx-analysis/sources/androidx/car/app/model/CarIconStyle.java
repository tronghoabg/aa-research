package androidx.car.app.model;

import defpackage.rb;
import defpackage.tk;
import defpackage.tl;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public class CarIconStyle {
    private final Shape mShape;
    private final CarColor mTint;

    private CarIconStyle(tk tkVar) {
        this.mTint = tkVar.a;
        this.mShape = tkVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIconStyle)) {
            return false;
        }
        CarIconStyle carIconStyle = (CarIconStyle) obj;
        return Objects.equals(this.mTint, carIconStyle.mTint) && Objects.equals(this.mShape, carIconStyle.mShape);
    }

    public Shape getShape() {
        return this.mShape;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int hashCode() {
        return Objects.hash(this.mTint, this.mShape);
    }

    public String toString() {
        return "CarIconStyle { tint: " + this.mTint + ", shape: " + this.mShape + " }";
    }

    public /* synthetic */ CarIconStyle(tk tkVar, tl tlVar) {
        this(tkVar);
    }

    private CarIconStyle() {
        this.mTint = null;
        this.mShape = null;
    }
}
