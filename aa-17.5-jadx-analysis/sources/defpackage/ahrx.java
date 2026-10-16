package defpackage;

/* loaded from: classes3.dex */
public final class ahrx extends afgk {
    final /* synthetic */ ahry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrx(Object obj, ahry ahryVar) {
        super(obj);
        this.this$0 = ahryVar;
    }

    @Override // defpackage.afgk
    protected boolean beforeChange(afia afiaVar, Object obj, Object obj2) {
        afiaVar.getClass();
        if (this.this$0.isLocked()) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
