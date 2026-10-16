package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qtl implements defpackage.rvl {
    final /* synthetic */ defpackage.qtn a;
    private final java.util.Set b;
    private final boolean c;

    public qtl(defpackage.qtn qtnVar, java.util.Set set, boolean z) {
        this.a = qtnVar;
        this.b = set;
        this.c = z;
    }

    @Override // defpackage.rvl
    public final void a() {
        defpackage.qtn.a.f().ai(7899).u("Car services started");
        defpackage.qtn qtnVar = this.a;
        defpackage.qtm qtmVar = qtnVar.e;
        qtmVar.getClass();
        qtnVar.d.post(new defpackage.qth(qtmVar, 6));
    }

    @Override // defpackage.rvl
    public final boolean b(int i) {
        if (!this.c || i != defpackage.rsi.SENSOR_SOURCE.a()) {
            return false;
        }
        defpackage.qtn.a.f().ai(7900).w("Sensor service (%d) already opened in Proxy. Force open in Lite.", i);
        return true;
    }

    @Override // defpackage.rvl
    public final boolean c(int i) {
        return this.b.contains(java.lang.Integer.valueOf(i));
    }
}
