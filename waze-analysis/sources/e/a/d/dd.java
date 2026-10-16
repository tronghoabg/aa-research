package e.a.d;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dd implements jp {
    @Override // e.a.d.jp
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(dh.i("grpc-default-executor-%d"));
    }

    @Override // e.a.d.jp
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
