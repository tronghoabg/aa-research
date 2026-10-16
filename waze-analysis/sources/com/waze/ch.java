package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ch {

    /* renamed from: a, reason: collision with root package name */
    private final ImageTypeToIconMapping$ImageType f22347a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.b.d f22348b;

    public ch(ImageTypeToIconMapping$ImageType imageTypeToIconMapping$ImageType, com.waze.design_components.b.d dVar) {
        h.g.b.x.f(imageTypeToIconMapping$ImageType, "imageType");
        h.g.b.x.f(dVar, "icon");
        this.f22347a = imageTypeToIconMapping$ImageType;
        this.f22348b = dVar;
    }

    public final ImageTypeToIconMapping$ImageType a() {
        return this.f22347a;
    }

    public final com.waze.design_components.b.d b() {
        return this.f22348b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return this.f22347a == chVar.f22347a && this.f22348b == chVar.f22348b;
    }

    public final int hashCode() {
        return (this.f22347a.hashCode() * 31) + this.f22348b.hashCode();
    }

    public final String toString() {
        return "Mapping(imageType=" + this.f22347a + ", icon=" + this.f22348b + ")";
    }
}
