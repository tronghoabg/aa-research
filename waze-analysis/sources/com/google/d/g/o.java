package com.google.d.g;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final g f7895a = new o();
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f7896b = 0;

    static {
        int i2 = j.f7881a;
    }

    o() {
    }

    @Override // com.google.d.g.g
    public final h a() {
        return new n();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        int i2 = ((o) obj).f7896b;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
