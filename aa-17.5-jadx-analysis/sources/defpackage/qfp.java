package defpackage;

import com.google.android.gearhead.appdecor.CarUiEntry;

/* loaded from: classes2.dex */
public final class qfp extends qzl {
    public final /* synthetic */ CarUiEntry a;

    public qfp(CarUiEntry carUiEntry) {
        this.a = carUiEntry;
    }

    @Override // defpackage.qzm
    public final void a(int i) {
        this.a.handler.post(new hhx(this, i, 19));
    }

    @Override // defpackage.qzm
    public final void c(boolean z) {
        this.a.handler.post(new jgv(this, z, 11));
    }

    @Override // defpackage.qzm
    public final void b(boolean z) {
    }
}
