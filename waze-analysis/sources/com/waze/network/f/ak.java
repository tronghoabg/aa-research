package com.waze.network.f;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.jni.protos.settings.SettingsValueProto;
import com.waze.settings.bs;
import com.waze.settings.de;
import com.waze.settings.dt;
import com.waze.settings.du;
import com.waze.settings.dw;
import com.waze.settings.dy;
import com.waze.settings.dz;
import com.waze.settings.ea;
import com.waze.settings.gw;
import com.waze.settings.he;
import com.waze.sound.bu;
import h.g.b.ar;
import l.a.aaz;
import l.a.atk;
import l.a.awx;
import l.a.bpn;
import l.a.yl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak {
    public static final void a() {
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new aj((ag) com.waze.web.r.m(ag.class), null), 3);
    }

    public static final boolean b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "onLogout");
        ag agVar = (ag) com.waze.web.r.m(ag.class);
        af afVar = (af) agVar.d().d();
        if (afVar == null) {
            return false;
        }
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new ai(agVar, afVar, lVar, null), 3);
        return true;
    }

    public static final awx c(com.waze.sharedui.h.i iVar) {
        h.g.b.x.f(iVar, "<this>");
        com.waze.sharedui.h.a aVar = com.waze.sharedui.h.a.f39016a;
        switch (iVar.ordinal()) {
            case 0:
                return awx.USE_CASE_ALTERNATIVE_ROUTES;
            case 1:
                return awx.USE_CASE_CLOSURE_REROUTE;
            case 2:
                return awx.USE_CASE_MAIN_NAVIGATION;
            case 3:
                return awx.USE_CASE_NA_1;
            case 4:
                return awx.USE_CASE_OFFLINE_RECOVERY;
            case 5:
                return awx.USE_CASE_REROUTE;
            case 6:
                return awx.USE_CASE_REROUTE_SUGGESTION;
            case 7:
                return awx.USE_CASE_RESUME_NAVIGATION;
            case 8:
                return awx.USE_CASE_SETTINGS_CHANGED;
            case 9:
                return awx.USE_CASE_TRIP_OVERVIEW;
            case 10:
                return awx.USE_CASE_WAYPOINT_MISSING;
            case 11:
                return awx.USE_CASE_USER_DEVIATION_REROUTE;
            case 12:
                return awx.USE_CASE_CANCEL_WAYPOINT;
            case 13:
                return awx.USE_CASE_DEBUG_REROUTE;
            case 14:
                return awx.USE_CASE_ETA_RANGE;
            case 15:
                return awx.USE_CASE_GET_WALKING_ETA_TO_PARKING_LOTS;
            case 16:
                return awx.USE_CASE_PARKING_ETA;
            case 17:
                return awx.USE_CASE_UNSPECIFIED;
            case 18:
                return awx.USE_CASE_PERIODIC_RETRY;
            case 19:
                return awx.USE_CASE_SELECT_VENUE_ENTRY_POINT;
            case 20:
                return awx.USE_CASE_TRIP_OVERVIEW_V2;
            default:
                throw new h.i();
        }
    }

    public static com.waze.notifications.b.d d() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = com.waze.notifications.b.d.f32557a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.notifications.b.d.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.notifications.b.d.class);
        }
        return (com.waze.notifications.b.d) bVarC.a(mVar, null, null);
    }

    public static final com.waze.nightmode.k e(String str) {
        h.g.b.x.f(str, "value");
        for (com.waze.nightmode.k kVar : com.waze.nightmode.k.values()) {
            if (h.g.b.x.n(kVar.a(), str)) {
                return kVar;
            }
        }
        return com.waze.nightmode.k.f32476d;
    }

    public static final /* synthetic */ Boolean f(com.waze.bo.b.a aVar) {
        dz dzVar = dz.f37105a;
        dy dyVar = dy.f37098a;
        dt dtVar = dt.f37074a;
        du duVar = du.f37086a;
        com.waze.bo.b.a aVar2 = com.waze.bo.b.a.f17176a;
        ea eaVar = ea.f37159a;
        com.waze.bo.b.b bVar = com.waze.bo.b.b.f17180a;
        dw dwVar = dw.f37091a;
        bu buVar = bu.f39572a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return null;
        }
        throw new h.i();
    }

    public static final /* synthetic */ yl g(dy dyVar) {
        dz dzVar = dz.f37105a;
        dt dtVar = dt.f37074a;
        du duVar = du.f37086a;
        com.waze.bo.b.a aVar = com.waze.bo.b.a.f17176a;
        ea eaVar = ea.f37159a;
        com.waze.bo.b.b bVar = com.waze.bo.b.b.f17180a;
        dw dwVar = dw.f37091a;
        bu buVar = bu.f39572a;
        int iOrdinal = dyVar.ordinal();
        if (iOrdinal == 0) {
            return yl.SETTING_ACTION_VIEW;
        }
        if (iOrdinal == 1) {
            return yl.SETTING_ACTION_BACK;
        }
        if (iOrdinal == 2) {
            return yl.SETTING_ACTION_CHANGE;
        }
        if (iOrdinal == 3) {
            return yl.SETTING_ACTION_CLICK;
        }
        if (iOrdinal == 4) {
            return yl.SETTING_ACTION_CLOSE;
        }
        if (iOrdinal == 5) {
            return yl.SETTING_ACTION_SAVE;
        }
        throw new h.i();
    }

    public static final /* synthetic */ aaz h(dw dwVar) {
        dz dzVar = dz.f37105a;
        dy dyVar = dy.f37098a;
        dt dtVar = dt.f37074a;
        du duVar = du.f37086a;
        com.waze.bo.b.a aVar = com.waze.bo.b.a.f17176a;
        ea eaVar = ea.f37159a;
        com.waze.bo.b.b bVar = com.waze.bo.b.b.f17180a;
        dw dwVar2 = dw.f37091a;
        bu buVar = bu.f39572a;
        int iOrdinal = dwVar.ordinal();
        if (iOrdinal == 0) {
            return aaz.SOUND_ON;
        }
        if (iOrdinal == 1) {
            return aaz.SOUND_OFF;
        }
        if (iOrdinal == 2) {
            return aaz.ALERTS_ONLY;
        }
        if (iOrdinal == 3) {
            return aaz.LESS_CHATTY;
        }
        if (iOrdinal == 4) {
            return aaz.SMART_GUIDANCE;
        }
        throw new h.i();
    }

    public static final /* synthetic */ atk i(com.waze.bo.b.b bVar) {
        dz dzVar = dz.f37105a;
        dy dyVar = dy.f37098a;
        dt dtVar = dt.f37074a;
        du duVar = du.f37086a;
        com.waze.bo.b.a aVar = com.waze.bo.b.a.f17176a;
        ea eaVar = ea.f37159a;
        dw dwVar = dw.f37091a;
        bu buVar = bu.f39572a;
        if (bVar.ordinal() == 0) {
            return atk.QUICK_ROUTE_SETTINGS_CONTEXT_TRIP_OVERVIEW;
        }
        throw new h.i();
    }

    public static final /* synthetic */ bpn j(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 2567710) {
            if (iHashCode != 403485027) {
                if (iHashCode == 871058833 && str.equals("MOTORCYCLE")) {
                    return bpn.MOTORCYCLE;
                }
            } else if (str.equals("PRIVATE")) {
                return bpn.PRIVATE;
            }
        } else if (str.equals("TAXI")) {
            return bpn.TAXI;
        }
        return bpn.TYPE_UNSPECIFIED;
    }

    public static final com.waze.shared_infra.q.i k(bs bsVar) {
        h.g.b.x.f(bsVar, "<this>");
        com.waze.shared_infra.q.i iVarF = bsVar.f();
        if (iVarF != null) {
            return iVarF;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String l(bs bsVar) {
        h.g.b.x.f(bsVar, "<this>");
        return bsVar.x() ? bsVar.k() : bsVar.n();
    }

    public static final String m(he heVar) {
        String strB;
        h.g.b.x.f(heVar, "<this>");
        String strB2 = heVar.b();
        if ((strB2 == null || strB2.length() == 0) && ((strB = heVar.b()) == null || strB.length() == 0)) {
            return null;
        }
        return heVar.b() + " " + heVar.d();
    }

    public static final boolean n(he heVar) {
        String strE;
        h.g.b.x.f(heVar, "<this>");
        String strC = heVar.c();
        return (strC == null || strC.length() == 0 || (strE = heVar.e()) == null || strE.length() == 0) ? false : true;
    }

    public static final gw o(SettingsValueProto settingsValueProto) {
        h.g.b.x.f(settingsValueProto, "<this>");
        return new gw(settingsValueProto.getValue(), settingsValueProto.getDisplay(), settingsValueProto.getIsSelected(), settingsValueProto.getType());
    }

    public static final com.waze.ifs.ui.a p(de deVar) {
        h.g.b.x.f(deVar, "<this>");
        Context contextG = deVar.g();
        if (contextG instanceof com.waze.ifs.ui.a) {
            return (com.waze.ifs.ui.a) contextG;
        }
        return null;
    }

    public static final kotlinx.coroutines.af q(de deVar) {
        h.g.b.x.f(deVar, "<this>");
        return LifecycleOwnerKt.getLifecycleScope(deVar.h());
    }
}
