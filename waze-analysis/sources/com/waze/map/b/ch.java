package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ch {

    /* renamed from: a, reason: collision with root package name */
    private static final ch f28144a = new ch(new cb(true));

    /* renamed from: b, reason: collision with root package name */
    private final cb f28145b;

    public ch(cb cbVar) {
        h.g.b.x.f(cbVar, "cameraFeatures");
        this.f28145b = cbVar;
    }

    public final cb a() {
        return this.f28145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch) && h.g.b.x.n(this.f28145b, ((ch) obj).f28145b);
    }

    public final int hashCode() {
        return this.f28145b.hashCode();
    }

    public final String toString() {
        return "Configuration(cameraFeatures=" + this.f28145b + ")";
    }
}
