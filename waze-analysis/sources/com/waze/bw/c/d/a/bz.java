package com.waze.bw.c.d.a;

import com.waze.bw.c.d.cv;
import com.waze.bw.c.d.dh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final cv f17917a;

    /* renamed from: b, reason: collision with root package name */
    private final dh f17918b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(cv cvVar, dh dhVar, boolean z) {
        super((byte[]) null);
        h.g.b.x.f(cvVar, "wazeUIDestination");
        h.g.b.x.f(dhVar, "favoriteInfo");
        this.f17917a = cvVar;
        this.f17918b = dhVar;
        this.f17919c = z;
    }

    public final cv a() {
        return this.f17917a;
    }

    public final dh b() {
        return this.f17918b;
    }

    public final boolean c() {
        return this.f17919c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return h.g.b.x.n(this.f17917a, bzVar.f17917a) && h.g.b.x.n(this.f17918b, bzVar.f17918b) && this.f17919c == bzVar.f17919c;
    }

    public final int hashCode() {
        return (((this.f17917a.hashCode() * 31) + this.f17918b.hashCode()) * 31) + a.a.a(this.f17919c);
    }

    public final String toString() {
        return "Carousel(wazeUIDestination=" + this.f17917a + ", favoriteInfo=" + this.f17918b + ", isLatam=" + this.f17919c + ")";
    }
}
