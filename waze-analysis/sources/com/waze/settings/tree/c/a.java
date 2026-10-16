package com.waze.settings.tree.c;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements h, b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f37531a;

    public a(com.waze.config.b bVar) {
        x.f(bVar, "config");
        this.f37531a = bVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return ConfigManager.getInstance().getConfigValueBool(this.f37531a);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        ConfigManager.getInstance().setConfigValueBool(this.f37531a, z);
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        boolean configValueBool = ConfigManager.getInstance().getConfigValueBool(this.f37531a);
        StringBuilder sb = new StringBuilder();
        sb.append(configValueBool);
        return sb.toString();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        Boolean boolValueOf = Boolean.valueOf(str);
        x.e(boolValueOf, "valueOf(...)");
        ConfigManager.getInstance().setConfigValueBool(this.f37531a, boolValueOf.booleanValue());
    }
}
