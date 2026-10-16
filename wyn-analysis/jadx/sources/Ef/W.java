package Ef;

import A7.AbstractC0279p0;

/* loaded from: classes5.dex */
public final class W implements InterfaceC0491h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3704a;

    public W(boolean z2) {
        this.f3704a = z2;
    }

    @Override // Ef.InterfaceC0491h0
    public final C0 b() {
        return null;
    }

    @Override // Ef.InterfaceC0491h0
    public final boolean isActive() {
        return this.f3704a;
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("Empty{"), this.f3704a ? "Active" : "New", '}');
    }
}
