package com.waze.settings.tree.b;

import com.waze.R;
import com.waze.settings.ds;
import com.waze.settings.gw;
import com.waze.settings.tree.d.g;
import com.waze.settings.tree.d.k;
import com.waze.settings.tree.d.l;
import com.waze.shared_infra.i.h;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import com.waze.uid.b.ab;
import com.waze.uid.c.z;
import h.a.i;
import h.g.b.x;
import java.util.List;
import l.a.aoh;
import l.a.brg;
import l.a.bri;
import l.a.bsq;
import l.a.bsr;
import l.a.bss;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37516a;

    public a(ds dsVar) {
        x.f(dsVar, "settingsRepository");
        this.f37516a = dsVar;
    }

    public final ds a() {
        return (ds) this.f37516a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final b b() {
        List listU = ((ds) this.f37516a).u();
        g[] gVarArr = new g[listU.size()];
        int size = listU.size();
        int i2 = R.drawable.setting_icon_gas;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            h.a("GAS TYPEXX: ".concat(String.valueOf(((gw) listU.get(i4)).f37359l)));
            String str = ((gw) listU.get(i4)).f37349b;
            int i5 = R.drawable.setting_icon_gas_regular;
            int i6 = R.drawable.gastype_gas_unselected;
            int i7 = R.drawable.gastype_gas_selected;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1487166104:
                        if (str.equals("petrol_premium")) {
                            i7 = R.drawable.gastype_gaspremium_selected;
                            i6 = R.drawable.gastype_gaspremium_unselected;
                            i5 = R.drawable.setting_icon_gaspremium;
                            break;
                        }
                        break;
                    case -1331959846:
                        if (str.equals("diesel")) {
                            i7 = R.drawable.gastype_diesel_selected;
                            i6 = R.drawable.gastype_diesel_unselected;
                            i5 = R.drawable.setting_icon_gas_diesel;
                            break;
                        }
                        break;
                    case -991657904:
                        str.equals("petrol");
                        break;
                    case -17124067:
                        if (str.equals("electric")) {
                            i7 = R.drawable.gastype_hybrid_selected;
                            i6 = R.drawable.gastype_hybrid_unselected;
                            i5 = R.drawable.setting_icon_gas_hybrid;
                            break;
                        }
                        break;
                    case 1478176962:
                        if (str.equals("self_service")) {
                            i7 = R.drawable.gastype_gasregularself_selected;
                            i6 = R.drawable.gastype_gasregularself_unselected;
                            i5 = R.drawable.setting_icon_gasregularself;
                            break;
                        }
                        break;
                }
            }
            boolean z = ((gw) listU.get(i4)).f37348a;
            if (true == z) {
                i3 = i4;
            }
            if (true == z) {
                i2 = i5;
            }
            gVarArr[i4] = new com.waze.settings.tree.d.a(String.valueOf(i4), com.waze.ui.ad.b.d(((gw) listU.get(i4)).f37350c), com.waze.nightmode.e.s(Integer.valueOf(i6)), com.waze.nightmode.e.s(Integer.valueOf(i7)));
        }
        b bVar = new b();
        bVar.d(h.a.c.R(gVarArr));
        bVar.e(i2);
        bVar.f(i3);
        return bVar;
    }

    public final List c() {
        return i.i(new l("license_plate_description", com.waze.ui.ad.b.c(Integer.valueOf(R.string.SETTINGS_LICENCE_PLATE_DESCRIPTION)), true), new k("license_plate_last_2_digits", "LICENSE_PLATE_LAST_2_DIGITS_SETTINGS", null, new e(this, 1), R.drawable.license_plate_icon, 3, true, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT));
    }

    public final List d() {
        List listV = ((ds) this.f37516a).v();
        g[] gVarArr = new g[listV.size() / 2];
        for (int i2 = 1; i2 < listV.size(); i2 += 2) {
            String str = (String) listV.get(i2);
            int iHashCode = str.hashCode();
            int i3 = R.drawable.vehicle_private_unselected;
            int i4 = R.drawable.vehicle_private_selected;
            int i5 = R.string.VEHICLE_PRIVATE_DESCRIPTION;
            if (iHashCode != 2567710) {
                if (iHashCode == 403485027) {
                    str.equals("PRIVATE");
                } else if (iHashCode == 871058833 && str.equals("MOTORCYCLE")) {
                    i5 = R.string.VEHICLE_MOTORCYCLE_DESCRIPTION;
                    i4 = R.drawable.vehicle_motorcylce_selected;
                    i3 = R.drawable.vehicle_motorcylce_unselected;
                }
            } else if (str.equals("TAXI")) {
                i5 = R.string.VEHICLE_TAXI_DESCRIPTION;
                i4 = R.drawable.vehicle_taxi_selected;
                i3 = R.drawable.vehicle_taxi_unselected;
            }
            gVarArr[i2 / 2] = new com.waze.settings.tree.d.a((String) listV.get(i2), com.waze.ui.ad.b.d((String) listV.get(i2 - 1)), com.waze.ui.ad.b.c(Integer.valueOf(i5)), com.waze.nightmode.e.s(Integer.valueOf(i3)), com.waze.nightmode.e.s(Integer.valueOf(i4)));
        }
        return h.a.c.R(gVarArr);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void e(z zVar, boolean z) {
        bsq bsqVar;
        aoh aohVar;
        x.f(zVar, "clickAction");
        bsr bsrVarNewBuilder = bss.newBuilder();
        z zVar2 = z.f44432a;
        switch (zVar.ordinal()) {
            case 0:
                bsqVar = bsq.BACK;
                break;
            case 1:
                bsqVar = bsq.GET_STARTED;
                break;
            case 2:
                bsqVar = bsq.LOGIN;
                break;
            case 3:
                bsqVar = bsq.PRIVACY_POLICY;
                break;
            case 4:
                bsqVar = bsq.TERMS_OF_SERVICE;
                break;
            case 5:
                bsqVar = bsq.CLICK;
                break;
            case 6:
                bsqVar = bsq.SWIPE;
                break;
            default:
                throw new h.i();
        }
        bsrVarNewBuilder.b(bsqVar);
        bsrVarNewBuilder.d(bsrVarNewBuilder.a());
        if (z) {
            aohVar = aoh.PRIMARY;
        } else {
            FlowContext flowContext = ((UidModel) ab.f44136a.a().b()).getFlowContext();
            FlowContext flowContext2 = FlowContext.OTHER;
            int iOrdinal = flowContext.ordinal();
            aohVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? aoh.CONTEXT_UNSPECIFIED : aoh.LOGIN_CONTEXT : aoh.WAZE_ONBOARDING : aoh.SETTINGS;
        }
        bsrVarNewBuilder.c(aohVar);
        x.e(bsrVarNewBuilder, "apply(...)");
        ?? r2 = this.f37516a;
        brg brgVarNewBuilder = bri.newBuilder();
        brgVarNewBuilder.z(bsrVarNewBuilder.build());
        bri briVarBuild = brgVarNewBuilder.build();
        x.e(briVarBuild, "build(...)");
        o.f(r2, briVarBuild);
    }

    public a(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f37516a = axVar;
    }
}
