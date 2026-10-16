package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class hvo implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new gnu(runnable, 15, null), "glide-active-resources");
    }
}
