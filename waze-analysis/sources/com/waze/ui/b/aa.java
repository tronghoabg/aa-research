package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends ac {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41999a;

    public aa(boolean z) {
        this.f41999a = z;
    }

    @Override // com.waze.ui.b.ac
    public final boolean a() {
        return this.f41999a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && this.f41999a == ((aa) obj).f41999a;
    }

    public final int hashCode() {
        return a.a.a(this.f41999a);
    }

    public final String toString() {
        return "PassRequired(noPrefix=" + this.f41999a + ")";
    }
}
