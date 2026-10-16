package com.waze.uid.state_impl.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final x f44698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super((byte[]) null);
        h.g.b.x.f(xVar, "viewType");
        this.f44698a = xVar;
    }

    public final x a() {
        return this.f44698a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof w ? this.f44698a == ((w) obj).f44698a : super.equals(obj);
    }

    public final String toString() {
        return "WelcomeControllerUiState(" + this.f44698a + ")";
    }
}
