package e.a;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ee {

    /* renamed from: a, reason: collision with root package name */
    public static final ee f47401a;

    /* renamed from: b, reason: collision with root package name */
    public static final ee f47402b;

    /* renamed from: c, reason: collision with root package name */
    public static final ee f47403c;

    /* renamed from: d, reason: collision with root package name */
    public static final ee f47404d;

    /* renamed from: e, reason: collision with root package name */
    public static final ee f47405e;

    /* renamed from: f, reason: collision with root package name */
    public static final ee f47406f;

    /* renamed from: g, reason: collision with root package name */
    public static final ee f47407g;

    /* renamed from: h, reason: collision with root package name */
    public static final ee f47408h;

    /* renamed from: i, reason: collision with root package name */
    public static final ee f47409i;

    /* renamed from: j, reason: collision with root package name */
    public static final ee f47410j;

    /* renamed from: k, reason: collision with root package name */
    public static final ee f47411k;

    /* renamed from: l, reason: collision with root package name */
    static final ch f47412l;
    static final ch m;
    private static final List n;
    private static final cl o;
    private final eb p;
    private final String q;
    private final Throwable r;

    static {
        TreeMap treeMap = new TreeMap();
        boolean z = false;
        for (eb ebVar : eb.values()) {
            ee eeVar = (ee) treeMap.put(Integer.valueOf(ebVar.a()), new ee(ebVar, null, null));
            if (eeVar != null) {
                throw new IllegalStateException("Code value duplication between " + eeVar.p.name() + " & " + ebVar.name());
            }
        }
        n = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        f47401a = eb.OK.b();
        f47402b = eb.CANCELLED.b();
        f47403c = eb.UNKNOWN.b();
        eb.INVALID_ARGUMENT.b();
        f47404d = eb.DEADLINE_EXCEEDED.b();
        eb.NOT_FOUND.b();
        eb.ALREADY_EXISTS.b();
        f47405e = eb.PERMISSION_DENIED.b();
        f47406f = eb.UNAUTHENTICATED.b();
        f47407g = eb.RESOURCE_EXHAUSTED.b();
        f47408h = eb.FAILED_PRECONDITION.b();
        eb.ABORTED.b();
        eb.OUT_OF_RANGE.b();
        f47409i = eb.UNIMPLEMENTED.b();
        f47410j = eb.INTERNAL.b();
        f47411k = eb.UNAVAILABLE.b();
        eb.DATA_LOSS.b();
        ec ecVar = new ec();
        int i2 = ch.f46523a;
        f47412l = new ck("grpc-status", z, ecVar);
        ed edVar = new ed();
        o = edVar;
        m = new ck("grpc-message", z, edVar);
    }

    private ee(eb ebVar, String str, Throwable th) {
        com.google.d.b.an.C(ebVar, "code");
        this.p = ebVar;
        this.q = str;
        this.r = th;
    }

    static /* bridge */ /* synthetic */ ee b(byte[] bArr) {
        int i2;
        byte b2;
        int length = bArr.length;
        char c2 = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return f47401a;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b2 = bArr[0]) >= 48 && b2 <= 57) {
                i2 = (b2 - 48) * 10;
                c2 = 1;
            }
            return f47403c.g("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i2 = 0;
        byte b3 = bArr[c2];
        if (b3 >= 48 && b3 <= 57) {
            int i3 = i2 + (b3 - 48);
            List list = n;
            if (i3 < list.size()) {
                return (ee) list.get(i3);
            }
        }
        return f47403c.g("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    public static ee d(int i2) {
        if (i2 >= 0) {
            List list = n;
            if (i2 < list.size()) {
                return (ee) list.get(i2);
            }
        }
        return f47403c.g("Unknown code " + i2);
    }

    public static ee e(Throwable th) {
        com.google.d.b.an.C(th, "t");
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof ef) {
                return ((ef) cause).b();
            }
            if (cause instanceof eh) {
                return ((eh) cause).b();
            }
        }
        return f47403c.f(th);
    }

    static String h(ee eeVar) {
        String str = eeVar.q;
        if (str == null) {
            return eeVar.p.toString();
        }
        return eeVar.p.toString() + ": " + str;
    }

    public final eb a() {
        return this.p;
    }

    public final ee c(String str) {
        String str2 = this.q;
        eb ebVar = this.p;
        if (str2 == null) {
            return new ee(ebVar, str, this.r);
        }
        return new ee(ebVar, str2 + "\n" + str, this.r);
    }

    public final ee f(Throwable th) {
        return Objects.equals(this.r, th) ? this : new ee(this.p, this.q, th);
    }

    public final ee g(String str) {
        return Objects.equals(this.q, str) ? this : new ee(this.p, str, this.r);
    }

    public final String i() {
        return this.q;
    }

    public final Throwable j() {
        return this.r;
    }

    public final boolean l() {
        return eb.OK == this.p;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("code", this.p.name());
        zVarH.d("description", this.q);
        Throwable th = this.r;
        Object string = th;
        if (th != null) {
            int i2 = com.google.d.b.ao.f7220a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        zVarH.d("cause", string);
        return zVarH.toString();
    }
}
