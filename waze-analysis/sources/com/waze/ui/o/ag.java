package com.waze.ui.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends ah {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43125a;

    public ag(boolean z) {
        super(null);
        this.f43125a = z;
    }

    public final boolean a() {
        return this.f43125a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && this.f43125a == ((ag) obj).f43125a;
    }

    public final int hashCode() {
        return a.a.a(this.f43125a);
    }

    public final String toString() {
        return "Enabled(showNotification=" + this.f43125a + ")";
    }
}
