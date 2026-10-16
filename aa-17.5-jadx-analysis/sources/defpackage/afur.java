package defpackage;

/* loaded from: classes.dex */
public abstract class afur<T> {
    private static final Object NULL_VALUE = new afuq();

    protected Object escape(T t) {
        return t == null ? NULL_VALUE : t;
    }

    public final T getValue(Object obj, Object obj2) {
        return invoke();
    }

    public abstract T invoke();

    /* JADX WARN: Multi-variable type inference failed */
    protected T unescape(Object obj) {
        if (obj == NULL_VALUE) {
            return null;
        }
        return obj;
    }
}
