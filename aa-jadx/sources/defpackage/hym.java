package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hym implements java.util.concurrent.ThreadFactory {
    public final boolean a;
    private final java.lang.String b;
    private final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger();

    public hym(java.lang.String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        defpackage.hyl hylVar = new defpackage.hyl(new defpackage.hie(this, runnable, 8, null));
        hylVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return hylVar;
    }
}
