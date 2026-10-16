package defpackage;

import android.app.ActivityManager;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager;
import com.google.android.apps.auto.components.softminversion.SoftMinversionManager;
import j$.util.OptionalInt;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kpi implements xwx {
    private final /* synthetic */ int a;

    public /* synthetic */ kpi(int i) {
        this.a = i;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        String strD;
        switch (this.a) {
            case 0:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                yph yphVar = kpn.a;
                if (bluetoothDevice == null) {
                    return false;
                }
                ((ype) kpn.a.l().ai((char) 3353)).y("Android Auto bluetooth connected: %s", bluetoothDevice.getAddress());
                return true;
            case 1:
                return OptionalInt.of(((Integer) obj).intValue());
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                xny xnyVarB = xny.b(((xnw) obj).b);
                return xnyVarB == null ? xny.SENSOR_LOCATION : xnyVarB;
            case 6:
                return xxh.g(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 7:
                return yfq.o((List) obj);
            case 8:
                ((ynz) ((ynz) ((ynz) vlj.a.h()).p((RuntimeException) obj)).ai(9834)).u("Metric extension provider failed.");
                return null;
            case 9:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 10:
                return false;
            case 11:
                wcp wcpVar = wcq.a;
                return "";
            case 12:
                return new SoftMinversionManager((Context) obj);
            case 13:
                return new HeadUnitUpdateManager((Context) obj);
            case 14:
                wcj wcjVar = aclg.a;
                return "com.google.android.projection.gearhead";
            default:
                Context context = (Context) obj;
                String str = adck.a;
                if (str != null) {
                    return str;
                }
                synchronized (adck.class) {
                    strD = adck.a;
                    if (strD == null) {
                        strD = wac.d(context, "com.google.android.gms.clearcut_client");
                        adck.a = strD;
                    }
                }
                return strD;
        }
    }
}
