package com.waze.settings.tree.a;

import android.view.View;
import com.waze.config.ConfigValues;
import com.waze.search.h.az;
import com.waze.settings.ds;
import com.waze.settings.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37465a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.c.a f37466b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f37467c;

    c(ds dsVar, com.waze.main_screen.c.a aVar, h.g.a.l lVar) {
        this.f37465a = dsVar;
        this.f37466b = aVar;
        this.f37467c = lVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return this.f37465a.f().getConfigValueBool(ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_MIC_ON_MAP);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        this.f37465a.f().setConfigValueBool(ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_MIC_ON_MAP, z);
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean S(View view, boolean z) {
        com.waze.main_screen.c.a aVar = this.f37466b;
        if (aVar == null || !aVar.f()) {
            return true;
        }
        return gu.e(aVar, z, new az(view, this.f37467c, 4));
    }
}
