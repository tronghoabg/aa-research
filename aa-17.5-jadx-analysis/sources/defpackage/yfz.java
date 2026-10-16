package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class yfz implements Serializable {
    private static final long serialVersionUID = 0;
    final yfy a;

    public yfz(yfy yfyVar) {
        this.a = yfyVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
