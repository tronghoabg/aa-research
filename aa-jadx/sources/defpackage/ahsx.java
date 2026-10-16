package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahsx extends defpackage.afhk {
    final /* synthetic */ defpackage.ahsy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsx(java.lang.Object obj, defpackage.ahsy ahsyVar) {
        super(obj);
        this.this$0 = ahsyVar;
    }

    @Override // defpackage.afhk
    protected boolean beforeChange(defpackage.afja afjaVar, java.lang.Object obj, java.lang.Object obj2) {
        afjaVar.getClass();
        if (this.this$0.isLocked()) {
            throw new java.lang.IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
