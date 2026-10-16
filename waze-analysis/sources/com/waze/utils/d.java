package com.waze.utils;

import android.util.Log;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.navigate.DriveToNativeManager;
import com.waze.settings.SettingsNativeManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f44859a;

    /* renamed from: f, reason: collision with root package name */
    private int f44864f;

    /* renamed from: b, reason: collision with root package name */
    private String[] f44860b = null;

    /* renamed from: c, reason: collision with root package name */
    private String[] f44861c = null;

    /* renamed from: d, reason: collision with root package name */
    private String[] f44862d = null;

    /* renamed from: e, reason: collision with root package name */
    private String[] f44863e = null;

    /* renamed from: g, reason: collision with root package name */
    private final List f44865g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f44866h = new Object();

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        dVar = f44859a;
        if (dVar == null) {
            dVar = new d();
            f44859a = dVar;
        }
        return dVar;
    }

    public static /* synthetic */ h.ab b(d dVar, boolean z, SettingsValueListProto settingsValueListProto) {
        h.ab abVar;
        if (settingsValueListProto == null || settingsValueListProto.getValuesList().isEmpty()) {
            return h.ab.f48028a;
        }
        if (!z) {
            dVar.f44862d = new String[settingsValueListProto.getValuesList().size()];
            dVar.f44863e = new String[settingsValueListProto.getValuesList().size()];
        }
        for (int i2 = 0; i2 < settingsValueListProto.getValuesList().size(); i2++) {
            if (!z) {
                dVar.f44862d[i2] = settingsValueListProto.getValuesList().get(i2).getValue();
                dVar.f44863e[i2] = com.waze.shared_infra.o.b.a().b(settingsValueListProto.getValuesList().get(i2).getDisplay());
            }
            settingsValueListProto.getValuesList().get(i2).getIsSelected();
        }
        String strE = dVar.e();
        String configValueString = ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE);
        if (dVar.f44861c != null) {
            if (configValueString.equals("UNDEFINED")) {
                ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE, dVar.f44861c[dVar.f44864f]);
            } else if (!z && !configValueString.equals(strE)) {
                com.waze.shared_infra.i.h.a("SETTING VEHICLE TYPE TO PERMANENT ".concat(String.valueOf(configValueString)));
                ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE, configValueString);
                dVar.e();
            }
        }
        synchronized (dVar.f44866h) {
            List list = dVar.f44865g;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            list.clear();
            abVar = h.ab.f48028a;
        }
        return abVar;
    }

    private final String e() {
        String configValueString = ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
        int i2 = 0;
        while (true) {
            String[] strArr = this.f44861c;
            if (i2 >= strArr.length) {
                return configValueString;
            }
            if (strArr[i2].equals(configValueString)) {
                this.f44864f = i2;
                return configValueString;
            }
            i2++;
        }
    }

    public final boolean c() {
        String[] strArr = this.f44863e;
        return (strArr == null || strArr.length <= 0 || this.f44861c == null) ? false : true;
    }

    public final void d() {
        int length;
        synchronized (this.f44866h) {
        }
        boolean zC = c();
        if (!zC) {
            String[] strArrConfigGetVehicleTypes = ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).configGetVehicleTypes();
            if (strArrConfigGetVehicleTypes == null || (length = strArrConfigGetVehicleTypes.length) < 2) {
                Log.i("CarGasManager", "vehicle types was empty or invalid: ".concat(String.valueOf(Arrays.toString(strArrConfigGetVehicleTypes))));
                return;
            }
            int i2 = length >> 1;
            this.f44860b = new String[i2];
            this.f44861c = new String[i2];
            for (int i3 = 1; i3 < strArrConfigGetVehicleTypes.length; i3 += 2) {
                int i4 = i3 / 2;
                this.f44861c[i4] = strArrConfigGetVehicleTypes[i3];
                this.f44860b[i4] = strArrConfigGetVehicleTypes[i3 - 1];
            }
        }
        ((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).loadGasTypes(new com.waze.main_screen.c.c.b(this, zC, 7));
    }
}
