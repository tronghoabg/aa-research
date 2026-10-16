package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ygq implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public ygq(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return ygr.o(this.a);
    }
}
