package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hfc implements hju {
    public final hju a;
    public final hju b;
    public final List c;

    public hfc(hju hjuVar, hju hjuVar2, List list) {
        this.a = hjuVar;
        this.b = hjuVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfc)) {
            return false;
        }
        hfc hfcVar = (hfc) obj;
        return affa.f(this.a, hfcVar.a) && affa.f(this.b, hfcVar.b) && affa.f(this.c, hfcVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SignInLayoutUiModel(header=" + this.a + ", content=" + this.b + ", actions=" + this.c + ")";
    }
}
