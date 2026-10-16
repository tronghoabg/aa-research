package defpackage;

import android.util.Log;

/* loaded from: classes3.dex */
public final /* synthetic */ class zyv implements svv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ zyv(zyu zyuVar, Runnable runnable, int i) {
        this.c = i;
        this.b = zyuVar;
        this.a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.svv
    public final void e(Object obj) {
        if (this.c == 0) {
            Object obj2 = this.b;
            ((zyw) this.a).m((yvx) obj2, (ntn) obj);
            return;
        }
        if (!((ntn) obj).g()) {
            if (zrn.e("MonitoringLogger", 4)) {
                Log.i("MonitoringLogger", "Opted out of usage reporting");
            }
        } else {
            if (zrn.e("MonitoringLogger", 4)) {
                Log.i("MonitoringLogger", "Opted in for usage reporting");
            }
            ((zyu) this.b).i.execute(this.a);
        }
    }

    public /* synthetic */ zyv(zyw zywVar, yvx yvxVar, int i) {
        this.c = i;
        this.a = zywVar;
        this.b = yvxVar;
    }
}
