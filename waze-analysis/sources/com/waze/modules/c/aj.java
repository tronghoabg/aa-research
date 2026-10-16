package com.waze.modules.c;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29842a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f29843b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f29844c;

    public aj(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2) {
        h.g.b.x.f(cVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(cVar2, "destination");
        this.f29842a = false;
        this.f29843b = cVar;
        this.f29844c = cVar2;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f29844c;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f29843b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        boolean z = ajVar.f29842a;
        return h.g.b.x.n(this.f29843b, ajVar.f29843b) && h.g.b.x.n(this.f29844c, ajVar.f29844c);
    }

    public final int hashCode() {
        return ((this.f29843b.hashCode() + 38347) * 31) + this.f29844c.hashCode();
    }

    public final String toString() {
        return "OverrideParams(isReroute=false, origin=" + this.f29843b + ", destination=" + this.f29844c + ")";
    }
}
