package com.waze.bi;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final k f16812a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16813b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16814c;

    public f(k kVar, long j2, boolean z) {
        x.f(kVar, TtmlNode.ATTR_ID);
        this.f16812a = kVar;
        this.f16813b = j2;
        this.f16814c = z;
    }

    public final long a() {
        return this.f16813b;
    }

    public final k b() {
        return this.f16812a;
    }

    public final boolean c() {
        return this.f16814c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16812a == fVar.f16812a && this.f16813b == fVar.f16813b && this.f16814c == fVar.f16814c;
    }

    public final int hashCode() {
        return (((this.f16812a.hashCode() * 31) + a.a.b(this.f16813b)) * 31) + a.a.a(this.f16814c);
    }

    public final String toString() {
        return "NotificationData(id=" + this.f16812a + ", version=" + this.f16813b + ", enabled=" + this.f16814c + ")";
    }
}
