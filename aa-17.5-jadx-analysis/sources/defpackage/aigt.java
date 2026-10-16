package defpackage;

/* loaded from: classes3.dex */
public final class aigt extends aijh {
    private final afdr<aigl> computation;
    private final aiec<aigl> lazyValue;
    private final aiei storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public aigt(aiei aieiVar, afdr<? extends aigl> afdrVar) {
        aieiVar.getClass();
        afdrVar.getClass();
        this.storageManager = aieiVar;
        this.computation = afdrVar;
        this.lazyValue = aieiVar.createLazyValue(afdrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl refine$lambda$0(aiju aijuVar, aigt aigtVar) {
        return aijuVar.refineType((ailw) aigtVar.computation.invoke());
    }

    @Override // defpackage.aijh
    protected aigl getDelegate() {
        return this.lazyValue.invoke();
    }

    @Override // defpackage.aijh
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // defpackage.aigl
    public aigt refine(aiju aijuVar) {
        aijuVar.getClass();
        return new aigt(this.storageManager, new aigs(aijuVar, this));
    }
}
