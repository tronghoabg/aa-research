package Q1;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9723b;

    public /* synthetic */ w(String str, int i5) {
        this.f9722a = i5;
        this.f9723b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9722a) {
            case 0:
                return new Thread(runnable, this.f9723b);
            case 1:
                return new Thread(runnable, this.f9723b);
            default:
                Thread thread = new Thread(runnable, this.f9723b);
                thread.setPriority(10);
                return thread;
        }
    }
}
