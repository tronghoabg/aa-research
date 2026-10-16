package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sjp {
    public static final defpackage.sjp a = new defpackage.sjp(defpackage.ysr.n(java.util.EnumSet.allOf(defpackage.sjq.class)));
    public static final defpackage.sjp b = new defpackage.sjp(defpackage.ynd.a);
    public static final defpackage.sjp c = new defpackage.sjp(defpackage.ysr.o(defpackage.sjq.ZWIEBACK, new defpackage.sjq[0]));
    public final defpackage.yhx d;

    public sjp(defpackage.yhx yhxVar) {
        this.d = yhxVar;
    }

    public final boolean a(defpackage.sjq sjqVar) {
        return this.d.contains(sjqVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.sjp) && this.d.equals(((defpackage.sjp) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
