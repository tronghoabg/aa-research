package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkp {
    public final android.content.ComponentName a;
    public final com.google.android.gms.car.display.CarRegionId b;
    public final int c;
    public final int d;
    public final android.graphics.Rect e;
    public final jhq f;
    public final defpackage.jhk g;
    public final defpackage.jik h;
    public final defpackage.jik i;
    public final java.util.List j;
    public final int k;
    public final int l;
    public final com.google.android.gms.car.ProjectionWindowDecorationParams m;
    public final java.util.function.Consumer n;
    public final int o;
    public final int p;
    public final java.util.UUID q;
    public final android.graphics.Rect r;

    public jkp(android.content.ComponentName componentName, com.google.android.gms.car.display.CarRegionId carRegionId, int i, int i2, android.graphics.Rect rect, jhq jhqVar, defpackage.jhk jhkVar, defpackage.jik jikVar, defpackage.jik jikVar2, java.util.List list, int i3, int i4, com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams, java.util.function.Consumer consumer, int i5, int i6, java.util.UUID uuid, android.graphics.Rect rect2) {
        carRegionId.getClass();
        rect.getClass();
        jhqVar.getClass();
        jhkVar.getClass();
        list.getClass();
        projectionWindowDecorationParams.getClass();
        uuid.getClass();
        rect2.getClass();
        this.a = componentName;
        this.b = carRegionId;
        this.c = i;
        this.d = i2;
        this.e = rect;
        this.f = jhqVar;
        this.g = jhkVar;
        this.h = jikVar;
        this.i = jikVar2;
        this.j = list;
        this.k = i3;
        this.l = i4;
        this.m = projectionWindowDecorationParams;
        this.n = consumer;
        this.o = i5;
        this.p = i6;
        this.q = uuid;
        this.r = rect2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jkp)) {
            return false;
        }
        defpackage.jkp jkpVar = (defpackage.jkp) obj;
        return defpackage.afga.f(this.a, jkpVar.a) && defpackage.afga.f(this.b, jkpVar.b) && this.c == jkpVar.c && this.d == jkpVar.d && defpackage.afga.f(this.e, jkpVar.e) && defpackage.afga.f(this.f, jkpVar.f) && defpackage.afga.f(this.g, jkpVar.g) && defpackage.afga.f(this.h, jkpVar.h) && defpackage.afga.f(this.i, jkpVar.i) && defpackage.afga.f(this.j, jkpVar.j) && this.k == jkpVar.k && this.l == jkpVar.l && defpackage.afga.f(this.m, jkpVar.m) && defpackage.afga.f(this.n, jkpVar.n) && this.o == jkpVar.o && this.p == jkpVar.p && defpackage.afga.f(this.q, jkpVar.q) && defpackage.afga.f(this.r, jkpVar.r);
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        int iHashCode = ((((((((((((componentName == null ? 0 : componentName.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        defpackage.jik jikVar = this.h;
        int iHashCode2 = ((iHashCode * 31) + (jikVar == null ? 0 : jikVar.hashCode())) * 31;
        defpackage.jik jikVar2 = this.i;
        int iHashCode3 = (((((((((iHashCode2 + (jikVar2 == null ? 0 : jikVar2.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l) * 31) + this.m.hashCode()) * 31;
        java.util.function.Consumer consumer = this.n;
        return ((((((((iHashCode3 + (consumer != null ? consumer.hashCode() : 0)) * 31) + this.o) * 31) + this.p) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final java.lang.String toString() {
        return "ProjectionWindowCreationParams(componentName=" + this.a + ", carRegionId=" + this.b + ", windowLayer=" + this.c + ", z=" + this.d + ", contentWindowBounds=" + this.e + ", initialContentWindowInsets=" + this.f + ", eventListener=" + this.g + ", enterAnimation=" + this.h + ", exitAnimation=" + this.i + ", regionsCastingInsets=" + this.j + ", insetSideHint=" + this.k + ", insetBehavior=" + this.l + ", windowDecorationParams=" + this.m + ", ghostSurfaceAvailableListener=" + this.n + ", focusFlags=" + this.o + ", visibilityFlags=" + this.p + ", carDisplayConfigurationId=" + this.q + ", insetOverdraw=" + this.r + ")";
    }
}
