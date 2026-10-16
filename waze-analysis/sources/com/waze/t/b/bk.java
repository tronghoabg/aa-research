package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bk extends com.waze.z.a.b.n {

    /* renamed from: a, reason: collision with root package name */
    private final String f40741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(String str) {
        super((byte[]) null);
        h.g.b.x.f(str, "text");
        this.f40741a = str;
    }

    public final String a() {
        return this.f40741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && h.g.b.x.n(this.f40741a, ((bk) obj).f40741a);
    }

    public final int hashCode() {
        return this.f40741a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.f40741a + ")";
    }
}
