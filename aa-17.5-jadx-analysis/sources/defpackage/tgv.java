package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class tgv implements tgu {
    final /* synthetic */ Closeable a;
    final /* synthetic */ InputStream b;
    final /* synthetic */ OutputStream c;

    public tgv(Closeable closeable, InputStream inputStream, OutputStream outputStream) {
        this.a = closeable;
        this.b = inputStream;
        this.c = outputStream;
    }

    @Override // defpackage.tgu
    public final InputStream a() {
        return this.b;
    }

    @Override // defpackage.tgu
    public final OutputStream b() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }
}
