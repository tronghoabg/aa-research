package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gl extends gn {

    /* renamed from: a, reason: collision with root package name */
    private final int f40095a;

    public gl() {
        super(null);
        this.f40095a = 70;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl)) {
            return false;
        }
        int i2 = ((gl) obj).f40095a;
        return true;
    }

    public final int hashCode() {
        return 70;
    }

    public final String toString() {
        return "Above(minKmph=70)";
    }
}
