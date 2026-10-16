package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    private final ar f34543a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34544b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ar arVar, String str) {
        super(null);
        h.g.b.x.f(arVar, "errorType");
        h.g.b.x.f(str, "errorDescription");
        this.f34543a = arVar;
        this.f34544b = str;
    }

    public final ar a() {
        return this.f34543a;
    }

    public final String b() {
        return this.f34544b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f34543a == wVar.f34543a && h.g.b.x.n(this.f34544b, wVar.f34544b);
    }

    public final int hashCode() {
        return (this.f34543a.hashCode() * 31) + this.f34544b.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f34543a + ", errorDescription=" + this.f34544b + ")";
    }
}
