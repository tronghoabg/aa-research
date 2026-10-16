package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class fqu extends fqv {
    public final String a;
    private final ajnr b;
    private final ajnf c;
    private final Closeable d;
    private boolean e;
    private ajna f;

    public fqu(ajnr ajnrVar, ajnf ajnfVar, String str, Closeable closeable) {
        this.b = ajnrVar;
        this.c = ajnfVar;
        this.a = str;
        this.d = closeable;
    }

    @Override // defpackage.fqv
    public final synchronized ajna a() {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        ajna ajnaVar = this.f;
        if (ajnaVar != null) {
            return ajnaVar;
        }
        ajna ajnaVarB = ahfm.b(this.c.f(this.b));
        this.f = ajnaVarB;
        return ajnaVarB;
    }

    @Override // defpackage.fqv
    public final dtg b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        ajna ajnaVar = this.f;
        if (ajnaVar != null) {
            Bitmap.Config[] configArr = ftw.a;
            a.e(ajnaVar);
        }
        Closeable closeable = this.d;
        if (closeable != null) {
            Bitmap.Config[] configArr2 = ftw.a;
            a.e(closeable);
        }
    }
}
