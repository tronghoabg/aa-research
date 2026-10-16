package androidx.datastore.core;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.FileReadScope$readData$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super T>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FileReadScope<T> fileReadScope, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.this$0 = fileReadScope;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.this$0, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super T> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public FileReadScope(File file, Serializer<T> serializer) {
        x.f(file, "file");
        x.f(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    static /* synthetic */ <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, e<? super T> eVar) {
        fileReadScope.checkNotClosed();
        return FileStorageKt.runFileDiagnosticsIfNotCorruption(((FileReadScope) fileReadScope).file, new AnonymousClass2(fileReadScope, null), eVar);
    }

    protected final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final File getFile() {
        return this.file;
    }

    protected final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(e<? super T> eVar) {
        return readData$suspendImpl(this, eVar);
    }
}
