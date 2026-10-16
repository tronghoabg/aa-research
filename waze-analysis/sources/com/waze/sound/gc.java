package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gc extends ge {

    /* renamed from: a, reason: collision with root package name */
    private final String f40080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(String str) {
        super(null);
        h.g.b.x.f(str, "reason");
        this.f40080a = str;
    }

    public final String a() {
        return this.f40080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc) && h.g.b.x.n(this.f40080a, ((gc) obj).f40080a);
    }

    public final int hashCode() {
        return this.f40080a.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.f40080a + ")";
    }
}
