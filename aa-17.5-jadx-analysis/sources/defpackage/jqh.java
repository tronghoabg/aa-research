package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
final class jqh implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public jqh(jqj jqjVar, long j, rwy rwyVar, int i) {
        this.d = i;
        this.a = j;
        this.b = rwyVar;
        this.c = jqjVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, rwy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.c;
        if (i == 0) {
            jou jouVar = (jou) ((jqj) obj).e;
            jouVar.f();
            long j = this.a;
            boolean zK = jouVar.k(j);
            ?? r11 = this.b;
            if (zK) {
                jouVar.e.post(new jpx(jouVar.d(), (rwy) r11, 1));
                return;
            } else {
                ((ype) ((ype) jou.a.f()).ai(2528)).H("Resume of session %d instead of %d", j, jouVar.e());
                jouVar.e.post(new joo(r11, 1));
                return;
            }
        }
        Bundle bundle = (Bundle) obj;
        boolean z = bundle.getBoolean("car_handoff_user_authorized_projection", false);
        boolean z2 = bundle.getBoolean("car_handoff_start_activities", false);
        int i2 = bundle.getInt("connection_tag");
        boolean z3 = bundle.getBoolean("car_handoff_legacy_frx_ran", false);
        jou jouVar2 = (jou) ((jqj) this.b).e;
        jouVar2.f();
        long j2 = this.a;
        if (!jouVar2.k(j2)) {
            ((ype) ((ype) jou.a.h()).ai(2546)).H("Aborting transfer for session %d because current session is %s.", j2, jouVar2.e());
        } else {
            jouVar2.e.post(new jom(jouVar2.d(), j2, z2, i2, z, z3));
        }
    }

    public jqh(jqj jqjVar, Bundle bundle, long j, int i) {
        this.d = i;
        this.c = bundle;
        this.a = j;
        this.b = jqjVar;
    }
}
