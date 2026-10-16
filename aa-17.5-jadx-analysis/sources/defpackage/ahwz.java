package defpackage;

/* loaded from: classes3.dex */
public final class ahwz extends ahwj {
    private final aiec<ahxe> lazyScope;

    public ahwz(aiei aieiVar, afdr<? extends ahxe> afdrVar) {
        aieiVar.getClass();
        afdrVar.getClass();
        this.lazyScope = aieiVar.createLazyValue(new ahwy(afdrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe lazyScope$lambda$0(afdr afdrVar) {
        ahxe ahxeVar = (ahxe) afdrVar.invoke();
        return ahxeVar instanceof ahwj ? ((ahwj) ahxeVar).getActualScope() : ahxeVar;
    }

    @Override // defpackage.ahwj
    protected ahxe getWorkerScope() {
        return this.lazyScope.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ahwz(afdr<? extends ahxe> afdrVar) {
        this(null, afdrVar, 1, 0 == true ? 1 : 0);
        afdrVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ahwz(aiei aieiVar, afdr afdrVar, int i, afeu afeuVar) {
        if ((i & 1) != 0) {
            aieiVar = aidz.NO_LOCKS;
            aieiVar.getClass();
        }
        this(aieiVar, afdrVar);
    }
}
