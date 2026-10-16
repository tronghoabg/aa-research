package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes2.dex */
public final class fqx extends fqv {
    private final File a;
    private boolean b;
    private final ajna c;
    private final dtg d;

    public fqx(ajna ajnaVar, File file, dtg dtgVar) {
        this.a = file;
        this.d = dtgVar;
        this.c = ajnaVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    @Override // defpackage.fqv
    public final synchronized ajna a() {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        return this.c;
    }

    @Override // defpackage.fqv
    public final dtg b() {
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b = true;
        Bitmap.Config[] configArr = ftw.a;
        a.e(this.c);
    }
}
