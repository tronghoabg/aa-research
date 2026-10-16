package md;

import A7.C0237b0;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import k8.AbstractC3211t;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final List f40673d;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f40674e;

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f40675f;

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f40676g;

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f40677h;

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f40678i;

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f40679j;
    public static final k0 k;

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f40680l;

    /* renamed from: m, reason: collision with root package name */
    public static final k0 f40681m;

    /* renamed from: n, reason: collision with root package name */
    public static final k0 f40682n;

    /* renamed from: o, reason: collision with root package name */
    public static final Z f40683o;

    /* renamed from: p, reason: collision with root package name */
    public static final Z f40684p;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f40685a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40686b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f40687c;

    static {
        TreeMap treeMap = new TreeMap();
        for (j0 j0Var : j0.values()) {
            k0 k0Var = (k0) treeMap.put(Integer.valueOf(j0Var.f40671a), new k0(j0Var, null, null));
            if (k0Var != null) {
                throw new IllegalStateException("Code value duplication between " + k0Var.f40685a.name() + " & " + j0Var.name());
            }
        }
        f40673d = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        f40674e = j0.OK.a();
        f40675f = j0.CANCELLED.a();
        f40676g = j0.UNKNOWN.a();
        j0.INVALID_ARGUMENT.a();
        f40677h = j0.DEADLINE_EXCEEDED.a();
        j0.NOT_FOUND.a();
        j0.ALREADY_EXISTS.a();
        f40678i = j0.PERMISSION_DENIED.a();
        f40679j = j0.UNAUTHENTICATED.a();
        k = j0.RESOURCE_EXHAUSTED.a();
        f40680l = j0.FAILED_PRECONDITION.a();
        j0.ABORTED.a();
        j0.OUT_OF_RANGE.a();
        j0.UNIMPLEMENTED.a();
        f40681m = j0.INTERNAL.a();
        f40682n = j0.UNAVAILABLE.a();
        j0.DATA_LOSS.a();
        f40683o = new Z("grpc-status", false, new C3542j(10));
        f40684p = new Z("grpc-message", false, new C3542j(1));
    }

    public k0(j0 j0Var, String str, Throwable th) {
        Fe.e.t(j0Var, "code");
        this.f40685a = j0Var;
        this.f40686b = str;
        this.f40687c = th;
    }

    public static String c(k0 k0Var) {
        String str = k0Var.f40686b;
        j0 j0Var = k0Var.f40685a;
        if (str == null) {
            return j0Var.toString();
        }
        return j0Var + ": " + k0Var.f40686b;
    }

    public static k0 d(int i5) {
        if (i5 >= 0) {
            List list = f40673d;
            if (i5 < list.size()) {
                return (k0) list.get(i5);
            }
        }
        return f40676g.h("Unknown code " + i5);
    }

    public static k0 e(Throwable th) {
        Fe.e.t(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof l0) {
                return ((l0) cause).f40690a;
            }
            if (cause instanceof m0) {
                return ((m0) cause).f40698a;
            }
        }
        return f40676g.g(th);
    }

    public final m0 a() {
        return new m0(this, null);
    }

    public final k0 b(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f40687c;
        j0 j0Var = this.f40685a;
        String str2 = this.f40686b;
        return str2 == null ? new k0(j0Var, str, th) : new k0(j0Var, N0.a.g(str2, "\n", str), th);
    }

    public final boolean f() {
        return j0.OK == this.f40685a;
    }

    public final k0 g(Throwable th) {
        return Fe.b.v(this.f40687c, th) ? this : new k0(this.f40685a, this.f40686b, th);
    }

    public final k0 h(String str) {
        return Fe.b.v(this.f40686b, str) ? this : new k0(this.f40685a, str, this.f40687c);
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40685a.name(), "code");
        c0237b0S.f(this.f40686b, "description");
        Throwable th = this.f40687c;
        Object string = th;
        if (th != null) {
            Object obj = AbstractC3211t.f39322a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        c0237b0S.f(string, "cause");
        return c0237b0S.toString();
    }
}
