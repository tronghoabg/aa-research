package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class adnq {
    public static final List a;
    public static final adnq b;
    public static final adnq c;
    public static final adnq d;
    public static final adnq e;
    public static final adnq f;
    public static final adnq g;
    public static final adnq h;
    public static final adnq i;
    public static final adnq j;
    public static final adnq k;
    public static final adnq l;
    public static final adnq m;
    static final adlx n;
    static final adlx o;
    private static final admb s;
    public final adnn p;
    public final String q;
    public final Throwable r;

    static {
        TreeMap treeMap = new TreeMap();
        for (adnn adnnVar : adnn.values()) {
            adnq adnqVar = (adnq) treeMap.put(Integer.valueOf(adnnVar.r), new adnq(adnnVar, null, null));
            if (adnqVar != null) {
                throw new IllegalStateException("Code value duplication between " + adnqVar.p.name() + " & " + adnnVar.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = adnn.OK.a();
        c = adnn.CANCELLED.a();
        d = adnn.UNKNOWN.a();
        e = adnn.INVALID_ARGUMENT.a();
        f = adnn.DEADLINE_EXCEEDED.a();
        adnn.NOT_FOUND.a();
        adnn.ALREADY_EXISTS.a();
        g = adnn.PERMISSION_DENIED.a();
        h = adnn.UNAUTHENTICATED.a();
        i = adnn.RESOURCE_EXHAUSTED.a();
        j = adnn.FAILED_PRECONDITION.a();
        adnn.ABORTED.a();
        adnn.OUT_OF_RANGE.a();
        k = adnn.UNIMPLEMENTED.a();
        l = adnn.INTERNAL.a();
        m = adnn.UNAVAILABLE.a();
        adnn.DATA_LOSS.a();
        adno adnoVar = new adno();
        int i2 = adlx.d;
        n = new adma("grpc-status", false, adnoVar);
        adnp adnpVar = new adnp();
        s = adnpVar;
        o = new adma("grpc-message", false, adnpVar);
    }

    private adnq(adnn adnnVar, String str, Throwable th) {
        adnnVar.getClass();
        this.p = adnnVar;
        this.q = str;
        this.r = th;
    }

    public static adnq b(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (adnq) list.get(i2);
            }
        }
        return d.e(a.bp(i2, "Unknown code "));
    }

    public static adnq c(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof adnr) {
                return ((adnr) cause).a;
            }
            if (cause instanceof adnt) {
                return ((adnt) cause).a;
            }
        }
        return d.d(th);
    }

    static String f(adnq adnqVar) {
        String str = adnqVar.q;
        if (str == null) {
            return adnqVar.p.toString();
        }
        return adnqVar.p.toString() + ": " + str;
    }

    public final adnq a(String str) {
        String str2 = this.q;
        adnn adnnVar = this.p;
        return str2 == null ? new adnq(adnnVar, str, this.r) : new adnq(adnnVar, a.bJ(str, str2, "\n"), this.r);
    }

    public final adnq d(Throwable th) {
        return Objects.equals(this.r, th) ? this : new adnq(this.p, this.q, th);
    }

    public final adnq e(String str) {
        return Objects.equals(this.q, str) ? this : new adnq(this.p, str, this.r);
    }

    public final boolean g() {
        return adnn.OK == this.p;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("code", this.p.name());
        xxgVarAo.b("description", this.q);
        Throwable th = this.r;
        Object objA = th;
        if (th != null) {
            objA = xyg.a(th);
        }
        xxgVarAo.b("cause", objA);
        return xxgVarAo.toString();
    }
}
