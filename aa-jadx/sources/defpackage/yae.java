package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yae extends defpackage.ydd {
    final /* synthetic */ defpackage.yaf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yae(defpackage.yaf yafVar, defpackage.ybu ybuVar) {
        super(ybuVar);
        this.a = yafVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ydd
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.yaf yafVar = this.a;
        defpackage.ybu ybuVarF = obj.f();
        if (ybuVarF == yafVar.a) {
            return null;
        }
        return ybuVarF;
    }
}
