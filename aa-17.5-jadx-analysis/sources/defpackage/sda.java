package defpackage;

import android.content.Intent;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class sda {
    private static final ypf a = ols.R("CAR.BT");

    public static int a(Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
            return 2;
        }
        if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
            return 0;
        }
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) || "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            return intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        }
        return -1;
    }

    public static boolean b(Parcelable[] parcelableArr) {
        if (parcelableArr != null) {
            ypf ypfVar = a;
            ypfVar.l().ai(8780).w("Received bluetooth device uuids %d", parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                ParcelUuid parcelUuid = (ParcelUuid) parcelable;
                if (parcelUuid != null && parcelUuid.getUuid() != null && (qtd.a.equals(parcelUuid.getUuid()) || qtd.b.equals(parcelUuid.getUuid()))) {
                    ypfVar.l().ai(8781).u("Received uuids matching known / chromecast uuid");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Intent intent) {
        return "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction());
    }
}
