package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajxe extends defpackage.akbq {
    protected final defpackage.akbs a;
    protected final defpackage.akbs b;

    public ajxe(defpackage.akbs akbsVar, defpackage.akbs akbsVar2) {
        this.a = akbsVar;
        this.b = akbsVar2;
    }

    @Override // defpackage.akbs
    public final java.lang.Object a(java.lang.String str) {
        defpackage.akbs akbsVar;
        defpackage.akbs akbsVar2 = this.b;
        java.lang.Object objA = akbsVar2 != null ? akbsVar2.a(str) : null;
        return (objA != null || (akbsVar = this.a) == null) ? objA : akbsVar.a(str);
    }

    @Override // defpackage.akbs
    public final void b(java.lang.String str, java.lang.Object obj) throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
