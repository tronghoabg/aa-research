package androidx.datastore.core;

import e.a.h.ad;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t, l<? super T, ? extends R> lVar) throws Throwable {
        x.f(t, "<this>");
        x.f(lVar, "block");
        try {
            R rInvoke = lVar.invoke(t);
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                return rInvoke;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                t.close();
            } catch (Throwable th3) {
                ad.c(th2, th3);
            }
            throw th2;
        }
    }
}
