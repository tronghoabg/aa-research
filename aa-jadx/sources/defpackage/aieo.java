package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aieo implements defpackage.aiep {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
    }

    @Override // defpackage.aiep
    public java.lang.RuntimeException handleException(java.lang.Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(0);
        }
        throw defpackage.aiqe.rethrow(th);
    }
}
