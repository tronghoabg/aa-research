package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class afvr<T> {
    private static final java.lang.Object NULL_VALUE = new defpackage.afvq();

    protected java.lang.Object escape(T t) {
        return t == null ? NULL_VALUE : t;
    }

    public final T getValue(java.lang.Object obj, java.lang.Object obj2) {
        return invoke();
    }

    public abstract T invoke();

    /* JADX WARN: Multi-variable type inference failed */
    protected T unescape(java.lang.Object obj) {
        if (obj == NULL_VALUE) {
            return null;
        }
        return obj;
    }
}
