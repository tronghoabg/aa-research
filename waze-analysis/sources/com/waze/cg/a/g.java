package com.waze.cg.a;

import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f22265a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22266b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22267c;

    /* renamed from: d, reason: collision with root package name */
    private final j f22268d;

    public g(String str, long j2, String str2, j jVar) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "matchClock");
        x.f(jVar, NotificationCompat.CATEGORY_EVENT);
        this.f22265a = str;
        this.f22266b = j2;
        this.f22267c = str2;
        this.f22268d = jVar;
    }

    public final long a() {
        return this.f22266b;
    }

    public final j b() {
        return this.f22268d;
    }

    public final String c() {
        return this.f22265a;
    }

    public final String d() {
        return this.f22267c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f22265a, gVar.f22265a) && this.f22266b == gVar.f22266b && x.n(this.f22267c, gVar.f22267c) && x.n(this.f22268d, gVar.f22268d);
    }

    public final int hashCode() {
        return (((((this.f22265a.hashCode() * 31) + a.a.b(this.f22266b)) * 31) + this.f22267c.hashCode()) * 31) + this.f22268d.hashCode();
    }

    public final String toString() {
        return "MatchEvent(id=" + this.f22265a + ", timestampEpochSec=" + this.f22266b + ", matchClock=" + this.f22267c + ", event=" + this.f22268d + ")";
    }
}
