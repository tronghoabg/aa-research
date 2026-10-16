package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az extends com.waze.location.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.c f45701a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45702b;

    public /* synthetic */ az(com.waze.ui.ac.c cVar) {
        h.g.b.x.f(cVar, "t2Icon");
        this.f45701a = cVar;
        this.f45702b = null;
    }

    public final com.waze.ui.ac.c a() {
        return this.f45701a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        if (!h.g.b.x.n(this.f45701a, azVar.f45701a)) {
            return false;
        }
        String str = azVar.f45702b;
        return h.g.b.x.n(null, null);
    }

    public final int hashCode() {
        return this.f45701a.hashCode() * 31;
    }

    public final String toString() {
        return "CustomTrailingIcon(t2Icon=" + this.f45701a + ", contentDescription=null)";
    }
}
