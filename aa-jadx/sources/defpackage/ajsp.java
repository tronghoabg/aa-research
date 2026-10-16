package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajsp extends defpackage.ajsm implements defpackage.ajqc {
    public defpackage.ajqb c;

    @Override // defpackage.ajqc
    public final defpackage.ajqb a() {
        return this.c;
    }

    @Override // defpackage.ajqc
    public final boolean b() {
        defpackage.ajpy ajpyVarHi = hi("Expect");
        return ajpyVarHi != null && "100-continue".equalsIgnoreCase(ajpyVarHi.c());
    }

    @Override // defpackage.ajsm
    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.ajsp ajspVar = (defpackage.ajsp) super.clone();
        defpackage.ajqb ajqbVar = this.c;
        if (ajqbVar != null) {
            ajspVar.c = (defpackage.ajqb) defpackage.agup.a(ajqbVar);
        }
        return ajspVar;
    }
}
