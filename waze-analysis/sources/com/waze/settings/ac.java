package com.waze.settings;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final List f36745a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36746b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f36747c;

    public ac(List list, boolean z, ab abVar) {
        h.g.b.x.f(list, "voices");
        this.f36745a = list;
        this.f36746b = z;
        this.f36747c = abVar;
    }

    public static /* synthetic */ ac d(ac acVar, List list, boolean z, ab abVar, int i2) {
        if ((i2 & 1) != 0) {
            list = acVar.f36745a;
        }
        if ((i2 & 2) != 0) {
            z = acVar.f36746b;
        }
        if ((i2 & 4) != 0) {
            abVar = acVar.f36747c;
        }
        h.g.b.x.f(list, "voices");
        return new ac(list, z, abVar);
    }

    public final ab a() {
        return this.f36747c;
    }

    public final List b() {
        return this.f36745a;
    }

    public final boolean c() {
        return this.f36746b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f36745a, acVar.f36745a) && this.f36746b == acVar.f36746b && h.g.b.x.n(this.f36747c, acVar.f36747c);
    }

    public final int hashCode() {
        int iHashCode = this.f36745a.hashCode() * 31;
        ab abVar = this.f36747c;
        return ((iHashCode + a.a.a(this.f36746b)) * 31) + (abVar == null ? 0 : abVar.hashCode());
    }

    public final String toString() {
        return "VoicesUiState(voices=" + this.f36745a + ", loading=" + this.f36746b + ", errorMessage=" + this.f36747c + ")";
    }
}
