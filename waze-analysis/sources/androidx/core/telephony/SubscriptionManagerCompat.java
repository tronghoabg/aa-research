package androidx.core.telephony;

import android.telephony.SubscriptionManager;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SubscriptionManagerCompat {
    private static Method sGetSlotIndexMethod;

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static int getSlotIndex(int i2) {
            return SubscriptionManager.getSlotIndex(i2);
        }
    }

    private SubscriptionManagerCompat() {
    }

    public static int getSlotIndex(int i2) {
        if (i2 == -1) {
            return -1;
        }
        return Api29Impl.getSlotIndex(i2);
    }
}
