package E4;

import java.util.concurrent.ThreadFactory;

/* renamed from: E4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0433b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2864a) {
            case 0:
                return new Thread(new RunnableC0432a(0, runnable), "glide-active-resources");
            default:
                return new h1.j(runnable);
        }
    }
}
