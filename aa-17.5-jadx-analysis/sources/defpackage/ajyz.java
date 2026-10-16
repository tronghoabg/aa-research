package defpackage;

/* loaded from: classes2.dex */
final class ajyz extends ajyg {
    @Override // defpackage.ajyg, defpackage.ajuj
    public final void c(ajui ajuiVar, ajul ajulVar) throws ajut {
        if (d(ajuiVar, ajulVar)) {
            return;
        }
        throw new ajun("Illegal 'path' attribute \"" + ajuiVar.d() + "\". Path of origin: \"" + ajulVar.c + "\"");
    }
}
