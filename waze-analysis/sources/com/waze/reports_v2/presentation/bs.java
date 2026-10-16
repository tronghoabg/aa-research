package com.waze.reports_v2.presentation;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bs extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34905a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bw f34906b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg f34907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bs(bw bwVar, cg cgVar, h.c.e eVar) {
        super(2, eVar);
        this.f34906b = bwVar;
        this.f34907c = cgVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bs(this.f34906b, this.f34907c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bs) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.reports_v2.b.at atVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34905a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bw bwVar = this.f34906b;
            cg cgVar = this.f34907c;
            com.waze.reports_v2.c.ca caVarC = bw.c(bwVar);
            com.waze.ui.w.b.bj bjVarC = ((v) ((cd) cgVar).a()).c();
            if (bjVarC != null) {
                h.g.b.x.f(bjVarC, "<this>");
                Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
                switch (bjVarC.ordinal()) {
                    case 0:
                        atVar = com.waze.reports_v2.b.at.f34073a;
                        break;
                    case 1:
                        atVar = com.waze.reports_v2.b.at.f34074b;
                        break;
                    case 2:
                        atVar = com.waze.reports_v2.b.at.f34075c;
                        break;
                    case 3:
                        atVar = com.waze.reports_v2.b.at.f34076d;
                        break;
                    case 4:
                        atVar = com.waze.reports_v2.b.at.f34078f;
                        break;
                    case 5:
                        atVar = com.waze.reports_v2.b.at.f34077e;
                        break;
                    case 6:
                        atVar = com.waze.reports_v2.b.at.f34079g;
                        break;
                    case 7:
                        atVar = com.waze.reports_v2.b.at.f34080h;
                        break;
                    case 8:
                        atVar = com.waze.reports_v2.b.at.f34081i;
                        break;
                    case 9:
                        atVar = com.waze.reports_v2.b.at.f34082j;
                        break;
                    case 10:
                        atVar = com.waze.reports_v2.b.at.f34083k;
                        break;
                    case 11:
                        atVar = com.waze.reports_v2.b.at.f34084l;
                        break;
                    case 12:
                        atVar = com.waze.reports_v2.b.at.m;
                        break;
                    case 13:
                        atVar = com.waze.reports_v2.b.at.n;
                        break;
                    case 14:
                        atVar = com.waze.reports_v2.b.at.o;
                        break;
                    case 15:
                        atVar = com.waze.reports_v2.b.at.p;
                        break;
                    case 16:
                        atVar = com.waze.reports_v2.b.at.q;
                        break;
                    case 17:
                        atVar = com.waze.reports_v2.b.at.r;
                        break;
                    case 18:
                        atVar = com.waze.reports_v2.b.at.s;
                        break;
                    case 19:
                        atVar = com.waze.reports_v2.b.at.t;
                        break;
                    case 20:
                        atVar = com.waze.reports_v2.b.at.u;
                        break;
                    case 21:
                        atVar = com.waze.reports_v2.b.at.v;
                        break;
                    case 22:
                        atVar = com.waze.reports_v2.b.at.w;
                        break;
                    case 23:
                        atVar = com.waze.reports_v2.b.at.x;
                        break;
                    case 24:
                        atVar = com.waze.reports_v2.b.at.y;
                        break;
                    case 25:
                        atVar = com.waze.reports_v2.b.at.z;
                        break;
                    case 26:
                        atVar = com.waze.reports_v2.b.at.A;
                        break;
                    case 27:
                        atVar = com.waze.reports_v2.b.at.B;
                        break;
                    case 28:
                        atVar = com.waze.reports_v2.b.at.C;
                        break;
                    case 29:
                        atVar = com.waze.reports_v2.b.at.D;
                        break;
                    case 30:
                        atVar = com.waze.reports_v2.b.at.E;
                        break;
                    case 31:
                        atVar = com.waze.reports_v2.b.at.F;
                        break;
                    case 32:
                        atVar = com.waze.reports_v2.b.at.G;
                        break;
                    case 33:
                        atVar = com.waze.reports_v2.b.at.H;
                        break;
                    case 34:
                        atVar = com.waze.reports_v2.b.at.J;
                        break;
                    case 35:
                        atVar = com.waze.reports_v2.b.at.K;
                        break;
                    case 36:
                        atVar = com.waze.reports_v2.b.at.L;
                        break;
                    case 37:
                        atVar = com.waze.reports_v2.b.at.M;
                        break;
                    case 38:
                        atVar = com.waze.reports_v2.b.at.N;
                        break;
                    case 39:
                        atVar = com.waze.reports_v2.b.at.O;
                        break;
                    case 40:
                        atVar = com.waze.reports_v2.b.at.P;
                        break;
                    case 41:
                        atVar = com.waze.reports_v2.b.at.Q;
                        break;
                    case 42:
                        atVar = com.waze.reports_v2.b.at.R;
                        break;
                    case 43:
                        atVar = com.waze.reports_v2.b.at.S;
                        break;
                    case 44:
                        atVar = com.waze.reports_v2.b.at.T;
                        break;
                    case 45:
                        atVar = com.waze.reports_v2.b.at.U;
                        break;
                    case 46:
                        atVar = com.waze.reports_v2.b.at.V;
                        break;
                    case 47:
                        atVar = com.waze.reports_v2.b.at.W;
                        break;
                    case 48:
                        atVar = com.waze.reports_v2.b.at.Y;
                        break;
                    case 49:
                        atVar = com.waze.reports_v2.b.at.Z;
                        break;
                    case 50:
                        atVar = com.waze.reports_v2.b.at.aa;
                        break;
                    default:
                        throw new h.i();
                }
            } else {
                atVar = null;
            }
            Context contextRequireContext = bwVar.requireContext();
            h.g.b.x.e(contextRequireContext, "requireContext(...)");
            this.f34905a = 1;
            if (caVarC.a(atVar, "ReportMenuFragment", contextRequireContext, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
