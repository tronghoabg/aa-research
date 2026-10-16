package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ybq extends defpackage.ydd {
    final /* synthetic */ defpackage.ybr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybq(defpackage.ybr ybrVar, defpackage.ybu ybuVar) {
        super(ybuVar);
        this.a = ybrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ydd
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.ybr ybrVar = this.a;
        defpackage.ybu ybuVarG = obj.g();
        if (ybuVarG == ybrVar.a) {
            return null;
        }
        return ybuVarG;
    }
}
