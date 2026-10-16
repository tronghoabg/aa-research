package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yha {
    java.lang.Object[] a;
    int b;
    defpackage.zps c;

    public yha(int i) {
        this.a = new java.lang.Object[i + i];
        this.b = 0;
    }

    private final void a(int i) {
        java.lang.Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = java.util.Arrays.copyOf(objArr, defpackage.ygl.f(length, i2));
        }
    }

    public defpackage.yhe b() {
        return d(true);
    }

    public final defpackage.yhe d(boolean z) {
        defpackage.zps zpsVar;
        defpackage.zps zpsVar2;
        if (z && (zpsVar2 = this.c) != null) {
            throw zpsVar2.c();
        }
        defpackage.ync yncVarA = defpackage.ync.a(this.b, this.a, this);
        if (!z || (zpsVar = this.c) == null) {
            return yncVarA;
        }
        throw zpsVar.c();
    }

    public final void e(defpackage.yha yhaVar) {
        yhaVar.getClass();
        a(this.b + yhaVar.b);
        java.lang.Object[] objArr = yhaVar.a;
        java.lang.Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = yhaVar.b;
        java.lang.System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += yhaVar.b;
    }

    public void f(java.lang.Object obj, java.lang.Object obj2) {
        a(this.b + 1);
        defpackage.ysr.aJ(obj, obj2);
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void g(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            a(this.b + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            f(entry.getKey(), entry.getValue());
        }
    }

    public final void h(java.util.Map map) {
        g(map.entrySet());
    }

    public yha() {
        throw null;
    }
}
