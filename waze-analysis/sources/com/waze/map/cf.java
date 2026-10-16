package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cf extends com.waze.google_assistant.an {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.cp f28674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(com.waze.map.b.cp cpVar) {
        super(null);
        h.g.b.x.f(cpVar, "original");
        this.f28674a = cpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf) && h.g.b.x.n(this.f28674a, ((cf) obj).f28674a);
    }

    public final int hashCode() {
        return this.f28674a.hashCode();
    }

    public final String toString() {
        return "Content(original=" + this.f28674a + ")";
    }
}
