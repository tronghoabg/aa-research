package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class yfo implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public yfo(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return yfq.p(this.a);
    }
}
