package com.waze.o.c.b;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.i f32796a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32797b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.waze.av.b.i iVar, String str, String str2) {
        super(null);
        h.g.b.x.f(iVar, "favoriteType");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "venueId");
        this.f32796a = iVar;
        this.f32797b = str;
        this.f32798c = str2;
    }

    public final com.waze.av.b.i a() {
        return this.f32796a;
    }

    public final String b() {
        return this.f32797b;
    }

    public final String c() {
        return this.f32798c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f32796a == gVar.f32796a && h.g.b.x.n(this.f32797b, gVar.f32797b) && h.g.b.x.n(this.f32798c, gVar.f32798c);
    }

    public final int hashCode() {
        return (((this.f32796a.hashCode() * 31) + this.f32797b.hashCode()) * 31) + this.f32798c.hashCode();
    }

    public final String toString() {
        return "Add(favoriteType=" + this.f32796a + ", name=" + this.f32797b + ", venueId=" + this.f32798c + ")";
    }
}
