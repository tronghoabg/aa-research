package defpackage;

/* loaded from: classes3.dex */
final class yak extends ybx {
    final /* synthetic */ yal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yak(yal yalVar, yao yaoVar) {
        super(yaoVar);
        this.a = yalVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ybx
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        yal yalVar = this.a;
        yao yaoVarG = obj.g();
        if (yaoVarG == yalVar.a) {
            return null;
        }
        return yaoVarG;
    }
}
