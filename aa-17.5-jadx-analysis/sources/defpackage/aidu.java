package defpackage;

/* loaded from: classes3.dex */
abstract class aidu<T> extends aids<T> implements aiec<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidu(aidz aidzVar, afdr<? extends T> afdrVar) {
        super(aidzVar, afdrVar);
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (afdrVar == null) {
            $$$reportNull$$$0(1);
        }
    }

    @Override // defpackage.aids, defpackage.aidr, defpackage.afdr
    public T invoke() {
        T t = (T) super.invoke();
        if (t == null) {
            $$$reportNull$$$0(2);
        }
        return t;
    }
}
