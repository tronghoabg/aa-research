package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fxj implements hju {
    public final List a;
    public final int b;

    public fxj(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxj)) {
            return false;
        }
        fxj fxjVar = (fxj) obj;
        return affa.f(this.a, fxjVar.a) && this.b == fxjVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ColumnActionsUiModel(actionDelegates=" + this.a + ", stretchButtons=" + ((Object) fxp.b(this.b)) + ")";
    }

    public fxj() {
        this(afbe.a, 2);
    }
}
