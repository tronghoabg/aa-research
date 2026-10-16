package com.waze.config;

import com.waze.ConfigManager;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {
    public a(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
    }

    public static final Object a(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        ConfigManager.runOnConfigSynced(new android.support.v7.app.p(completableDeferredJ, 17));
        Object objC = completableDeferredJ.c(eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objC != aVar) {
            objC = h.ab.f48028a;
        }
        return objC == aVar ? objC : h.ab.f48028a;
    }
}
