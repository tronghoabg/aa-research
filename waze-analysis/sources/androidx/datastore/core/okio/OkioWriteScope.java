package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import k.ab;
import k.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
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
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OkioWriteScope<T> okioWriteScope, e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.this$0 = okioWriteScope;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(p pVar, ab abVar, OkioSerializer<T> okioSerializer) {
        super(pVar, abVar, okioSerializer);
        x.f(pVar, "fileSystem");
        x.f(abVar, "path");
        x.f(okioSerializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:46:0x00c3, B:38:0x00b5, B:20:0x006a, B:35:0x00b0), top: B:68:0x0020, outer: #5, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r10, h.c.e<? super h.ab> r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, h.c.e):java.lang.Object");
    }
}
