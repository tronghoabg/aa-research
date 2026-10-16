package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbw implements defpackage.akca {
    private final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.akca
    public final java.lang.Object v(java.lang.String str) {
        return this.a.get(str);
    }

    @Override // defpackage.akca
    public final void x(java.lang.String str, java.lang.Object obj) {
        java.util.Map map = this.a;
        if (obj != null) {
            map.put(str, obj);
        } else {
            map.remove(str);
        }
    }
}
