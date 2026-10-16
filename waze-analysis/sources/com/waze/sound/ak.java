package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f39435a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39436b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39437c;

    public ak(String str, String str2, String str3) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(str2, "url");
        h.g.b.x.f(str3, "cacheKey");
        this.f39435a = str;
        this.f39436b = str2;
        this.f39437c = str3;
    }

    public final String a() {
        return this.f39437c;
    }

    public final String b() {
        return this.f39435a;
    }

    public final String c() {
        return this.f39436b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f39435a, akVar.f39435a) && h.g.b.x.n(this.f39436b, akVar.f39436b) && h.g.b.x.n(this.f39437c, akVar.f39437c);
    }

    public final int hashCode() {
        return (((this.f39435a.hashCode() * 31) + this.f39436b.hashCode()) * 31) + this.f39437c.hashCode();
    }

    public final String toString() {
        return "Chunk(text=" + this.f39435a + ", url=" + this.f39436b + ", cacheKey=" + this.f39437c + ")";
    }
}
