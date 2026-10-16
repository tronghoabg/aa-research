package J3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5542a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5543b;

    public a(boolean z2) {
        this.f5543b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbJ = N0.a.j(this.f5543b ? "WM.task-" : "androidx.work-");
        sbJ.append(this.f5542a.incrementAndGet());
        return new Thread(runnable, sbJ.toString());
    }
}
