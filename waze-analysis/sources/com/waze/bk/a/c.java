package com.waze.bk.a;

import com.waze.map.canvas.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16843a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16844b;

    /* renamed from: c, reason: collision with root package name */
    private final m f16845c;

    public c(boolean z, boolean z2, m mVar) {
        this.f16843a = z;
        this.f16844b = z2;
        this.f16845c = mVar;
    }

    public final boolean a() {
        return this.f16843a;
    }

    public final boolean b() {
        return this.f16844b;
    }

    public final m c() {
        return this.f16845c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16843a == cVar.f16843a && this.f16844b == cVar.f16844b && x.n(this.f16845c, cVar.f16845c);
    }

    public final int hashCode() {
        m mVar = this.f16845c;
        return (((a.a.a(this.f16843a) * 31) + a.a.a(this.f16844b)) * 31) + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "Widgets(loader=" + this.f16843a + ", speedometer=" + this.f16844b + ", bottomPill=" + this.f16845c + ")";
    }
}
