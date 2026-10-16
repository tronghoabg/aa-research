package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rec implements defpackage.rda {
    final /* synthetic */ defpackage.ref a;

    public rec(defpackage.ref refVar) {
        this.a = refVar;
    }

    @Override // defpackage.rda
    public final void a(int i) {
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.CLIENT", null, "localCarConnectionListener received onCarConnected()", new java.lang.Object[0]);
        }
        this.a.e.set(null, true);
    }

    @Override // defpackage.rda
    public final void b() {
        if (defpackage.omv.c("CAR.CLIENT", 3)) {
            defpackage.rrx.a("CAR.CLIENT", null, "localCarConnectionListener received onCarDisconnected()");
        }
        this.a.I();
    }
}
