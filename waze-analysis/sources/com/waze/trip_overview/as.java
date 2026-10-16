package com.waze.trip_overview;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final String f41015a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41016b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41017c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41018d;

    public as(String str, String str2, boolean z, String str3) {
        h.g.b.x.f(str, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(str2, "destination");
        this.f41015a = str;
        this.f41016b = str2;
        this.f41017c = z;
        this.f41018d = str3;
    }

    public final String a() {
        return this.f41018d;
    }

    public final String b() {
        return this.f41016b;
    }

    public final String c() {
        return this.f41015a;
    }

    public final boolean d() {
        return this.f41017c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return h.g.b.x.n(this.f41015a, asVar.f41015a) && h.g.b.x.n(this.f41016b, asVar.f41016b) && this.f41017c == asVar.f41017c && h.g.b.x.n(this.f41018d, asVar.f41018d);
    }

    public final int hashCode() {
        int iHashCode = (this.f41015a.hashCode() * 31) + this.f41016b.hashCode();
        String str = this.f41018d;
        return (((iHashCode * 31) + a.a.a(this.f41017c)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RouteHeaderData(origin=" + this.f41015a + ", destination=" + this.f41016b + ", showTimeToLeave=" + this.f41017c + ", departureTimeText=" + this.f41018d + ")";
    }
}
