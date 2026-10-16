package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qav implements java.io.Serializable {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/gmm/userevent3/api/UserEvent3Params");

    @java.lang.Deprecated
    public final java.lang.String b;
    public final defpackage.zer c;
    public final boolean d;
    public final defpackage.qau e;
    public final defpackage.abxr f;
    private final defpackage.png g;
    private final java.lang.String h;
    private final boolean i;
    private final java.lang.String j;
    private final defpackage.png k;
    private final defpackage.qam l;
    private final java.lang.String m;
    private final int n;

    static {
        new defpackage.qav();
        new defpackage.qav();
    }

    public qav(defpackage.abxr abxrVar, defpackage.yxg yxgVar, defpackage.qau qauVar) {
        this.g = null;
        this.h = null;
        this.i = false;
        this.b = null;
        this.j = null;
        this.f = abxrVar;
        this.k = new defpackage.png(yxgVar);
        this.n = 0;
        this.c = null;
        this.d = false;
        this.l = null;
        this.e = qauVar;
        this.m = null;
    }

    public static defpackage.qav c(defpackage.abxr abxrVar) {
        return defpackage.rox.ad(defpackage.qau.a(), abxrVar, defpackage.yxg.a.n());
    }

    public static final void d() {
        defpackage.zdk zdkVar = defpackage.zdk.a;
        defpackage.abox.L(defpackage.zdk.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [abpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final defpackage.yxg a() {
        ?? r1;
        defpackage.yxg yxgVar = defpackage.yxg.a;
        defpackage.png pngVar = this.k;
        defpackage.abqe abqeVarL = defpackage.abox.L(defpackage.yxg.class);
        defpackage.yxg yxgVar2 = defpackage.yxg.a;
        defpackage.abpy abpyVar = pngVar.a;
        if (abpyVar != null) {
            r1 = abpyVar;
        } else {
            synchronized (pngVar) {
                try {
                    abpyVar = pngVar.a;
                    if (abpyVar != null) {
                        r1 = abpyVar;
                    } else {
                        byte[] bArr = pngVar.b;
                        bArr.getClass();
                        try {
                            ?? J = abqeVarL.j(bArr, defpackage.abol.a());
                            pngVar.a = J;
                            pngVar.b = null;
                            r1 = J;
                        } catch (defpackage.abpp unused) {
                            r1 = yxgVar2;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return (defpackage.yxg) r1;
    }

    public final boolean b() {
        return (defpackage.ysr.bw(null) && defpackage.ysr.bw(null) && this.f == null) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.qav) {
            defpackage.qav qavVar = (defpackage.qav) obj;
            if (j$.util.Objects.equals(this.f, qavVar.f)) {
                boolean z = qavVar.i;
                int i = qavVar.n;
                boolean z2 = qavVar.d;
                defpackage.zer zerVar = qavVar.c;
                if (j$.util.Objects.equals(null, null)) {
                    java.lang.String str = qavVar.h;
                    if (j$.util.Objects.equals(null, null)) {
                        java.lang.String str2 = qavVar.b;
                        if (j$.util.Objects.equals(null, null)) {
                            java.lang.String str3 = qavVar.j;
                            if (j$.util.Objects.equals(null, null)) {
                                java.lang.String str4 = qavVar.m;
                                if (j$.util.Objects.equals(null, null)) {
                                    defpackage.qam qamVar = qavVar.l;
                                    if (j$.util.Objects.equals(null, null)) {
                                        defpackage.png pngVar = qavVar.g;
                                        if (j$.util.Objects.equals(null, null) && j$.util.Objects.equals(this.e, qavVar.e) && j$.util.Objects.equals(a(), qavVar.a())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        d();
        defpackage.abxr abxrVar = this.f;
        defpackage.yxg yxgVarA = a();
        defpackage.qau qauVar = this.e;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return j$.util.Objects.hash(null, null, bool, null, null, abxrVar, yxgVarA, null, null, bool, null, qauVar, null);
    }

    public final java.lang.String toString() {
        defpackage.yxg yxgVarA = a();
        defpackage.xym xymVar = new defpackage.xym("UserEvent3Params");
        xymVar.c();
        d();
        defpackage.zcf zcfVar = null;
        xymVar.b("uiState", null);
        xymVar.b("dataElement", null);
        xymVar.h("vedHasEi", false);
        xymVar.b("serverEi", null);
        xymVar.b("splitEventDataReference", null);
        defpackage.abxr abxrVar = this.f;
        xymVar.b("visualElement", abxrVar == null ? null : java.lang.Integer.toString(abxrVar.a));
        xymVar.b("prefetchUpgradeType", null);
        xymVar.b("clickFeatureFingerprint", null);
        xymVar.b("clickFeatureFingerprintScrubbed", null);
        xymVar.b("forcedExternalContext", null);
        xymVar.b("impressionParams", this.e);
        xymVar.b("notificationMetadata", null);
        if ((yxgVarA.b & 128) != 0 && (zcfVar = yxgVarA.d) == null) {
            zcfVar = defpackage.zcf.a;
        }
        xymVar.b("bottomSheetParams", zcfVar);
        return xymVar.toString();
    }

    private qav() {
        this(null, defpackage.yxg.a, defpackage.qau.a().a());
    }
}
