package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adst implements adzk {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adst.class.getName());
    public final java.util.concurrent.ScheduledExecutorService b;
    public final defpackage.adox c;
    public defpackage.adup d;
    public defpackage.aecg e;

    public adst(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.adox adoxVar) {
        this.b = scheduledExecutorService;
        this.c = adoxVar;
    }

    public final void a() {
        defpackage.adox adoxVar = this.c;
        adoxVar.c();
        adoxVar.execute(new defpackage.adkj(this, 12, null));
    }
}
