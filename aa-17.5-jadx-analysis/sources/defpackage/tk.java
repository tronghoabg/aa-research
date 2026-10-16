package defpackage;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIconStyle;
import androidx.car.app.model.Shape;

/* loaded from: classes2.dex */
public final class tk {
    public CarColor a;
    public final Shape b;

    public tk(CarIconStyle carIconStyle) {
        this.a = carIconStyle.getTint();
        this.b = carIconStyle.getShape();
    }

    public final CarIconStyle a() {
        if (this.a == null && this.b == null) {
            throw new IllegalStateException("Either a tint or a shape must be set for a CarIconStyle");
        }
        return new CarIconStyle(this, null);
    }

    public final void b(CarColor carColor) {
        wg.a.a(carColor);
        this.a = carColor;
    }

    public tk() {
        this.a = null;
        this.b = null;
    }
}
