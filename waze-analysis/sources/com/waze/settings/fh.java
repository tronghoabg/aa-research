package com.waze.settings;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fh implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37255a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37256b;

    fh(Object obj, int i2) {
        this.f37256b = i2;
        this.f37255a = obj;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        int i2 = this.f37256b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        int i2 = this.f37256b;
        if (i2 == 0) {
            return String.valueOf(((ds) this.f37255a).a());
        }
        if (i2 == 1) {
            String configValueString = ((ds) this.f37255a).f().getConfigValueString(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_MESSAGE);
            h.g.b.x.e(configValueString, "getConfigValueString(...)");
            return configValueString;
        }
        if (i2 == 2) {
            return String.valueOf(((gr) this.f37255a).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_PRIVACY_USE_LOCATION_IN_BG));
        }
        if (i2 == 3) {
            String configValueString2 = ((gr) this.f37255a).d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
            h.g.b.x.e(configValueString2, "getConfigValueString(...)");
            return configValueString2;
        }
        Object obj = this.f37255a;
        if (i2 != 4) {
            String configValueString3 = ((gr) obj).d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SOUND_PACKAGE_NAME);
            h.g.b.x.e(configValueString3, "getConfigValueString(...)");
            return configValueString3;
        }
        String configValueString4 = ((gr) obj).d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_MODE);
        h.g.b.x.e(configValueString4, "getConfigValueString(...)");
        return configValueString4;
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) throws NumberFormatException {
        int i2 = this.f37256b;
        if (i2 == 0) {
            h.g.b.x.c(str);
            ((ds) this.f37255a).Q(Integer.parseInt(str));
            return;
        }
        if (i2 == 1) {
            ds dsVar = (ds) this.f37255a;
            dsVar.R(true);
            if (str2 != null) {
                dsVar.f().setConfigValueString(ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_MESSAGE, str);
                return;
            }
            return;
        }
        if (i2 == 2) {
            ((gr) this.f37255a).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_PRIVACY_USE_LOCATION_IN_BG, Boolean.parseBoolean(str));
            return;
        }
        if (i2 != 3) {
            Object obj = this.f37255a;
            if (i2 != 4) {
                ((gr) obj).d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SOUND_PACKAGE_NAME, str);
                return;
            } else {
                ((gr) obj).d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_MODE, str);
                return;
            }
        }
        gr grVar = (gr) this.f37255a;
        grVar.d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE, str);
        grVar.d().f().setConfigValueString(ConfigValues.CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE, str);
        if (str == null || h.g.b.x.n(str, str2)) {
            return;
        }
        grVar.f37330c.k(str2, str);
    }
}
