package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oio implements defpackage.lhn {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/auto/components/telemetry/TelemetryBatcher");
    private final java.util.Map b = new defpackage.zd();

    public static defpackage.oio a() {
        return (defpackage.oio) defpackage.mkp.a.i(defpackage.oio.class);
    }

    public final void b(defpackage.rrw rrwVar) {
        defpackage.ysr.aY(!rrwVar.x.f(), "eventCount field is forbidden for batched events");
        defpackage.ype ypeVar = (defpackage.ype) ((defpackage.ype) a.e()).ai(5972);
        defpackage.zbe zbeVar = rrwVar.h;
        java.lang.String strName = zbeVar.name();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(zbeVar.he);
        defpackage.zbd zbdVar = rrwVar.i;
        ypeVar.S("Adding to Batch: Context: %s(%d) Action: %s(%d)", strName, numValueOf, zbdVar.sn, java.lang.Integer.valueOf(zbdVar.a()));
        java.util.Map map = this.b;
        synchronized (map) {
            java.lang.Integer num = (java.lang.Integer) map.get(rrwVar);
            map.put(rrwVar, java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        defpackage.oim oimVarU = defpackage.omf.u();
        java.util.Map map = this.b;
        synchronized (map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                defpackage.rrv rrvVar = new defpackage.rrv((defpackage.rrw) entry.getKey());
                rrvVar.w(((java.lang.Integer) entry.getValue()).intValue());
                oimVarU.F(rrvVar.l());
            }
            map.clear();
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
