package com.waze.settings.tree.a;

import android.view.View;
import com.waze.config.ConfigValues;
import com.waze.settings.bs;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.settings.tree.g f37498a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37499b;

    u(com.waze.settings.tree.g gVar, int i2) {
        this.f37499b = i2;
        this.f37498a = gVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        int i2 = this.f37499b;
        com.waze.settings.tree.g gVar = this.f37498a;
        return i2 != 0 ? ((n) gVar).d().f().getConfigValueBool(ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_NOTIFY_NOW_PLAYING) : ((bs) ((z) gVar).c().A().d()).x();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        int i2 = this.f37499b;
        com.waze.settings.tree.g gVar = this.f37498a;
        if (i2 != 0) {
            ((n) gVar).d().f().setConfigValueBool(ConfigValues.CONFIG_VALUE_AUDIO_EXTENSION_NOTIFY_NOW_PLAYING, z);
        } else {
            ((z) gVar).c().Z(z);
        }
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
