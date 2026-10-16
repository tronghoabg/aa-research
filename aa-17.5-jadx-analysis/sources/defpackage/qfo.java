package defpackage;

import com.google.android.gearhead.appdecor.CarUiEntry;

/* loaded from: classes2.dex */
public final class qfo extends qtz {
    final /* synthetic */ CarUiEntry a;

    public qfo(CarUiEntry carUiEntry) {
        this.a = carUiEntry;
    }

    @Override // defpackage.qua
    public final void a(qtu qtuVar) {
        ((ype) CarUiEntry.logger.l().ai((char) 7055)).u("AppDecorService is ready callback");
        this.a.handler.post(new qfa((Object) this, (Object) qtuVar, 2, (byte[]) null));
    }
}
