package androidx.camera.camera2.pipe.core;

import h.ab;
import h.c.e;
import h.g.a.p;
import h.g.b.u;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class MutexesKt$lockAndSuspend$lockFn$1 extends u implements p<a, e<? super ab>, Object> {
    public static final MutexesKt$lockAndSuspend$lockFn$1 INSTANCE = new MutexesKt$lockAndSuspend$lockFn$1();

    MutexesKt$lockAndSuspend$lockFn$1() {
        super(2, MutexesKt.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // h.g.a.p
    public final Object invoke(a aVar, e<? super ab> eVar) {
        return MutexesKt.lockWithoutOwner(aVar, eVar);
    }
}
