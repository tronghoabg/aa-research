package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akct extends akcw implements Cloneable, Serializable, akcu {
    private static final long serialVersionUID = 2852608688135209575L;

    public akct(akcl akclVar) {
        super(0L, akdr.O(akclVar));
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public akct() {
    }
}
