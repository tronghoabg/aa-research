package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ygf implements Serializable {
    private static final long serialVersionUID = 0;
    final yfy a;

    public ygf(yfy yfyVar) {
        this.a = yfyVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
