package com.waze.bl.c.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f17024a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17025b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.closure.a.a f17026c;

    public b(String str, String str2, com.waze.closure.a.a aVar) {
        x.f(str, "ordinalId");
        x.f(str2, "referenceName");
        x.f(aVar, TtmlNode.TAG_METADATA);
        this.f17024a = str;
        this.f17025b = str2;
        this.f17026c = aVar;
    }

    public final com.waze.closure.a.a a() {
        return this.f17026c;
    }

    public final String b() {
        return this.f17024a;
    }

    public final String c() {
        return this.f17025b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f17024a, bVar.f17024a) && x.n(this.f17025b, bVar.f17025b) && x.n(this.f17026c, bVar.f17026c);
    }

    public final int hashCode() {
        return (((this.f17024a.hashCode() * 31) + this.f17025b.hashCode()) * 31) + this.f17026c.hashCode();
    }

    public final String toString() {
        return "ReportAgentClosureCandidate(ordinalId=" + this.f17024a + ", referenceName=" + this.f17025b + ", metadata=" + this.f17026c + ")";
    }
}
