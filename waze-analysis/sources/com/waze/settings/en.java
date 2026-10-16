package com.waze.settings;

import android.view.View;
import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class en implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sound.bs f37189a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sound.bu f37190b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37191c;

    public /* synthetic */ en(com.waze.sound.bs bsVar, com.waze.sound.bu buVar) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("VoiceGuidanceModeHandler");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(buVar, "source");
        h.g.b.x.f(eVarD, "logger");
        this.f37189a = bsVar;
        this.f37190b = buVar;
        this.f37191c = eVarD;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        return ((com.waze.sound.bp) this.f37189a.b().d()).a();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (str != null) {
            com.waze.sound.bp bpVar = com.waze.sound.bp.f39554a;
            com.waze.sound.bp bpVarE = com.waze.sharedui.api.i.e(str);
            if (bpVarE != null) {
                this.f37189a.d(bpVarE, this.f37190b);
            } else {
                this.f37191c.g("Unknown guidance mode: ".concat(str));
            }
        }
    }
}
