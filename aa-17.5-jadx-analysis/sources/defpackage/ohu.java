package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ohu implements lhg {
    private static final yob a = yob.c("com/google/android/apps/auto/components/telemetry/TelemetryBatcher");
    private final Map b = new yw();

    public static ohu a() {
        return (ohu) mki.a.i(ohu.class);
    }

    public final void b(rrc rrcVar) {
        woy.O(!rrcVar.x.f(), "eventCount field is forbidden for batched events");
        ynz ynzVar = (ynz) ((ynz) a.e()).ai(5946);
        yzz yzzVar = rrcVar.h;
        String strName = yzzVar.name();
        Integer numValueOf = Integer.valueOf(yzzVar.he);
        yzy yzyVar = rrcVar.i;
        ynzVar.S("Adding to Batch: Context: %s(%d) Action: %s(%d)", strName, numValueOf, yzyVar.sn, Integer.valueOf(yzyVar.a()));
        Map map = this.b;
        synchronized (map) {
            Integer num = (Integer) map.get(rrcVar);
            map.put(rrcVar, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        ohs ohsVarJ = ebf.j();
        Map map = this.b;
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                rrb rrbVar = new rrb((rrc) entry.getKey());
                rrbVar.w(((Integer) entry.getValue()).intValue());
                ohsVarJ.F(rrbVar.l());
            }
            map.clear();
        }
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
