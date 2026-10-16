package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hfb implements hju {
    public final hju a;
    public final hfa b;
    public final List c;

    public hfb(hju hjuVar, hfa hfaVar, List list) {
        this.a = hjuVar;
        this.b = hfaVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfb)) {
            return false;
        }
        hfb hfbVar = (hfb) obj;
        return affa.f(this.a, hfbVar.a) && affa.f(this.b, hfbVar.b) && affa.f(this.c, hfbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "QrCodeSignInLayoutUiModel(header=" + this.a + ", content=" + this.b + ", actions=" + this.c + ")";
    }
}
