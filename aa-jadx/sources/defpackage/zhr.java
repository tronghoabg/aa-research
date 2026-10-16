package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zhr {
    private final java.lang.String a;
    private volatile java.util.logging.Logger b;
    private final defpackage.affp c = new defpackage.affp();

    public zhr(java.lang.Class cls) {
        this.a = cls.getName();
    }

    final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            java.util.logging.Logger logger2 = this.b;
            if (logger2 != null) {
                return logger2;
            }
            this.b = java.util.logging.Logger.getLogger(this.a);
            return this.b;
        }
    }
}
