package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiht extends defpackage.aikh {
    private final defpackage.afer<defpackage.aihl> computation;
    private final defpackage.aifc<defpackage.aihl> lazyValue;
    private final defpackage.aifi storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public aiht(defpackage.aifi aifiVar, defpackage.afer<? extends defpackage.aihl> aferVar) {
        aifiVar.getClass();
        aferVar.getClass();
        this.storageManager = aifiVar;
        this.computation = aferVar;
        this.lazyValue = aifiVar.createLazyValue(aferVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aihl refine$lambda$0(defpackage.aiku aikuVar, defpackage.aiht aihtVar) {
        return aikuVar.refineType((defpackage.aimw) aihtVar.computation.invoke());
    }

    @Override // defpackage.aikh
    protected defpackage.aihl getDelegate() {
        return this.lazyValue.invoke();
    }

    @Override // defpackage.aikh
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // defpackage.aihl
    public defpackage.aiht refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return new defpackage.aiht(this.storageManager, new defpackage.aihs(aikuVar, this));
    }
}
