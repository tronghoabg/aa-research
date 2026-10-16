package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aclr implements defpackage.aclt {
    private defpackage.aclw a;

    public static void b(defpackage.aclr aclrVar, defpackage.aclw aclwVar) {
        if (aclrVar.a != null) {
            throw new java.lang.IllegalStateException();
        }
        aclrVar.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        defpackage.aclw aclwVar = this.a;
        if (aclwVar != null) {
            return aclwVar.a();
        }
        throw new java.lang.IllegalStateException();
    }
}
