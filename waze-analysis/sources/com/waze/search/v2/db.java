package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    private final f f36333a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f36334b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36335c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36336d;

    public db(f fVar, Integer num, String str, String str2) {
        h.g.b.x.f(fVar, "backgroundType");
        this.f36333a = fVar;
        this.f36334b = num;
        this.f36335c = str;
        this.f36336d = str2;
    }

    public final f a() {
        return this.f36333a;
    }

    public final Integer b() {
        return this.f36334b;
    }

    public final String c() {
        return this.f36336d;
    }

    public final String d() {
        return this.f36335c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.f36333a == dbVar.f36333a && h.g.b.x.n(this.f36334b, dbVar.f36334b) && h.g.b.x.n(this.f36335c, dbVar.f36335c) && h.g.b.x.n(this.f36336d, dbVar.f36336d);
    }

    public final int hashCode() {
        int iHashCode = this.f36333a.hashCode() * 31;
        Integer num = this.f36334b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f36335c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f36336d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PinParams(backgroundType=" + this.f36333a + ", categoryIconId=" + this.f36334b + ", categoryId=" + this.f36335c + ", categoryGroupId=" + this.f36336d + ")";
    }

    public db() {
        this(f.f36485a, null, null, null);
    }
}
