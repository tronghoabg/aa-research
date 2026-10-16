package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jqi implements java.lang.Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public jqi(defpackage.jqk jqkVar, long j, defpackage.rxr rxrVar, int i) {
        this.d = i;
        this.a = j;
        this.b = rxrVar;
        this.c = jqkVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, rxr] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        java.lang.Object obj = this.c;
        if (i == 0) {
            defpackage.jpc jpcVar = (defpackage.jpc) ((defpackage.jqk) obj).e;
            jpcVar.f();
            long j = this.a;
            boolean zK = jpcVar.k(j);
            ?? r11 = this.b;
            if (zK) {
                jpcVar.e.post(new defpackage.aq(jpcVar.d(), (defpackage.rxr) r11, 20));
                return;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.f()).ai(2529)).H("Resume of session %d instead of %d", j, jpcVar.e());
                jpcVar.e.post(new defpackage.jmy(r11, 8, null));
                return;
            }
        }
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z = bundle.getBoolean("car_handoff_user_authorized_projection", false);
        boolean z2 = bundle.getBoolean("car_handoff_start_activities", false);
        int i2 = bundle.getInt("connection_tag");
        boolean z3 = bundle.getBoolean("car_handoff_legacy_frx_ran", false);
        defpackage.jpc jpcVar2 = (defpackage.jpc) ((defpackage.jqk) this.b).e;
        jpcVar2.f();
        long j2 = this.a;
        if (!jpcVar2.k(j2)) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.jpc.a.h()).ai(2548)).H("Aborting transfer for session %d because current session is %s.", j2, jpcVar2.e());
        } else {
            jpcVar2.e.post(new defpackage.jou(jpcVar2.d(), j2, z2, i2, z, z3));
        }
    }

    public jqi(defpackage.jqk jqkVar, android.os.Bundle bundle, long j, int i) {
        this.d = i;
        this.c = bundle;
        this.a = j;
        this.b = jqkVar;
    }
}
