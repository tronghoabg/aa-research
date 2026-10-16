package defpackage;

import com.google.android.gearhead.appdecor.CarUiEntry;

/* loaded from: classes2.dex */
public final class qfl implements lar {
    final /* synthetic */ CarUiEntry a;

    public qfl(CarUiEntry carUiEntry) {
        this.a = carUiEntry;
    }

    @Override // defpackage.lar
    public final void a() {
        CarUiEntry carUiEntry = this.a;
        carUiEntry.menuController.m();
        carUiEntry.interactionModerator.k(gsn.a, yzz.DRAWER);
    }

    @Override // defpackage.lar
    public final void b() {
        CarUiEntry carUiEntry = this.a;
        carUiEntry.menuController.q();
        carUiEntry.interactionModerator.k(gsn.b, yzz.DRAWER);
    }
}
