package defpackage;

import android.content.pm.PackageInstaller;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class sac extends PackageInstaller.SessionCallback {
    final /* synthetic */ sad a;
    private final SparseArray b = new SparseArray();
    private final FsmController c;

    public sac(sad sadVar, FsmController fsmController) {
        PackageInstaller.SessionInfo sessionInfoA;
        this.a = sadVar;
        this.c = fsmController;
        ypf ypfVar = sad.a;
        ypfVar.l().ai(8581).u("Looking for apps that are already downloading");
        for (ses sesVar : sadVar.d) {
            if (!sesVar.d(sadVar.b) && (sessionInfoA = sadVar.a(sesVar.a)) != null) {
                ypfVar.l().ai(8582).y("App is already downloading: %s", sesVar);
                this.b.put(sessionInfoA.getSessionId(), sesVar.a);
            }
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
        if (this.b.get(i) == null || z) {
            return;
        }
        sad.a.l().ai(8583).w("Session goes inactive: %d", i);
        Bundle bundle = new Bundle();
        sad sadVar = this.a;
        bundle.putString("errorTitle", sadVar.b.getString(R.string.car_frx_no_connection_title));
        FsmController fsmController = this.c;
        fsmController.f("EVENT_APPLICATION_INSTALLATION_FAILED", bundle);
        abnp abnpVarN = zab.a.n();
        int i2 = yzz.FRX_DOWNLOAD_APPS.he;
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = i2;
        int iA = yzy.bM.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        fsmController.g((zab) abnpVarN.q());
        sadVar.c.unregisterSessionCallback(this);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        sad sadVar = this.a;
        PackageInstaller.SessionInfo sessionInfo = sadVar.c.getSessionInfo(i);
        if (sessionInfo == null) {
            return;
        }
        for (ses sesVar : sadVar.d) {
            String str = sesVar.a;
            if (str.equals(sessionInfo.getAppPackageName())) {
                sad.a.l().ai(8584).K("New app starts downloading %s sessionId: %d", sesVar, i);
                this.b.put(i, str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        SparseArray sparseArray = this.b;
        if (sparseArray.get(i) != null) {
            if (z) {
                sad.a.l().ai(8586).w("Session finished successfully: %d", i);
                ser serVar = (ser) this.a.e.a.get((String) sparseArray.get(i));
                serVar.getClass();
                serVar.a = 1;
                sparseArray.remove(i);
                FsmController fsmController = this.c;
                abnp abnpVarN = zab.a.n();
                int i2 = yzz.FRX_DOWNLOAD_APPS.he;
                abnpVarN.t();
                zab zabVar = (zab) abnpVarN.b;
                zabVar.b = 1 | zabVar.b;
                zabVar.d = i2;
                int iA = yzy.bQ.a();
                abnpVarN.t();
                zab zabVar2 = (zab) abnpVarN.b;
                zabVar2.b |= 2;
                zabVar2.e = iA;
                fsmController.g((zab) abnpVarN.q());
                fsmController.f("EVENT_APPLICATION_INSTALLED", null);
            } else {
                sad.a.l().ai(8585).w("Session finished unsuccessfully: %d", i);
                FsmController fsmController2 = this.c;
                abnp abnpVarN2 = zab.a.n();
                int i3 = yzz.FRX_DOWNLOAD_APPS.he;
                abnpVarN2.t();
                zab zabVar3 = (zab) abnpVarN2.b;
                zabVar3.b = 1 | zabVar3.b;
                zabVar3.d = i3;
                int iA2 = yzy.bN.a();
                abnpVarN2.t();
                zab zabVar4 = (zab) abnpVarN2.b;
                zabVar4.b |= 2;
                zabVar4.e = iA2;
                fsmController2.g((zab) abnpVarN2.q());
                fsmController2.f("EVENT_APPLICATION_INSTALLATION_FAILED", null);
                this.a.c.unregisterSessionCallback(this);
            }
            if (sparseArray.size() == 0) {
                sad sadVar = this.a;
                if (sadVar.e().isEmpty()) {
                    this.c.f("EVENT_APPLICATIONS_UP_TO_DATE", null);
                    sadVar.c.unregisterSessionCallback(this);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
        String str = (String) this.b.get(i);
        if (str != null) {
            ser serVar = (ser) this.a.e.a.get(str);
            serVar.getClass();
            serVar.a(f);
            this.c.f("EVENT_APPLICATION_INSTALLATION_UPDATE", null);
        }
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }
}
