package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ymn extends defpackage.yms implements java.io.Serializable {
    public static final defpackage.ymn a = new defpackage.ymn();
    private static final long serialVersionUID = 0;
    private transient defpackage.yms b;
    private transient defpackage.yms c;

    private ymn() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.yms
    public final defpackage.yms a() {
        defpackage.yms ymsVar = this.b;
        if (ymsVar != null) {
            return ymsVar;
        }
        ymo ymoVar = new ymo(this);
        this.b = ymoVar;
        return ymoVar;
    }

    @Override // defpackage.yms
    public final defpackage.yms b() {
        defpackage.yms ymsVar = this.c;
        if (ymsVar != null) {
            return ymsVar;
        }
        ymp ympVar = new ymp(this);
        this.c = ympVar;
        return ympVar;
    }

    @Override // defpackage.yms
    public final defpackage.yms c() {
        return yni.a;
    }

    @Override // defpackage.yms, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }
}
