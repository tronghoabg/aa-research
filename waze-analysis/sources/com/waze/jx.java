package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jx extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final String f24990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24991b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.a f24992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(String str, String str2, com.waze.app_nav.hub.b.a aVar) {
        super(aVar, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        h.g.b.x.f(aVar, "aapConnectionPopupBehavior");
        this.f24990a = str;
        this.f24991b = str2;
        this.f24992c = aVar;
    }

    public final String b() {
        return this.f24991b;
    }

    public final String c() {
        return this.f24990a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        return h.g.b.x.n(this.f24990a, jxVar.f24990a) && h.g.b.x.n(this.f24991b, jxVar.f24991b) && h.g.b.x.n(this.f24992c, jxVar.f24992c);
    }

    public final int hashCode() {
        return (((this.f24990a.hashCode() * 31) + this.f24991b.hashCode()) * 31) + this.f24992c.hashCode();
    }

    @Override // com.waze.ka
    public final com.waze.app_nav.hub.b.a m() {
        return this.f24992c;
    }

    public final String toString() {
        return "TechCodePopup(title=" + this.f24990a + ", message=" + this.f24991b + ", aapConnectionPopupBehavior=" + this.f24992c + ")";
    }
}
