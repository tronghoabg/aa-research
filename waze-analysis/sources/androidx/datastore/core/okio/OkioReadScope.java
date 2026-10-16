package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import k.ab;
import k.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final p fileSystem;
    private final ab path;
    private final OkioSerializer<T> serializer;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
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
        Object L$6;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioReadScope<T> okioReadScope, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = okioReadScope;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(p pVar, ab abVar, OkioSerializer<T> okioSerializer) {
        x.f(pVar, "fileSystem");
        x.f(abVar, "path");
        x.f(okioSerializer, "serializer");
        this.fileSystem = pVar;
        this.path = abVar;
        this.serializer = okioSerializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[Catch: FileNotFoundException -> 0x00dd, TRY_LEAVE, TryCatch #10 {FileNotFoundException -> 0x00dd, blocks: (B:46:0x00dc, B:42:0x00d3, B:39:0x00ce), top: B:90:0x00ce, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140 A[Catch: Exception -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0141, blocks: (B:73:0x0140, B:50:0x00e8), top: B:105:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> r9, h.c.e<? super T> r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope, h.c.e):java.lang.Object");
    }

    protected final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final p getFileSystem() {
        return this.fileSystem;
    }

    protected final ab getPath() {
        return this.path;
    }

    protected final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(e<? super T> eVar) {
        return readData$suspendImpl(this, eVar);
    }
}
