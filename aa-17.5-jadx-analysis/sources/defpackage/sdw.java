package defpackage;

import android.content.Intent;
import com.google.android.gms.carsetup.frx.SetupFsm;

/* loaded from: classes2.dex */
public final class sdw extends rht {
    final /* synthetic */ SetupFsm.InstallingAppsState a;

    public sdw(SetupFsm.InstallingAppsState installingAppsState) {
        this.a = installingAppsState;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = SetupFsm.a;
        ypfVar.l().ai(8813).y("Got config change: %s", intent);
        this.a.f();
        ypfVar.l().ai(8814).u("Not a car module change");
    }
}
