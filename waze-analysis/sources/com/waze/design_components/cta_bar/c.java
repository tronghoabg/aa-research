package com.waze.design_components.cta_bar;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends com.waze.design_components.d {

    /* renamed from: a, reason: collision with root package name */
    private final b f23429a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23430b;

    /* renamed from: c, reason: collision with root package name */
    private final g f23431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, b bVar2, g gVar) {
        super(null);
        x.f(bVar, "firstButtonData");
        x.f(bVar2, "secondButtonData");
        x.f(gVar, "orientation");
        this.f23429a = bVar;
        this.f23430b = bVar2;
        this.f23431c = gVar;
    }

    public static /* synthetic */ c g(c cVar, b bVar, b bVar2, int i2) {
        if ((i2 & 1) != 0) {
            bVar = cVar.f23429a;
        }
        if ((i2 & 2) != 0) {
            bVar2 = cVar.f23430b;
        }
        g gVar = cVar.f23431c;
        x.f(bVar, "firstButtonData");
        x.f(bVar2, "secondButtonData");
        x.f(gVar, "orientation");
        return new c(bVar, bVar2, gVar);
    }

    public final b d() {
        return this.f23429a;
    }

    public final b e() {
        return this.f23430b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f23429a, cVar.f23429a) && x.n(this.f23430b, cVar.f23430b) && this.f23431c == cVar.f23431c;
    }

    public final g f() {
        return this.f23431c;
    }

    public final int hashCode() {
        return (((this.f23429a.hashCode() * 31) + this.f23430b.hashCode()) * 31) + this.f23431c.hashCode();
    }

    public final String toString() {
        return "TwoButtonsData(firstButtonData=" + this.f23429a + ", secondButtonData=" + this.f23430b + ", orientation=" + this.f23431c + ")";
    }
}
