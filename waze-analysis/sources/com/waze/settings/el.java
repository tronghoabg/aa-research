package com.waze.settings;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class el implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigManager f37186a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.config.f f37187b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37188c;

    el(ConfigManager configManager, com.waze.config.f fVar, int i2) {
        this.f37188c = i2;
        this.f37186a = configManager;
        this.f37187b = fVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return this.f37188c != 0 ? com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        int i2 = this.f37188c;
        ConfigManager configManager = this.f37186a;
        if (i2 != 0) {
            return String.valueOf(configManager.getConfigValueInt((com.waze.config.c) this.f37187b));
        }
        String configValueString = configManager.getConfigValueString((com.waze.config.d) this.f37187b);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (this.f37188c == 0) {
            this.f37186a.setConfigValueString((com.waze.config.d) this.f37187b, str);
        } else {
            this.f37186a.setConfigValueInt((com.waze.config.c) this.f37187b, str != null ? Integer.parseInt(str) : 0);
        }
    }
}
