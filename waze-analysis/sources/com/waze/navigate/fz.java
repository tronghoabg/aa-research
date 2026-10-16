package com.waze.navigate;

import androidx.camera.video.AudioStats;
import l.a.biv;
import l.a.biw;
import l.a.bix;
import l.a.biy;
import l.a.biz;
import l.a.bja;
import l.a.bjb;
import l.a.bmb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fz implements fy {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f31400a;

    public fz(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f31400a = axVar;
    }

    @Override // com.waze.navigate.fy
    public final void a(fv fvVar) {
        biv bivVar;
        h.g.b.x.f(fvVar, "action");
        com.waze.shared_infra.s.c cVarM = h.b.a.m(bmb.newBuilder());
        biw biwVarNewBuilder = bix.newBuilder();
        h.g.b.x.f(biwVarNewBuilder, "builder");
        fx fxVar = fx.f31396a;
        fw fwVar = fw.f31385a;
        fv fvVar2 = fv.f31381a;
        int iOrdinal = fvVar.ordinal();
        if (iOrdinal == 0) {
            bivVar = biv.CLOSED;
        } else if (iOrdinal == 1) {
            bivVar = biv.URL_ACTION_CLICKED;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            bivVar = biv.HELP_URL_CLICKED;
        }
        com.waze.stats.ax axVar = this.f31400a;
        h.g.b.x.f(bivVar, "value");
        biwVarNewBuilder.a(bivVar);
        bix bixVarBuild = biwVarNewBuilder.build();
        h.g.b.x.e(bixVarBuild, "build(...)");
        cVarM.C(bixVarBuild);
        com.waze.sharedui.utils.o.J(axVar, cVarM.B());
    }

    @Override // com.waze.navigate.fy
    public final void b(NavigateTollPriceInformation navigateTollPriceInformation, ge geVar, gf gfVar) {
        fx fxVar;
        fw fwVar;
        h.g.b.x.f(navigateTollPriceInformation, "tollInfo");
        h.g.b.x.f(geVar, "source");
        h.g.b.x.f(gfVar, "messageType");
        fx fxVar2 = fx.f31396a;
        fw fwVar2 = fw.f31385a;
        fv fvVar = fv.f31381a;
        int iOrdinal = geVar.ordinal();
        if (iOrdinal == 0) {
            fxVar = fx.f31398c;
        } else if (iOrdinal == 1) {
            fxVar = fx.f31396a;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            fxVar = fx.f31397b;
        }
        fx fxVar3 = fxVar;
        switch (gfVar.ordinal()) {
            case 0:
                fwVar = fw.f31394j;
                break;
            case 1:
                fwVar = fw.f31385a;
                break;
            case 2:
                fwVar = fw.f31386b;
                break;
            case 3:
                fwVar = fw.f31387c;
                break;
            case 4:
                fwVar = fw.f31388d;
                break;
            case 5:
                fwVar = fw.f31389e;
                break;
            case 6:
                fwVar = fw.f31390f;
                break;
            case 7:
                fwVar = fw.f31391g;
                break;
            case 8:
                fwVar = fw.f31393i;
                break;
            case 9:
                fwVar = fw.f31392h;
                break;
            default:
                throw new h.i();
        }
        fw fwVar3 = fwVar;
        String str = navigateTollPriceInformation.tollRoadName;
        Double dValueOf = Double.valueOf(navigateTollPriceInformation.tollPrice);
        boolean z = dValueOf.doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE;
        Boolean.valueOf(z).getClass();
        Double d2 = true != z ? null : dValueOf;
        String str2 = navigateTollPriceInformation.tollCurrencyCode;
        if (str2 != null) {
            String str3 = str2;
            str = str3.length() != 0 ? str3 : null;
        }
        c(fxVar3, fwVar3, str, d2, str);
    }

    @Override // com.waze.navigate.fy
    public final void c(fx fxVar, fw fwVar, String str, Double d2, String str2) {
        biy biyVar;
        bja bjaVar;
        h.g.b.x.f(fxVar, "source");
        h.g.b.x.f(fwVar, "popupId");
        com.waze.shared_infra.s.c cVarM = h.b.a.m(bmb.newBuilder());
        biz bizVarNewBuilder = bjb.newBuilder();
        h.g.b.x.f(bizVarNewBuilder, "builder");
        if (str != null && str.length() > 0) {
            h.g.b.x.f(str, "value");
            bizVarNewBuilder.e(str);
        }
        if (d2 != null) {
            bizVarNewBuilder.c(d2.doubleValue());
        }
        if (str2 != null) {
            h.g.b.x.f(str2, "value");
            bizVarNewBuilder.d(str2);
        }
        fx fxVar2 = fx.f31396a;
        fw fwVar2 = fw.f31385a;
        fv fvVar = fv.f31381a;
        int iOrdinal = fxVar.ordinal();
        if (iOrdinal == 0) {
            biyVar = biy.TRIP_OVERVIEW_SCREEN;
        } else if (iOrdinal == 1) {
            biyVar = biy.ALTERNATE_ROUTES_SCREEN;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            biyVar = biy.ETA_SCREEN;
        }
        h.g.b.x.f(biyVar, "value");
        bizVarNewBuilder.a(biyVar);
        switch (fwVar.ordinal()) {
            case 0:
                bjaVar = bja.TOLL_INFO_MISSING_PASS;
                break;
            case 1:
                bjaVar = bja.TOLL_INFO_MISSING_PASS_WITH_PRICE;
                break;
            case 2:
                bjaVar = bja.TOLL_INFO_PRICE_CHANGE;
                break;
            case 3:
                bjaVar = bja.TOLL_INFO_PRICE_CHANGE_BY_TIME;
                break;
            case 4:
                bjaVar = bja.TOLL_INFO_WITH_PASS;
                break;
            case 5:
                bjaVar = bja.TOLL_INFO_DEFAULT;
                break;
            case 6:
                bjaVar = bja.TOLL_INFO_NO_PRICE;
                break;
            case 7:
                bjaVar = bja.TOLL_INFO_DISABLED_BY_CONFIG;
                break;
            case 8:
                bjaVar = bja.TOLL_INFO_DYNAMIC_PRICE_SHOWN;
                break;
            case 9:
                bjaVar = bja.TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN;
                break;
            default:
                throw new h.i();
        }
        com.waze.stats.ax axVar = this.f31400a;
        h.g.b.x.f(bjaVar, "value");
        bizVarNewBuilder.b(bjaVar);
        bjb bjbVarBuild = bizVarNewBuilder.build();
        h.g.b.x.e(bjbVarBuild, "build(...)");
        cVarM.D(bjbVarBuild);
        com.waze.sharedui.utils.o.J(axVar, cVarM.B());
    }
}
