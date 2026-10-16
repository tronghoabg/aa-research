package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* loaded from: classes3.dex */
final class yfj implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public yfj(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new yfk(this.a.clone());
    }
}
