package defpackage;

import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
final class kne extends knf {
    private final ajmd a;

    public kne(ajmd ajmdVar) {
        this.a = ajmdVar;
    }

    @Override // defpackage.knh
    public final void a() {
        if (WirelessSetupSharedService.b) {
            return;
        }
        ((WirelessSetupSharedService) this.a.a).n.f(pag.FOUND_COMPATIBLE_WIFI_NETWORK);
    }

    @Override // defpackage.knh
    public final int c() {
        return 103;
    }

    public final String toString() {
        return "Awaiting Start";
    }

    @Override // defpackage.knh
    public final void b() {
    }
}
