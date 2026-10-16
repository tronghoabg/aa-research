package defpackage;

/* loaded from: classes.dex */
public final class afiw {
    private static final boolean useClassValue;

    static {
        Object objDE;
        try {
            objDE = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        if (aezw.b(objDE)) {
            objDE = true;
        }
        if (true == (objDE instanceof aezv)) {
            objDE = false;
        }
        useClassValue = ((Boolean) objDE).booleanValue();
    }

    public static final <V> afiv<V> createCache(afec<? super Class, ? extends V> afecVar) {
        afecVar.getClass();
        return useClassValue ? new afjd(afecVar) : new afjf(afecVar);
    }
}
