package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dja implements defpackage.djg {
    @Override // defpackage.djg
    public final void a(defpackage.djh djhVar) {
        if (djhVar.k()) {
            djhVar.g(djhVar.c, djhVar.d);
            return;
        }
        if (djhVar.b() == -1) {
            int i = djhVar.a;
            int i2 = djhVar.b;
            djhVar.j(i, i);
            djhVar.g(i, i2);
            return;
        }
        if (djhVar.b() == 0) {
            return;
        }
        java.lang.String string = djhVar.toString();
        int iB = djhVar.b();
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        djhVar.g(characterInstance.preceding(iB), djhVar.b());
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.dja;
    }

    public final int hashCode() {
        return defpackage.afgw.b(getClass()).hashCode();
    }

    public final java.lang.String toString() {
        return "BackspaceCommand()";
    }
}
