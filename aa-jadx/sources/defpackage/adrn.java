package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adrn {
    public java.lang.Object a;
    public java.lang.Object b;

    public adrn(byte[] bArr) {
        this.b = null;
        this.a = null;
    }

    public static java.lang.String d(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.ROOT, str, objArr);
    }

    public static java.util.concurrent.ThreadFactory g(defpackage.adrn adrnVar) {
        java.lang.Object obj = adrnVar.b;
        java.lang.Object obj2 = adrnVar.a;
        return new defpackage.zig(java.util.concurrent.Executors.defaultThreadFactory(), (java.lang.String) obj, obj != null ? new java.util.concurrent.atomic.AtomicLong(0L) : null, (java.lang.Boolean) obj2);
    }

    public final defpackage.adjs a() {
        if (this.b != null) {
            this.a = new defpackage.adjs((java.util.IdentityHashMap) this.b);
            this.b = null;
        }
        return (defpackage.adjs) this.a;
    }

    public final java.util.IdentityHashMap b(int i) {
        if (this.b == null) {
            java.lang.Object obj = this.a;
            defpackage.adjs adjsVar = defpackage.adjs.a;
            java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap(((defpackage.adjs) obj).b.size() + i);
            this.b = identityHashMap;
            identityHashMap.putAll(((defpackage.adjs) this.a).b);
            this.a = null;
        }
        return (java.util.IdentityHashMap) this.b;
    }

    public final void c(defpackage.adjr adjrVar, java.lang.Object obj) {
        b(1).put(adjrVar, obj);
    }

    public final void e() {
        this.a = java.lang.Boolean.TRUE;
    }

    public final void f(java.lang.String str) {
        d(str, 0);
        this.b = str;
    }

    public adrn(defpackage.adjs adjsVar) {
        this.a = adjsVar;
    }
}
