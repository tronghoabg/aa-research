package com.waze.an.a.a;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f14528a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14529b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14530c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14531d;

    public /* synthetic */ x(String str, int i2, long j2, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actionsList");
        this.f14528a = str;
        this.f14529b = i2;
        this.f14530c = j2;
        this.f14531d = list;
    }

    public final int a() {
        return this.f14529b;
    }

    public final long b() {
        return this.f14530c;
    }

    public final String c() {
        return this.f14528a;
    }

    public final List d() {
        return this.f14531d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f14528a, xVar.f14528a) && this.f14529b == xVar.f14529b && h.o.a.A(this.f14530c, xVar.f14530c) && h.g.b.x.n(this.f14531d, xVar.f14531d);
    }

    public final int hashCode() {
        int iHashCode = this.f14528a.hashCode() * 31;
        h.o.c cVar = h.o.a.f48264a;
        List list = this.f14531d;
        return ((((iHashCode + this.f14529b) * 31) + a.a.b(this.f14530c)) * 31) + list.hashCode();
    }

    public final String toString() {
        return "FeedbackInsightData(title=" + this.f14528a + ", iconResId=" + this.f14529b + ", timeoutDuration=" + h.o.a.y(this.f14530c) + ", actionsList=" + this.f14531d + ")";
    }
}
