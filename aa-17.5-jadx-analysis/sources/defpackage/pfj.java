package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class pfj {
    public final Queue a = new yne(new ydx(100));
    public final Queue b = new yne(new ydx(100));
    public BluetoothDevice c = null;
    public final oqe d;
    public final Context e;

    public pfj(Context context, oqe oqeVar) {
        this.d = oqeVar;
        this.e = context;
    }

    public static String a(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return a.bp(i, "UNKONW_VALUE:");
        }
    }
}
