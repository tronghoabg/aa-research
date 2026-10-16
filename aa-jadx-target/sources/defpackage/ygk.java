package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class ygk extends defpackage.ygl {
    java.lang.Object[] a;
    int b;
    boolean c;

    public ygk(int i) {
        defpackage.ysr.aL(i, "initialCapacity");
        this.a = new java.lang.Object[i];
        this.b = 0;
    }

    private final void h(int i) {
        int length = this.a.length;
        int iF = f(length, this.b + i);
        if (iF > length || this.c) {
            this.a = java.util.Arrays.copyOf(this.a, iF);
            this.c = false;
        }
    }

    final void a(java.lang.Object[] objArr, int i) {
        defpackage.ysr.B(objArr, i);
        h(i);
        java.lang.System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(java.lang.Object obj) {
        obj.getClass();
        h(1);
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.ygl
    public /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        throw null;
    }

    public final void d(java.lang.Object... objArr) {
        a(objArr, objArr.length);
    }

    public final void e(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            h(collection.size());
            if (collection instanceof defpackage.ygm) {
                this.b = ((defpackage.ygm) collection).a(this.a, this.b);
                return;
            }
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
