package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajik {
    private final boolean a;
    private java.lang.String[] b;
    private java.lang.String[] c;
    private boolean d;

    public ajik(defpackage.ajil ajilVar) {
        this.a = ajilVar.c;
        this.b = ajilVar.e;
        this.c = ajilVar.f;
        this.d = ajilVar.d;
    }

    public final defpackage.ajil a() {
        return new defpackage.ajil(this.a, this.d, this.b, this.c);
    }

    public final void b(java.lang.String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, length);
        objArrCopyOf.getClass();
        this.b = (java.lang.String[]) objArrCopyOf;
    }

    public final void c() {
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(java.lang.String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, length);
        objArrCopyOf.getClass();
        this.c = (java.lang.String[]) objArrCopyOf;
    }

    public final void e(defpackage.ajij... ajijVarArr) {
        ajijVarArr.getClass();
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(ajijVarArr.length);
        for (defpackage.ajij ajijVar : ajijVarArr) {
            arrayList.add(ajijVar.s);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        b((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(defpackage.ajjj... ajjjVarArr) {
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(ajjjVarArr.length);
        for (defpackage.ajjj ajjjVar : ajjjVarArr) {
            arrayList.add(ajjjVar.f);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        d((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public ajik(boolean z) {
        this.a = z;
    }
}
