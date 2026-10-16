package androidx.core.os;

import android.os.Message;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    private MessageCompat() {
    }

    public static boolean isAsynchronous(Message message) {
        return message.isAsynchronous();
    }

    public static void setAsynchronous(Message message, boolean z) {
        message.setAsynchronous(z);
    }
}
