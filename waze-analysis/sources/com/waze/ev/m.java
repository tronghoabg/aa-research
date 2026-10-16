package com.waze.ev;

import h.g.b.x;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23702a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f23703b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23704c;

    public m(boolean z, Set set, List list) {
        x.f(set, "selectedConnectorIds");
        x.f(list, "selectedNetworkNames");
        this.f23702a = z;
        this.f23703b = set;
        this.f23704c = list;
    }

    public final List a() {
        return this.f23704c;
    }

    public final Set b() {
        return this.f23703b;
    }

    public final boolean c() {
        return this.f23702a;
    }

    public final boolean d() {
        return this.f23702a && !this.f23703b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23702a == mVar.f23702a && x.n(this.f23703b, mVar.f23703b) && x.n(this.f23704c, mVar.f23704c);
    }

    public final int hashCode() {
        return (((a.a.a(this.f23702a) * 31) + this.f23703b.hashCode()) * 31) + this.f23704c.hashCode();
    }

    public final String toString() {
        return "UserSettings(hasEVCar=" + this.f23702a + ", selectedConnectorIds=" + this.f23703b + ", selectedNetworkNames=" + this.f23704c + ")";
    }
}
