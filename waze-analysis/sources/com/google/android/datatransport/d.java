package com.google.android.datatransport;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f4092a;

    d(Integer num) {
        this.f4092a = num;
    }

    public static d a(Integer num) {
        return new d(num);
    }

    public final Integer b() {
        return this.f4092a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f4092a.equals(((d) obj).f4092a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4092a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f4092a + "}";
    }

    public d() {
        throw null;
    }
}
