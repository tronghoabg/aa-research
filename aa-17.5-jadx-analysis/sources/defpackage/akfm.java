package defpackage;

/* loaded from: classes2.dex */
final class akfm implements akfl {
    public final akfl a;

    private akfm(akfl akflVar) {
        this.a = akflVar;
    }

    static akfm b(akfl akflVar) {
        if (akflVar instanceof akfi) {
            return ((akfi) akflVar).a;
        }
        if (akflVar instanceof akfm) {
            return (akfm) akflVar;
        }
        if (akflVar == null) {
            return null;
        }
        return new akfm(akflVar);
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        return this.a.c(akfhVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akfm) {
            return this.a.equals(((akfm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
