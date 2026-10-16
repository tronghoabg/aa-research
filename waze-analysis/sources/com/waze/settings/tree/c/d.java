package com.waze.settings.tree.c;

import com.waze.ConfigManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f37532a;

    public d(com.waze.config.b bVar) {
        x.f(bVar, "config");
        this.f37532a = bVar;
    }

    @Override // com.waze.settings.tree.c.c
    public final boolean a() {
        return ConfigManager.getInstance().getConfigValueBool(this.f37532a);
    }
}
