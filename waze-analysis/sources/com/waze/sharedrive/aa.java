package com.waze.sharedrive;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38048a;

    public aa(Object obj) {
        super(null);
        this.f38048a = obj;
    }

    public final Object a() {
        return this.f38048a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && h.g.b.x.n(this.f38048a, ((aa) obj).f38048a);
    }

    public final int hashCode() {
        Object obj = this.f38048a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f38048a + ")";
    }
}
