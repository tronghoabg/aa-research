package defpackage;

/* loaded from: classes3.dex */
final class aidj extends aidt {
    final /* synthetic */ aidz this$0;
    final /* synthetic */ Object val$onRecursiveCall;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidj(aidz aidzVar, aidz aidzVar2, afdr afdrVar, Object obj) {
        super(aidzVar2, afdrVar);
        this.this$0 = aidzVar;
        this.val$onRecursiveCall = obj;
    }

    @Override // defpackage.aidr
    protected aidy recursionDetected(boolean z) {
        return aidy.value(this.val$onRecursiveCall);
    }
}
