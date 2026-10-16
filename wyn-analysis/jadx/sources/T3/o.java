package T3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11430a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11430a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
