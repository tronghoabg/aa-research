package c7;

import java.util.concurrent.Executor;

/* renamed from: c7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ExecutorC1572h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC1572h f19688b = new ExecutorC1572h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ExecutorC1572h f19689c = new ExecutorC1572h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19690a;

    public /* synthetic */ ExecutorC1572h(int i5) {
        this.f19690a = i5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f19690a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
