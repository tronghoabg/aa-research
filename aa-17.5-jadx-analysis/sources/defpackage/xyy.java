package defpackage;

/* loaded from: classes3.dex */
final class xyy extends ybx {
    final /* synthetic */ xyz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyy(xyz xyzVar, yao yaoVar) {
        super(yaoVar);
        this.a = xyzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ybx
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        xyz xyzVar = this.a;
        yao yaoVarF = obj.f();
        if (yaoVarF == xyzVar.a) {
            return null;
        }
        return yaoVarF;
    }
}
