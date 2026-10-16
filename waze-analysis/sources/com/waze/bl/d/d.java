package com.waze.bl.d;

import com.waze.reports_v2.b.at;
import com.waze.ui.w.b.bj;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.bl.d.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final at f17076a;

    /* renamed from: b, reason: collision with root package name */
    private final bj f17077b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(at atVar, bj bjVar, int i2) {
        super(null, null);
        x.f(atVar, "reportedType");
        this.f17076a = atVar;
        this.f17077b = bjVar;
        this.f17078c = i2;
    }

    public final int a() {
        return this.f17078c;
    }

    public final at b() {
        return this.f17076a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17076a == dVar.f17076a && this.f17077b == dVar.f17077b && this.f17078c == dVar.f17078c;
    }

    public final int hashCode() {
        int iHashCode = this.f17076a.hashCode() * 31;
        bj bjVar = this.f17077b;
        return ((iHashCode + (bjVar == null ? 0 : bjVar.hashCode())) * 31) + this.f17078c;
    }

    public final String toString() {
        return "EndConversationWithReport(reportedType=" + this.f17076a + ", reportedUiType=" + this.f17077b + ", pointsAwarded=" + this.f17078c + ")";
    }
}
