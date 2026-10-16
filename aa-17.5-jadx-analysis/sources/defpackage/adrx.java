package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class adrx extends adiy {
    private final adry a;

    public adrx(adry adryVar, aeaa aeaaVar) {
        adryVar.getClass();
        this.a = adryVar;
        aeaaVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.adiy
    public final void a(int i, String str) {
        Level levelC = c(i);
        if (adry.a.isLoggable(levelC)) {
            adry.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.adiy
    public final void b(int i, String str, Object... objArr) {
        Level levelC = c(i);
        d(i);
        a(i, adry.a.isLoggable(levelC) ? MessageFormat.format(str, objArr) : null);
    }
}
