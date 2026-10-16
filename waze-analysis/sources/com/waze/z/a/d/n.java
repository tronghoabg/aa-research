package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f45968a;

    public n(String str) {
        h.g.b.x.f(str, "text");
        this.f45968a = str;
    }

    public final String a() {
        return this.f45968a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f45968a, ((n) obj).f45968a);
    }

    public final int hashCode() {
        return this.f45968a.hashCode();
    }

    public final String toString() {
        return "TextChanged(text=" + this.f45968a + ")";
    }
}
