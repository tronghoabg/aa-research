package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adjw {
    public static final defpackage.adjw a;
    public final defpackage.adks b;
    public final java.util.concurrent.Executor c;
    public final java.lang.String d = null;
    public final java.util.List e;
    public final java.lang.Integer f;
    public final java.lang.Integer g;
    public final defpackage.adrq h;
    private final java.lang.Object[][] i;
    private final java.lang.Boolean j;

    static {
        defpackage.adju adjuVar = new defpackage.adju();
        adjuVar.c = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
        adjuVar.d = java.util.Collections.EMPTY_LIST;
        a = new defpackage.adjw(adjuVar);
    }

    public adjw(defpackage.adju adjuVar) {
        this.b = adjuVar.a;
        this.c = adjuVar.b;
        this.h = adjuVar.h;
        this.i = adjuVar.c;
        this.e = adjuVar.d;
        this.j = adjuVar.e;
        this.f = adjuVar.f;
        this.g = adjuVar.g;
    }

    public static defpackage.adju a(defpackage.adjw adjwVar) {
        defpackage.adju adjuVar = new defpackage.adju();
        adjuVar.a = adjwVar.b;
        adjuVar.b = adjwVar.c;
        adjuVar.h = adjwVar.h;
        adjuVar.c = adjwVar.i;
        adjuVar.d = adjwVar.e;
        adjuVar.e = adjwVar.j;
        adjuVar.f = adjwVar.f;
        adjuVar.g = adjwVar.g;
        return adjuVar;
    }

    public final defpackage.adjw b(defpackage.adks adksVar) {
        defpackage.adju adjuVarA = a(this);
        adjuVarA.a = adksVar;
        return new defpackage.adjw(adjuVarA);
    }

    public final defpackage.adjw c(java.util.concurrent.Executor executor) {
        defpackage.adju adjuVarA = a(this);
        adjuVarA.b = executor;
        return new defpackage.adjw(adjuVarA);
    }

    public final defpackage.adjw d(int i) {
        defpackage.ysr.ba(i >= 0, "invalid maxsize %s", i);
        defpackage.adju adjuVarA = a(this);
        adjuVarA.f = java.lang.Integer.valueOf(i);
        return new defpackage.adjw(adjuVarA);
    }

    public final defpackage.adjw e(int i) {
        defpackage.ysr.ba(i >= 0, "invalid maxsize %s", i);
        defpackage.adju adjuVarA = a(this);
        adjuVarA.g = java.lang.Integer.valueOf(i);
        return new defpackage.adjw(adjuVarA);
    }

    public final defpackage.adjw f(defpackage.adjv adjvVar, java.lang.Object obj) {
        java.lang.Object[][] objArr;
        int length;
        adjvVar.getClass();
        defpackage.adju adjuVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.i;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (adjvVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        adjuVarA.c = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, (i == -1 ? 1 : 0) + length, 2);
        java.lang.System.arraycopy(objArr, 0, adjuVarA.c, 0, length);
        if (i == -1) {
            adjuVarA.c[length] = new java.lang.Object[]{adjvVar, obj};
        } else {
            adjuVarA.c[i] = new java.lang.Object[]{adjvVar, obj};
        }
        return new defpackage.adjw(adjuVarA);
    }

    public final java.lang.Object g(defpackage.adjv adjvVar) {
        adjvVar.getClass();
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = this.i;
            if (i >= objArr.length) {
                return adjvVar.a;
            }
            if (adjvVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean h() {
        return java.lang.Boolean.TRUE.equals(this.j);
    }

    public final defpackage.adjw i(defpackage.adrq adrqVar) {
        java.util.List list = this.e;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(adrqVar);
        defpackage.adju adjuVarA = a(this);
        adjuVarA.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
        return new defpackage.adjw(adjuVarA);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("deadline", this.b);
        xymVarBy.b("authority", null);
        xymVarBy.b("callCredentials", this.h);
        java.util.concurrent.Executor executor = this.c;
        xymVarBy.b("executor", executor != null ? executor.getClass() : null);
        xymVarBy.b("compressorName", null);
        xymVarBy.b("customOptions", java.util.Arrays.deepToString(this.i));
        xymVarBy.h("waitForReady", h());
        xymVarBy.b("maxInboundMessageSize", this.f);
        xymVarBy.b("maxOutboundMessageSize", this.g);
        xymVarBy.b("onReadyThreshold", null);
        xymVarBy.b("streamTracerFactories", this.e);
        return xymVarBy.toString();
    }
}
