package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class qaa implements Serializable {
    public static final yob a = yob.c("com/google/android/apps/gmm/userevent3/api/UserEvent3Params");

    @Deprecated
    public final String b;
    public final zdl c;
    public final boolean d;
    public final pzz e;
    public final abwo f;
    private final pmk g;
    private final String h;
    private final boolean i;
    private final String j;
    private final pmk k;
    private final pzr l;
    private final String m;
    private final int n;

    static {
        new qaa();
        new qaa();
    }

    public qaa(abwo abwoVar, ywb ywbVar, pzz pzzVar) {
        this.g = null;
        this.h = null;
        this.i = false;
        this.b = null;
        this.j = null;
        this.f = abwoVar;
        this.k = new pmk(ywbVar);
        this.n = 0;
        this.c = null;
        this.d = false;
        this.l = null;
        this.e = pzzVar;
        this.m = null;
    }

    public static qaa c(abwo abwoVar) {
        return lxr.H(pzz.a(), abwoVar, ywb.a.n());
    }

    public static final void d() throws ClassNotFoundException {
        zce zceVar = zce.a;
        abnv.L(zce.class);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [abow, java.lang.Object] */
    public final ywb a() throws ClassNotFoundException {
        ywb ywbVar = ywb.a;
        pmk pmkVar = this.k;
        abpc abpcVarL = abnv.L(ywb.class);
        abox aboxVar = ywb.a;
        abox aboxVar2 = pmkVar.a;
        if (aboxVar2 != null) {
            aboxVar = aboxVar2;
        } else {
            synchronized (pmkVar) {
                aboxVar2 = pmkVar.a;
                if (aboxVar2 != null) {
                    aboxVar = aboxVar2;
                } else {
                    byte[] bArr = pmkVar.b;
                    bArr.getClass();
                    try {
                        ?? J = abpcVarL.j(bArr, abnj.a());
                        pmkVar.a = J;
                        pmkVar.b = null;
                        aboxVar = J;
                    } catch (abon unused) {
                    }
                }
            }
        }
        return (ywb) aboxVar;
    }

    public final boolean b() {
        return (woy.am(null) && woy.am(null) && this.f == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qaa) {
            qaa qaaVar = (qaa) obj;
            if (Objects.equals(this.f, qaaVar.f)) {
                boolean z = qaaVar.i;
                int i = qaaVar.n;
                boolean z2 = qaaVar.d;
                zdl zdlVar = qaaVar.c;
                if (Objects.equals(null, null)) {
                    String str = qaaVar.h;
                    if (Objects.equals(null, null)) {
                        String str2 = qaaVar.b;
                        if (Objects.equals(null, null)) {
                            String str3 = qaaVar.j;
                            if (Objects.equals(null, null)) {
                                String str4 = qaaVar.m;
                                if (Objects.equals(null, null)) {
                                    pzr pzrVar = qaaVar.l;
                                    if (Objects.equals(null, null)) {
                                        pmk pmkVar = qaaVar.g;
                                        if (Objects.equals(null, null) && Objects.equals(this.e, qaaVar.e) && Objects.equals(a(), qaaVar.a())) {
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

    public final int hashCode() throws ClassNotFoundException {
        d();
        return Objects.hash(null, null, false, null, null, this.f, a(), null, null, false, null, this.e, null);
    }

    public final String toString() throws ClassNotFoundException {
        ywb ywbVarA = a();
        xxg xxgVar = new xxg("UserEvent3Params");
        xxgVar.c();
        d();
        zaz zazVar = null;
        xxgVar.b("uiState", null);
        xxgVar.b("dataElement", null);
        xxgVar.h("vedHasEi", false);
        xxgVar.b("serverEi", null);
        xxgVar.b("splitEventDataReference", null);
        abwo abwoVar = this.f;
        xxgVar.b("visualElement", abwoVar == null ? null : Integer.toString(abwoVar.a));
        xxgVar.b("prefetchUpgradeType", null);
        xxgVar.b("clickFeatureFingerprint", null);
        xxgVar.b("clickFeatureFingerprintScrubbed", null);
        xxgVar.b("forcedExternalContext", null);
        xxgVar.b("impressionParams", this.e);
        xxgVar.b("notificationMetadata", null);
        if ((ywbVarA.b & 128) != 0 && (zazVar = ywbVarA.d) == null) {
            zazVar = zaz.a;
        }
        xxgVar.b("bottomSheetParams", zazVar);
        return xxgVar.toString();
    }

    private qaa() {
        this(null, ywb.a, pzz.a().a());
    }
}
