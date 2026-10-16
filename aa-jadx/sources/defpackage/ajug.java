package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajug implements java.lang.Cloneable, defpackage.ajuk {
    public final defpackage.ajqe a;
    public final java.net.InetAddress b;
    public final boolean c;
    private final java.util.List d;
    private final defpackage.ajuj e;
    private final defpackage.ajui f;

    public ajug(defpackage.ajqe ajqeVar, java.net.InetAddress inetAddress, java.util.List list, boolean z, defpackage.ajuj ajujVar, defpackage.ajui ajuiVar) {
        int i;
        defpackage.aguw.e(ajqeVar, "Target host");
        if (ajqeVar.c < 0) {
            java.net.InetAddress inetAddress2 = ajqeVar.e;
            java.lang.String str = ajqeVar.d;
            java.lang.String str2 = ajqeVar.a;
            if ("http".equalsIgnoreCase(str)) {
                i = 80;
            } else {
                i = "https".equalsIgnoreCase(str) ? 443 : -1;
            }
            ajqeVar = new defpackage.ajqe(str2, i, str);
        }
        this.a = ajqeVar;
        this.b = inetAddress;
        if (list == null || list.isEmpty()) {
            this.d = null;
        } else {
            this.d = new java.util.ArrayList(list);
        }
        if (ajujVar == defpackage.ajuj.b) {
            defpackage.aguw.a(this.d != null, "Proxy required if tunnelled");
        }
        this.c = z;
        this.e = ajujVar == null ? defpackage.ajuj.a : ajujVar;
        this.f = ajuiVar == null ? defpackage.ajui.a : ajuiVar;
    }

    @Override // defpackage.ajuk
    public final int a() {
        java.util.List list = this.d;
        if (list != null) {
            return list.size() + 1;
        }
        return 1;
    }

    @Override // defpackage.ajuk
    public final defpackage.ajqe b(int i) {
        defpackage.aguw.d(i, "Hop index");
        int iA = a();
        defpackage.aguw.a(i < iA, "Hop index exceeds tracked route length");
        return i < iA + (-1) ? (defpackage.ajqe) this.d.get(i) : this.a;
    }

    @Override // defpackage.ajuk
    public final defpackage.ajqe c() {
        java.util.List list = this.d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (defpackage.ajqe) list.get(0);
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajuk
    public final defpackage.ajqe d() {
        return this.a;
    }

    @Override // defpackage.ajuk
    public final boolean e() {
        return this.f == defpackage.ajui.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ajug) {
            defpackage.ajug ajugVar = (defpackage.ajug) obj;
            if (this.c == ajugVar.c && this.e == ajugVar.e && this.f == ajugVar.f && defpackage.a.an(this.a, ajugVar.a) && defpackage.a.an(this.b, ajugVar.b) && defpackage.a.an(this.d, ajugVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajuk
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ajuk
    public final boolean g() {
        return this.e == defpackage.ajuj.b;
    }

    public final int hashCode() {
        int iC = defpackage.agwh.c(defpackage.agwh.c(17, this.a), this.b);
        java.util.List list = this.d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                iC = defpackage.agwh.c(iC, (defpackage.ajqe) it.next());
            }
        }
        boolean z = this.c;
        defpackage.ajuj ajujVar = this.e;
        return defpackage.agwh.c(defpackage.agwh.c((iC * 37) + (z ? 1 : 0), ajujVar), this.f);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((a() * 30) + 50);
        java.net.InetAddress inetAddress = this.b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.e == defpackage.ajuj.b) {
            sb.append('t');
        }
        if (this.f == defpackage.ajui.b) {
            sb.append('l');
        }
        if (this.c) {
            sb.append('s');
        }
        sb.append("}->");
        java.util.List list = this.d;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((defpackage.ajqe) it.next());
                sb.append("->");
            }
        }
        sb.append(this.a);
        return sb.toString();
    }
}
