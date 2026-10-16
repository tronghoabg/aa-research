package defpackage;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
class aidv<K, V> implements aieb<K, V> {
    private final ConcurrentMap<K, Object> cache;
    private final afec<? super K, ? extends V> compute;
    private final aidz storageManager;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public aidv(aidz aidzVar, ConcurrentMap<K, Object> concurrentMap, afec<? super K, ? extends V> afecVar) {
        if (aidzVar == null) {
            $$$reportNull$$$0(0);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(1);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(2);
        }
        this.storageManager = aidzVar;
        this.cache = concurrentMap;
        this.compute = afecVar;
    }

    private AssertionError inconsistentComputingKey(K k, Object obj) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + aidx.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.storageManager);
        aidz.access$200(assertionError);
        return assertionError;
    }

    private AssertionError raceCondition(K k, Object obj) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.storageManager);
        aidz.access$200(assertionError);
        return assertionError;
    }

    private AssertionError unableToRemoveKey(K k, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + k + " under " + this.storageManager, th);
        aidz.access$200(assertionError);
        return assertionError;
    }

    protected aidz getStorageManager() {
        return this.storageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x00cf, PHI: r0
  0x0034: PHI (r0v6 java.lang.Object) = (r0v5 java.lang.Object), (r0v20 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x00cf, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:14:0x0034, B:16:0x0038, B:18:0x0043, B:20:0x004a, B:33:0x007d, B:36:0x0089, B:38:0x008d, B:39:0x0091, B:40:0x0092, B:41:0x0094, B:47:0x009f, B:49:0x00ab, B:50:0x00af, B:51:0x00b0, B:52:0x00ba, B:54:0x00be, B:55:0x00c8, B:57:0x00ca, B:58:0x00ce, B:43:0x0096, B:44:0x009a, B:35:0x0083, B:53:0x00bb), top: B:70:0x0018, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // defpackage.afec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V invoke(K r4) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r3.cache
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L11
            aidx r1 = defpackage.aidx.COMPUTING
            if (r0 == r1) goto L11
            java.lang.Object r3 = defpackage.aipz.unescapeExceptionOrNull(r0)
            return r3
        L11:
            aidz r0 = r3.storageManager
            aief r0 = r0.lock
            r0.lock()
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r3.cache     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> Lcf
            aidx r1 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> Lcf
            if (r0 != r1) goto L34
            aidx r0 = defpackage.aidx.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lcf
            r1 = 1
            aidy r1 = r3.recursionDetected(r4, r1)     // Catch: java.lang.Throwable -> Lcf
            boolean r2 = r1.isFallThrough()     // Catch: java.lang.Throwable -> Lcf
            if (r2 != 0) goto L34
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> Lcf
            goto L6b
        L34:
            aidx r1 = defpackage.aidx.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> Lcf
            if (r0 != r1) goto L48
            r1 = 0
            aidy r1 = r3.recursionDetected(r4, r1)     // Catch: java.lang.Throwable -> Lcf
            boolean r2 = r1.isFallThrough()     // Catch: java.lang.Throwable -> Lcf
            if (r2 != 0) goto L48
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> Lcf
            goto L6b
        L48:
            if (r0 == 0) goto L4f
            java.lang.Object r4 = defpackage.aipz.unescapeExceptionOrNull(r0)     // Catch: java.lang.Throwable -> Lcf
            goto L6b
        L4f:
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r3.cache     // Catch: java.lang.Throwable -> L7a
            aidx r1 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> L7a
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L7a
            afec<? super K, ? extends V> r0 = r3.compute     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r1 = r3.cache     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = defpackage.aipz.escapeNull(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r1.put(r4, r2)     // Catch: java.lang.Throwable -> L7a
            aidx r2 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> L7a
            if (r1 != r2) goto L73
            r4 = r0
        L6b:
            aidz r3 = r3.storageManager
            aief r3 = r3.lock
            r3.unlock()
            return r4
        L73:
            java.lang.AssertionError r0 = r3.raceCondition(r4, r1)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            goto L7d
        L7a:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L7d:
            boolean r2 = defpackage.aipe.isProcessCanceledException(r1)     // Catch: java.lang.Throwable -> Lcf
            if (r2 == 0) goto L9b
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r3.cache     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.remove(r4)     // Catch: java.lang.Throwable -> L95
            aidx r2 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> Lcf
            if (r0 == r2) goto L92
            java.lang.AssertionError r4 = r3.inconsistentComputingKey(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        L92:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> Lcf
            throw r1     // Catch: java.lang.Throwable -> Lcf
        L95:
            r0 = move-exception
            java.lang.AssertionError r4 = r3.unableToRemoveKey(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        L9b:
            java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r3.cache
            if (r1 == r0) goto Lbb
            java.lang.Object r0 = defpackage.aipz.escapeThrowable(r1)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r0 = r2.put(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            aidx r2 = defpackage.aidx.COMPUTING     // Catch: java.lang.Throwable -> Lcf
            if (r0 == r2) goto Lb0
            java.lang.AssertionError r4 = r3.raceCondition(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        Lb0:
            aidz r4 = r3.storageManager     // Catch: java.lang.Throwable -> Lcf
            aidp r4 = defpackage.aidz.access$100(r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.RuntimeException r4 = r4.handleException(r1)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        Lbb:
            r2.remove(r4)     // Catch: java.lang.Throwable -> Lc9
            aidz r4 = r3.storageManager     // Catch: java.lang.Throwable -> Lcf
            aidp r4 = defpackage.aidz.access$100(r4)     // Catch: java.lang.Throwable -> Lcf
            java.lang.RuntimeException r4 = r4.handleException(r1)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        Lc9:
            r0 = move-exception
            java.lang.AssertionError r4 = r3.unableToRemoveKey(r4, r0)     // Catch: java.lang.Throwable -> Lcf
            throw r4     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            r4 = move-exception
            aidz r3 = r3.storageManager
            aief r3 = r3.lock
            r3.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidv.invoke(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aieb
    public boolean isComputed(K k) {
        Object obj = this.cache.get(k);
        return (obj == null || obj == aidx.COMPUTING) ? false : true;
    }

    protected aidy<V> recursionDetected(K k, boolean z) {
        aidy<V> aidyVarRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("", k);
        if (aidyVarRecursionDetectedDefault == null) {
            $$$reportNull$$$0(3);
        }
        return aidyVarRecursionDetectedDefault;
    }
}
