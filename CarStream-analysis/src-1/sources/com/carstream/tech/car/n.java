package com.carstream.tech.car;

import defpackage.fa;
import defpackage.j2;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ n(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CarScreen carScreen = this.b.b;
                carScreen.speedOverlay.c();
                j2 j2Var = carScreen.carHud;
                if (j2Var != null) {
                    j2Var.a(carScreen.host());
                }
                carScreen.railAfterSettingChange();
                carScreen.applyVideoFitLive();
                carScreen.applyDataSaverLive();
                carScreen.reloadIfCodecChanged();
                carScreen.rebuildControlBar();
                carScreen.syncScreenFlags(carScreen.onScreen);
                fa faVar = carScreen.settingsPanel;
                if (faVar != null && faVar.l().getVisibility() == 0) {
                    carScreen.settingsPanel.f();
                    break;
                }
                break;
            default:
                this.b.b.searchBar.f(true);
                break;
        }
    }
}
