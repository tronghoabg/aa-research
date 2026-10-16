package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s extends com.waze.install.ah implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f28366a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28367b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i2, com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f28366a = i2;
        this.f28367b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f28366a == sVar.f28366a && h.g.b.x.n(this.f28367b, sVar.f28367b);
    }

    public final int f() {
        return this.f28366a;
    }

    public final com.waze.shared_infra.h.c g() {
        return this.f28367b;
    }

    public final int hashCode() {
        return (this.f28366a * 31) + this.f28367b.hashCode();
    }

    public final String toString() {
        return "AlertClick(id=" + this.f28366a + ", coordinate=" + this.f28367b + ")";
    }
}
