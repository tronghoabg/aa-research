package com.waze.mywaze;

import android.content.Intent;
import android.support.v4.app.ar;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.waze.NativeManager;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.gp;
import com.waze.lm;
import com.waze.navigate.DriveToNativeManager;
import com.waze.reports.GasPriceReportActivity;
import com.waze.reports.NearbyGasStationsActivity;
import com.waze.reports.ax;
import com.waze.reports.di;
import com.waze.reports.dj;
import com.waze.reports.dr;
import com.waze.reports_v2.c.ck;
import com.waze.sharedui.views.WazeSwitchView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30584a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30585b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f30585b = i2;
        this.f30584a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f30585b) {
            case 0:
                l.r((l) this.f30584a);
                break;
            case 1:
                ax.K((ax) this.f30584a);
                break;
            case 2:
                ((ar) this.f30584a).requireActivity().onBackPressed();
                break;
            case 3:
                ((GasPriceReportActivity) this.f30584a).finish();
                break;
            case 4:
                int i2 = GasPriceReportActivity.f33545f;
                ((WazeSwitchView) this.f30584a).c();
                break;
            case 5:
                ((GasPriceReportActivity) this.f30584a).Q(0);
                break;
            case 6:
                GasPriceReportActivity.K((GasPriceReportActivity) this.f30584a);
                break;
            case 7:
                GasPriceReportActivity.I((GasPriceReportActivity) this.f30584a);
                break;
            case 8:
                GasPriceReportActivity.H((GasPriceReportActivity) this.f30584a);
                break;
            case 9:
                ((GasPriceReportActivity) this.f30584a).Q(r3.p - 1);
                break;
            case 10:
                GasPriceReportActivity gasPriceReportActivity = (GasPriceReportActivity) this.f30584a;
                gasPriceReportActivity.Q(gasPriceReportActivity.p + 1);
                break;
            case 11:
                ((GasPriceReportActivity) this.f30584a).N();
                break;
            case 12:
                ((ComponentActivity) this.f30584a).onBackPressed();
                break;
            case 13:
                NearbyGasStationsActivity nearbyGasStationsActivity = (NearbyGasStationsActivity) this.f30584a;
                nearbyGasStationsActivity.setResult(-1);
                nearbyGasStationsActivity.finish();
                break;
            case 14:
                di diVar = (di) this.f30584a;
                diVar.L();
                dj djVar = diVar.w;
                if (djVar == null) {
                    com.waze.sharedui.a.e eVarE = lm.d().e();
                    if (eVarE != null) {
                        eVarE.startActivityForResult(new Intent(eVarE, (Class<?>) SpeechRecognizerActivity.class), 32790);
                        break;
                    }
                } else {
                    djVar.a(new Intent(diVar.getContext(), (Class<?>) SpeechRecognizerActivity.class));
                    break;
                }
                break;
            case 15:
                ((di) this.f30584a).H();
                break;
            case 16:
                ((di) this.f30584a).o();
                break;
            case 17:
                com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34565c, new ck(com.waze.reports_v2.b.ad.f34019c));
                if (!NativeManager.getInstance().hasNetworkNTV()) {
                    com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("ReportMenu", new gp(this.f30584a, 16)));
                    break;
                } else {
                    ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).searchNearbyStations();
                    break;
                }
            case 18:
                com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34564b, null);
                ((dr) this.f30584a).D();
                break;
            case 19:
                com.waze.reports_v2.d.j.f34595a.a().y(com.waze.reports_v2.d.d.f34564b, null);
                ((dr) this.f30584a).D();
                break;
            default:
                dr.s((dr) this.f30584a, view);
                break;
        }
    }
}
