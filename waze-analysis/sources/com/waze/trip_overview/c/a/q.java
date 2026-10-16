package com.waze.trip_overview.c.a;

import com.waze.map.b.cs;
import com.waze.map.b.de;
import com.waze.map.b.dk;
import com.waze.map.b.dm;
import com.waze.map.b.dx;
import com.waze.trip_overview.as;
import com.waze.trip_overview.bs;
import com.waze.trip_overview.ef;
import com.waze.trip_overview.ej;
import com.waze.trip_overview.ek;
import com.waze.trip_overview.views.RouteHeader;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f41251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f41252b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f41253c) {
            case 0:
                q qVar = new q((ab) this.f41252b, eVar, 0);
                qVar.f41251a = obj;
                return qVar;
            case 1:
                q qVar2 = new q((ab) this.f41252b, eVar, 1, (byte[]) null);
                qVar2.f41251a = obj;
                return qVar2;
            case 2:
                q qVar3 = new q((ab) this.f41252b, eVar, 2, (char[]) null);
                qVar3.f41251a = obj;
                return qVar3;
            case 3:
                q qVar4 = new q((ab) this.f41252b, eVar, 3, (short[]) null);
                qVar4.f41251a = obj;
                return qVar4;
            case 4:
                q qVar5 = new q((ab) this.f41252b, eVar, 4, (int[]) null);
                qVar5.f41251a = obj;
                return qVar5;
            case 5:
                q qVar6 = new q((ab) this.f41252b, eVar, 5, (boolean[]) null);
                qVar6.f41251a = obj;
                return qVar6;
            case 6:
                q qVar7 = new q((RouteHeader) this.f41252b, eVar, 6);
                qVar7.f41251a = obj;
                return qVar7;
            case 7:
                q qVar8 = new q((ab) this.f41252b, eVar, 7, (float[]) null);
                qVar8.f41251a = obj;
                return qVar8;
            default:
                q qVar9 = new q((ab) this.f41252b, eVar, 8, (byte[][]) null);
                qVar9.f41251a = obj;
                return qVar9;
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f41253c) {
            case 0:
                return ((q) create((dk) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 1:
                return ((q) create((com.waze.uid.c.al) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 2:
                return ((q) create((dm) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 3:
                return ((q) create((de) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 4:
                return ((q) create((dx) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 5:
                return ((q) create((cs) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 6:
                return ((q) create((as) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            case 7:
                return ((q) create((ac) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
            default:
                return ((q) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
        }
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41253c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                e.b.c.b(obj);
                dk dkVar = (dk) this.f41251a;
                com.waze.shared_infra.i.e eVarI = ((ab) this.f41252b).I();
                Objects.toString(dkVar);
                eVarI.a("TripOverview mapMovementState changed: ".concat(String.valueOf(dkVar)));
                break;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                ab.y((ab) this.f41252b, (com.waze.uid.c.al) this.f41251a);
                break;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                dm dmVar = (dm) this.f41251a;
                com.waze.shared_infra.i.e eVarI2 = ((ab) this.f41252b).I();
                Objects.toString(dmVar);
                eVarI2.a("TripOverview mapVisibleAreaState changed: ".concat(String.valueOf(dmVar)));
                break;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                ((ab) this.f41252b).h().l(new ej((de) this.f41251a));
                break;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                ((ab) this.f41252b).h().l(new ek((dx) this.f41251a));
                break;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                cs csVar = (cs) this.f41251a;
                ((ab) this.f41252b).h().l(new ef(csVar != null ? csVar.a() : null));
                break;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                as asVar = (as) this.f41251a;
                Object obj2 = this.f41252b;
                h.g.b.x.c(obj2);
                h.g.b.x.f(obj2, "<this>");
                h.g.b.x.f(asVar, "headerData");
                RouteHeader routeHeader = (RouteHeader) obj2;
                routeHeader.g(asVar.d());
                routeHeader.f(asVar.a());
                routeHeader.e(asVar.c());
                routeHeader.c(asVar.b());
                break;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                ab.r((ab) this.f41252b, (ac) this.f41251a);
                break;
            default:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                e.b.c.b(obj);
                h.k kVar = (h.k) this.f41251a;
                ab.q((ab) this.f41252b, (ae) kVar.a(), (bs) kVar.b());
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ab abVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(RouteHeader routeHeader, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41253c = i2;
        this.f41252b = routeHeader;
    }
}
