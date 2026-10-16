package com.waze.sdk;

import l.a.ako;
import l.a.akq;
import l.a.brd;
import l.a.brf;
import l.a.gc;
import l.a.gd;
import l.a.ge;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn implements bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f35359a;

    public bn(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatsReporter");
        this.f35359a = axVar;
    }

    @Override // com.waze.sdk.bm
    public final void a(bl blVar, String str) {
        gc gcVar;
        h.g.b.x.f(blVar, "action");
        h.g.b.x.f(str, "partnerAppPackageName");
        bl blVar2 = bl.f35347a;
        switch (blVar.ordinal()) {
            case 0:
                gcVar = gc.FORWARD;
                break;
            case 1:
                gcVar = gc.NEXT;
                break;
            case 2:
                gcVar = gc.RESUME;
                break;
            case 3:
                gcVar = gc.COLLAPSE;
                break;
            case 4:
                gcVar = gc.PLAY;
                break;
            case 5:
                gcVar = gc.REWIND;
                break;
            case 6:
                gcVar = gc.SHOW_LIST;
                break;
            case 7:
                gcVar = gc.SETTINGS;
                break;
            case 8:
                gcVar = gc.PAUSE;
                break;
            case 9:
                gcVar = gc.OPEN_PARTNER_APP;
                break;
            case 10:
                gcVar = gc.PREVIOUS;
                break;
            case 11:
                gcVar = gc.CHANGE_APP;
                break;
            case 12:
                gcVar = gc.SHUFFLE;
                break;
            case 13:
                gcVar = gc.THUMB_DOWN;
                break;
            case 14:
                gcVar = gc.FAVORITE;
                break;
            case 15:
                gcVar = gc.SAVE;
                break;
            case 16:
                gcVar = gc.REPEAT;
                break;
            case 17:
                gcVar = gc.THUMB_UP;
                break;
            default:
                throw new h.i();
        }
        ako akoVarNewBuilder = akq.newBuilder();
        gd gdVarNewBuilder = ge.newBuilder();
        gdVarNewBuilder.a(gcVar);
        gdVarNewBuilder.b(str);
        akoVarNewBuilder.b(gdVarNewBuilder.build());
        akq akqVarBuild = akoVarNewBuilder.build();
        h.g.b.x.e(akqVarBuild, "build(...)");
        com.waze.stats.ax axVar = this.f35359a;
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.z(akqVarBuild);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(axVar, brfVarBuild);
    }
}
