package defpackage;

import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
final class kno extends knf {
    private final ajmd a;

    public kno(ajmd ajmdVar) {
        this.a = ajmdVar;
    }

    @Override // defpackage.knh
    public final void a() {
        if (WirelessSetupSharedService.b) {
            return;
        }
        ((WirelessSetupSharedService) this.a.a).n.g();
    }

    @Override // defpackage.knh
    public final int c() {
        return 104;
    }

    public final String toString() {
        return "Wifi Setup";
    }

    @Override // defpackage.knh
    public final void b() {
    }
}
