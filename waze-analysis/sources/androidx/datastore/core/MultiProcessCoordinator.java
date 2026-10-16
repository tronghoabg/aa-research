package androidx.datastore.core;

import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.f;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final j context;
    private final File file;
    private final a inMemoryMutex;
    private final f<SharedCounter> lazySharedCounter;
    private final f lockFile$delegate;
    private final k<ab> updateNotifications;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    final class C04281<T> extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        C04281(e<? super C04281> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2, reason: invalid class name */
    public final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<SharedCounter, e, Object> $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super SharedCounter, ? super e, ? extends Object> pVar, MultiProcessCoordinator multiProcessCoordinator, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = pVar;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$block, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            p<SharedCounter, e, Object> pVar = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = pVar.invoke(sharedCounter, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    public MultiProcessCoordinator(j jVar, File file) {
        x.f(jVar, "context");
        x.f(file, "file");
        this.context = jVar;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = i.c();
        this.lockFile$delegate = h.g.a(new h.g.a.a() { // from class: androidx.datastore.core.MultiProcessCoordinator$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return MultiProcessCoordinator.lockFile_delegate$lambda$0(this.f$0);
            }
        });
        this.lazySharedCounter = h.g.a(new h.g.a.a() { // from class: androidx.datastore.core.MultiProcessCoordinator$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return SharedCounter.Factory.create$datastore_core(new h.g.a.a() { // from class: androidx.datastore.core.MultiProcessCoordinator$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return MultiProcessCoordinator.lazySharedCounter$lambda$0$0(multiProcessCoordinator);
                    }
                });
            }
        });
    }

    private final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            Objects.toString(file);
            throw new IOException("Unable to create parent directories of ".concat(String.valueOf(file)));
        }
    }

    private final File fileWithSuffix(String str) {
        return new File(String.valueOf(this.file.getAbsolutePath()).concat(String.valueOf(str)));
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File lazySharedCounter$lambda$0$0(MultiProcessCoordinator multiProcessCoordinator) throws IOException {
        File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
        return fileFileWithSuffix;
    }

    static final File lockFile_delegate$lambda$0(MultiProcessCoordinator multiProcessCoordinator) throws IOException {
        File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
        return fileFileWithSuffix;
    }

    private final <T> Object withLazyCounter(p<? super SharedCounter, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return this.lazySharedCounter.isInitialized() ? pVar.invoke(getSharedCounter(), eVar) : aj.v(this.context, new AnonymousClass2(pVar, this, null), eVar);
    }

    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public k<ab> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(e<? super Integer> eVar) {
        return this.lazySharedCounter.isInitialized() ? new Integer(getSharedCounter().getValue()) : aj.v(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), eVar);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(e<? super Integer> eVar) {
        return this.lazySharedCounter.isInitialized() ? new Integer(getSharedCounter().incrementAndGetValue()) : aj.v(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea A[Catch: all -> 0x00ee, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x00ee, blocks: (B:40:0x00ea, B:56:0x010a, B:57:0x010d), top: B:76:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #9 {all -> 0x00ee, blocks: (B:40:0x00ea, B:56:0x010a, B:57:0x010d), top: B:76:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.h.a] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(h.g.a.l<? super h.c.e<? super T>, ? extends java.lang.Object> r11, h.c.e<? super T> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.lock(h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[Catch: all -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x010e, blocks: (B:53:0x010a, B:71:0x012b, B:72:0x012e), top: B:105:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b A[Catch: all -> 0x010e, TRY_ENTER, TryCatch #9 {all -> 0x010e, blocks: (B:53:0x010a, B:71:0x012b, B:72:0x012e), top: B:105:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(h.g.a.p<? super java.lang.Boolean, ? super h.c.e<? super T>, ? extends java.lang.Object> r19, h.c.e<? super T> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.tryLock(h.g.a.p, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0082 -> B:26:0x0084). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r12, h.c.e<? super java.nio.channels.FileLock> r13) throws java.io.IOException {
            /*
                r11 = this;
                boolean r0 = r13 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r13
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r11, r13)
            L18:
                java.lang.Object r11 = r0.result
                h.c.a.a r13 = h.c.a.a.f48038a
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L3a
                if (r1 != r2) goto L32
                long r3 = r0.J$0
                java.lang.Object r12 = r0.L$1
                java.io.IOException r12 = (java.io.IOException) r12
                java.lang.Object r12 = r0.L$0
                java.io.FileOutputStream r12 = (java.io.FileOutputStream) r12
                e.b.c.b(r11)
                r11 = r0
                goto L84
            L32:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L3a:
                e.b.c.b(r11)
                long r3 = androidx.datastore.core.MultiProcessCoordinator.access$getINITIAL_WAIT_MILLIS$cp()
                r11 = r0
            L42:
                long r0 = androidx.datastore.core.MultiProcessCoordinator.access$getMAX_WAIT_MILLIS$cp()
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                java.lang.String r1 = "lock(...)"
                if (r0 > 0) goto L88
                java.nio.channels.FileChannel r5 = androidx.datastore.core.MultiProcessCoordinator$Companion$$ExternalSyntheticAPIConversion0.m(r12)     // Catch: java.io.IOException -> L60
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L60
                h.g.b.x.e(r0, r1)     // Catch: java.io.IOException -> L60
                return r0
            L60:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L87
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.String r5 = androidx.datastore.core.MultiProcessCoordinator.access$getDEADLOCK_ERROR_MESSAGE$cp()
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r1 = h.n.o.P(r1, r5)
                if (r1 != r2) goto L87
                r11.L$0 = r12
                r0 = 0
                r11.L$1 = r0
                r11.J$0 = r3
                r11.label = r2
                java.lang.Object r0 = kotlinx.coroutines.aj.q(r3, r11)
                if (r0 == r13) goto L86
            L84:
                long r3 = r3 + r3
                goto L42
            L86:
                return r13
            L87:
                throw r0
            L88:
                java.nio.channels.FileChannel r5 = androidx.datastore.core.MultiProcessCoordinator$Companion$$ExternalSyntheticAPIConversion0.m(r12)
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)
                h.g.b.x.e(r11, r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, h.c.e):java.lang.Object");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
