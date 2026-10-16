package com.waze.cg.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f22276a;

    /* renamed from: b, reason: collision with root package name */
    private final k f22277b;

    /* renamed from: c, reason: collision with root package name */
    private final k f22278c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22279d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22280e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22281f;

    /* renamed from: g, reason: collision with root package name */
    private final List f22282g;

    public l(String str, k kVar, k kVar2, String str2, String str3, String str4, List list) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(kVar, "homeTeam");
        x.f(kVar2, "awayTeam");
        x.f(str2, "homeScore");
        x.f(str3, "awayScore");
        x.f(str4, "matchClock");
        x.f(list, "events");
        this.f22276a = str;
        this.f22277b = kVar;
        this.f22278c = kVar2;
        this.f22279d = str2;
        this.f22280e = str3;
        this.f22281f = str4;
        this.f22282g = list;
    }

    public final k a() {
        return this.f22278c;
    }

    public final k b() {
        return this.f22277b;
    }

    public final String c() {
        return this.f22280e;
    }

    public final String d() {
        return this.f22279d;
    }

    public final List e() {
        return this.f22282g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return x.n(this.f22276a, lVar.f22276a) && x.n(this.f22277b, lVar.f22277b) && x.n(this.f22278c, lVar.f22278c) && x.n(this.f22279d, lVar.f22279d) && x.n(this.f22280e, lVar.f22280e) && x.n(this.f22281f, lVar.f22281f) && x.n(this.f22282g, lVar.f22282g);
    }

    public final int hashCode() {
        return (((((((((((this.f22276a.hashCode() * 31) + this.f22277b.hashCode()) * 31) + this.f22278c.hashCode()) * 31) + this.f22279d.hashCode()) * 31) + this.f22280e.hashCode()) * 31) + this.f22281f.hashCode()) * 31) + this.f22282g.hashCode();
    }

    public final String toString() {
        return "WazeToGoalState(id=" + this.f22276a + ", homeTeam=" + this.f22277b + ", awayTeam=" + this.f22278c + ", homeScore=" + this.f22279d + ", awayScore=" + this.f22280e + ", matchClock=" + this.f22281f + ", events=" + this.f22282g + ")";
    }
}
