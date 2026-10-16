package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.design_components.button.g f45670a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.button.f f45671b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.design_components.button.e f45672c;

    public ar(com.waze.design_components.button.g gVar, com.waze.design_components.button.f fVar, com.waze.design_components.button.e eVar) {
        h.g.b.x.f(gVar, "buttonType");
        h.g.b.x.f(fVar, "buttonSize");
        h.g.b.x.f(eVar, "buttonSentiment");
        this.f45670a = gVar;
        this.f45671b = fVar;
        this.f45672c = eVar;
    }

    public static /* synthetic */ ar d(ar arVar, com.waze.design_components.button.g gVar) {
        h.g.b.x.f(gVar, "buttonType");
        com.waze.design_components.button.f fVar = arVar.f45671b;
        h.g.b.x.f(fVar, "buttonSize");
        com.waze.design_components.button.e eVar = arVar.f45672c;
        h.g.b.x.f(eVar, "buttonSentiment");
        return new ar(gVar, fVar, eVar);
    }

    public final com.waze.design_components.button.e a() {
        return this.f45672c;
    }

    public final com.waze.design_components.button.f b() {
        return this.f45671b;
    }

    public final com.waze.design_components.button.g c() {
        return this.f45670a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.f45670a == arVar.f45670a && this.f45671b == arVar.f45671b && this.f45672c == arVar.f45672c;
    }

    public final int hashCode() {
        return (((this.f45670a.hashCode() * 31) + this.f45671b.hashCode()) * 31) + this.f45672c.hashCode();
    }

    public final String toString() {
        return "WazeButtonProperties(buttonType=" + this.f45670a + ", buttonSize=" + this.f45671b + ", buttonSentiment=" + this.f45672c + ")";
    }
}
