package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f32160a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.at f32161b;

    public bm(Integer num, okhttp3.at atVar) {
        this.f32160a = num;
        this.f32161b = atVar;
    }

    public final Integer a() {
        return this.f32160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return h.g.b.x.n(this.f32160a, bmVar.f32160a) && h.g.b.x.n(this.f32161b, bmVar.f32161b);
    }

    public final int hashCode() {
        int iHashCode = this.f32160a.hashCode() * 31;
        okhttp3.at atVar = this.f32161b;
        return iHashCode + (atVar == null ? 0 : atVar.hashCode());
    }

    public final String toString() {
        return "HttpResponse(code=" + this.f32160a + ", data=" + this.f32161b + ")";
    }
}
