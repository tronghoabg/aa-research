package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ojf implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ThermalMitigation");
    android.os.PowerManager.OnThermalStatusChangedListener b;
    final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final defpackage.yhe d;
    private final android.content.Context e;

    public ojf(android.content.Context context) {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(0, defpackage.zbd.vk);
        yhaVar.f(1, defpackage.zbd.vl);
        yhaVar.f(2, defpackage.zbd.vm);
        yhaVar.f(3, defpackage.zbd.vn);
        yhaVar.f(4, defpackage.zbd.vo);
        yhaVar.f(5, defpackage.zbd.vp);
        yhaVar.f(6, defpackage.zbd.vq);
        this.d = yhaVar.d(true);
        this.e = context;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.c.compareAndSet(true, false)) {
            ((defpackage.yqj) a.l().ai((char) 5996)).u("Unregistering thermal status listener");
            android.os.PowerManager powerManager = (android.os.PowerManager) this.e.getSystemService(android.os.PowerManager.class);
            powerManager.getClass();
            ep$.ExternalSyntheticApiModelOutline0.m(powerManager, this.b);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            ((defpackage.yqj) a.l().ai((char) 5995)).u("Unable to start ThermalMitigationLogger, API level < Q");
            return;
        }
        if (this.c.compareAndSet(false, true)) {
            ((defpackage.yqj) a.l().ai((char) 5994)).u("Registering thermal status listener");
            this.b = new android.os.PowerManager.OnThermalStatusChangedListener() { // from class: oje
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i) {
                    defpackage.zbd zbdVar = (defpackage.zbd) this.a.d.getOrDefault(java.lang.Integer.valueOf(i), defpackage.zbd.vj);
                    if (i == 3) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ojf.a.h()).ai(5992)).K("Thermal status update: %s (%d)", zbdVar.sn, i);
                    } else if (i == 4 || i == 5 || i == 6) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ojf.a.g()).ai(5993)).K("Thermal status update: %s (%d)", zbdVar.sn, i);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ojf.a.f()).ai(5991)).K("Thermal status update: %s (%d)", zbdVar.sn, i);
                    }
                    defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.THERMAL_MITIGATION, zbdVar).l());
                }
            };
            android.os.PowerManager powerManager = (android.os.PowerManager) this.e.getSystemService(android.os.PowerManager.class);
            powerManager.getClass();
            ep$.ExternalSyntheticApiModelOutline0.m$1(powerManager, this.b);
        }
    }
}
