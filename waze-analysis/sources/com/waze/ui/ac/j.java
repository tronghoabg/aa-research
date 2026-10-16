package com.waze.ui.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    private final int f41766a;

    public j(int i2) {
        super(null);
        this.f41766a = i2;
    }

    public final int a() {
        return this.f41766a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f41766a == ((j) obj).f41766a;
    }

    public final int hashCode() {
        return this.f41766a;
    }

    public final String toString() {
        return "Resource(value=" + this.f41766a + ")";
    }
}
