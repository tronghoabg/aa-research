package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igr {
    public java.util.List a = null;
    public int b = 0;

    public final int a() {
        java.util.List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final defpackage.igs b(int i) {
        return (defpackage.igs) this.a.get(i);
    }

    public final void c() {
        this.b += 100;
    }

    public final boolean d() {
        java.util.List list = this.a;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append((defpackage.igs) it.next());
            sb.append(' ');
        }
        sb.append('(');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
