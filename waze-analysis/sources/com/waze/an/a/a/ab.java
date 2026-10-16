package com.waze.an.a.a;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final String f14330a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f14331b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14332c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14333d;

    public /* synthetic */ ab(String str, long j2, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actionsList");
        this.f14330a = str;
        this.f14331b = null;
        this.f14332c = j2;
        this.f14333d = list;
    }

    public final long a() {
        return this.f14332c;
    }

    public final String b() {
        return this.f14330a;
    }

    public final List c() {
        return this.f14333d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if (!h.g.b.x.n(this.f14330a, abVar.f14330a)) {
            return false;
        }
        Integer num = abVar.f14331b;
        return h.g.b.x.n(null, null) && h.o.a.A(this.f14332c, abVar.f14332c) && h.g.b.x.n(this.f14333d, abVar.f14333d);
    }

    public final int hashCode() {
        int iHashCode = this.f14330a.hashCode() * 961;
        h.o.c cVar = h.o.a.f48264a;
        return ((iHashCode + a.a.b(this.f14332c)) * 31) + this.f14333d.hashCode();
    }

    public final String toString() {
        return "MultiAskInsightData(title=" + this.f14330a + ", iconResId=null, timeoutDuration=" + h.o.a.y(this.f14332c) + ", actionsList=" + this.f14333d + ")";
    }
}
