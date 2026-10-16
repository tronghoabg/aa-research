package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends ac {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42000a;

    public ab(boolean z) {
        this.f42000a = z;
    }

    @Override // com.waze.ui.b.ac
    public final boolean a() {
        return this.f42000a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && this.f42000a == ((ab) obj).f42000a;
    }

    public final int hashCode() {
        return a.a.a(this.f42000a);
    }

    public final String toString() {
        return "RestrictedArea(noPrefix=" + this.f42000a + ")";
    }
}
