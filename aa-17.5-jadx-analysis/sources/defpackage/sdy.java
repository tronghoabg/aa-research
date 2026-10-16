package defpackage;

import android.content.Intent;
import com.google.android.gms.carsetup.frx.SetupFsm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class sdy extends rht {
    public final /* synthetic */ SetupFsm.InstallingAppsState a;

    public sdy(SetupFsm.InstallingAppsState installingAppsState) {
        this.a = installingAppsState;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        SetupFsm.a.l().ai(8815).y("Got package change: %s", intent);
        if ("com.google.android.projection.gearhead".equals(intent.getData().getSchemeSpecificPart())) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new sdx(this));
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }
}
