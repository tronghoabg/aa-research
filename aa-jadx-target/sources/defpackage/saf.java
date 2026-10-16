package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class saf {
    private final java.io.PrintWriter a;
    private int b;
    private boolean c;

    protected saf(java.io.PrintWriter printWriter) {
        this.b = 0;
        this.c = true;
        this.a = printWriter;
    }

    public final defpackage.saf a(java.lang.Object obj, java.lang.Object obj2) {
        return h("%s: %s,", obj, obj2);
    }

    public final defpackage.saf b(java.lang.Object obj, java.lang.Runnable runnable) {
        i((java.lang.String) obj);
        i(": ");
        runnable.run();
        m(",");
        return this;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.saf c(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        return a(obj, java.lang.String.format(str, objArr));
    }

    public final defpackage.saf d(java.lang.Object obj, java.util.Collection collection, defpackage.dzn dznVar) {
        return b(obj, new defpackage.qjn((java.lang.Object) this, (java.lang.Object) collection, (java.lang.Object) dznVar, 7, (byte[]) null));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.saf e(java.lang.Runnable runnable) {
        i("{");
        j(runnable);
        i("}");
        return this;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.saf f(java.lang.Object obj, java.lang.Runnable runnable) {
        i((java.lang.String) obj);
        i(" ");
        return e(runnable);
    }

    public final defpackage.saf g(java.lang.String str, java.lang.Object... objArr) {
        i(java.lang.String.format(str, objArr));
        return this;
    }

    public final defpackage.saf h(java.lang.String str, java.lang.Object... objArr) {
        m(java.lang.String.format(str, objArr));
        return this;
    }

    public final void i(java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        defpackage.ysr.bj(this.b >= 0);
        if (this.c) {
            this.c = false;
            int i = this.b;
            if (i > 0) {
                this.a.print(defpackage.ysr.aT(i));
            }
        }
        this.c = str.endsWith("\n");
        if (this.b > 0 && str.contains("\n")) {
            str = str.replaceAll("\\n(?!(\\n|$))", "\n".concat(defpackage.ysr.aT(this.b)));
        }
        this.a.print(str);
    }

    public final void j(java.lang.Runnable runnable) {
        int i = this.b;
        defpackage.ysr.bl(i >= 0, "Invalid indentCount %s", i);
        this.b++;
        runnable.run();
        this.b--;
    }

    public final void k(java.util.Collection collection, defpackage.dzn dznVar) {
        if (collection.isEmpty()) {
            i("[]");
            return;
        }
        m("[");
        this.b++;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            dznVar.a(it.next());
            m(",");
        }
        this.b--;
        i("]");
    }

    public final void l() {
        this.a.println();
        this.c = true;
    }

    public final void m(java.lang.String str) {
        i(str);
        l();
    }

    public saf(java.io.PrintWriter printWriter, byte[] bArr) {
        this(printWriter);
    }
}
