package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
final class mhs implements mpb {
    final /* synthetic */ mhv a;

    public mhs(mhv mhvVar) {
        this.a = mhvVar;
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        mhv mhvVar;
        ComponentName componentName;
        mqb mqbVarD = mpl.d(intent);
        if (mqbVarD == null || (componentName = (mhvVar = this.a).e) == null || !mqbVarD.a.equals(componentName)) {
            return;
        }
        for (wyd wydVar : mhvVar.f) {
            kio.b().e();
            nso nsoVar = (nso) wydVar.a;
            if (!nsoVar.D) {
                nsoVar.D = true;
                nsoVar.O();
            }
        }
        Runnable runnable = mhvVar.c;
        if (runnable != null) {
            runnable.run();
            mhvVar.c = null;
        }
    }

    @Override // defpackage.mpb
    public final void f(Intent intent, CarRegionId carRegionId) {
        mhv mhvVar;
        ComponentName componentName;
        mqb mqbVarD = mpl.d(intent);
        if (mqbVarD == null || (componentName = (mhvVar = this.a).e) == null || !mqbVarD.a.equals(componentName)) {
            return;
        }
        ((ype) mhv.a.l().ai((char) 4954)).y("Stopped %s", mqbVarD);
        mhvVar.e = null;
        for (wyd wydVar : mhvVar.f) {
            kio.b().e();
            nso nsoVar = (nso) wydVar.a;
            if (nsoVar.D) {
                nsoVar.D = false;
                nsoVar.O();
            }
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void b(Intent intent, CarRegionId carRegionId) {
    }
}
