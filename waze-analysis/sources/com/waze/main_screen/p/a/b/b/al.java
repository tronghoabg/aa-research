package com.waze.main_screen.p.a.b.b;

import com.waze.br;
import com.waze.navigate.NavResultData;
import com.waze.navigate.ft;
import com.waze.navigate.fu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al {

    /* renamed from: e, reason: collision with root package name */
    private static final al f26912e = new al(null, new fu(new ft(false), false), null, true);

    /* renamed from: a, reason: collision with root package name */
    public final NavResultData f26913a;

    /* renamed from: b, reason: collision with root package name */
    public final fu f26914b;

    /* renamed from: c, reason: collision with root package name */
    public final br f26915c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26916d;

    public al(NavResultData navResultData, fu fuVar, br brVar, boolean z) {
        h.g.b.x.f(fuVar, "scrollableEtaState");
        this.f26913a = navResultData;
        this.f26914b = fuVar;
        this.f26915c = brVar;
        this.f26916d = z;
    }

    public static /* synthetic */ al b(al alVar, NavResultData navResultData, fu fuVar, br brVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            navResultData = alVar.f26913a;
        }
        if ((i2 & 2) != 0) {
            fuVar = alVar.f26914b;
        }
        if ((i2 & 4) != 0) {
            brVar = alVar.f26915c;
        }
        if ((i2 & 8) != 0) {
            z = alVar.f26916d;
        }
        h.g.b.x.f(fuVar, "scrollableEtaState");
        return new al(navResultData, fuVar, brVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return h.g.b.x.n(this.f26913a, alVar.f26913a) && h.g.b.x.n(this.f26914b, alVar.f26914b) && h.g.b.x.n(this.f26915c, alVar.f26915c) && this.f26916d == alVar.f26916d;
    }

    public final int hashCode() {
        NavResultData navResultData = this.f26913a;
        int iHashCode = ((navResultData == null ? 0 : navResultData.hashCode()) * 31) + this.f26914b.hashCode();
        br brVar = this.f26915c;
        return (((iHashCode * 31) + (brVar != null ? brVar.hashCode() : 0)) * 31) + a.a.a(this.f26916d);
    }

    public final String toString() {
        return "State(navResultData=" + this.f26913a + ", scrollableEtaState=" + this.f26914b + ", etaCardData=" + this.f26915c + ", isCalculating=" + this.f26916d + ")";
    }
}
