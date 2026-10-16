package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ymy extends defpackage.ygw {
    final /* synthetic */ defpackage.ymz a;

    public ymy(defpackage.ymz ymzVar) {
        this.a = ymzVar;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        defpackage.ymz ymzVar = this.a;
        defpackage.ysr.bs(i, ymzVar.c);
        java.lang.Object[] objArr = ymzVar.a;
        int i2 = i + i;
        int i3 = ymzVar.b;
        java.lang.Object obj = objArr[i2 + i3];
        obj.getClass();
        java.lang.Object obj2 = objArr[i2 + (i3 ^ 1)];
        obj2.getClass();
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
