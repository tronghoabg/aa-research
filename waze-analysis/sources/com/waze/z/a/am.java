package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.design_components.b.d f45638a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.b.e f45639b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45640c;

    public am(com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, boolean z) {
        h.g.b.x.f(dVar, "icon");
        h.g.b.x.f(eVar, "iconType");
        this.f45638a = dVar;
        this.f45639b = eVar;
        this.f45640c = z;
    }

    public final com.waze.design_components.b.d a() {
        return this.f45638a;
    }

    public final com.waze.design_components.b.e b() {
        return this.f45639b;
    }

    public final boolean c() {
        return this.f45640c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return this.f45638a == amVar.f45638a && this.f45639b == amVar.f45639b && this.f45640c == amVar.f45640c;
    }

    public final int hashCode() {
        return (((this.f45638a.hashCode() * 31) + this.f45639b.hashCode()) * 31) + a.a.a(this.f45640c);
    }

    public final String toString() {
        return "WazeButtonIconProperties(icon=" + this.f45638a + ", iconType=" + this.f45639b + ", setIconTint=" + this.f45640c + ")";
    }
}
