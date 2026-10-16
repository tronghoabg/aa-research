package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class adlz {
    private final adlw a;
    private final Object b;
    private volatile byte[] c;

    public adlz(adlw adlwVar, Object obj) {
        this.a = adlwVar;
        this.b = obj;
    }

    public static adlw a(adlx adlxVar) {
        Object obj = adlxVar.c;
        return (adlw) (adlw.class.isInstance(obj) ? adlw.class.cast(obj) : null);
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = admc.i(b());
                }
            }
        }
        return this.c;
    }
}
