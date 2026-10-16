package com.waze.bw.b.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.bw.c.d.v;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f17683a;

    /* renamed from: b, reason: collision with root package name */
    private final b f17684b;

    /* renamed from: c, reason: collision with root package name */
    private final a f17685c;

    /* renamed from: d, reason: collision with root package name */
    private final v f17686d;

    public c(String str, b bVar, a aVar, v vVar) {
        x.f(str, "requestId");
        x.f(bVar, TtmlNode.ATTR_TTS_ORIGIN);
        x.f(aVar, "destination");
        x.f(vVar, "timeConstraint");
        this.f17683a = str;
        this.f17684b = bVar;
        this.f17685c = aVar;
        this.f17686d = vVar;
    }

    public final a a() {
        return this.f17685c;
    }

    public final b b() {
        return this.f17684b;
    }

    public final String c() {
        return this.f17683a;
    }

    public final v d() {
        return this.f17686d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f17683a, cVar.f17683a) && x.n(this.f17684b, cVar.f17684b) && x.n(this.f17685c, cVar.f17685c) && x.n(this.f17686d, cVar.f17686d);
    }

    public final int hashCode() {
        return (((((this.f17683a.hashCode() * 31) + this.f17684b.hashCode()) * 31) + this.f17685c.hashCode()) * 31) + this.f17686d.hashCode();
    }

    public final String toString() {
        return "RouteDurationRequest(requestId=" + this.f17683a + ", origin=" + this.f17684b + ", destination=" + this.f17685c + ", timeConstraint=" + this.f17686d + ")";
    }
}
