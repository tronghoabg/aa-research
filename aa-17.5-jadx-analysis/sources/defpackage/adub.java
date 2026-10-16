package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final class adub implements adzq {
    @Override // defpackage.adzq
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(adue.i("grpc-default-executor-%d"));
    }

    @Override // defpackage.adzq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
