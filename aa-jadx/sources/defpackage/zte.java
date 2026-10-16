package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zte {
    private final java.lang.String a;
    private final defpackage.sg b;
    private defpackage.sg c;

    private zte(java.lang.String str) {
        defpackage.sg sgVar = new defpackage.sg((byte[]) null);
        this.b = sgVar;
        this.c = sgVar;
        defpackage.zlv.m(str);
        this.a = str;
    }

    public static defpackage.zte a(java.lang.Object obj) {
        return new defpackage.zte(obj.getClass().getSimpleName());
    }

    public final void b(java.lang.String str, java.lang.Object obj) {
        defpackage.sg sgVar = new defpackage.sg((byte[]) null);
        this.c.a = sgVar;
        this.c = sgVar;
        sgVar.c = obj;
        sgVar.b = str;
    }

    public final void c(java.lang.String str, double d) {
        b(str, java.lang.String.valueOf(d));
    }

    public final void d(java.lang.String str, float f) {
        b(str, java.lang.String.valueOf(f));
    }

    public final void e(java.lang.String str, int i) {
        b(str, java.lang.String.valueOf(i));
    }

    public final void f(java.lang.String str, long j) {
        b(str, java.lang.String.valueOf(j));
    }

    public final void g(java.lang.String str, boolean z) {
        b(str, java.lang.String.valueOf(z));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        java.lang.Object obj = this.b.a;
        java.lang.String str = "";
        while (obj != null) {
            defpackage.sg sgVar = (defpackage.sg) obj;
            java.lang.Object obj2 = sgVar.c;
            sb.append(str);
            java.lang.Object obj3 = sgVar.b;
            if (obj3 != null) {
                sb.append((java.lang.String) obj3);
                sb.append('=');
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb.append(obj2);
            } else {
                java.lang.String strDeepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj2});
                sb.append((java.lang.CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            obj = sgVar.a;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
