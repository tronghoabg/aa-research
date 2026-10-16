package com.waze.planned_drive;

import l.a.aqs;
import l.a.aqt;
import l.a.aqu;
import l.a.aqv;
import l.a.aqw;
import l.a.aqx;
import l.a.aqy;
import l.a.aqz;
import l.a.arb;
import l.a.axn;
import l.a.axo;
import l.a.axp;
import l.a.brd;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl implements bk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f33262a;

    public bl(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f33262a = axVar;
    }

    private final void d(aqz aqzVar) {
        brd brdVarNewBuilder = brf.newBuilder();
        h.g.b.x.e(brdVarNewBuilder, "newBuilder(...)");
        brdVarNewBuilder.G(aqzVar);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(this.f33262a, brfVarBuild);
    }

    @Override // com.waze.planned_drive.bk
    public final void a(bh bhVar) {
        aqs aqsVar;
        h.g.b.x.f(bhVar, "action");
        aqt aqtVarNewBuilder = aqu.newBuilder();
        h.g.b.x.e(aqtVarNewBuilder, "newBuilder(...)");
        bj bjVar = bj.f33256a;
        bi biVar = bi.f33253a;
        bg bgVar = bg.f33240a;
        bh bhVar2 = bh.f33244a;
        switch (bhVar.ordinal()) {
            case 0:
                aqsVar = aqs.ACTION_UNSPECIFIED;
                break;
            case 1:
                aqsVar = aqs.ADD;
                break;
            case 2:
                aqsVar = aqs.BACK;
                break;
            case 3:
                aqsVar = aqs.CALENDAR_DRIVE;
                break;
            case 4:
                aqsVar = aqs.NOTIFICATION_TOGGLE;
                break;
            case 5:
                aqsVar = aqs.NAVIGATE_TO_PLANNED_DRIVE;
                break;
            case 6:
                aqsVar = aqs.SETTINGS;
                break;
            case 7:
                aqsVar = aqs.CALENDAR_SYNC;
                break;
            default:
                throw new h.i();
        }
        aqtVarNewBuilder.a(aqsVar);
        aqz aqzVarNewBuilder = arb.newBuilder();
        h.g.b.x.e(aqzVarNewBuilder, "newBuilder(...)");
        aqzVarNewBuilder.a(aqtVarNewBuilder);
        d(aqzVarNewBuilder);
    }

    @Override // com.waze.planned_drive.bk
    public final void b(bi biVar, bg bgVar) {
        aqx aqxVar;
        aqw aqwVar;
        h.g.b.x.f(biVar, "screenState");
        h.g.b.x.f(bgVar, "toggleState");
        aqv aqvVarNewBuilder = aqy.newBuilder();
        h.g.b.x.e(aqvVarNewBuilder, "newBuilder(...)");
        bj bjVar = bj.f33256a;
        bi biVar2 = bi.f33253a;
        bg bgVar2 = bg.f33240a;
        bh bhVar = bh.f33244a;
        int iOrdinal = biVar.ordinal();
        if (iOrdinal == 0) {
            aqxVar = aqx.HAS_PLANNED_DRIVES;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            aqxVar = aqx.NO_ACTIVE_PLANNED_DRIVES;
        }
        aqvVarNewBuilder.b(aqxVar);
        int iOrdinal2 = bgVar.ordinal();
        if (iOrdinal2 == 0) {
            aqwVar = aqw.NOT_SHOWN;
        } else if (iOrdinal2 == 1) {
            aqwVar = aqw.OFF;
        } else {
            if (iOrdinal2 != 2) {
                throw new h.i();
            }
            aqwVar = aqw.ON;
        }
        aqvVarNewBuilder.a(aqwVar);
        aqz aqzVarNewBuilder = arb.newBuilder();
        h.g.b.x.e(aqzVarNewBuilder, "newBuilder(...)");
        aqzVarNewBuilder.b(aqvVarNewBuilder);
        d(aqzVarNewBuilder);
    }

    @Override // com.waze.planned_drive.bk
    public final void c(bj bjVar) {
        axo axoVar;
        h.g.b.x.f(bjVar, "context");
        axn axnVarNewBuilder = axp.newBuilder();
        h.g.b.x.e(axnVarNewBuilder, "newBuilder(...)");
        bj bjVar2 = bj.f33256a;
        bi biVar = bi.f33253a;
        bg bgVar = bg.f33240a;
        bh bhVar = bh.f33244a;
        int iOrdinal = bjVar.ordinal();
        if (iOrdinal == 0) {
            axoVar = axo.TRIP_OVERVIEW_SCREEN;
        } else if (iOrdinal == 1) {
            axoVar = axo.ETA_SCREEN;
        } else if (iOrdinal == 2) {
            axoVar = axo.PLANNED_DRIVE_SCREEN;
        } else if (iOrdinal == 3) {
            axoVar = axo.SAVED_PLANNED_DRIVE_EDIT_TIME;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            axoVar = axo.CONTEXT_UNSPECIFIED;
        }
        axnVarNewBuilder.a(axoVar);
        aqz aqzVarNewBuilder = arb.newBuilder();
        h.g.b.x.e(aqzVarNewBuilder, "newBuilder(...)");
        aqzVarNewBuilder.d(axnVarNewBuilder);
        d(aqzVarNewBuilder);
    }
}
