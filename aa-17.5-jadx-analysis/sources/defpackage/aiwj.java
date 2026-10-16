package defpackage;

/* loaded from: classes2.dex */
public final class aiwj {
    public static final ThreadLocal a = new ThreadLocal();

    public static final aius a() {
        ThreadLocal threadLocal = a;
        aius aiusVar = (aius) threadLocal.get();
        if (aiusVar != null) {
            return aiusVar;
        }
        aitc aitcVar = new aitc(Thread.currentThread());
        threadLocal.set(aitcVar);
        return aitcVar;
    }
}
