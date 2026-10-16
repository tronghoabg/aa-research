package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eru implements defpackage.afar {
    private final defpackage.afie a;
    private final defpackage.afer b;
    private final defpackage.afer c;
    private final defpackage.afer d;
    private defpackage.ers e;

    public eru(defpackage.afie afieVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.afer aferVar3) {
        afieVar.getClass();
        this.a = afieVar;
        this.b = aferVar;
        this.c = aferVar2;
        this.d = aferVar3;
    }

    @Override // defpackage.afar
    public final /* synthetic */ java.lang.Object a() {
        defpackage.ers ersVar = this.e;
        if (ersVar != null) {
            return ersVar;
        }
        defpackage.erz erzVar = (defpackage.erz) this.b.invoke();
        defpackage.erw erwVar = (defpackage.erw) this.c.invoke();
        defpackage.esi esiVar = (defpackage.esi) this.d.invoke();
        erzVar.getClass();
        erwVar.getClass();
        esiVar.getClass();
        defpackage.ers ersVarB = new defpackage.ery(erzVar, erwVar, esiVar).b(this.a);
        this.e = ersVarB;
        return ersVarB;
    }

    @Override // defpackage.afar
    public final boolean b() {
        throw null;
    }
}
