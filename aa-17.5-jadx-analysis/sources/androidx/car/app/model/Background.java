package androidx.car.app.model;

import defpackage.rb;
import defpackage.td;
import defpackage.wg;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Background {
    public static final Background TRANSPARENT;
    private final CarColor mColor;
    private final CarIcon mImage;

    static {
        td tdVar = new td();
        CarColor carColorCreateCustom = CarColor.createCustom(0, 0);
        wg.a.a(carColorCreateCustom);
        tdVar.b = carColorCreateCustom;
        if (tdVar.b == null) {
            throw new IllegalStateException("Background must have exactly one property set: either Image or Color.");
        }
        TRANSPARENT = new Background(tdVar);
    }

    public Background(td tdVar) {
        this.mColor = tdVar.b;
        CarIcon carIcon = tdVar.a;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Objects.equals(this.mImage, background.mImage) && Objects.equals(this.mColor, background.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mImage);
    }

    public String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + "]";
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
