package com.waze.t.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends u {

    /* renamed from: a, reason: collision with root package name */
    private final String f40638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(null);
        x.f(str, "text");
        this.f40638a = str;
    }

    public final String a() {
        return this.f40638a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && x.n(this.f40638a, ((p) obj).f40638a);
    }

    public final int hashCode() {
        return this.f40638a.hashCode();
    }

    public final String toString() {
        return "DisplayText(text=" + this.f40638a + ")";
    }
}
