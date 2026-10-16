package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class afup<T> extends afur<T> implements afdr<T> {
    private final afdr<T> initializer;
    private volatile SoftReference<Object> value;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
    }

    public afup(T t, afdr<T> afdrVar) {
        if (afdrVar == null) {
            $$$reportNull$$$0(0);
        }
        this.value = null;
        this.initializer = afdrVar;
        if (t != null) {
            this.value = new SoftReference<>(escape(t));
        }
    }

    @Override // defpackage.afur, defpackage.afdr
    public T invoke() {
        Object obj;
        SoftReference<Object> softReference = this.value;
        if (softReference != null && (obj = softReference.get()) != null) {
            return unescape(obj);
        }
        T tInvoke = this.initializer.invoke();
        this.value = new SoftReference<>(escape(tInvoke));
        return tInvoke;
    }
}
