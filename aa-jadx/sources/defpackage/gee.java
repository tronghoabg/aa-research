package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gee extends defpackage.eqp implements defpackage.ged {
    public static defpackage.gee a;
    public final java.lang.String i;
    public final java.lang.String j;
    private final java.lang.StringBuilder n = new java.lang.StringBuilder();
    public final java.lang.String k = "Input";
    public final java.util.LinkedHashMap h = new java.util.LinkedHashMap();
    public boolean l = false;
    public boolean m = false;

    public gee(java.lang.String str, java.lang.String str2) {
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.ged
    public final void a(java.lang.String str) {
        if (((java.lang.String) this.h.remove(str)) != null) {
            j(r());
        }
    }

    @Override // defpackage.ged
    public final void b(java.lang.String str, java.lang.String str2) {
        this.h.put(str, str2);
        j(r());
    }

    public final java.lang.CharSequence r() {
        java.lang.StringBuilder sb = this.n;
        boolean z = false;
        sb.setLength(0);
        java.util.LinkedHashMap linkedHashMap = this.h;
        for (java.lang.String str : linkedHashMap.keySet()) {
            if (!j$.util.Objects.equals(str, this.k) || this.m) {
                if (z) {
                    sb.append("\n");
                }
                sb.append(str);
                sb.append(": ");
                sb.append((java.lang.String) linkedHashMap.get(str));
                z = true;
            }
        }
        return sb.toString();
    }
}
