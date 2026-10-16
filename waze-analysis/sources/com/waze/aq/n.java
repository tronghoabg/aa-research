package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends com.waze.main_screen.p.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15473a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str) {
        super(null, null);
        x.f(str, "token");
        this.f15473a = str;
    }

    public final String a() {
        return this.f15473a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && x.n(this.f15473a, ((n) obj).f15473a);
    }

    public final int hashCode() {
        return this.f15473a.hashCode();
    }

    public final String toString() {
        return "Success(token=" + this.f15473a + ")";
    }
}
