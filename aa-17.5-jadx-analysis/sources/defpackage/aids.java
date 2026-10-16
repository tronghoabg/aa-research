package defpackage;

/* loaded from: classes3.dex */
abstract class aids<T> extends aidr<T> {
    private volatile aieg<T> valuePostCompute;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computable";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aids(aidz aidzVar, afdr<? extends T> afdrVar) {
        super(aidzVar, afdrVar);
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (afdrVar == null) {
            $$$reportNull$$$0(1);
        }
        this.valuePostCompute = null;
    }

    protected abstract void doPostCompute(T t);

    @Override // defpackage.aidr, defpackage.afdr
    public T invoke() {
        aieg<T> aiegVar = this.valuePostCompute;
        return (aiegVar == null || !aiegVar.hasValue()) ? (T) super.invoke() : aiegVar.getValue();
    }

    @Override // defpackage.aidr
    protected final void postCompute(T t) {
        this.valuePostCompute = new aieg<>(t);
        try {
            doPostCompute(t);
        } finally {
            this.valuePostCompute = null;
        }
    }
}
