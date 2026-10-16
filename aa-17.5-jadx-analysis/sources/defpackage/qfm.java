package defpackage;

import com.google.android.gearhead.appdecor.CarUiEntry;

/* loaded from: classes2.dex */
public final class qfm implements lax {
    final /* synthetic */ CarUiEntry a;

    public qfm(CarUiEntry carUiEntry) {
        this.a = carUiEntry;
    }

    @Override // defpackage.lax
    public final String a(int i) {
        return this.a.menuController.l(i).toString();
    }

    @Override // defpackage.lax
    public final boolean b() {
        return this.a.menuController.w();
    }
}
