package defpackage;

/* loaded from: classes2.dex */
final class akfi implements akfl {
    public final akfm a;

    private akfi(akfm akfmVar) {
        this.a = akfmVar;
    }

    static akfl b(akfm akfmVar) {
        if (akfmVar instanceof akfm) {
            return akfmVar;
        }
        if (akfmVar == null) {
            return null;
        }
        return new akfi(akfmVar);
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        return this.a.a.c(akfhVar, charSequence.toString(), i);
    }
}
