package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f29838a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(String str) {
        super(null, null);
        h.g.b.x.f(str, "labelContent");
        this.f29838a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && h.g.b.x.n(this.f29838a, ((ah) obj).f29838a);
    }

    public final String f() {
        return this.f29838a;
    }

    public final int hashCode() {
        return this.f29838a.hashCode();
    }

    public final String toString() {
        return "Plain(labelContent=" + this.f29838a + ")";
    }
}
