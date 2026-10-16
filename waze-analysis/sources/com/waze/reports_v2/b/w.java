package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    private final String f34138a;

    public w(String str) {
        super(null);
        this.f34138a = str;
    }

    public final String a() {
        return this.f34138a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && h.g.b.x.n(this.f34138a, ((w) obj).f34138a);
    }

    public final int hashCode() {
        String str = this.f34138a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Error(message=" + this.f34138a + ")";
    }
}
