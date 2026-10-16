package com.waze.car_lib.p;

import androidx.car.app.model.Distance;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final String f20630a;

    /* renamed from: b, reason: collision with root package name */
    private final Distance f20631b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20632c;

    /* renamed from: d, reason: collision with root package name */
    private final bk f20633d;

    /* renamed from: e, reason: collision with root package name */
    private final bi f20634e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f20635f;

    public bj(String str, Distance distance, long j2, bk bkVar, bi biVar, Boolean bool) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(distance, "distance");
        this.f20630a = str;
        this.f20631b = distance;
        this.f20632c = j2;
        this.f20633d = bkVar;
        this.f20634e = biVar;
        this.f20635f = bool;
    }

    public final long a() {
        return this.f20632c;
    }

    public final Distance b() {
        return this.f20631b;
    }

    public final bi c() {
        return this.f20634e;
    }

    public final bk d() {
        return this.f20633d;
    }

    public final Boolean e() {
        return this.f20635f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return h.g.b.x.n(this.f20630a, bjVar.f20630a) && h.g.b.x.n(this.f20631b, bjVar.f20631b) && this.f20632c == bjVar.f20632c && h.g.b.x.n(this.f20633d, bjVar.f20633d) && h.g.b.x.n(this.f20634e, bjVar.f20634e) && h.g.b.x.n(this.f20635f, bjVar.f20635f);
    }

    public final String f() {
        return this.f20630a;
    }

    public final int hashCode() {
        int iHashCode = (this.f20630a.hashCode() * 31) + this.f20631b.hashCode();
        bk bkVar = this.f20633d;
        int iB = ((((iHashCode * 31) + a.a.b(this.f20632c)) * 31) + (bkVar == null ? 0 : bkVar.hashCode())) * 31;
        bi biVar = this.f20634e;
        int iHashCode2 = (iB + (biVar == null ? 0 : biVar.hashCode())) * 31;
        Boolean bool = this.f20635f;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "RouteInfo(title=" + this.f20630a + ", distance=" + this.f20631b + ", durationSeconds=" + this.f20632c + ", tollInfo=" + this.f20633d + ", hovInfo=" + this.f20634e + ", personalSafetyIncident=" + this.f20635f + ")";
    }
}
