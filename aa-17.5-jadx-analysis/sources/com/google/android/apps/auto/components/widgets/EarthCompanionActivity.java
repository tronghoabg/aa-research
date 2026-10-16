package com.google.android.apps.auto.components.widgets;

import android.app.ActivityOptions;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.hardware.info.EnergyProfile;
import defpackage.aezr;
import defpackage.affw;
import defpackage.cct;
import defpackage.ero;
import defpackage.lec;
import defpackage.ndw;
import defpackage.njg;
import defpackage.ob;
import defpackage.od;
import defpackage.opo;
import defpackage.opp;
import defpackage.opr;
import defpackage.oqc;
import defpackage.ot;
import defpackage.ype;
import defpackage.yph;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0017"}, d2 = {"Lcom/google/android/apps/auto/components/widgets/EarthCompanionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/google/android/apps/auto/components/widgets/WidgetViewModel;", "getViewModel", "()Lcom/google/android/apps/auto/components/widgets/WidgetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "java.com.google.android.apps.auto.components.widgets_widgets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EarthCompanionActivity extends ob {
    private static final yph a = yph.c("GH.EarthCompanion");
    private final aezr b = new ero(affw.b(oqc.class), new ndw(this, 14), new ndw(this, 13), new ndw(this, 15));

    private static final void b(EarthCompanionActivity earthCompanionActivity, opo opoVar) {
        a.l().y("Widget status: %s", opoVar);
        int i = opoVar.a;
        if (i == 0) {
            earthCompanionActivity.a().a(opoVar.b);
            return;
        }
        if (i != 1) {
            opp oppVar = opr.a;
            AppWidgetManager appWidgetManager = oppVar.a().e;
            int i2 = opoVar.b;
            appWidgetManager.getAppWidgetInfo(i2);
            oppVar.a().f.startAppWidgetConfigureActivityForResult(earthCompanionActivity, i2, 0, 102, ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            return;
        }
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
        intent.putExtra("appWidgetId", opoVar.b);
        AppWidgetProviderInfo appWidgetProviderInfo = opoVar.c;
        intent.putExtra("appWidgetProvider", appWidgetProviderInfo.provider);
        intent.putExtra("appWidgetProviderProfile", appWidgetProviderInfo.getProfile());
        earthCompanionActivity.startActivityForResult(intent, EnergyProfile.EVCONNECTOR_TYPE_OTHER);
    }

    public final oqc a() {
        return (oqc) this.b.a();
    }

    @Override // defpackage.ob, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) throws JSONException, PackageManager.NameNotFoundException {
        opo opoVar;
        super.onActivityResult(i, i2, intent);
        yph yphVar = a;
        yphVar.l().R("onActivityResult(%s, %s, %s)", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i == 100) {
            if (i2 == -1) {
                AppWidgetProviderInfo appWidgetProviderInfo = intent != null ? (AppWidgetProviderInfo) intent.getParcelableExtra("widget_info") : null;
                if (appWidgetProviderInfo == null) {
                    ((ype) yphVar.h()).u("No AppWidgetProviderInfo from picker");
                    return;
                }
                opr oprVarA = opr.a.a();
                int iAllocateAppWidgetId = oprVarA.f.allocateAppWidgetId();
                oprVarA.h = iAllocateAppWidgetId;
                if (oprVarA.e.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, appWidgetProviderInfo.provider)) {
                    opr.c.l().y("Can bind widget for: %s", appWidgetProviderInfo.provider);
                    opoVar = oprVarA.b(iAllocateAppWidgetId, appWidgetProviderInfo);
                } else {
                    opr.c.l().y("Need bind widget for: %s", appWidgetProviderInfo.provider);
                    opoVar = new opo(1, iAllocateAppWidgetId, appWidgetProviderInfo);
                }
                b(this, opoVar);
                return;
            }
            i = 100;
        }
        if (i == 101) {
            if (i2 == -1) {
                int intExtra = intent != null ? intent.getIntExtra("appWidgetId", -1) : opr.a.a().h;
                if (intExtra == -1) {
                    ((ype) yphVar.h()).u("Unable to find widget id after bind");
                    return;
                }
                opp oppVar = opr.a;
                AppWidgetProviderInfo appWidgetInfo = oppVar.a().e.getAppWidgetInfo(intExtra);
                if (appWidgetInfo == null) {
                    ((ype) yphVar.h()).w("Unable to find AppWidgetInfo after bind for %s", intExtra);
                    return;
                } else {
                    b(this, oppVar.a().b(intExtra, appWidgetInfo));
                    return;
                }
            }
            i = 101;
        }
        if (i != 102 || i2 != -1) {
            if (i == 103 && i2 == -1) {
                yphVar.l().u("Widget reconfigured successfully");
                return;
            }
            return;
        }
        int intExtra2 = intent != null ? intent.getIntExtra("appWidgetId", -1) : opr.a.a().h;
        if (intExtra2 == -1) {
            ((ype) yphVar.h()).u("Unable to find widget id after configure");
            return;
        }
        opp oppVar2 = opr.a;
        AppWidgetProviderInfo appWidgetInfo2 = oppVar2.a().e.getAppWidgetInfo(intExtra2);
        if (appWidgetInfo2 == null) {
            ((ype) yphVar.h()).w("Unable to find AppWidgetInfo after configure for %s", intExtra2);
        } else {
            oppVar2.a().g(intExtra2, appWidgetInfo2);
            a().a(intExtra2);
        }
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!lec.a.a().f()) {
            finish();
        } else {
            od.a(this);
            ot.a(this, new cct(1305488613, true, new njg(this, 15)));
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        opr.a.a().f.startListening();
    }

    @Override // android.app.Activity
    protected final void onStop() {
        super.onStop();
        opr.a.a().f.stopListening();
    }
}
