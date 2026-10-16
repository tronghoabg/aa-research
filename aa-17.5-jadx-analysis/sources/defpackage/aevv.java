package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aevv<K, V> extends aerb<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aevv() {
    }

    private Object readResolve() {
        return aevw.a;
    }

    public Object clone() {
        return aevw.a;
    }

    @Override // defpackage.aerb, defpackage.aeee
    public final boolean containsKey(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    @Override // defpackage.aevu, defpackage.aeee
    public final V get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aerb, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
