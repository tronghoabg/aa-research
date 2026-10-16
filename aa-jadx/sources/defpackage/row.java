package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class row {
    public final java.lang.Object a;

    public row(defpackage.afak afakVar) {
        this.a = afakVar;
    }

    public final boolean a() {
        return ((com.google.android.gms.car.CarUiInfo) this.a).a;
    }

    public final boolean b() {
        return ((com.google.android.gms.car.CarUiInfo) this.a).d;
    }

    public final boolean c() {
        return ((com.google.android.gms.car.CarUiInfo) this.a).b;
    }

    public final defpackage.row d() throws defpackage.qst {
        return new defpackage.row(((defpackage.ret) this.a).a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afak, java.lang.Object] */
    public final defpackage.vyv e(float f) {
        java.util.Random random = (java.util.Random) this.a.a();
        random.getClass();
        return new defpackage.vyv(random, f);
    }

    public row(java.lang.Object obj) {
        this.a = obj;
    }
}
