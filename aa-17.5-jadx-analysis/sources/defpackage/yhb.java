package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class yhb implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public yhb(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        yha yhaVar = new yha(this.a);
        yhaVar.o(this.b);
        return yhaVar.g();
    }
}
