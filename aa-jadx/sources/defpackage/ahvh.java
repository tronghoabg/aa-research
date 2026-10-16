package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahvh<T> {
    private final T value;

    public ahvh(T t) {
        this.value = t;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        defpackage.ahvh ahvhVar = obj instanceof defpackage.ahvh ? (defpackage.ahvh) obj : null;
        return defpackage.afga.f(value, ahvhVar != null ? ahvhVar.getValue() : null);
    }

    public abstract defpackage.aihl getType(defpackage.agdu agduVar);

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }
}
