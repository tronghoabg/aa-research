package defpackage;

import androidx.car.app.model.CarColor;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gat implements gbg {
    public final CarColor a;
    private final int b = R.drawable.media_icon_animation;

    public gat(CarColor carColor) {
        this.a = carColor;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gat)) {
            return false;
        }
        gat gatVar = (gat) obj;
        int i = gatVar.b;
        return affa.f(this.a, gatVar.a);
    }

    public final int hashCode() {
        CarColor carColor = this.a;
        return (carColor == null ? 0 : carColor.hashCode()) + 1643709127;
    }

    public final String toString() {
        return "LazyAnimatedIconUiModel(resId=2131232857, tint=" + this.a + ")";
    }
}
