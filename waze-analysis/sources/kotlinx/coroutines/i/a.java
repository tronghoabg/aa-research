package kotlinx.coroutines.i;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52051a = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
