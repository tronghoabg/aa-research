package defpackage;

import defpackage.zeu;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
abstract class zfi extends zeu.f {
    public static final zff a;
    private static final zgo b = new zgo(zfi.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zff zfhVar;
        try {
            zfhVar = new zfg();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zfhVar = new zfh();
        }
        Throwable th3 = th;
        a = zfhVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public zfi(int i) {
        this.remainingField = i;
    }

    public abstract void d(Set set);
}
