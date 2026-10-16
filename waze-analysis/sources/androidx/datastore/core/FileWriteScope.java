package androidx.datastore.core;

import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.FileWriteScope$writeData$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ T $value;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FileWriteScope<T> fileWriteScope, T t, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.this$0 = fileWriteScope;
            this.$value = t;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.this$0, this.$value, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            FileOutputStream fileOutputStream;
            a aVar = a.f48038a;
            ?? r1 = this.label;
            try {
                try {
                    if (r1 == 0) {
                        c.b(obj);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(this.this$0.getFile());
                        FileWriteScope<T> fileWriteScope = this.this$0;
                        T t = this.$value;
                        FileOutputStream fileOutputStream3 = fileOutputStream2;
                        Serializer<T> serializer = fileWriteScope.getSerializer();
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream3);
                        this.L$0 = null;
                        this.L$1 = fileOutputStream2;
                        this.L$2 = fileOutputStream3;
                        this.I$0 = 0;
                        this.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, this) == aVar) {
                            return aVar;
                        }
                        fileOutputStream = fileOutputStream3;
                        r1 = fileOutputStream2;
                    } else {
                        if (r1 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileOutputStream = (FileOutputStream) this.L$2;
                        java.io.Closeable closeable = (java.io.Closeable) this.L$1;
                        c.b(obj);
                        r1 = closeable;
                    }
                    fileOutputStream.getFD().sync();
                    i.aW(r1, null);
                    return ab.f48028a;
                } finally {
                }
            } catch (Exception e2) {
                if (e2 instanceof FileNotFoundException) {
                    throw DirectBootExceptionUtilKt.wrapExceptionIfDueToDirectBoot(this.this$0.getFile().getParent(), e2);
                }
                throw e2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        x.f(file, "file");
        x.f(serializer, "serializer");
    }

    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, e<? super ab> eVar) throws IOException {
        checkNotClosed();
        Object objRunFileDiagnosticsIfNotCorruption = FileStorageKt.runFileDiagnosticsIfNotCorruption(getFile(), new AnonymousClass2(this, t, null), eVar);
        return objRunFileDiagnosticsIfNotCorruption == a.f48038a ? objRunFileDiagnosticsIfNotCorruption : ab.f48028a;
    }
}
