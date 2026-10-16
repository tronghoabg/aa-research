package defpackage;

import android.os.Bundle;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;

/* loaded from: classes2.dex */
public final class pbp extends kfn {
    final /* synthetic */ WirelessSetupSharedService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp(WirelessSetupSharedService wirelessSetupSharedService) {
        super(null);
        this.a = wirelessSetupSharedService;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        f(rrw.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pah] */
    @Override // defpackage.kfn
    public final void b() {
        WirelessSetupSharedService wirelessSetupSharedService = this.a;
        pah pahVar = wirelessSetupSharedService.w;
        pag pagVar = pag.PROJECTION_DISCONNECTED;
        pahVar.c(pagVar, Bundle.EMPTY);
        ogz ogzVar = wirelessSetupSharedService.A;
        if (ogzVar != null) {
            ogzVar.a.c(pagVar, Bundle.EMPTY);
        }
        ((kny) wirelessSetupSharedService.B.e).c(pagVar, Bundle.EMPTY);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, pah] */
    public final void f(rrw rrwVar) {
        WirelessSetupSharedService wirelessSetupSharedService = this.a;
        pah pahVar = wirelessSetupSharedService.w;
        pag pagVar = pag.PROJECTION_CONNECTED;
        pahVar.c(pagVar, Bundle.EMPTY);
        ogz ogzVar = wirelessSetupSharedService.A;
        if (ogzVar != null) {
            ogzVar.a.c(pagVar, Bundle.EMPTY);
        }
        rxr rxrVar = wirelessSetupSharedService.l;
        if (rxrVar != null && rrwVar != rrw.b) {
            rxrVar.e(wirelessSetupSharedService);
        }
        ((kny) wirelessSetupSharedService.B.e).c(pagVar, Bundle.EMPTY);
    }

    public pbp() {
        throw null;
    }
}
