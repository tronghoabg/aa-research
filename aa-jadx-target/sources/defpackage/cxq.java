package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxq extends defpackage.cwe {
    @Override // defpackage.cwe
    public final int a(defpackage.cyl cylVar, defpackage.csf csfVar) {
        defpackage.cxv cxvVarC = cylVar.C();
        cxvVarC.getClass();
        return cxvVarC.dJ(csfVar);
    }

    @Override // defpackage.cwe
    protected final long b(defpackage.cyl cylVar, long j) {
        defpackage.cxv cxvVarC = cylVar.C();
        cxvVarC.getClass();
        long j2 = cxvVarC.h;
        return defpackage.a.ah((((long) java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.cwe
    public final java.util.Map c(defpackage.cyl cylVar) {
        defpackage.cxv cxvVarC = cylVar.C();
        cxvVarC.getClass();
        return cxvVarC.K().f();
    }
}
