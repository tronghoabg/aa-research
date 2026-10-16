package defpackage;

import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyg implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        yph yphVar = WifiBluetoothReceiver.a;
        kfl.g().e(yxi.WIRELESS_SETUP_CANCELLED, OptionalInt.of(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
