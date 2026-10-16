package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbk implements defpackage.lhn, defpackage.mnj {
    private final defpackage.yfd c = new defpackage.yfd(10);
    private final java.lang.String d;
    private defpackage.mbi e;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.NotifListnrStMonitor");
    public static final java.text.SimpleDateFormat a = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", java.util.Locale.US);

    public mbk(java.lang.String str) {
        this.d = str;
    }

    public final synchronized void a(java.lang.String str) {
        defpackage.mbi mbiVar = this.e;
        if (mbiVar == null) {
            return;
        }
        java.util.Map map = mbiVar.b;
        if (!map.containsKey(str)) {
            map.put(str, 0L);
        }
        map.put(str, java.lang.Long.valueOf(((java.lang.Long) map.get(str)).longValue() + 1));
    }

    public final synchronized void b(int i) {
        defpackage.mbi mbiVar = this.e;
        if (mbiVar == null) {
            return;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_CLIENT_CONNECTING);
        } else if (i2 == 1) {
            defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_CLIENT_SUCCESSFULLY_CONNECTED);
        }
        mbiVar.a.add(new defpackage.mbj(a.format(new java.util.Date()), i));
    }

    @Override // defpackage.lhn
    public final synchronized void d() {
        defpackage.mbi mbiVar = this.e;
        if (mbiVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 4706)).u("Unable to log telemetry event for total number of notifications posted");
        } else {
            long jSum = j$.util.Collection.-EL.stream(defpackage.yhe.j(mbiVar.b).values()).mapToLong(new defpackage.lvf(2)).sum();
            ((defpackage.yqj) b.l().ai(4705)).x("Logging telemetry events: Total number of notifications posted %d", jSum);
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NOTIFICATION_LISTENER, defpackage.zbd.Fm);
            int i = (int) jSum;
            if (jSum != i) {
                throw new java.lang.ArithmeticException();
            }
            rrvVarH.w(i);
            oimVarU.F(rrvVarH.l());
        }
        defpackage.mni.a().d(defpackage.mnh.q);
        this.e = null;
    }

    @Override // defpackage.lhn
    public final synchronized void eQ() {
        defpackage.mbi mbiVar = new defpackage.mbi(a.format(new java.util.Date()), this.d);
        this.e = mbiVar;
        this.c.add(mbiVar);
        defpackage.mni.a().b(defpackage.mnh.q, this);
    }

    @Override // defpackage.mnj
    public final synchronized void h(java.io.PrintWriter printWriter) {
        java.util.Iterator<E> it = this.c.iterator();
        while (it.hasNext()) {
            printWriter.println(((defpackage.mbi) it.next()).toString());
        }
    }
}
