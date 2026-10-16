package e.a.f;

import e.a.d.dh;
import e.a.d.jp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements jp {
    @Override // e.a.d.jp
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(dh.i("grpc-okhttp-%d"));
    }

    @Override // e.a.d.jp
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }
}
