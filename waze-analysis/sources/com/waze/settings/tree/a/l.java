package com.waze.settings.tree.a;

import android.view.View;
import com.waze.sdk.SdkConfiguration;
import com.waze.search.h.az;
import com.waze.settings.gu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f37479a;

    l(n nVar) {
        this.f37479a = nVar;
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
        n nVar = this.f37479a;
        com.waze.main_screen.c.a aVar = nVar.f37484b;
        if (aVar == null || !aVar.f()) {
            return true;
        }
        return gu.e(nVar.f37484b, z, new az(view, nVar, 5));
    }
}
