package defpackage;

/* loaded from: classes.dex */
public final class bjj {
    public String a;
    public boolean b = false;
    public biv c = null;
    private final String d;

    public bjj(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjj)) {
            return false;
        }
        bjj bjjVar = (bjj) obj;
        return affa.f(this.d, bjjVar.d) && affa.f(this.a, bjjVar.a) && this.b == bjjVar.b && affa.f(this.c, bjjVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = true != this.b ? 1237 : 1231;
        biv bivVar = this.c;
        return (((iHashCode * 31) + i) * 31) + (bivVar == null ? 0 : bivVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ")";
    }
}
