package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.view.View;
import com.google.android.libraries.assistant.appintegration.api.standard.callback.SystemUiManager;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda2 implements Runnable {
    public /* synthetic */ SystemUiManager.ClientAppWindow f$0;
    public /* synthetic */ View f$1;

    public /* synthetic */ SystemUiManager$ClientAppWindow$$ExternalSyntheticLambda2(SystemUiManager.ClientAppWindow clientAppWindow, View view) {
        this.f$0 = clientAppWindow;
        this.f$1 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$maybeRegisterOnSystemUiVisibilityChangeListener$0(this.f$1);
    }
}
