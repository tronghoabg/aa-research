package com.waze.design_components.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends com.waze.design_components.d {

    /* renamed from: a, reason: collision with root package name */
    private final int f23299a;

    public a(int i2) {
        super(null);
        this.f23299a = i2;
    }

    public final int d() {
        return this.f23299a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23299a == ((a) obj).f23299a;
    }

    public final int hashCode() {
        return this.f23299a;
    }

    public final String toString() {
        return "DrawableResource(resId=" + this.f23299a + ")";
    }
}
