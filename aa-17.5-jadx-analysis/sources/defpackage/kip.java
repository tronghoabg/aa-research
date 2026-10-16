package defpackage;

import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
final class kip extends kfn {
    final /* synthetic */ kiq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kip(kiq kiqVar) {
        super(null);
        this.a = kiqVar;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        yph yphVar = kiq.a;
        ((ype) ((ype) yphVar.f()).ai((char) 3151)).u("onCarConnected");
        try {
            mki.a.f();
            CarInfo carInfoD = oni.d(qrnVar);
            if (carInfoD == null) {
                ((ype) ((ype) yphVar.f()).ai(3153)).u("No car info available.");
                carInfoD = kiq.b;
            }
            this.a.c.set(carInfoD);
        } catch (IllegalStateException | qrz unused) {
            ((ype) ((ype) kiq.a.h()).ai((char) 3152)).u("Failed to get car info.");
        }
    }
}
