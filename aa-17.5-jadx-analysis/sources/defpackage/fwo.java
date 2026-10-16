package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fwo implements hju {
    public final List a;
    public final boolean b;
    public final int c;

    public fwo(List list, boolean z, int i) {
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwo)) {
            return false;
        }
        fwo fwoVar = (fwo) obj;
        return affa.f(this.a, fwoVar.a) && this.b == fwoVar.b && this.c == fwoVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c;
    }

    public final String toString() {
        return "AdaptiveContentActionsUiModel(actionDelegates=" + this.a + ", collapseAction=" + this.b + ", stretchButtons=" + ((Object) fxp.b(this.c)) + ")";
    }

    public fwo() {
        this(afbe.a, true, 2);
    }
}
