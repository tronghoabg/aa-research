package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class koc implements tgu {
    final /* synthetic */ Closeable a;
    final /* synthetic */ kod b;
    final /* synthetic */ kog c;

    public koc(Closeable closeable, kod kodVar, kog kogVar) {
        this.a = closeable;
        this.b = kodVar;
        this.c = kogVar;
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
