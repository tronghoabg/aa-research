package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikb implements defpackage.ijy {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");
    static final defpackage.yhx b = defpackage.yhx.r("com.google.android.projection.gearhead:projection", "com.google.android.projection.gearhead:car", "com.google.android.apps.maps", "com.google.android.projection.gearhead:shared");
    static final defpackage.yhe c;
    public final android.content.Context d;
    public final defpackage.yhx e;
    public final defpackage.xzi f;
    public final java.lang.Runnable g;
    public final java.lang.Object h;
    public final defpackage.yhe i;
    public final java.util.Map j;
    public final java.util.Map k;
    public final java.util.Set l;
    public boolean m;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f("com.google.android.projection.gearhead:projection", defpackage.rso.a);
        yhaVar.f("com.google.android.projection.gearhead:car", defpackage.rso.b);
        c = yhaVar.d(true);
    }

    public ikb(android.content.Context context, defpackage.xzi xziVar) {
        defpackage.yhx yhxVar = b;
        defpackage.yhe yheVar = c;
        this.g = new defpackage.bgf(this, 9);
        this.h = new java.lang.Object();
        this.j = new java.util.HashMap();
        this.k = new java.util.HashMap();
        this.l = new java.util.HashSet();
        this.d = context;
        this.e = defpackage.yhx.n(yhxVar);
        this.i = defpackage.yhe.j(yheVar);
        this.f = xziVar;
    }

    @Override // defpackage.ijy
    public final void a(java.io.PrintWriter printWriter) {
        printWriter.println("Dumping History of projecting process");
        j$.time.format.DateTimeFormatter dateTimeFormatterWithZone = j$.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS", java.util.Locale.US).withZone(j$.time.ZoneId.systemDefault());
        synchronized (this.h) {
            for (java.util.Map.Entry entry : this.j.entrySet()) {
                printWriter.println("For process " + ((java.lang.String) entry.getKey()));
                for (defpackage.ika ikaVar : (defpackage.yfd) entry.getValue()) {
                    printWriter.println(java.lang.String.format(java.util.Locale.US, "%s:%s", dateTimeFormatterWithZone.format(j$.time.Instant.ofEpochMilli(ikaVar.a)), ikaVar.b));
                }
            }
        }
    }
}
