package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajjm extends defpackage.ajjn {
    public final defpackage.afie a;
    public final java.lang.Object b;
    public final defpackage.ajjn c;

    public ajjm(defpackage.afie afieVar, java.lang.Object obj, defpackage.ajjn ajjnVar) {
        this.a = afieVar;
        this.b = obj;
        this.c = ajjnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ajjn] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.ajjn
    public final defpackage.ajjn a(defpackage.afie afieVar, java.lang.Object obj) {
        ?? r3;
        defpackage.afie afieVar2 = this.a;
        boolean zF = defpackage.afga.f(afieVar, afieVar2);
        defpackage.ajjn ajjmVar = this.c;
        if (zF) {
            r3 = ajjmVar;
        } else {
            defpackage.ajjn ajjnVarA = ajjmVar.a(afieVar, null);
            if (ajjnVarA != ajjmVar) {
                this = this;
                ajjmVar = new defpackage.ajjm(afieVar2, this.b, ajjnVarA);
                r3 = ajjmVar;
            }
        }
        return obj != null ? new defpackage.ajjm(afieVar, obj, r3) : r3;
    }

    public final java.lang.String toString() {
        return defpackage.afga.bo(defpackage.afga.aU(defpackage.afsg.j(defpackage.afsg.f(this, new defpackage.xsz(11)))), null, "{", "}", new defpackage.xsz(12), 25);
    }
}
