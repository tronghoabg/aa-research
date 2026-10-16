package com.waze.google_assistant.a;

import com.waze.google_assistant.al;
import com.waze.google_assistant.am;
import com.waze.google_assistant.d;
import com.waze.google_assistant.e;
import com.waze.google_assistant.f;
import com.waze.google_assistant.g;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import h.i;
import l.a.aaa;
import l.a.aab;
import l.a.aac;
import l.a.aaj;
import l.a.aak;
import l.a.aam;
import l.a.zr;
import l.a.zs;
import l.a.zt;
import l.a.zu;
import l.a.zv;
import l.a.zw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    private final ax f24059b;

    public c(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f24059b = axVar;
    }

    @Override // com.waze.google_assistant.a.b
    public final void a(am amVar, al alVar) {
        zr zrVar;
        x.f(amVar, "action");
        x.f(alVar, "entryPoint");
        zs zsVarNewBuilder = zt.newBuilder();
        int iOrdinal = amVar.ordinal();
        if (iOrdinal == 0) {
            zrVar = zr.CONFIRM;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new i();
            }
            zrVar = zr.CLOSE;
        }
        zsVarNewBuilder.a(zrVar);
        zsVarNewBuilder.b(com.waze.aj.b.b(alVar));
        zt ztVarBuild = zsVarNewBuilder.build();
        x.e(ztVarBuild, "build(...)");
        aak aakVarNewBuilder = aam.newBuilder();
        aakVarNewBuilder.a(ztVarBuild);
        aam aamVarBuild = aakVarNewBuilder.build();
        x.e(aamVarBuild, "build(...)");
        o.q(this.f24059b, aamVarBuild);
    }

    @Override // com.waze.google_assistant.a.b
    public final void b(al alVar) {
        x.f(alVar, "entryPoint");
        zu zuVarNewBuilder = zv.newBuilder();
        zuVarNewBuilder.a(com.waze.aj.b.b(alVar));
        zv zvVarBuild = zuVarNewBuilder.build();
        x.e(zvVarBuild, "build(...)");
        aak aakVarNewBuilder = aam.newBuilder();
        aakVarNewBuilder.b(zvVarBuild);
        aam aamVarBuild = aakVarNewBuilder.build();
        x.e(aamVarBuild, "build(...)");
        o.q(this.f24059b, aamVarBuild);
    }

    @Override // com.waze.google_assistant.a.b
    public final void c(String str) {
        aaj aajVarE;
        com.waze.sharedui.d.a.b bVarD = e.c.b.d(aam.newBuilder());
        aab aabVarNewBuilder = aac.newBuilder();
        x.f(aabVarNewBuilder, "builder");
        if (str != null) {
            x.f(str, "value");
            aabVarNewBuilder.a(str);
        }
        if (str != null && (aajVarE = com.waze.z.a.e.b.e(str)) != null) {
            x.f(aajVarE, "value");
            aabVarNewBuilder.b(aajVarE);
        }
        ax axVar = this.f24059b;
        aac aacVarBuild = aabVarNewBuilder.build();
        x.e(aacVarBuild, "build(...)");
        bVarD.I(aacVarBuild);
        o.q(axVar, bVarD.G());
    }

    @Override // com.waze.google_assistant.a.b
    public final void d(g gVar, boolean z, f fVar, String str) {
        aaj aajVarE;
        x.f(gVar, "reportInfo");
        x.f(fVar, "direction");
        com.waze.sharedui.d.a.b bVarD = e.c.b.d(aam.newBuilder());
        com.waze.sharedui.d.a.b bVarE = e.b.c.e(aaa.newBuilder());
        bVarE.K(zw.SEND_REPORT);
        bVarE.R(z);
        bVarE.N(fVar.a());
        if (str != null) {
            bVarE.M(str);
        }
        if (str != null && (aajVarE = com.waze.z.a.e.b.e(str)) != null) {
            bVarE.Q(aajVarE);
        }
        ax axVar = this.f24059b;
        bVarE.P(gVar.b());
        bVarE.O(gVar.a());
        bVarD.H(bVarE.J());
        o.q(axVar, bVarD.G());
    }

    @Override // com.waze.google_assistant.a.b
    public final void e(e eVar, boolean z, d dVar, String str) {
        zw zwVarA;
        aaj aajVarE;
        com.waze.sharedui.d.a.b bVarD = e.c.b.d(aam.newBuilder());
        com.waze.sharedui.d.a.b bVarE = e.b.c.e(aaa.newBuilder());
        if (eVar == null || (zwVarA = eVar.a()) == null) {
            zwVarA = zw.ACTION_UNSPECIFIED;
        }
        bVarE.K(zwVarA);
        bVarE.R(z);
        if (dVar != null) {
            bVarE.L(dVar.a());
        }
        if (str != null) {
            bVarE.M(str);
        }
        if (str != null && (aajVarE = com.waze.z.a.e.b.e(str)) != null) {
            bVarE.Q(aajVarE);
        }
        ax axVar = this.f24059b;
        bVarD.H(bVarE.J());
        o.q(axVar, bVarD.G());
    }
}
