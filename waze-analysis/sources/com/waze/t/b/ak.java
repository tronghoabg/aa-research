package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends am {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40686a;

    public ak(Object obj) {
        super(null);
        this.f40686a = obj;
    }

    public final Object a() {
        return this.f40686a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f40686a, ((ak) obj).f40686a);
    }

    public final int hashCode() {
        return this.f40686a.hashCode();
    }

    public final String toString() {
        return "HandlingFeatureAction(featureAction=" + this.f40686a + ")";
    }
}
