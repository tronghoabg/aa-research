package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class xyf implements Serializable, xyc {
    private static final long serialVersionUID = 0;
    public final Object a;

    public xyf(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xyc
    public final boolean equals(Object obj) {
        if (obj instanceof xyf) {
            return Objects.equals(this.a, ((xyf) obj).a);
        }
        return false;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + String.valueOf(this.a) + ")";
    }
}
