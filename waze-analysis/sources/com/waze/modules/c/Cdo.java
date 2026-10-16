package com.waze.modules.c;

/* compiled from: WazeSource */
/* renamed from: com.waze.modules.c.do, reason: invalid class name */
/* loaded from: classes6.dex */
public final class Cdo extends com.waze.aj.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f30103a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(String str) {
        super(null, null);
        h.g.b.x.f(str, "serverString");
        this.f30103a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cdo) && h.g.b.x.n(this.f30103a, ((Cdo) obj).f30103a);
    }

    public final String f() {
        return this.f30103a;
    }

    public final int hashCode() {
        return this.f30103a.hashCode();
    }

    public final String toString() {
        return "ServerString(serverString=" + this.f30103a + ")";
    }
}
