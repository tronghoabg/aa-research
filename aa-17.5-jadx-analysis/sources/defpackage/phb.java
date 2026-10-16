package defpackage;

import android.net.wifi.WifiInfo;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
public final class phb implements pah {
    final /* synthetic */ WirelessSetupSharedService a;

    public phb(WirelessSetupSharedService wirelessSetupSharedService) {
        this.a = wirelessSetupSharedService;
    }

    @Override // defpackage.pah
    public final void a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
        ((ype) WirelessSetupSharedService.a.l().ai(6637)).K("Ready for projection initiation: %s %d", str, i);
    }

    @Override // defpackage.pah
    public final void b() {
        ((ype) WirelessSetupSharedService.a.l().ai((char) 6638)).u("Shutting down");
        WirelessSetupSharedService wirelessSetupSharedService = this.a;
        if (wirelessSetupSharedService.p == null) {
            wirelessSetupSharedService.q.d(yxi.WIRELESS_SETUP_CAR_BLUETOOTH_DISAPPEAR_BEFORE_WSEM);
        }
        wirelessSetupSharedService.g = false;
        wirelessSetupSharedService.o = null;
        wirelessSetupSharedService.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.os.IInterface, pbj] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.pah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.pag r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phb.c(pag, android.os.Bundle):void");
    }
}
