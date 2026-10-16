package com.waze;

import android.content.Context;
import androidx.core.view.KeyEventDispatcher;
import com.waze.config.PreferencesConfigNativeManager;
import com.waze.settings.SettingsNativeManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nc extends com.waze.sharedui.h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.web.j f31840a = new na(this);

    /* renamed from: b, reason: collision with root package name */
    private HashMap f31841b;

    @Override // com.waze.sharedui.h
    public final Context a() {
        return mg.a();
    }

    @Override // com.waze.sharedui.h
    public final com.waze.sharedui.web.j b() {
        return this.f31840a;
    }

    @Override // com.waze.sharedui.h
    public final String c() {
        return com.b.b.a.u.d().c().a();
    }

    @Override // com.waze.sharedui.h, com.waze.sharedui.m
    public final Locale d() {
        return new Locale(((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).getLanguagesLocale());
    }

    @Override // com.waze.sharedui.h
    public final void e(String str, int i2, int i3, com.waze.sharedui.g gVar) {
        if (str == null || str.isEmpty()) {
            gVar.a(null);
        } else {
            com.waze.utils.i.a().e(str, new nb(this, gVar), str, i2, i3, true);
        }
    }

    @Override // com.waze.sharedui.h
    public final void f(com.waze.sharedui.f fVar) {
        KeyEventDispatcher.Component componentE = lm.d().e();
        if (componentE instanceof com.waze.sharedui.e) {
            HashMap map = this.f31841b;
            if (map == null) {
                map = new HashMap();
                this.f31841b = map;
            }
            map.put(fVar, fVar);
            ((com.waze.sharedui.e) componentE).w(fVar);
        }
    }

    @Override // com.waze.sharedui.h
    public final void g(boolean z) {
        ix.k(z, Arrays.asList(Integer.valueOf(R.string.ADS_SETTINGS_TITLE), Integer.valueOf(R.string.ADS_SETTINGS_PROFILE_TARGETING_ITEM), Integer.valueOf(R.string.ADS_SETTINGS_PROFILE_TARGETING_DESCRIPTION)));
    }

    @Override // com.waze.sharedui.h
    public final void h(com.waze.sharedui.f fVar) {
        HashMap map;
        com.waze.sharedui.f fVar2;
        KeyEventDispatcher.Component componentE = lm.d().e();
        if (!(componentE instanceof com.waze.sharedui.e) || (map = this.f31841b) == null || (fVar2 = (com.waze.sharedui.f) map.remove(fVar)) == null) {
            return;
        }
        ((com.waze.sharedui.e) componentE).A(fVar2);
    }

    @Override // com.waze.sharedui.h
    public final void i(Runnable runnable) {
        ConfigManager.getInstance().sendLogsAutoConfirm();
        runnable.run();
    }

    @Override // com.waze.sharedui.h
    public final void j(com.waze.settings.q qVar) {
        PreferencesConfigNativeManager.runOnPreferencesConfigSynced(new com.google.android.material.internal.o(qVar, 7));
    }
}
