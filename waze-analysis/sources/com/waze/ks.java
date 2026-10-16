package com.waze;

import android.app.Dialog;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ks implements com.waze.sharedui.web.ad {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f25067a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Dialog f25068b;

    ks(Runnable runnable, Dialog dialog) {
        this.f25067a = runnable;
        this.f25068b = dialog;
    }

    @Override // com.waze.sharedui.web.ad
    public final void a() {
        this.f25068b.dismiss();
    }

    @Override // com.waze.sharedui.web.ad
    public final void b(boolean z) {
        this.f25067a.run();
    }

    @Override // com.waze.sharedui.web.ad
    public final void c() {
    }
}
