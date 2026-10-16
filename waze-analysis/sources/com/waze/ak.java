package com.waze;

import android.util.Size;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final Size f14080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(Size size) {
        super(null, null);
        h.g.b.x.f(size, "screenSize");
        this.f14080a = size;
    }

    public final Size a() {
        return this.f14080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f14080a, ((ak) obj).f14080a);
    }

    public final int hashCode() {
        return this.f14080a.hashCode();
    }

    public final String toString() {
        return "Aaos(screenSize=" + this.f14080a + ")";
    }

    public ak() {
        this((byte[]) null);
    }

    public /* synthetic */ ak(byte[] bArr) {
        this(new Size(0, 0));
    }
}
