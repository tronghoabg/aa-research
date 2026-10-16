package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.b.x;
import k.p;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final p fileSystem;
    private final a<ab> onClose;
    private final k.ab path;
    private final OkioSerializer<T> serializer;
    private final kotlinx.coroutines.h.a transactionMutex;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioStorageConnection<T> okioStorageConnection, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = okioStorageConnection;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, reason: invalid class name and case insensitive filesystem */
    final class C04311 extends c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04311(OkioStorageConnection<T> okioStorageConnection, e<? super C04311> eVar) {
            super(eVar);
            this.this$0 = okioStorageConnection;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(p pVar, k.ab abVar, OkioSerializer<T> okioSerializer, InterProcessCoordinator interProcessCoordinator, a<ab> aVar) {
        x.f(pVar, "fileSystem");
        x.f(abVar, "path");
        x.f(okioSerializer, "serializer");
        x.f(interProcessCoordinator, "coordinator");
        x.f(aVar, "onClose");
        this.fileSystem = pVar;
        this.path = abVar;
        this.serializer = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = aVar;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = i.c();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
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
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: all -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x008d, blocks: (B:30:0x008c, B:40:0x009d, B:39:0x009a, B:36:0x0095), top: B:56:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(h.g.a.q<? super androidx.datastore.core.ReadScope<T>, ? super java.lang.Boolean, ? super h.c.e<? super R>, ? extends java.lang.Object> r10, h.c.e<? super R> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
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
            androidx.datastore.core.okio.OkioReadScope r1 = (androidx.datastore.core.okio.OkioReadScope) r1
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            h.g.a.q r0 = (h.g.a.q) r0
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L3a
            goto L7d
        L3a:
            r11 = move-exception
            goto L95
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
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> La2
            k.p r5 = r9.fileSystem     // Catch: java.lang.Throwable -> La2
            k.ab r6 = r9.path     // Catch: java.lang.Throwable -> La2
            androidx.datastore.core.okio.OkioSerializer<T> r7 = r9.serializer     // Catch: java.lang.Throwable -> La2
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> La2
            androidx.datastore.core.Closeable r2 = (androidx.datastore.core.Closeable) r2     // Catch: java.lang.Throwable -> La2
            r5 = r2
            androidx.datastore.core.okio.OkioReadScope r5 = (androidx.datastore.core.okio.OkioReadScope) r5     // Catch: java.lang.Throwable -> L90
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L90
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r4     // Catch: java.lang.Throwable -> L90
            r0.Z$0 = r11     // Catch: java.lang.Throwable -> L90
            r7 = 0
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L90
            r0.I$1 = r7     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r10.invoke(r5, r6, r0)     // Catch: java.lang.Throwable -> L90
            if (r10 == r1) goto L8f
            r1 = r11
            r11 = r10
            r10 = r1
            r1 = r2
        L7d:
            r1.close()     // Catch: java.lang.Throwable -> L81
            goto L82
        L81:
            r4 = move-exception
        L82:
            if (r4 != 0) goto L8c
            if (r10 == 0) goto L8b
            kotlinx.coroutines.h.a r9 = r9.transactionMutex
            kotlinx.coroutines.i.c.d(r9)
        L8b:
            return r11
        L8c:
            throw r4     // Catch: java.lang.Throwable -> L8d
        L8d:
            r11 = move-exception
            goto L9e
        L8f:
            return r1
        L90:
            r10 = move-exception
            r1 = r11
            r11 = r10
            r10 = r1
            r1 = r2
        L95:
            r1.close()     // Catch: java.lang.Throwable -> L99
            goto L9d
        L99:
            r0 = move-exception
            e.a.h.ad.c(r11, r0)     // Catch: java.lang.Throwable -> L8d
        L9d:
            throw r11     // Catch: java.lang.Throwable -> L8d
        L9e:
            r8 = r11
            r11 = r10
            r10 = r8
            goto La3
        La2:
            r10 = move-exception
        La3:
            if (r11 == 0) goto Laa
            kotlinx.coroutines.h.a r9 = r9.transactionMutex
            kotlinx.coroutines.i.c.d(r9)
        Laa:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(h.g.a.q, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[Catch: all -> 0x0130, IOException -> 0x013f, TRY_ENTER, TryCatch #0 {all -> 0x0130, blocks: (B:43:0x011a, B:45:0x0122, B:48:0x012f, B:61:0x0143, B:63:0x014b, B:64:0x0155, B:57:0x013e, B:56:0x013b, B:34:0x00c6, B:35:0x00e1), top: B:71:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f A[Catch: all -> 0x0130, IOException -> 0x013f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:43:0x011a, B:45:0x0122, B:48:0x012f, B:61:0x0143, B:63:0x014b, B:64:0x0155, B:57:0x013e, B:56:0x013b, B:34:0x00c6, B:35:0x00e1), top: B:71:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.h.a] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(h.g.a.p<? super androidx.datastore.core.WriteScope<T>, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r11, h.c.e<? super h.ab> r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.writeScope(h.g.a.p, h.c.e):java.lang.Object");
    }
}
