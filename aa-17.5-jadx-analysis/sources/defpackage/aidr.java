package defpackage;

/* loaded from: classes3.dex */
class aidr<T> implements aied<T> {
    private final afdr<? extends T> computable;
    private final aidz storageManager;
    private volatile Object value;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public aidr(aidz aidzVar, afdr<? extends T> afdrVar) {
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (afdrVar == null) {
            $$$reportNull$$$0(1);
        }
        this.value = aidx.NOT_COMPUTED;
        this.storageManager = aidzVar;
        this.computable = afdrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:7:0x0011, B:9:0x0017, B:10:0x001b, B:12:0x001f, B:14:0x002e, B:15:0x0033, B:17:0x0037, B:19:0x0042, B:20:0x0047, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:32:0x007c, B:30:0x006c, B:33:0x007d, B:34:0x0083, B:21:0x004b), top: B:38:0x0011, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:7:0x0011, B:9:0x0017, B:10:0x001b, B:12:0x001f, B:14:0x002e, B:15:0x0033, B:17:0x0037, B:19:0x0042, B:20:0x0047, B:25:0x005f, B:27:0x0065, B:31:0x0072, B:32:0x007c, B:30:0x006c, B:33:0x007d, B:34:0x0083, B:21:0x004b), top: B:38:0x0011, inners: #1 }] */
    @Override // defpackage.afdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T invoke() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.value
            boolean r1 = r0 instanceof defpackage.aidx
            if (r1 != 0) goto La
            defpackage.aipz.unescapeThrowable(r0)
            return r0
        La:
            aidz r0 = r3.storageManager
            aief r0 = r0.lock
            r0.lock()
            java.lang.Object r0 = r3.value     // Catch: java.lang.Throwable -> L84
            boolean r1 = r0 instanceof defpackage.aidx     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L1b
            defpackage.aipz.unescapeThrowable(r0)     // Catch: java.lang.Throwable -> L84
            goto L56
        L1b:
            aidx r1 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> L84
            if (r0 != r1) goto L33
            aidx r1 = defpackage.aidx.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L84
            r3.value = r1     // Catch: java.lang.Throwable -> L84
            r1 = 1
            aidy r1 = r3.recursionDetected(r1)     // Catch: java.lang.Throwable -> L84
            boolean r2 = r1.isFallThrough()     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L33
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L84
            goto L56
        L33:
            aidx r1 = defpackage.aidx.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L84
            if (r0 != r1) goto L47
            r0 = 0
            aidy r0 = r3.recursionDetected(r0)     // Catch: java.lang.Throwable -> L84
            boolean r1 = r0.isFallThrough()     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L47
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L84
            goto L56
        L47:
            aidx r0 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> L84
            r3.value = r0     // Catch: java.lang.Throwable -> L84
            afdr<? extends T> r0 = r3.computable     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L5e
            r3.postCompute(r0)     // Catch: java.lang.Throwable -> L5e
            r3.value = r0     // Catch: java.lang.Throwable -> L5e
        L56:
            aidz r3 = r3.storageManager
            aief r3 = r3.lock
            r3.unlock()
            return r0
        L5e:
            r0 = move-exception
            boolean r1 = defpackage.aipe.isProcessCanceledException(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L7d
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L84
            aidx r2 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> L84
            if (r1 == r2) goto L6c
            goto L72
        L6c:
            java.lang.Object r1 = defpackage.aipz.escapeThrowable(r0)     // Catch: java.lang.Throwable -> L84
            r3.value = r1     // Catch: java.lang.Throwable -> L84
        L72:
            aidz r1 = r3.storageManager     // Catch: java.lang.Throwable -> L84
            aidp r1 = defpackage.aidz.access$100(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r0 = r1.handleException(r0)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L7d:
            aidx r1 = defpackage.aidx.NOT_COMPUTED     // Catch: java.lang.Throwable -> L84
            r3.value = r1     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            aidz r3 = r3.storageManager
            aief r3 = r3.lock
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidr.invoke():java.lang.Object");
    }

    public boolean isComputed() {
        return (this.value == aidx.NOT_COMPUTED || this.value == aidx.COMPUTING) ? false : true;
    }

    protected aidy<T> recursionDetected(boolean z) {
        aidy<T> aidyVarRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("in a lazy value", null);
        if (aidyVarRecursionDetectedDefault == null) {
            $$$reportNull$$$0(2);
        }
        return aidyVarRecursionDetectedDefault;
    }

    protected void postCompute(T t) {
    }
}
