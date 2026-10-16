package com.waze;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    private final String f25151a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25152b;

    public li(String str, String str2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "label");
        this.f25151a = str;
        this.f25152b = str2;
    }

    public final String a() {
        return this.f25151a;
    }

    public final String b() {
        return this.f25152b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return h.g.b.x.n(this.f25151a, liVar.f25151a) && h.g.b.x.n(this.f25152b, liVar.f25152b);
    }

    public final int hashCode() {
        return (this.f25151a.hashCode() * 31) + this.f25152b.hashCode();
    }

    public final String toString() {
        return "VenueCategoryGroup(id=" + this.f25151a + ", label=" + this.f25152b + ")";
    }
}
