package defpackage;

/* loaded from: classes3.dex */
final class aido implements aidp {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
    }

    @Override // defpackage.aidp
    public RuntimeException handleException(Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(0);
        }
        throw aipe.rethrow(th);
    }
}
