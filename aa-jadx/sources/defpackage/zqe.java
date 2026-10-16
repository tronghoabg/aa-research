package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqe implements defpackage.zqf {
    public final defpackage.zqd a;
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    private zqe(defpackage.zqd zqdVar) {
        this.a = zqdVar;
    }

    public static defpackage.zqe c() {
        return new defpackage.zqe(new defpackage.zqc(0));
    }

    public static defpackage.zqe d() {
        return new defpackage.zqe(new defpackage.zqc(1));
    }

    @Override // defpackage.zqf
    public final void a(defpackage.zpk zpkVar) {
        this.b.put(this.a.a(zpkVar), zpkVar);
    }

    public final defpackage.zpk b(java.lang.Object obj) {
        if (obj != null) {
            return (defpackage.zpk) this.b.get(obj);
        }
        return null;
    }
}
