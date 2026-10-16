package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarColor;

/* loaded from: classes2.dex */
public final class gau implements gbg {
    public final Drawable a;
    private final CarColor b = null;

    public gau(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.gbg
    public final CarColor a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gau)) {
            return false;
        }
        gau gauVar = (gau) obj;
        if (!affa.f(this.a, gauVar.a)) {
            return false;
        }
        CarColor carColor = gauVar.b;
        return affa.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "LazyAppIconUiModel(appIcon=" + this.a + ", tint=null)";
    }
}
