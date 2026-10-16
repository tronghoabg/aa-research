package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yhy extends defpackage.yhp {
    public final defpackage.yia a() {
        java.util.Map map = this.a;
        if (map == null) {
            return yfc.a;
        }
        defpackage.ydy<java.util.Map.Entry> ydyVar = new defpackage.ydy((defpackage.yed) map);
        if (ydyVar.isEmpty()) {
            return yfc.a;
        }
        defpackage.yha yhaVar = new defpackage.yha(ydyVar.size());
        int size = 0;
        for (java.util.Map.Entry entry : ydyVar) {
            java.lang.Object key = entry.getKey();
            defpackage.yhx yhxVarN = defpackage.yhx.n(((defpackage.yhv) entry.getValue()).g());
            if (!yhxVarN.isEmpty()) {
                yhaVar.f(key, yhxVarN);
                size += yhxVarN.size();
            }
        }
        return new defpackage.yia(yhaVar.d(true), size, null);
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        super.f(obj, obj2);
    }

    public final void c(java.lang.Object obj, java.lang.Iterable iterable) {
        super.g(obj, iterable);
    }

    @Override // defpackage.yhp
    public final defpackage.ygl d(int i) {
        defpackage.ysr.aL(i, "expectedSize");
        return new defpackage.yhv(i);
    }

    @Override // defpackage.yhp
    public final int h(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Set) {
            return java.lang.Math.max(4, ((java.util.Set) iterable).size());
        }
        return 4;
    }
}
