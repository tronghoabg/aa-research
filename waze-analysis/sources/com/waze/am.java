package com.waze;

import android.util.Size;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class am extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final Size f14304a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(Size size) {
        super(null, null);
        h.g.b.x.f(size, "screenSize");
        this.f14304a = size;
    }

    public final Size a() {
        return this.f14304a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f14304a, ((am) obj).f14304a);
    }

    public final int hashCode() {
        return this.f14304a.hashCode();
    }

    public final String toString() {
        return "Projection(screenSize=" + this.f14304a + ")";
    }

    public am() {
        this((byte[]) null);
    }

    public /* synthetic */ am(byte[] bArr) {
        this(new Size(0, 0));
    }
}
