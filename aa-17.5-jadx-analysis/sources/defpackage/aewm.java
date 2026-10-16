package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aewm<K, V> extends aerd<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aewm() {
    }

    private Object readResolve() {
        return aewn.a;
    }

    public Object clone() {
        return aewn.a;
    }

    @Override // defpackage.aerd, defpackage.aeee
    public final boolean containsKey(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    @Override // defpackage.aewl, defpackage.aeee
    public final V get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aerd, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
