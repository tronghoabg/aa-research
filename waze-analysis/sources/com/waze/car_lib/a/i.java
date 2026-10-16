package com.waze.car_lib.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends com.waze.car_lib.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f18836a;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(String str) {
        h.g.b.x.f(str, "adId");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f18836a = str;
    }

    public final String e() {
        return this.f18836a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && h.g.b.x.n(this.f18836a, ((i) obj).f18836a);
    }

    public final int hashCode() {
        return this.f18836a.hashCode();
    }

    public final String toString() {
        return "ShowAd(adId=" + this.f18836a + ")";
    }
}
