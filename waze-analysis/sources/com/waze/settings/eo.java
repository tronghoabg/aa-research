package com.waze.settings;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eo implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.config.b f37193b;

    eo(gr grVar, com.waze.config.b bVar) {
        this.f37192a = grVar;
        this.f37193b = bVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return this.f37192a.d().f().getConfigValueBool(this.f37193b);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        this.f37192a.d().f().setConfigValueBool(this.f37193b, z);
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean S(View view, boolean z) {
        gr grVar = this.f37192a;
        return gu.e(grVar.f37337j, z, new com.waze.search.h.az(view, grVar, 2));
    }
}
