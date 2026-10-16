package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aeib<V> extends aegh<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeib() {
    }

    private Object readResolve() {
        return aeic.a;
    }

    @Override // defpackage.aegh, defpackage.aeia
    public final boolean c(int i) {
        return false;
    }

    public Object clone() {
        return aeic.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    @Override // defpackage.aeia
    public final Object h(int i) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aegh, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
