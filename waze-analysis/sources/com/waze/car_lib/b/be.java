package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class be extends com.waze.ads.c.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f19026a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(String str) {
        super(null);
        h.g.b.x.f(str, "prompt");
        this.f19026a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be) && h.g.b.x.n(this.f19026a, ((be) obj).f19026a);
    }

    public final int hashCode() {
        return this.f19026a.hashCode();
    }

    public final String i() {
        return this.f19026a;
    }

    public final String toString() {
        return "UserInputReady(prompt=" + this.f19026a + ")";
    }
}
