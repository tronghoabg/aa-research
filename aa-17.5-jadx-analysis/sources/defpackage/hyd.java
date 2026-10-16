package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class hyd implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public hyd(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        hyc hycVar = new hyc(new hhw(this, runnable, 8, (byte[]) null));
        hycVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return hycVar;
    }
}
