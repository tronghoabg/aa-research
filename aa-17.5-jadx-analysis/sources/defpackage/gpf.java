package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.navigation.model.MapWithContentTemplate;

/* loaded from: classes2.dex */
public final class gpf implements wb {
    public final MapWithContentTemplate a;
    public final Action b;

    public gpf(MapWithContentTemplate mapWithContentTemplate, Action action) {
        this.a = mapWithContentTemplate;
        this.b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpf)) {
            return false;
        }
        gpf gpfVar = (gpf) obj;
        return affa.f(this.a, gpfVar.a) && affa.f(this.b, gpfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Action action = this.b;
        return iHashCode + (action == null ? 0 : action.hashCode());
    }

    public final String toString() {
        return "MapWithContentTemplateWrapper(mapWithContentTemplate=" + this.a + ", navigateAction=" + this.b + ")";
    }
}
