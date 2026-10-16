package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final Object f42282a;

    public aj(Object obj) {
        super(null);
        this.f42282a = obj;
    }

    public final Object a() {
        return this.f42282a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && h.g.b.x.n(this.f42282a, ((aj) obj).f42282a);
    }

    public final int hashCode() {
        Object obj = this.f42282a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f42282a + ")";
    }
}
