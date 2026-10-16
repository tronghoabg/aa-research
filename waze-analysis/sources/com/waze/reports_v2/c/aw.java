package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f34226a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(String str) {
        super(null);
        h.g.b.x.f(str, "input");
        this.f34226a = str;
    }

    public final String a() {
        return this.f34226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && h.g.b.x.n(this.f34226a, ((aw) obj).f34226a);
    }

    public final int hashCode() {
        return this.f34226a.hashCode();
    }

    public final String toString() {
        return "UserInput(input=" + this.f34226a + ")";
    }
}
