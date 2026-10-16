package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixs extends defpackage.mdl {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.POWER");
    public final android.os.Handler c;
    public final android.content.Context d;
    public defpackage.ixr e;
    public final java.util.List b = new java.util.ArrayList(10);
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);

    public ixs(android.content.Context context, android.os.Handler handler) {
        this.d = context;
        this.c = handler;
    }

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("BatteryStateMonitor");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        int intExtra = intent.getIntExtra("temperature", -1) / 10;
        int intExtra2 = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
        float f = intExtra;
        android.util.Pair pair = new android.util.Pair(new java.util.Date(), java.lang.Float.valueOf(f));
        java.util.List list = this.b;
        list.add(pair);
        defpackage.ixr ixrVar = this.e;
        ixrVar.getClass();
        defpackage.iya iyaVar = (defpackage.iya) ixrVar;
        iyaVar.e = f;
        iyaVar.d = intExtra2;
        iyaVar.d();
        while (list.size() > 10) {
            list.remove(0);
        }
    }
}
