package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xym {
    private final java.lang.String a;
    private final defpackage.xyl b;
    private defpackage.xyl c;
    private boolean d;

    public xym(java.lang.String str) {
        defpackage.xyl xylVar = new defpackage.xyl();
        this.b = xylVar;
        this.c = xylVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final defpackage.xyl i() {
        defpackage.xyl xylVar = new defpackage.xyl();
        this.c.c = xylVar;
        this.c = xylVar;
        return xylVar;
    }

    private final void j(java.lang.String str, java.lang.Object obj) {
        defpackage.xyk xykVar = new defpackage.xyk();
        this.c.c = xykVar;
        this.c = xykVar;
        xykVar.b = obj;
        xykVar.a = str;
    }

    public final void a(java.lang.Object obj) {
        i().b = obj;
    }

    public final void b(java.lang.String str, java.lang.Object obj) {
        defpackage.xyl xylVarI = i();
        xylVarI.b = obj;
        xylVarI.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(java.lang.String str, double d) {
        j(str, java.lang.String.valueOf(d));
    }

    public final void e(java.lang.String str, float f) {
        j(str, java.lang.String.valueOf(f));
    }

    public final void f(java.lang.String str, int i) {
        j(str, java.lang.String.valueOf(i));
    }

    public final void g(java.lang.String str, long j) {
        j(str, java.lang.String.valueOf(j));
    }

    public final void h(java.lang.String str, boolean z) {
        j(str, java.lang.String.valueOf(z));
    }

    public final java.lang.String toString() {
        boolean z = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        java.lang.String str = "";
        for (defpackage.xyl xylVar = this.b.c; xylVar != null; xylVar = xylVar.c) {
            boolean z2 = xylVar instanceof defpackage.xyk;
            java.lang.Object obj = xylVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                java.lang.String str2 = xylVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                    sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
