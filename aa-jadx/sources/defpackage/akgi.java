package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgi implements defpackage.akgl {
    public final defpackage.akgm a;

    private akgi(defpackage.akgm akgmVar) {
        this.a = akgmVar;
    }

    static defpackage.akgl b(defpackage.akgm akgmVar) {
        if (akgmVar instanceof defpackage.akgm) {
            return akgmVar;
        }
        if (akgmVar == null) {
            return null;
        }
        return new defpackage.akgi(akgmVar);
    }

    @Override // defpackage.akgl
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.akgl
    public final int c(defpackage.akgh akghVar, java.lang.CharSequence charSequence, int i) {
        return this.a.a.c(akghVar, charSequence.toString(), i);
    }
}
