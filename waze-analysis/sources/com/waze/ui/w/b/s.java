package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.ui.w.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f43709a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(null);
        h.g.b.x.f(str, "prompt");
        this.f43709a = str;
    }

    public final String d() {
        return this.f43709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.g.b.x.n(this.f43709a, ((s) obj).f43709a);
    }

    public final int hashCode() {
        return this.f43709a.hashCode();
    }

    public final String toString() {
        return "UserPromptReady(prompt=" + this.f43709a + ")";
    }
}
