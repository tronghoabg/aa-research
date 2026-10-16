package com.waze.ui.w.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends com.waze.ui.x.u {

    /* renamed from: a, reason: collision with root package name */
    private final List f43594a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43595b;

    public ao(List list, boolean z) {
        h.g.b.x.f(list, "items");
        this.f43594a = list;
        this.f43595b = z;
    }

    @Override // com.waze.ui.x.u
    public final List a() {
        return this.f43594a;
    }

    public final boolean b() {
        return this.f43595b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return h.g.b.x.n(this.f43594a, aoVar.f43594a) && this.f43595b == aoVar.f43595b;
    }

    public final int hashCode() {
        return (this.f43594a.hashCode() * 31) + a.a.a(this.f43595b);
    }

    public final String toString() {
        return "MainMenu(items=" + this.f43594a + ", disclaimerNeeded=" + this.f43595b + ")";
    }
}
