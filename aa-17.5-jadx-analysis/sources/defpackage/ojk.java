package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.PowerManager;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ojk implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ojk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v64, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v74, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v83, types: [ackk, java.lang.Object] */
    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.b) {
            case 0:
                return new oki((Context) this.a);
            case 1:
                return new oja((Context) this.a);
            case 2:
                return new ojs((Context) this.a);
            case 3:
                return new ojy((Context) this.a);
            case 4:
                return new okd((Context) this.a);
            case 5:
                return onw.b((Context) this.a);
            case 6:
                UUID uuid = jlq.a;
                ype ypeVar = (ype) ((ype) phl.a.f()).ai(6700);
                BluetoothDevice bluetoothDevice = ((pdy) this.a).c;
                ypeVar.M("Creating rfcomm socket for device: %s and uuid: %s", bluetoothDevice.getAddress(), uuid);
                return bluetoothDevice.createRfcommSocketToServiceRecord(uuid);
            case 7:
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ((pew) this.a).b.getSystemService(PowerManager.class)).newWakeLock(1, "com.google.android.projection.gearhead:WPP-TCP");
                wakeLockNewWakeLock.setReferenceCounted(false);
                return wakeLockNewWakeLock;
            case 8:
                pgr pgrVar = (pgr) this.a;
                Optional optionalA = pgrVar.O.a(pgrVar.r.getAddress());
                if (true == optionalA.isPresent()) {
                    optionalA = Optional.ofNullable(((CarInfoInternal) optionalA.get()).a);
                }
                return (CarInfo) optionalA.orElse(new CarInfoInternal().a);
            case 9:
                PowerManager.WakeLock wakeLockNewWakeLock2 = ((PowerManager) jfj.c(((WirelessSetupSharedService) this.a).getApplicationContext()).getSystemService(PowerManager.class)).newWakeLock(1, "com.google.android.projection.gearhead:WSSS");
                wakeLockNewWakeLock2.setReferenceCounted(false);
                return wakeLockNewWakeLock2;
            case 10:
                Object obj = this.a;
                WirelessSetupSharedService wirelessSetupSharedService = (WirelessSetupSharedService) obj;
                wirelessSetupSharedService.B.getClass();
                return ozf.a((Context) obj, (Executor) wirelessSetupSharedService.t.get());
            case 11:
                return Integer.valueOf(((plu) this.a).a.q(plv.e));
            case 12:
                return ((plu) this.a).a.k(plv.c, "");
            case 13:
                return ((plu) this.a).a.k(plv.d, "");
            case 14:
                return Integer.valueOf(((plu) this.a).a.q(plv.f));
            case 15:
                this.a.run();
                return null;
            case 16:
                Object obj2 = this.a;
                return vky.a(new vky("ClientParametersBlockingReference.getDelegate: "), obj2 == null ? new vky("NO_GROUP") : vky.d(null, (Enum) obj2));
            case 17:
                return ((pwh) this.a).a(pwe.h);
            case 18:
                return (Map) Collection.EL.stream((Set) this.a.a()).collect(ycm.a(new nsb(17), Function$CC.identity()));
            case 19:
                return ((pwh) this.a).a(pwe.l);
            default:
                return yfy.j((Map) this.a.a());
        }
    }
}
