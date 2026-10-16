package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class aixj {
    public static final aixq a = new aixq(-1, null, null, 0);
    public static final int b = afuq.d("kotlinx.coroutines.bufferedChannel.segmentSize", 32, Alert.DURATION_SHOW_INDEFINITELY);
    public static final int c = afuq.d("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, Alert.DURATION_SHOW_INDEFINITELY);
    public static final ajcz d = new ajcz("BUFFERED");
    public static final ajcz e = new ajcz("SHOULD_BUFFER");
    public static final ajcz f = new ajcz("S_RESUMING_BY_RCV");
    public static final ajcz g = new ajcz("RESUMING_BY_EB");
    public static final ajcz h = new ajcz("POISONED");
    public static final ajcz i = new ajcz("DONE_RCV");
    public static final ajcz j = new ajcz("INTERRUPTED_SEND");
    public static final ajcz k = new ajcz("INTERRUPTED_RCV");
    public static final ajcz l = new ajcz("CHANNEL_CLOSED");
    public static final ajcz m = new ajcz("SUSPEND");
    public static final ajcz n = new ajcz("SUSPEND_NO_WAITER");
    public static final ajcz o = new ajcz("FAILED");
    public static final ajcz p = new ajcz("NO_RECEIVE_RESULT");
    public static final ajcz q = new ajcz("CLOSE_HANDLER_CLOSED");
    public static final ajcz r = new ajcz("CLOSE_HANDLER_INVOKED");
    public static final ajcz s = new ajcz("NO_CLOSE_CAUSE");

    public static final long a(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final boolean b(aitf aitfVar, Object obj) {
        Object objJ = aitfVar.j(obj, null);
        if (objJ == null) {
            return false;
        }
        aitfVar.c(objJ);
        return true;
    }
}
