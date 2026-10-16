package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aelp extends aeku implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aelp() {
    }

    private Object readResolve() {
        return aelq.a;
    }

    public Object clone() {
        return aelq.a;
    }

    @Override // defpackage.aeku, defpackage.aelo
    public final boolean d(long j) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aelo
    public final int s(long j) {
        return 0;
    }

    @Override // defpackage.aeku, defpackage.aeee
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
