package defpackage;

/* loaded from: classes3.dex */
public abstract class ahuh<T> {
    private final T value;

    public ahuh(T t) {
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        ahuh ahuhVar = obj instanceof ahuh ? (ahuh) obj : null;
        return affa.f(value, ahuhVar != null ? ahuhVar.getValue() : null);
    }

    public abstract aigl getType(agcu agcuVar);

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

    public String toString() {
        return String.valueOf(getValue());
    }
}
