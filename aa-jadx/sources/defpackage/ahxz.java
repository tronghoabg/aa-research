package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahxz extends defpackage.ahxj {
    private final defpackage.aifc<defpackage.ahye> lazyScope;

    public ahxz(defpackage.aifi aifiVar, defpackage.afer<? extends defpackage.ahye> aferVar) {
        aifiVar.getClass();
        aferVar.getClass();
        this.lazyScope = aifiVar.createLazyValue(new defpackage.ahxy(aferVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahye lazyScope$lambda$0(defpackage.afer aferVar) {
        defpackage.ahye ahyeVar = (defpackage.ahye) aferVar.invoke();
        return ahyeVar instanceof defpackage.ahxj ? ((defpackage.ahxj) ahyeVar).getActualScope() : ahyeVar;
    }

    @Override // defpackage.ahxj
    protected defpackage.ahye getWorkerScope() {
        return this.lazyScope.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ahxz(defpackage.afer<? extends defpackage.ahye> aferVar) {
        this(null, aferVar, 1, 0 == true ? 1 : 0);
        aferVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ahxz(defpackage.aifi aifiVar, defpackage.afer aferVar, int i, defpackage.affu affuVar) {
        if ((i & 1) != 0) {
            aifiVar = defpackage.aiez.NO_LOCKS;
            aifiVar.getClass();
        }
        this(aifiVar, aferVar);
    }
}
