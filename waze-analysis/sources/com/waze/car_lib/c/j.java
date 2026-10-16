package com.waze.car_lib.c;

import com.waze.sharedui.utils.o;
import com.waze.sharedui.web.as;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.ack;
import l.a.acl;
import l.a.acm;
import l.a.acn;
import l.a.aco;
import l.a.acp;
import l.a.acq;
import l.a.act;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final ax f19251a;

    public j(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f19251a = axVar;
    }

    @Override // com.waze.car_lib.c.i
    public final void a(g gVar, boolean z) {
        ack ackVar;
        x.f(gVar, "clickedButton");
        as asVarF = e.c.h.f(act.newBuilder());
        acl aclVarNewBuilder = acn.newBuilder();
        x.f(aclVarNewBuilder, "builder");
        acq acqVar = acq.MAP;
        x.f(acqVar, "value");
        aclVarNewBuilder.a(acqVar);
        g gVar2 = g.f19228a;
        switch (gVar.ordinal()) {
            case 0:
                ackVar = ack.IN_CAR_BUTTON_HOME;
                break;
            case 1:
                ackVar = ack.IN_CAR_BUTTON_WORK;
                break;
            case 2:
                ackVar = ack.IN_CAR_BUTTON_FAVORITES;
                break;
            case 3:
                ackVar = ack.IN_CAR_BUTTON_SEARCH;
                break;
            case 4:
                ackVar = ack.IN_CAR_BUTTON_VOICE_ASSISTANT;
                break;
            case 5:
                ackVar = ack.IN_CAR_BUTTON_SETTINGS;
                break;
            case 6:
                ackVar = ack.IN_CAR_BUTTON_RECENTER;
                break;
            case 7:
                ackVar = ack.IN_CAR_BUTTON_ALTERNATE_ROUTES;
                break;
            case 8:
                ackVar = ack.IN_CAR_BUTTON_SOUNDS;
                break;
            case 9:
                ackVar = ack.IN_CAR_BUTTON_REPORT;
                break;
            case 10:
                ackVar = ack.IN_CAR_BUTTON_STOP_NAVIGATION;
                break;
            case 11:
                ackVar = ack.IN_CAR_BUTTON_ZOOM_IN;
                break;
            case 12:
                ackVar = ack.IN_CAR_BUTTON_ZOOM_OUT;
                break;
            default:
                throw new h.i();
        }
        x.f(ackVar, "value");
        aclVarNewBuilder.b(ackVar);
        acm acmVar = z ? acm.IN_CAR_SCREEN_MODE_AA_COOLWALK : acm.IN_CAR_SCREEN_MODE_AA_MAIN_SCREEN;
        ax axVar = this.f19251a;
        x.f(acmVar, "value");
        aclVarNewBuilder.c(acmVar);
        acn acnVarBuild = aclVarNewBuilder.build();
        x.e(acnVarBuild, "build(...)");
        asVarF.B(acnVarBuild);
        o.t(axVar, asVarF.A());
    }

    @Override // com.waze.car_lib.c.i
    public final void b(h hVar) {
        x.f(hVar, "mapButtons");
        as asVarF = e.c.h.f(act.newBuilder());
        aco acoVarNewBuilder = acp.newBuilder();
        x.f(acoVarNewBuilder, "builder");
        if (hVar.c()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_HOME, acoVarNewBuilder);
        }
        if (hVar.j()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_WORK, acoVarNewBuilder);
        }
        if (hVar.b()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_FAVORITES, acoVarNewBuilder);
        }
        if (hVar.f()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_SEARCH, acoVarNewBuilder);
        }
        if (hVar.g()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_SETTINGS, acoVarNewBuilder);
        }
        if (hVar.d()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_RECENTER, acoVarNewBuilder);
        }
        if (hVar.a()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_ALTERNATE_ROUTES, acoVarNewBuilder);
        }
        if (hVar.h()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_SOUNDS, acoVarNewBuilder);
        }
        if (hVar.e()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_REPORT, acoVarNewBuilder);
        }
        if (hVar.i()) {
            e.c.b.b(e.c.b.a(acoVarNewBuilder), ack.IN_CAR_BUTTON_STOP_NAVIGATION, acoVarNewBuilder);
        }
        ax axVar = this.f19251a;
        acp acpVarBuild = acoVarNewBuilder.build();
        x.e(acpVarBuild, "build(...)");
        asVarF.C(acpVarBuild);
        o.t(axVar, asVarF.A());
    }
}
