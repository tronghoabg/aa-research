package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bq extends by {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29918a;

    public bq(boolean z) {
        super(null);
        this.f29918a = z;
    }

    public final boolean a() {
        return this.f29918a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq) && this.f29918a == ((bq) obj).f29918a;
    }

    public final int hashCode() {
        return a.a.a(this.f29918a);
    }

    public final String toString() {
        return "DynamicPrice(priceShown=" + this.f29918a + ")";
    }
}
