package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class wad implements ThreadFactory {
    private final /* synthetic */ int a;

    public /* synthetic */ wad(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.a != 0) {
            return new dwm(runnable);
        }
        AtomicReference atomicReference = wae.a;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
