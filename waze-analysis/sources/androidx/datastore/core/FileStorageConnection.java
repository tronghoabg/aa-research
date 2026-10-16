package androidx.datastore.core;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.b.x;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import kotlinx.coroutines.h.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final a<ab> onClose;
    private final Serializer<T> serializer;
    private final kotlinx.coroutines.h.a transactionMutex;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.FileStorageConnection$readScope$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FileStorageConnection<T> fileStorageConnection, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = fileStorageConnection;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1, reason: invalid class name and case insensitive filesystem */
    final class C04271 extends c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04271(FileStorageConnection<T> fileStorageConnection, e<? super C04271> eVar) {
            super(eVar);
            this.this$0 = fileStorageConnection;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator interProcessCoordinator, a<ab> aVar) {
        x.f(file, "file");
        x.f(serializer, "serializer");
        x.f(interProcessCoordinator, "coordinator");
        x.f(aVar, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = aVar;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = new h(false);
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
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

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x008b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x008b, blocks: (B:30:0x008a, B:40:0x009b, B:39:0x0098, B:36:0x0093), top: B:52:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(h.g.a.q<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super h.c.e<? super R>, ? extends java.lang.Object> r10, h.c.e<? super R> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.FileStorageConnection.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r10 = r0.I$1
            int r10 = r0.I$0
            boolean r10 = r0.Z$0
            java.lang.Object r1 = r0.L$2
            androidx.datastore.core.FileReadScope r1 = (androidx.datastore.core.FileReadScope) r1
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            h.g.a.q r0 = (h.g.a.q) r0
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L3a
            goto L7b
        L3a:
            r11 = move-exception
            goto L93
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            e.b.c.b(r11)
            r9.checkNotClosed()
            kotlinx.coroutines.h.a r11 = r9.transactionMutex
            boolean r11 = kotlinx.coroutines.i.c.c(r11)
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> La0
            java.io.File r5 = r9.file     // Catch: java.lang.Throwable -> La0
            androidx.datastore.core.Serializer<T> r6 = r9.serializer     // Catch: java.lang.Throwable -> La0
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> La0
            androidx.datastore.core.Closeable r2 = (androidx.datastore.core.Closeable) r2     // Catch: java.lang.Throwable -> La0
            r5 = r2
            androidx.datastore.core.FileReadScope r5 = (androidx.datastore.core.FileReadScope) r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L8e
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L8e
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L8e
            r0.L$2 = r4     // Catch: java.lang.Throwable -> L8e
            r0.Z$0 = r11     // Catch: java.lang.Throwable -> L8e
            r7 = 0
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L8e
            r0.I$1 = r7     // Catch: java.lang.Throwable -> L8e
            r0.label = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r10 = r10.invoke(r5, r6, r0)     // Catch: java.lang.Throwable -> L8e
            if (r10 == r1) goto L8d
            r1 = r11
            r11 = r10
            r10 = r1
            r1 = r2
        L7b:
            r1.close()     // Catch: java.lang.Throwable -> L7f
            goto L80
        L7f:
            r4 = move-exception
        L80:
            if (r4 != 0) goto L8a
            if (r10 == 0) goto L89
            kotlinx.coroutines.h.a r9 = r9.transactionMutex
            kotlinx.coroutines.i.c.d(r9)
        L89:
            return r11
        L8a:
            throw r4     // Catch: java.lang.Throwable -> L8b
        L8b:
            r11 = move-exception
            goto L9c
        L8d:
            return r1
        L8e:
            r10 = move-exception
            r1 = r11
            r11 = r10
            r10 = r1
            r1 = r2
        L93:
            r1.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r0 = move-exception
            e.a.h.ad.c(r11, r0)     // Catch: java.lang.Throwable -> L8b
        L9b:
            throw r11     // Catch: java.lang.Throwable -> L8b
        L9c:
            r8 = r11
            r11 = r10
            r10 = r8
            goto La1
        La0:
            r10 = move-exception
        La1:
            if (r11 == 0) goto La8
            kotlinx.coroutines.h.a r9 = r9.transactionMutex
            kotlinx.coroutines.i.c.d(r9)
        La8:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(h.g.a.q, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[Catch: all -> 0x00e0, IOException -> 0x00ef, TRY_ENTER, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00ce, B:34:0x00d4, B:37:0x00df, B:50:0x00f3, B:52:0x00f9, B:53:0x00fc, B:54:0x011e, B:46:0x00ee, B:45:0x00eb, B:23:0x0082, B:24:0x009e), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[Catch: all -> 0x00e0, IOException -> 0x00ef, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:32:0x00ce, B:34:0x00d4, B:37:0x00df, B:50:0x00f3, B:52:0x00f9, B:53:0x00fc, B:54:0x011e, B:46:0x00ee, B:45:0x00eb, B:23:0x0082, B:24:0x009e), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, kotlinx.coroutines.h.a] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(h.g.a.p<? super androidx.datastore.core.WriteScope<T>, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r11, h.c.e<? super h.ab> r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.writeScope(h.g.a.p, h.c.e):java.lang.Object");
    }
}
