package com.waze.alerters.b;

import com.waze.alerters.a.z;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final z f14239a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14240b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14241c;

    public h(z zVar, boolean z, boolean z2) {
        this.f14239a = zVar;
        this.f14240b = z;
        this.f14241c = z2;
    }

    public static /* synthetic */ h d(h hVar, z zVar, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            zVar = hVar.f14239a;
        }
        if ((i2 & 2) != 0) {
            z = hVar.f14240b;
        }
        if ((i2 & 4) != 0) {
            z2 = hVar.f14241c;
        }
        return new h(zVar, z, z2);
    }

    public final z a() {
        return this.f14239a;
    }

    public final boolean b() {
        return this.f14240b;
    }

    public final boolean c() {
        return this.f14241c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f14239a, hVar.f14239a) && this.f14240b == hVar.f14240b && this.f14241c == hVar.f14241c;
    }

    public final int hashCode() {
        z zVar = this.f14239a;
        return ((((zVar == null ? 0 : zVar.hashCode()) * 31) + a.a.a(this.f14240b)) * 31) + a.a.a(this.f14241c);
    }

    public final String toString() {
        return "State(data=" + this.f14239a + ", enterHandled=" + this.f14240b + ", exitHandled=" + this.f14241c + ")";
    }
}
