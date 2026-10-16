package defpackage;

/* loaded from: classes3.dex */
final class aidk extends aidu {
    final /* synthetic */ aidz this$0;
    final /* synthetic */ afec val$onRecursiveCall;
    final /* synthetic */ afec val$postCompute;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidk(aidz aidzVar, aidz aidzVar2, afdr afdrVar, afec afecVar, afec afecVar2) {
        super(aidzVar2, afdrVar);
        this.this$0 = aidzVar;
        this.val$onRecursiveCall = afecVar;
        this.val$postCompute = afecVar2;
    }

    @Override // defpackage.aids
    protected void doPostCompute(Object obj) {
        if (obj == null) {
            $$$reportNull$$$0(2);
        }
        this.val$postCompute.invoke(obj);
    }

    @Override // defpackage.aidr
    protected aidy recursionDetected(boolean z) {
        afec afecVar = this.val$onRecursiveCall;
        if (afecVar != null) {
            return aidy.value(afecVar.invoke(Boolean.valueOf(z)));
        }
        aidy aidyVarRecursionDetected = super.recursionDetected(z);
        if (aidyVarRecursionDetected == null) {
            $$$reportNull$$$0(0);
        }
        return aidyVarRecursionDetected;
    }
}
