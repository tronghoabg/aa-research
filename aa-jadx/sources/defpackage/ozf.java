package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ozf implements java.util.function.IntConsumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ozf(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                ((defpackage.pbn) this.a).k = j$.util.OptionalInt.of(i);
                break;
            case 1:
                int i2 = defpackage.kof.d;
                ((android.content.Intent) this.a).putExtra("event_detail", i);
                break;
            case 2:
                defpackage.yqm yqmVar = defpackage.pbn.a;
                ((android.content.Intent) this.a).putExtra("cancellation_token", i);
                break;
            case 3:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) this.a).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED, j$.util.OptionalInt.of(i));
                break;
            case 4:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) this.a).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED_DIFFERENT_BLUETOOTH_DEVICE, j$.util.OptionalInt.of(i));
                break;
            case 5:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) this.a).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED, j$.util.OptionalInt.of(i));
                break;
            case 6:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) this.a).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED_ALREADY_STARTED, j$.util.OptionalInt.of(i));
                break;
            case 7:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) this.a).q.e(defpackage.yyn.WIRELESS_SETUP_ALREADY_PROJECTING, j$.util.OptionalInt.of(i));
                break;
            case 8:
                ((defpackage.phv) this.a).g.q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED, j$.util.OptionalInt.of(i));
                break;
            case 9:
                ((defpackage.phv) this.a).g.q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED_HU_NOT_CONNECTED, j$.util.OptionalInt.of(i));
                break;
            case 10:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) ((defpackage.ozh) this.a).b).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED, j$.util.OptionalInt.of(i));
                break;
            default:
                ((com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService) ((defpackage.ozh) this.a).b).q.e(defpackage.yyn.WIRELESS_SETUP_CANCELLED_DONGLE_ASSOCIATED_DEVICE_NOT_CONNECTED, j$.util.OptionalInt.of(i));
                break;
        }
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
