package defpackage;

import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.util.OptionalInt;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class phd implements Executor {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public phd(WirelessSetupSharedService wirelessSetupSharedService, OptionalInt optionalInt, int i) {
        this.c = i;
        this.a = optionalInt;
        this.b = wirelessSetupSharedService;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            WirelessSetupSharedService wirelessSetupSharedService = (WirelessSetupSharedService) this.b;
            wirelessSetupSharedService.q.e(yxi.WIRELESS_SETUP_CAR_FOR_DONGLE_PRESENCE_EVALUATED, (OptionalInt) obj);
            wirelessSetupSharedService.h.post(runnable);
            return;
        }
        if (i != 1) {
            this.a.execute(new xab(this.b, runnable, 7, null));
        } else {
            Object obj2 = this.a;
            WirelessSetupSharedService wirelessSetupSharedService2 = (WirelessSetupSharedService) this.b;
            wirelessSetupSharedService2.q.e(yxi.WIRELESS_SETUP_HU_PRESENCE_EVALUATED, (OptionalInt) obj2);
            wirelessSetupSharedService2.h.post(runnable);
        }
    }

    public /* synthetic */ phd(zis zisVar, Executor executor, int i) {
        this.c = i;
        this.b = zisVar;
        this.a = executor;
    }
}
