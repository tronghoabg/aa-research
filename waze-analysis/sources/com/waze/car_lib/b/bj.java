package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends com.waze.alerters.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f19031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(String str) {
        super(null);
        h.g.b.x.f(str, "prompt");
        this.f19031a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj) && h.g.b.x.n(this.f19031a, ((bj) obj).f19031a);
    }

    public final String f() {
        return this.f19031a;
    }

    public final int hashCode() {
        return this.f19031a.hashCode();
    }

    public final String toString() {
        return "PlayingFollowUpPrompt(prompt=" + this.f19031a + ")";
    }
}
