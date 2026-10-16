package com.waze.settings.tree.c;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.ConfigManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f37535a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.f f37536b;

    public g(com.waze.config.c cVar, int i2) {
        this.f37535a = i2;
        x.f(cVar, "config");
        this.f37536b = cVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return this.f37535a != 0 ? com.waze.settings.tree.a.d.d(this) : com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        int i2 = this.f37535a;
        com.waze.config.f fVar = this.f37536b;
        return i2 != 0 ? String.valueOf(ConfigManager.getInstance().getConfigValueInt((com.waze.config.c) fVar)) : ConfigManager.getInstance().getConfigValueString((com.waze.config.d) fVar);
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (this.f37535a != 0) {
            ConfigManager.getInstance().setConfigValueInt((com.waze.config.c) this.f37536b, str != null ? Integer.parseInt(str) : 0);
        } else {
            ConfigManager.getInstance().setConfigValueString((com.waze.config.d) this.f37536b, str);
        }
    }

    public g(com.waze.config.d dVar, int i2) {
        this.f37535a = i2;
        x.f(dVar, "config");
        this.f37536b = dVar;
    }
}
