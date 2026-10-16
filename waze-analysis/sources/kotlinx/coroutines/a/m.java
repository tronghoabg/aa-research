package kotlinx.coroutines.a;

import androidx.collection.SieveCacheKt;
import kotlinx.coroutines.e.ak;
import kotlinx.coroutines.e.al;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static final u f51307c = new u(-1, null, null, 0);

    /* renamed from: a, reason: collision with root package name */
    public static final int f51305a = al.d("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    private static final int f51308d = al.d("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: b, reason: collision with root package name */
    public static final ak f51306b = new ak("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    private static final ak f51309e = new ak("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    private static final ak f51310f = new ak("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    private static final ak f51311g = new ak("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    private static final ak f51312h = new ak("POISONED");

    /* renamed from: i, reason: collision with root package name */
    private static final ak f51313i = new ak("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    private static final ak f51314j = new ak("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    private static final ak f51315k = new ak("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    private static final ak f51316l = new ak("CHANNEL_CLOSED");
    private static final ak m = new ak("SUSPEND");
    private static final ak n = new ak("SUSPEND_NO_WAITER");
    private static final ak o = new ak("FAILED");
    private static final ak p = new ak("NO_RECEIVE_RESULT");
    private static final ak q = new ak("CLOSE_HANDLER_CLOSED");
    private static final ak r = new ak("CLOSE_HANDLER_INVOKED");
    private static final ak s = new ak("NO_CLOSE_CAUSE");

    public static final /* synthetic */ long b(long j2, boolean z) {
        return (true != z ? 0L : SieveCacheKt.NodeVisitedBit) + j2;
    }

    public static final /* synthetic */ long c(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final h.l.f d() {
        return l.f51304a;
    }

    public static final ak t() {
        return f51316l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(kotlinx.coroutines.k kVar, Object obj, h.g.a.q qVar) {
        Object objI = kVar.i(obj, qVar);
        if (objI == null) {
            return false;
        }
        kVar.b(objI);
        return true;
    }
}
