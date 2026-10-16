package androidx.car.app.model;

import defpackage.rb;
import defpackage.ts;
import defpackage.tt;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class CondensedItemStyle {
    private final Background mBackground;
    private final Shape mShape;

    private CondensedItemStyle(ts tsVar) {
        Shape shape = tsVar.a;
        this.mShape = null;
        Background background = tsVar.b;
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItemStyle)) {
            return false;
        }
        CondensedItemStyle condensedItemStyle = (CondensedItemStyle) obj;
        return Objects.equals(this.mShape, condensedItemStyle.mShape) && Objects.equals(this.mBackground, condensedItemStyle.mBackground);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mBackground);
    }

    public String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ CondensedItemStyle(ts tsVar, tt ttVar) {
        this(tsVar);
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
