package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aegv<V> extends aege<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aegv() {
    }

    private Object readResolve() {
        return aegw.a;
    }

    @Override // defpackage.aege, defpackage.aegu
    public final boolean c(int i) {
        return false;
    }

    public Object clone() {
        return aegw.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aegu
    public final Object p(int i) {
        return null;
    }

    @Override // defpackage.aege, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
