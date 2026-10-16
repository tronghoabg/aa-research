package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xxg {
    private final String a;
    private final xxf b;
    private xxf c;
    private boolean d;

    public xxg(String str) {
        xxf xxfVar = new xxf();
        this.b = xxfVar;
        this.c = xxfVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final xxf i() {
        xxf xxfVar = new xxf();
        this.c.c = xxfVar;
        this.c = xxfVar;
        return xxfVar;
    }

    private final void j(String str, Object obj) {
        xxe xxeVar = new xxe();
        this.c.c = xxeVar;
        this.c = xxeVar;
        xxeVar.b = obj;
        xxeVar.a = str;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        xxf xxfVarI = i();
        xxfVarI.b = obj;
        xxfVarI.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, double d) {
        j(str, String.valueOf(d));
    }

    public final void e(String str, float f) {
        j(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        j(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        j(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        j(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (xxf xxfVar = this.b.c; xxfVar != null; xxfVar = xxfVar.c) {
            boolean z2 = xxfVar instanceof xxe;
            Object obj = xxfVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = xxfVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
