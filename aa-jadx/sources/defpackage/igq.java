package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igq {
    public java.util.List a = null;

    public final void a(defpackage.igq igqVar) {
        java.util.List list = igqVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new java.util.ArrayList(list.size());
        }
        java.util.Iterator it = igqVar.a.iterator();
        while (it.hasNext()) {
            this.a.add((defpackage.igp) it.next());
        }
    }

    public final java.lang.String toString() {
        if (this.a == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((defpackage.igp) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
