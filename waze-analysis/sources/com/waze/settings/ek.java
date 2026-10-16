package com.waze.settings;

import android.view.View;
import com.waze.ConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ek implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigManager f37183a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.config.b f37184b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f37185c;

    ek(ConfigManager configManager, com.waze.config.b bVar, boolean z) {
        this.f37183a = configManager;
        this.f37184b = bVar;
        this.f37185c = z;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return this.f37185c ^ this.f37183a.getConfigValueBool(this.f37184b);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        this.f37183a.setConfigValueBool(this.f37184b, this.f37185c ^ z);
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
