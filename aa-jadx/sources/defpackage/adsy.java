package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class adsy extends defpackage.adjy {
    private final defpackage.adsz a;

    public adsy(defpackage.adsz adszVar, defpackage.aeba aebaVar) {
        adszVar.getClass();
        this.a = adszVar;
        aebaVar.getClass();
    }

    public static java.util.logging.Level c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? java.util.logging.Level.FINE : java.util.logging.Level.FINEST;
        }
        return java.util.logging.Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.adjy
    public final void a(int i, java.lang.String str) {
        java.util.logging.Level levelC = c(i);
        if (defpackage.adsz.a.isLoggable(levelC)) {
            defpackage.adsz.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.adjy
    public final void b(int i, java.lang.String str, java.lang.Object... objArr) {
        java.util.logging.Level levelC = c(i);
        d(i);
        a(i, defpackage.adsz.a.isLoggable(levelC) ? java.text.MessageFormat.format(str, objArr) : null);
    }
}
