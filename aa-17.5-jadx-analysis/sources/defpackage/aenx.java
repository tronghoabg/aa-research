package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aenx<V> extends aelb<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aenx() {
    }

    private Object readResolve() {
        return aeny.a;
    }

    @Override // defpackage.aelb, defpackage.aenw
    public final boolean c(long j) {
        return false;
    }

    public Object clone() {
        return aeny.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    @Override // defpackage.aenw
    public final Object h(long j) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aelb, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
