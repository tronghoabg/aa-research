package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajzu extends defpackage.ajzg {
    @Override // defpackage.ajzg, defpackage.ajvj
    public final void c(defpackage.ajvi ajviVar, defpackage.ajvl ajvlVar) throws defpackage.ajvt {
        if (d(ajviVar, ajvlVar)) {
            return;
        }
        throw new defpackage.ajvn("Illegal 'path' attribute \"" + ajviVar.d() + "\". Path of origin: \"" + ajvlVar.c + "\"");
    }
}
