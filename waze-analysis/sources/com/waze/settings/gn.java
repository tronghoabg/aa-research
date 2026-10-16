package com.waze.settings;

import android.view.View;
import com.waze.sdk.SdkConfiguration;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gn implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37323a;

    gn(gr grVar) {
        this.f37323a = grVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        return SdkConfiguration.isAudioSdkEnabled();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        SdkConfiguration.enableAudioSdk(z);
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean S(View view, boolean z) {
        gr grVar = this.f37323a;
        com.waze.main_screen.c.a aVar = grVar.f37337j;
        if (aVar == null || !aVar.f()) {
            return true;
        }
        return gu.e(grVar.f37337j, z, new com.waze.search.h.az(view, grVar, 3));
    }
}
