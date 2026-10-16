package defpackage;

import android.content.Intent;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyh implements IntConsumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oyh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                ((pap) this.a).k = OptionalInt.of(i);
                break;
            case 1:
                int i2 = kny.d;
                ((Intent) this.a).putExtra("event_detail", i);
                break;
            case 2:
                yph yphVar = pap.a;
                ((Intent) this.a).putExtra("cancellation_token", i);
                break;
            case 3:
                ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_CANCELLED, OptionalInt.of(i));
                break;
            case 4:
                ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_CANCELLED_DIFFERENT_BLUETOOTH_DEVICE, OptionalInt.of(i));
                break;
            case 5:
                ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_CANCELLED, OptionalInt.of(i));
                break;
            case 6:
                ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_CANCELLED_ALREADY_STARTED, OptionalInt.of(i));
                break;
            case 7:
                ((WirelessSetupSharedService) this.a).q.e(yxi.WIRELESS_SETUP_ALREADY_PROJECTING, OptionalInt.of(i));
                break;
            case 8:
                ((pgz) this.a).g.q.e(yxi.WIRELESS_SETUP_CANCELLED, OptionalInt.of(i));
                break;
            case 9:
                ((pgz) this.a).g.q.e(yxi.WIRELESS_SETUP_CANCELLED_HU_NOT_CONNECTED, OptionalInt.of(i));
                break;
            case 10:
                ((WirelessSetupSharedService) ((oyj) this.a).b).q.e(yxi.WIRELESS_SETUP_CANCELLED, OptionalInt.of(i));
                break;
            default:
                ((WirelessSetupSharedService) ((oyj) this.a).b).q.e(yxi.WIRELESS_SETUP_CANCELLED_DONGLE_ASSOCIATED_DEVICE_NOT_CONNECTED, OptionalInt.of(i));
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.b) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
