package org.a.d.c;

import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final l f56381a;

    public b(l lVar) {
        this.f56381a = lVar;
    }

    public final l a() {
        return this.f56381a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f56381a, ((b) obj).f56381a);
    }

    public final int hashCode() {
        l lVar = this.f56381a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Callbacks(onClose=" + this.f56381a + ")";
    }

    public b() {
        this((byte[]) null);
    }

    public /* synthetic */ b(byte[] bArr) {
        this((l) null);
    }
}
