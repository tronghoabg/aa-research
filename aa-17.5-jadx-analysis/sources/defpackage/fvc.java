package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fvc implements hju {
    public final List a;

    public fvc(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvc) && affa.f(this.a, ((fvc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlphaJumpKeyboardUiModel(keys=" + this.a + ")";
    }
}
