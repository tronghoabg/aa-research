package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gae implements gag {
    public final Drawable a;
    private final CarColor b = null;

    public gae(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gae)) {
            return false;
        }
        gae gaeVar = (gae) obj;
        if (!affa.f(this.a, gaeVar.a)) {
            return false;
        }
        CarColor carColor = gaeVar.b;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "LazyAppIconInternalModel(appIcon=" + this.a + ", tint=null)";
    }
}
