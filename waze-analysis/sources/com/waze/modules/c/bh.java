package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bh extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final String f29909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(String str) {
        super(null);
        h.g.b.x.f(str, "pass");
        this.f29909a = str;
    }

    public final String a() {
        return this.f29909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && h.g.b.x.n(this.f29909a, ((bh) obj).f29909a);
    }

    public final int hashCode() {
        return this.f29909a.hashCode();
    }

    public final String toString() {
        return "PassNeeded(pass=" + this.f29909a + ")";
    }
}
