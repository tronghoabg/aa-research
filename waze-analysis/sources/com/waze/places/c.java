package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends com.waze.reports_v2.presentation.p {

    /* renamed from: a, reason: collision with root package name */
    private final String f33104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(null, null);
        h.g.b.x.f(str, "address");
        this.f33104a = str;
    }

    public final String a() {
        return this.f33104a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f33104a, ((c) obj).f33104a);
    }

    public final int hashCode() {
        return this.f33104a.hashCode();
    }

    public final String toString() {
        return "FullyFormatted(address=" + this.f33104a + ")";
    }
}
