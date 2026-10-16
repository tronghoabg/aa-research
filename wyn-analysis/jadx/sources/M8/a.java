package M8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f7530e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f7531a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7533c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f7534d;

    public a(String str, int i5, StrictMode.ThreadPolicy threadPolicy) {
        this.f7532b = str;
        this.f7533c = i5;
        this.f7534d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f7530e.newThread(new C8.d(21, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f7532b + " Thread #" + this.f7531a.getAndIncrement());
        return threadNewThread;
    }
}
