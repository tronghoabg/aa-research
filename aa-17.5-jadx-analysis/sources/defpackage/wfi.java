package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wfi implements Closeable {
    public Closeable a;

    public wfi(Closeable closeable) {
        this.a = closeable;
    }

    @ResultIgnorabilityUnspecified
    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
