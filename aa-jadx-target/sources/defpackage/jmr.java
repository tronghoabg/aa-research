package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmr {
    private final defpackage.afer a;
    private final defpackage.affc b;
    private int c;
    private java.lang.Object d;

    public jmr(defpackage.afer aferVar, defpackage.affc affcVar) {
        this.a = aferVar;
        this.b = affcVar;
    }

    public final synchronized java.lang.Object a() {
        this.c++;
        java.lang.Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        java.lang.Object objInvoke = this.a.invoke();
        this.d = objInvoke;
        return objInvoke;
    }

    public final synchronized void b() {
        java.lang.Object obj;
        int i = this.c;
        if (i <= 0) {
            throw new java.lang.IllegalStateException("Trying to decrement reference count below zero!");
        }
        int i2 = i - 1;
        this.c = i2;
        if (i2 != 0 || (obj = this.d) == null) {
            return;
        }
        this.b.invoke(obj);
        this.d = null;
    }
}
