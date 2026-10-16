package com.waze.settings;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.ix;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.utils.RequestPermissionActivity;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ew implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37198a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37199b;

    ew(Object obj, int i2) {
        this.f37199b = i2;
        this.f37198a = obj;
    }

    public static /* synthetic */ void e(final ew ewVar, final WazeSettingsView wazeSettingsView, com.waze.ifs.ui.a aVar, boolean z) {
        if (!z) {
            ewVar.f(false, wazeSettingsView);
            return;
        }
        final com.waze.ifs.ui.a aVar2 = aVar;
        final Consumer consumer = new Consumer() { // from class: com.waze.settings.fj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                this.f37260b.f(((Boolean) obj).booleanValue(), wazeSettingsView);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (ContextCompat.checkSelfPermission(aVar2, "android.permission.READ_PHONE_STATE") == 0) {
            consumer.u(true);
            return;
        }
        final int iE = com.waze.utils.o.e(com.waze.utils.f.ACTIVITY_RESULT);
        Intent intent = new Intent(aVar2, (Class<?>) RequestPermissionActivity.class);
        intent.putExtra("needed_permissions", new String[]{"android.permission.READ_PHONE_STATE"});
        com.waze.sharedui.a.e.aN(iE, new com.waze.sharedui.a.a() { // from class: com.waze.settings.gs

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f37343d = "android.permission.READ_PHONE_STATE";

            @Override // com.waze.sharedui.a.a
            public final void a(int i2) {
                if (i2 == iE) {
                    String str = this.f37343d;
                    consumer.u(Boolean.valueOf(ContextCompat.checkSelfPermission(aVar2, str) == 0));
                }
            }
        });
        aVar2.startActivityForResult(intent, iE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean z, WazeSettingsView wazeSettingsView) {
        gr grVar = (gr) this.f37198a;
        grVar.d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_DISPLAY_RETURN_TO_WAZE, z);
        grVar.d().J();
        if (z) {
            com.waze.t.j(wazeSettingsView.getContext());
        }
    }

    /* JADX WARN: Type inference failed for: r4v42, types: [com.waze.sound.fc, java.lang.Object] */
    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        switch (this.f37199b) {
            case 0:
                return ((gr) this.f37198a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS);
            case 1:
                return ((gr) this.f37198a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES);
            case 2:
                return ((ds) this.f37198a).f().getConfigValueBool(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENABLED);
            case 3:
                return ((gr) this.f37198a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_DISPLAY_RETURN_TO_WAZE) && com.waze.system.c.b();
            case 4:
                gr grVar = (gr) this.f37198a;
                return h.g.b.x.n(grVar.d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_AUTO_ZOOM), "speed") || h.g.b.x.n(grVar.d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_AUTO_ZOOM), "yes");
            case 5:
                return ((bs) ((ds) this.f37198a).A().d()).y();
            case 6:
                return ((ds) this.f37198a).f().getConfigValueBool(ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER);
            case 7:
                return ((gr) this.f37198a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS);
            case 8:
                return this.f37198a.d();
            case 9:
                return ((gr) this.f37198a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING);
            case 10:
                return ((gr) this.f37198a).f37329b.getColorRoads();
            case 11:
                return ((gr) this.f37198a).f37329b.getShowWazers();
            default:
                return ((gy) this.f37198a).p().m();
        }
    }

    /* JADX WARN: Type inference failed for: r12v30, types: [com.waze.sound.fc, java.lang.Object] */
    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        byte[] bArr = null;
        switch (this.f37199b) {
            case 0:
                ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS, z);
                break;
            case 1:
                ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES, z);
                break;
            case 2:
                ((ds) this.f37198a).f().setConfigValueBool(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENABLED, z);
                break;
            case 3:
                if (z && !com.waze.system.c.b()) {
                    h.g.b.x.c(view);
                    Context context = view.getContext();
                    com.waze.ifs.ui.a aVar = context instanceof com.waze.ifs.ui.a ? (com.waze.ifs.ui.a) context : null;
                    if (aVar != null) {
                        WazeSettingsView wazeSettingsView = (WazeSettingsView) view;
                        android.support.v4.app.n nVar = new android.support.v4.app.n(aVar, this, wazeSettingsView, 15, (char[]) null);
                        com.waze.beacons.p pVar = new com.waze.beacons.p(wazeSettingsView, 8);
                        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
                        com.waze.ab.o oVar = new com.waze.ab.o();
                        oVar.Q(aVarA.c(R.string.KEEP_WAZE_ON_TOP_POPUP_TITLE, new Object[0]));
                        oVar.P(aVarA.c(R.string.KEEP_WAZE_ON_TOP_POPUP_TEXT, new Object[0]));
                        oVar.M(aVarA.c(R.string.KEEP_WAZE_ON_TOP_POPUP_PRIMARY_BUTTON, new Object[0]));
                        oVar.N(aVarA.c(R.string.KEEP_WAZE_ON_TOP_POPUP_SECONDARY_BUTTON, new Object[0]));
                        oVar.R(true);
                        oVar.y(false);
                        oVar.f13808a = new com.waze.navigate.f(nVar, pVar, 6, bArr);
                        com.waze.z.a.d.ai.r(oVar, aVar);
                        break;
                    }
                } else {
                    ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_DISPLAY_RETURN_TO_WAZE, z);
                    break;
                }
                break;
            case 4:
                ((gr) this.f37198a).d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_AUTO_ZOOM, true != z ? "no" : "yes");
                break;
            case 5:
                ((ds) this.f37198a).Y(z);
                break;
            case 6:
                ((ds) this.f37198a).f().setConfigValueBool(ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER, z);
                break;
            case 7:
                ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS, z);
                break;
            case 8:
                this.f37198a.b(z);
                break;
            case 9:
                gr grVar = (gr) this.f37198a;
                grVar.d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING, z);
                grVar.d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS, "set");
                ix.k(z, h.a.i.i(Integer.valueOf(R.string.ADS_SETTINGS_TITLE), Integer.valueOf(R.string.ADS_SETTINGS_PROFILE_TARGETING_ITEM), Integer.valueOf(R.string.ADS_SETTINGS_PROFILE_TARGETING_DESCRIPTION)));
                break;
            case 10:
                ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_MAP_SHOW_TRAFFIC_JAMS, z);
                break;
            case 11:
                ((gr) this.f37198a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_MAP_SHOW_OTHER_WAZERS, z);
                break;
            default:
                Object obj = this.f37198a;
                if (!z) {
                    ((gy) obj).p().f(false);
                    break;
                } else {
                    kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope((ViewModel) obj), null, null, new u((gy) obj, (h.c.e) null, 8), 3);
                    break;
                }
        }
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
