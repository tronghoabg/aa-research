package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class xyj {
    public final java.lang.String c;

    public xyj(defpackage.xyj xyjVar) {
        this.c = xyjVar.c;
    }

    public java.lang.CharSequence a(java.lang.Object obj) {
        obj.getClass();
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    public java.lang.String b(java.lang.Iterable iterable) {
        return d(iterable.iterator());
    }

    public void c(java.lang.Appendable appendable, java.util.Iterator it) throws java.io.IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final java.lang.String d(java.util.Iterator it) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        f(sb, it);
        return sb.toString();
    }

    public final java.lang.String e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) {
        return b(new defpackage.xyi(objArr, obj, obj2));
    }

    public final void f(java.lang.StringBuilder sb, java.util.Iterator it) {
        try {
            c(sb, it);
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final void g(java.lang.StringBuilder sb, java.lang.Iterable iterable) {
        f(sb, iterable.iterator());
    }

    public xyj(java.lang.String str) {
        this.c = str;
    }
}
