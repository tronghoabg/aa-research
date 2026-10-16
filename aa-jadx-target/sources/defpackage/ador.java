package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ador {
    public static final java.util.List a;
    public static final defpackage.ador b;
    public static final defpackage.ador c;
    public static final defpackage.ador d;
    public static final defpackage.ador e;
    public static final defpackage.ador f;
    public static final defpackage.ador g;
    public static final defpackage.ador h;
    public static final defpackage.ador i;
    public static final defpackage.ador j;
    public static final defpackage.ador k;
    public static final defpackage.ador l;
    public static final defpackage.ador m;
    static final defpackage.admy n;
    static final defpackage.admy o;
    private static final adnc s;
    public final defpackage.adoo p;
    public final java.lang.String q;
    public final java.lang.Throwable r;

    static {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (defpackage.adoo adooVar : defpackage.adoo.values()) {
            defpackage.ador adorVar = (defpackage.ador) treeMap.put(java.lang.Integer.valueOf(adooVar.r), new defpackage.ador(adooVar, null, null));
            if (adorVar != null) {
                throw new java.lang.IllegalStateException("Code value duplication between " + adorVar.p.name() + " & " + adooVar.name());
            }
        }
        a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(treeMap.values()));
        b = defpackage.adoo.OK.a();
        c = defpackage.adoo.CANCELLED.a();
        d = defpackage.adoo.UNKNOWN.a();
        e = defpackage.adoo.INVALID_ARGUMENT.a();
        f = defpackage.adoo.DEADLINE_EXCEEDED.a();
        defpackage.adoo.NOT_FOUND.a();
        defpackage.adoo.ALREADY_EXISTS.a();
        g = defpackage.adoo.PERMISSION_DENIED.a();
        h = defpackage.adoo.UNAUTHENTICATED.a();
        i = defpackage.adoo.RESOURCE_EXHAUSTED.a();
        j = defpackage.adoo.FAILED_PRECONDITION.a();
        defpackage.adoo.ABORTED.a();
        defpackage.adoo.OUT_OF_RANGE.a();
        k = defpackage.adoo.UNIMPLEMENTED.a();
        l = defpackage.adoo.INTERNAL.a();
        m = defpackage.adoo.UNAVAILABLE.a();
        defpackage.adoo.DATA_LOSS.a();
        adop adopVar = new adop();
        int i2 = defpackage.admy.d;
        n = new defpackage.adnb("grpc-status", false, adopVar);
        defpackage.adoq adoqVar = new defpackage.adoq();
        s = adoqVar;
        o = new defpackage.adnb("grpc-message", false, adoqVar);
    }

    private ador(defpackage.adoo adooVar, java.lang.String str, java.lang.Throwable th) {
        adooVar.getClass();
        this.p = adooVar;
        this.q = str;
        this.r = th;
    }

    public static defpackage.ador b(int i2) {
        if (i2 >= 0) {
            java.util.List list = a;
            if (i2 < list.size()) {
                return (defpackage.ador) list.get(i2);
            }
        }
        return d.e(defpackage.a.bo(i2, "Unknown code "));
    }

    public static defpackage.ador c(java.lang.Throwable th) {
        th.getClass();
        for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof ados) {
                return ((ados) cause).a;
            }
            if (cause instanceof defpackage.adou) {
                return ((defpackage.adou) cause).a;
            }
        }
        return d.d(th);
    }

    static java.lang.String f(defpackage.ador adorVar) {
        java.lang.String str = adorVar.q;
        if (str == null) {
            return adorVar.p.toString();
        }
        return adorVar.p.toString() + ": " + str;
    }

    public final defpackage.ador a(java.lang.String str) {
        java.lang.String str2 = this.q;
        defpackage.adoo adooVar = this.p;
        return str2 == null ? new defpackage.ador(adooVar, str, this.r) : new defpackage.ador(adooVar, defpackage.a.bI(str, str2, "\n"), this.r);
    }

    public final defpackage.ador d(java.lang.Throwable th) {
        return j$.util.Objects.equals(this.r, th) ? this : new defpackage.ador(this.p, this.q, th);
    }

    public final defpackage.ador e(java.lang.String str) {
        return j$.util.Objects.equals(this.q, str) ? this : new defpackage.ador(this.p, str, this.r);
    }

    public final boolean g() {
        return defpackage.adoo.OK == this.p;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("code", this.p.name());
        xymVarBy.b("description", this.q);
        java.lang.Throwable th = this.r;
        java.lang.Object objA = th;
        if (th != null) {
            objA = defpackage.xzm.a(th);
        }
        xymVarBy.b("cause", objA);
        return xymVarBy.toString();
    }
}
