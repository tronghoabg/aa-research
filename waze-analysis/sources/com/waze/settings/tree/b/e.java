package com.waze.settings.tree.b;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.settings.tree.c.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f37524a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37525b;

    e(Object obj, int i2) {
        this.f37525b = i2;
        this.f37524a = obj;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return this.f37525b != 0 ? com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        return this.f37525b != 0 ? ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX) : ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (this.f37525b != 0) {
            ((a) this.f37524a).a().T(str);
            return;
        }
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE, str);
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE, str);
        ((f) this.f37524a).f37528c.k(str2, str);
    }
}
