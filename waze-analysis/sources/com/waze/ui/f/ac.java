package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f42275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(String str) {
        super(null);
        h.g.b.x.f(str, "hint");
        this.f42275a = str;
    }

    public final String a() {
        return this.f42275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac) && h.g.b.x.n(this.f42275a, ((ac) obj).f42275a);
    }

    public final int hashCode() {
        return this.f42275a.hashCode();
    }

    public final String toString() {
        return "FteHint(hint=" + this.f42275a + ")";
    }
}
