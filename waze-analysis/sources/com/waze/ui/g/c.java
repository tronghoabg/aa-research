package com.waze.ui.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f42322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(null);
        h.g.b.x.f(str, "carId");
        this.f42322a = str;
    }

    public final String a() {
        return this.f42322a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f42322a, ((c) obj).f42322a);
    }

    public final int hashCode() {
        return this.f42322a.hashCode();
    }

    public final String toString() {
        return "CarClicked(carId=" + this.f42322a + ")";
    }
}
