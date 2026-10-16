package e.a.h;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g<ReqT, RespT> {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f47773b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f47772a = new ArrayBlockingQueue(1);

    static {
        Logger.getLogger(g.class.getName());
    }

    g() {
    }
}
