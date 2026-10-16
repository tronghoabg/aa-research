package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class awe implements defpackage.awd {
    public static final defpackage.awe a = new defpackage.awe();

    @Override // defpackage.awd
    public final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.csu csuVar) {
        return cgfVar.a(new defpackage.awz(csuVar));
    }

    @Override // defpackage.awd
    public final defpackage.cgf b(defpackage.cgf cgfVar, float f, boolean z) {
        if (f <= 0.0d) {
            defpackage.axd.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return cgfVar.a(new defpackage.avk(f, z));
    }

    @Override // defpackage.awd
    public final defpackage.cgf c(defpackage.cgf cgfVar, defpackage.cfy cfyVar) {
        return cgfVar.a(new defpackage.aws(cfyVar));
    }
}
