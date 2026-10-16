package androidx.car.app.model;

import defpackage.rb;
import defpackage.th;
import defpackage.ti;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class BannerStyle {
    private final Background mBackground;
    private final Shape mShape;

    private BannerStyle(th thVar) {
        Shape shape = thVar.a;
        this.mShape = null;
        Background background = thVar.b;
        this.mBackground = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerStyle)) {
            return false;
        }
        BannerStyle bannerStyle = (BannerStyle) obj;
        return Objects.equals(this.mShape, bannerStyle.mShape) && Objects.equals(this.mBackground, bannerStyle.mBackground);
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
        return "BannerStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    /* synthetic */ BannerStyle(th thVar, ti tiVar) {
        this(thVar);
    }

    private BannerStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
