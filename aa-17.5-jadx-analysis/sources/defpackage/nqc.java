package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class nqc implements mpb {
    final /* synthetic */ nqd a;

    public nqc(nqd nqdVar) {
        this.a = nqdVar;
    }

    @Override // defpackage.mpb
    public final void a(Intent intent, CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        nqd nqdVar = this.a;
        if (nqdVar.f != null) {
            nqdVar.f(carRegionId);
        }
    }

    @Override // defpackage.mpb
    public final void b(Intent intent, CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        nqd nqdVar = this.a;
        if (nqdVar.j(carRegionId)) {
            nqdVar.g(intent);
        } else if (nqdVar.i(carRegionId)) {
            nqdVar.e(intent);
        }
    }

    @Override // defpackage.mpb
    public final void f(Intent intent, CarRegionId carRegionId) {
        intent.getClass();
        carRegionId.getClass();
        nqd nqdVar = this.a;
        if (nqdVar.f != null) {
            nqdVar.f(carRegionId);
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }
}
