package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import j$.util.OptionalInt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pdy implements pdz {
    public static final yph a = yph.c("GH.WIRELESS.BT");
    public static final Map b;
    public final BluetoothDevice c;
    public final Context d;
    public final tla e;
    public final tle f;
    public final pgc g;
    public final gjv h;
    private final aezr i;
    private final ajdr j;

    static {
        b = Build.VERSION.SDK_INT < 34 ? afbf.a : woy.ba(new aezu(15, yxi.WIRELESS_BT_SOCKET_EXCEPTION_BLUETOOTH_OFF_FAILURE), new aezu(2, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_ACL_FAILURE), new aezu(3, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_CLIENT_SECURITY_FAILURE), new aezu(4, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INSUFFICIENT_AUTHENTICATION), new aezu(5, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INSUFFICIENT_AUTHORIZATION), new aezu(7, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INSUFFICIENT_ENCRYPTION), new aezu(6, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INSUFFICIENT_ENCRYPT_KEY_SIZE), new aezu(11, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INVALID_PARAMETERS), new aezu(8, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_INVALID_SOURCE_CID), new aezu(13, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_NO_PSM_AVAILABLE), new aezu(12, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_NO_RESOURCES), new aezu(9, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_SOURCE_CID_ALREADY_ALLOCATED), new aezu(14, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_TIMEOUT), new aezu(10, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_UNACCEPTABLE_PARAMETERS), new aezu(1, yxi.WIRELESS_BT_SOCKET_EXCEPTION_L2CAP_UNKNOWN), new aezu(19, yxi.WIRELESS_BT_SOCKET_EXCEPTION_NULL_DEVICE), new aezu(20, yxi.WIRELESS_BT_SOCKET_EXCEPTION_RPC_FAILURE), new aezu(17, yxi.WIRELESS_BT_SOCKET_EXCEPTION_SOCKET_CLOSED), new aezu(18, yxi.WIRELESS_BT_SOCKET_EXCEPTION_SOCKET_CONNECTION_FAILURE), new aezu(16, yxi.WIRELESS_BT_SOCKET_EXCEPTION_SOCKET_MANAGER_FAILURE), new aezu(0, yxi.WIRELESS_BT_SOCKET_EXCEPTION_UNSPECIFIED));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public pdy(BluetoothDevice bluetoothDevice, ajdr ajdrVar, pgc pgcVar, Context context) {
        ajdrVar.getClass();
        pgcVar.getClass();
        this.c = bluetoothDevice;
        this.j = ajdrVar;
        this.g = pgcVar;
        this.d = context;
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        this.e = new tla("rfcomm-socket", mainLooper, ajdrVar.b);
        this.h = new gjv(pds.a);
        this.i = woy.dG(new ooq(this, 13));
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        this.f = new tle("rfcomm-wakelock", thread, ajdrVar.b);
    }

    @Override // defpackage.pab
    public final pac a() {
        return pac.a;
    }

    @Override // defpackage.pab
    public final void b(xpr xprVar, abow abowVar) {
        abowVar.getClass();
        pdt pdtVar = (pdt) this.h.v();
        if (pdtVar instanceof pdq) {
            ((pdq) pdtVar).a.b(xprVar, abowVar);
            return;
        }
        d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_SEND_MESSAGE_DROPPED_NO_CONNECTION_RFCOMM, Integer.valueOf(xprVar.l));
        ((ype) a.h()).y("Dropping message of type %s because connection object is empty", xprVar.name());
    }

    public final PowerManager.WakeLock c() {
        return (PowerManager.WakeLock) this.i.a();
    }

    public final void d(yxi yxiVar, Integer num) {
        ajdr ajdrVar = this.j;
        if (num == null) {
            ((kny) ajdrVar.e).d(yxiVar);
        } else {
            ((kny) ajdrVar.e).e(yxiVar, OptionalInt.of(num.intValue()));
        }
    }

    public final void e(ozr ozrVar) {
        f();
        this.g.b(ozrVar);
    }

    public final void f() {
        gjv gjvVar = this.h;
        pdt pdtVar = (pdt) gjvVar.v();
        if (!pdtVar.a()) {
            throw new IllegalArgumentException("stopInternal called from wrong state");
        }
        if (pdtVar instanceof pdq) {
            ((pdq) pdtVar).a.d();
        }
        this.e.b();
        gjvVar.w(pds.a);
        if (aczv.ag()) {
            this.f.b(new pea(this, 1));
        }
    }
}
