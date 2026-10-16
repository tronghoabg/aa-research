package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zsa {
    private final String a;
    private final sb b;
    private sb c;

    private zsa(String str) {
        sb sbVar = new sb((byte[]) null);
        this.b = sbVar;
        this.c = sbVar;
        zkt.m(str);
        this.a = str;
    }

    public static zsa a(Object obj) {
        return new zsa(obj.getClass().getSimpleName());
    }

    public final void b(String str, Object obj) {
        sb sbVar = new sb((byte[]) null);
        this.c.a = sbVar;
        this.c = sbVar;
        sbVar.c = obj;
        sbVar.b = str;
    }

    public final void c(String str, double d) {
        b(str, String.valueOf(d));
    }

    public final void d(String str, float f) {
        b(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        b(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        b(str, String.valueOf(j));
    }

    public final void g(String str, boolean z) {
        b(str, String.valueOf(z));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        Object obj = this.b.a;
        String str = "";
        while (obj != null) {
            sb sbVar = (sb) obj;
            Object obj2 = sbVar.c;
            sb.append(str);
            Object obj3 = sbVar.b;
            if (obj3 != null) {
                sb.append((String) obj3);
                sb.append('=');
            }
            if (obj2 == null || !obj2.getClass().isArray()) {
                sb.append(obj2);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
            }
            obj = sbVar.a;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
