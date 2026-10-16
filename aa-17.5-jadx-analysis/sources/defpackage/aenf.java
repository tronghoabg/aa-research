package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aenf<V> extends aeky<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aenf() {
    }

    private Object readResolve() {
        return aeng.a;
    }

    @Override // defpackage.aeky, defpackage.aene
    public final boolean c(long j) {
        return false;
    }

    public Object clone() {
        return aeng.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aene
    public final Object p(long j) {
        return null;
    }

    @Override // defpackage.aeky, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
