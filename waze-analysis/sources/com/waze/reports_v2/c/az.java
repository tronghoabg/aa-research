package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final ar f34228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(ar arVar) {
        super(null);
        h.g.b.x.f(arVar, "errorType");
        this.f34228a = arVar;
    }

    public final ar a() {
        return this.f34228a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az) && this.f34228a == ((az) obj).f34228a;
    }

    public final int hashCode() {
        return this.f34228a.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f34228a + ")";
    }
}
