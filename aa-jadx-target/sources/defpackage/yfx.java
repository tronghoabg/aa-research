package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yfx extends defpackage.ygd {
    final /* synthetic */ defpackage.yge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfx(defpackage.yge ygeVar) {
        super(ygeVar);
        this.a = ygeVar;
    }

    @Override // defpackage.ygd
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return new defpackage.yfv(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            defpackage.yge ygeVar = this.a;
            int iB = ygeVar.b(key);
            if (iB != -1 && j$.util.Objects.equals(value, ygeVar.b[iB])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        int iAA = defpackage.ysr.aA(key);
        defpackage.yge ygeVar = this.a;
        int iC = ygeVar.c(key, iAA);
        if (iC == -1 || !j$.util.Objects.equals(value, ygeVar.b[iC])) {
            return false;
        }
        ygeVar.g(iC, iAA);
        return true;
    }
}
