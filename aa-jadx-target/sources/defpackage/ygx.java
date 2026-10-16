package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ygx extends defpackage.yhp {
    public final defpackage.ygy a() {
        java.util.Map map = this.a;
        if (map == null) {
            return yfb.a;
        }
        defpackage.ydy<java.util.Map.Entry> ydyVar = new defpackage.ydy((defpackage.yed) map);
        if (ydyVar.isEmpty()) {
            return yfb.a;
        }
        defpackage.yha yhaVar = new defpackage.yha(ydyVar.size());
        int i = 0;
        for (java.util.Map.Entry entry : ydyVar) {
            java.lang.Object key = entry.getKey();
            defpackage.ygw ygwVarG = ((defpackage.ygr) entry.getValue()).g();
            yhaVar.f(key, ygwVarG);
            i += ((defpackage.ymx) ygwVarG).c;
        }
        return new defpackage.ygy(yhaVar.d(true), i);
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        super.f(obj, obj2);
    }

    public final void c(java.lang.Object obj, java.lang.Iterable iterable) {
        super.g(obj, iterable);
    }
}
