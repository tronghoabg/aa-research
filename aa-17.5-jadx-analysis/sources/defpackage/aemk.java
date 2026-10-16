package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aemk extends aekw implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aemk() {
    }

    private Object readResolve() {
        return aemm.a;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long a() {
        return 0L;
    }

    public Object clone() {
        return aemm.a;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final boolean e(long j) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof aeee) && ((aeee) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final int size() {
        return 0;
    }

    @Override // defpackage.aemj
    public final long t(long j) {
        return 0L;
    }

    public String toString() {
        return "{}";
    }

    public final void clear() {
    }
}
