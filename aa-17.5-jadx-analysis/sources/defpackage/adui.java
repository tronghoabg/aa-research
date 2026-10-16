package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adui {
    private static final Logger f = Logger.getLogger(adui.class.getName());
    public final long a;
    public final xya b;
    public Map c = new LinkedHashMap();
    public boolean d;
    public adnq e;

    public adui(long j, xya xyaVar) {
        this.a = j;
        this.b = xyaVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(ajmd ajmdVar, Executor executor) {
        a(executor, new adpo(ajmdVar, 15, null));
    }
}
