package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class skg extends defpackage.sjz {
    public final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();
    public final java.lang.String c;
    public final defpackage.sjx d;
    final /* synthetic */ defpackage.ski e;
    private final java.util.List f;

    public skg(defpackage.ski skiVar, java.util.List list, java.lang.String str, defpackage.sjx sjxVar) {
        this.e = skiVar;
        this.f = list;
        this.c = str;
        this.d = sjxVar;
    }

    @Override // defpackage.sjz
    public final void c(com.google.android.gms.common.api.Status status) {
        int i = defpackage.ski.b;
        java.util.List list = this.f;
        if (((defpackage.skf) list.get(0)).d) {
            defpackage.skb.b().e(((defpackage.skf) list.get(0)).a.a.f, 1035);
        } else {
            defpackage.skb.b().e(this.c, 1028);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.skb.b().e(((defpackage.skf) it.next()).a.a.f, 1029);
            }
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(list).map(new defpackage.mmf(14));
        int i2 = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) map.collect(defpackage.yds.a);
        int size = ygwVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(ygwVar.get(i3)), status);
        }
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
