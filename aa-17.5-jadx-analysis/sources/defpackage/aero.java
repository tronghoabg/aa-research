package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aero<K> extends aeqk<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aero() {
    }

    private Object readResolve() {
        return aerq.a;
    }

    public Object clone() {
        return aerq.a;
    }

    @Override // defpackage.aeqk, defpackage.aeee
    public final boolean containsKey(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aern
    public final int o(Object obj) {
        return 0;
    }

    @Override // defpackage.aeqk, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
