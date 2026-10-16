package com.waze.an.c;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final String f14754a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f14755b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f14756c;

    public ah(String str, ag agVar, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(agVar, "timeout");
        h.g.b.x.f(aVar, "onClose");
        this.f14754a = str;
        this.f14755b = agVar;
        this.f14756c = aVar;
    }

    public final ag a() {
        return this.f14755b;
    }

    public final String b() {
        return this.f14754a;
    }

    public final h.g.a.a c() {
        return this.f14756c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f14754a, ahVar.f14754a) && h.g.b.x.n(this.f14755b, ahVar.f14755b) && h.g.b.x.n(this.f14756c, ahVar.f14756c);
    }

    public final int hashCode() {
        return (((this.f14754a.hashCode() * 31) + this.f14755b.hashCode()) * 31) + this.f14756c.hashCode();
    }

    public final String toString() {
        return "RichContent(title=" + this.f14754a + ", timeout=" + this.f14755b + ", onClose=" + this.f14756c + ")";
    }
}
