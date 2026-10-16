package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ygb implements Serializable {
    private static final long serialVersionUID = 0;
    final yfy a;

    public ygb(yfy yfyVar) {
        this.a = yfyVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
