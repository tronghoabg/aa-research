package com.waze.settings.tree;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final int f37460a;

    public a(int i2) {
        super(null);
        this.f37460a = i2;
    }

    public final int a() {
        return this.f37460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f37460a == ((a) obj).f37460a;
    }

    public final int hashCode() {
        return this.f37460a;
    }

    public final String toString() {
        return "Id(value=" + this.f37460a + ")";
    }
}
