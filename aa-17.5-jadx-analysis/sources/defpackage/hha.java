package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hha implements hju {
    public static final int a = fxb.a;
    public final List b;
    public final fxb c;

    public hha(List list, fxb fxbVar) {
        this.b = list;
        this.c = fxbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hha)) {
            return false;
        }
        hha hhaVar = (hha) obj;
        return affa.f(this.b, hhaVar.b) && affa.f(this.c, hhaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        fxb fxbVar = this.c;
        return iHashCode + (fxbVar == null ? 0 : fxbVar.hashCode());
    }

    public final String toString() {
        return "TabHeaderUiModel(tabs=" + this.b + ", startContent=" + this.c + ")";
    }
}
