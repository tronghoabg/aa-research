package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jh extends com.waze.car_lib.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f19753a;

    /* JADX WARN: Illegal instructions before constructor call */
    public jh(String str) {
        h.g.b.x.f(str, "userName");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f19753a = str;
    }

    public final String e() {
        return this.f19753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh) && h.g.b.x.n(this.f19753a, ((jh) obj).f19753a);
    }

    public final int hashCode() {
        return this.f19753a.hashCode();
    }

    public final String toString() {
        return "Password(userName=" + this.f19753a + ")";
    }
}
