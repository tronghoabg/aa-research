package com.waze.cg.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f22272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22274c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22275d;

    public k(String str, String str2, String str3, String str4) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "shortName");
        x.f(str3, "longName");
        x.f(str4, "flagEmoji");
        this.f22272a = str;
        this.f22273b = str2;
        this.f22274c = str3;
        this.f22275d = str4;
    }

    public final String a() {
        return this.f22275d;
    }

    public final String b() {
        return this.f22273b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x.n(this.f22272a, kVar.f22272a) && x.n(this.f22273b, kVar.f22273b) && x.n(this.f22274c, kVar.f22274c) && x.n(this.f22275d, kVar.f22275d);
    }

    public final int hashCode() {
        return (((((this.f22272a.hashCode() * 31) + this.f22273b.hashCode()) * 31) + this.f22274c.hashCode()) * 31) + this.f22275d.hashCode();
    }

    public final String toString() {
        return "Team(id=" + this.f22272a + ", shortName=" + this.f22273b + ", longName=" + this.f22274c + ", flagEmoji=" + this.f22275d + ")";
    }
}
