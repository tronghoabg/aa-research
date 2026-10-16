package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adxe extends defpackage.adux {
    private final defpackage.adxd e;
    private static final java.lang.ref.ReferenceQueue c = new java.lang.ref.ReferenceQueue();
    private static final java.util.concurrent.ConcurrentMap d = new j$.util.concurrent.ConcurrentHashMap();
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.adxe.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adxe(defpackage.admn admnVar) {
        super(admnVar);
        java.lang.ref.ReferenceQueue referenceQueue = c;
        java.util.concurrent.ConcurrentMap concurrentMap = d;
        this.e = new defpackage.adxd(this, admnVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.adux, defpackage.admn
    public final void c() {
        int i = defpackage.adxd.b;
        defpackage.adxd adxdVar = this.e;
        if (!adxdVar.a.getAndSet(true)) {
            adxdVar.clear();
        }
        if (getClass() == null) {
            throw new java.lang.AssertionError();
        }
        defpackage.admn admnVar = this.a;
        defpackage.adww adwwVar = (defpackage.adww) admnVar;
        adwwVar.F.a(1, "shutdown() called");
        if (adwwVar.z.compareAndSet(false, true)) {
            defpackage.adox adoxVar = adwwVar.m;
            adoxVar.execute(new defpackage.adug(admnVar, 14));
            defpackage.adwt adwtVar = adwwVar.H;
            adwtVar.c.m.execute(new defpackage.adug(adwtVar, 17));
            adoxVar.execute(new defpackage.adug(admnVar, 12));
        }
    }
}
