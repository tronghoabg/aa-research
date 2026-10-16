package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nqu implements defpackage.mph {
    final /* synthetic */ defpackage.nqw a;

    public nqu(defpackage.nqw nqwVar) {
        this.a = nqwVar;
    }

    @Override // defpackage.mph
    public final void a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        defpackage.nqw nqwVar = this.a;
        if (nqwVar.f != null) {
            nqwVar.f(carRegionId);
        }
    }

    @Override // defpackage.mph
    public final void b(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        defpackage.nqw nqwVar = this.a;
        if (nqwVar.j(carRegionId)) {
            nqwVar.g(intent);
        } else if (nqwVar.i(carRegionId)) {
            nqwVar.e(intent);
        }
    }

    @Override // defpackage.mph
    public final void f(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        defpackage.nqw nqwVar = this.a;
        if (nqwVar.f != null) {
            nqwVar.f(carRegionId);
        }
    }

    @Override // defpackage.mph
    public final /* synthetic */ void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }
}
