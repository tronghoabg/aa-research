package Ef;

/* loaded from: classes5.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3681a = new ThreadLocal();

    public static AbstractC0481c0 a() {
        ThreadLocal threadLocal = f3681a;
        AbstractC0481c0 abstractC0481c0 = (AbstractC0481c0) threadLocal.get();
        if (abstractC0481c0 != null) {
            return abstractC0481c0;
        }
        C0492i c0492i = new C0492i(Thread.currentThread());
        threadLocal.set(c0492i);
        return c0492i;
    }
}
