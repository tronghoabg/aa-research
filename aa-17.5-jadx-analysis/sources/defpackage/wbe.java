package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class wbe implements Closeable {
    public final Inflater a = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.end();
    }
}
