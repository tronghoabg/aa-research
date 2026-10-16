package com.waze.car_lib.n;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f20394a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20395b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20396c;

    public d(String str, String str2, int i2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "label");
        this.f20394a = str;
        this.f20395b = str2;
        this.f20396c = i2;
    }

    public final int a() {
        return this.f20396c;
    }

    public final String b() {
        return this.f20394a;
    }

    public final String c() {
        return this.f20395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f20394a, dVar.f20394a) && h.g.b.x.n(this.f20395b, dVar.f20395b) && this.f20396c == dVar.f20396c;
    }

    public final int hashCode() {
        return (((this.f20394a.hashCode() * 31) + this.f20395b.hashCode()) * 31) + this.f20396c;
    }

    public final String toString() {
        return "CategoryGroup(id=" + this.f20394a + ", label=" + this.f20395b + ", icon=" + this.f20396c + ")";
    }
}
