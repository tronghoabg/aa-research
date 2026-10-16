package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class tzy implements Serializable, Comparable {
    public static final tzy a = new tzy(new tob(0, 0), 0);
    public final tob b;
    public final int c;
    public final String d = "";

    public tzy(tob tobVar, int i) {
        this.b = tobVar;
        this.c = i;
    }

    public static tzy a(aazt aaztVar) {
        if (aaztVar == null) {
            return null;
        }
        tob tobVarA = tob.a(aaztVar.c);
        int i = (aaztVar.b & 2) != 0 ? aaztVar.d : Integer.MIN_VALUE;
        if (tobVarA != null) {
            return new tzy(tobVarA, i);
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((tzy) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tzy) {
            return this.b.equals(((tzy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "{" + getClass().getSimpleName() + ":id=" + this.b.f() + ", levelNumberE3=" + this.c + ", levelName=" + this.d + "}";
    }
}
