package defpackage;

import android.content.ComponentName;
import android.graphics.Rect;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class jki {
    public final ComponentName a;
    public final CarRegionId b;
    public final int c;
    public final int d;
    public final Rect e;
    public final Rect f;
    public final jhe g;
    public final jid h;
    public final jid i;
    public final List j;
    public final int k;
    public final int l;
    public final ProjectionWindowDecorationParams m;
    public final Consumer n;
    public final int o;
    public final int p;
    public final UUID q;
    public final Rect r;

    public jki(ComponentName componentName, CarRegionId carRegionId, int i, int i2, Rect rect, Rect rect2, jhe jheVar, jid jidVar, jid jidVar2, List list, int i3, int i4, ProjectionWindowDecorationParams projectionWindowDecorationParams, Consumer consumer, int i5, int i6, UUID uuid, Rect rect3) {
        carRegionId.getClass();
        rect.getClass();
        rect2.getClass();
        jheVar.getClass();
        list.getClass();
        projectionWindowDecorationParams.getClass();
        uuid.getClass();
        rect3.getClass();
        this.a = componentName;
        this.b = carRegionId;
        this.c = i;
        this.d = i2;
        this.e = rect;
        this.f = rect2;
        this.g = jheVar;
        this.h = jidVar;
        this.i = jidVar2;
        this.j = list;
        this.k = i3;
        this.l = i4;
        this.m = projectionWindowDecorationParams;
        this.n = consumer;
        this.o = i5;
        this.p = i6;
        this.q = uuid;
        this.r = rect3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jki)) {
            return false;
        }
        jki jkiVar = (jki) obj;
        return affa.f(this.a, jkiVar.a) && affa.f(this.b, jkiVar.b) && this.c == jkiVar.c && this.d == jkiVar.d && affa.f(this.e, jkiVar.e) && affa.f(this.f, jkiVar.f) && affa.f(this.g, jkiVar.g) && affa.f(this.h, jkiVar.h) && affa.f(this.i, jkiVar.i) && affa.f(this.j, jkiVar.j) && this.k == jkiVar.k && this.l == jkiVar.l && affa.f(this.m, jkiVar.m) && affa.f(this.n, jkiVar.n) && this.o == jkiVar.o && this.p == jkiVar.p && affa.f(this.q, jkiVar.q) && affa.f(this.r, jkiVar.r);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int iHashCode = ((((((((((((componentName == null ? 0 : componentName.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        jid jidVar = this.h;
        int iHashCode2 = ((iHashCode * 31) + (jidVar == null ? 0 : jidVar.hashCode())) * 31;
        jid jidVar2 = this.i;
        int iHashCode3 = (((((((((iHashCode2 + (jidVar2 == null ? 0 : jidVar2.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l) * 31) + this.m.hashCode()) * 31;
        Consumer consumer = this.n;
        return ((((((((iHashCode3 + (consumer != null ? consumer.hashCode() : 0)) * 31) + this.o) * 31) + this.p) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "ProjectionWindowCreationParams(componentName=" + this.a + ", carRegionId=" + this.b + ", windowLayer=" + this.c + ", z=" + this.d + ", contentWindowBounds=" + this.e + ", initialContentWindowInsets=" + this.f + ", eventListener=" + this.g + ", enterAnimation=" + this.h + ", exitAnimation=" + this.i + ", regionsCastingInsets=" + this.j + ", insetSideHint=" + this.k + ", insetBehavior=" + this.l + ", windowDecorationParams=" + this.m + ", ghostSurfaceAvailableListener=" + this.n + ", focusFlags=" + this.o + ", visibilityFlags=" + this.p + ", carDisplayConfigurationId=" + this.q + ", insetOverdraw=" + this.r + ")";
    }
}
