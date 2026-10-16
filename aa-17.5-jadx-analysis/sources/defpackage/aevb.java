package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aevb<K> extends aeqz<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aevb() {
    }

    private Object readResolve() {
        return aevc.a;
    }

    public Object clone() {
        return aevc.a;
    }

    @Override // defpackage.aeqz, defpackage.aeee
    public final boolean containsKey(Object obj) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aeva
    public final int o(Object obj) {
        return 0;
    }

    @Override // defpackage.aeqz, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
