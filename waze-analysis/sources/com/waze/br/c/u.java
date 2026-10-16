package com.waze.br.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    private final float f17413a;

    public u(float f2) {
        this.f17413a = f2;
    }

    public final float a() {
        return this.f17413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f17413a, ((u) obj).f17413a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17413a);
    }

    public final String toString() {
        return "Manual(value=" + this.f17413a + ")";
    }
}
