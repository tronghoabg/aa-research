package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class qak extends qaj {
    private final pzw a;
    private final zce b;
    private final String c;
    private final String d;
    private final ywg e;
    private final ywb f;
    private final zdl g;
    private final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qak(pzw pzwVar, sm smVar, ywg ywgVar, ywb ywbVar) {
        super(null);
        Duration.ofMillis(((Duration) smVar.a).toMillis());
        this.a = pzwVar;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = ywgVar;
        this.g = null;
        this.h = false;
        this.f = ywbVar;
    }

    public final synchronized boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof qak)) {
            return false;
        }
        qak qakVar = (qak) obj;
        synchronized (qakVar) {
            if (Objects.equals(this.a, qakVar.a)) {
                zce zceVar = qakVar.b;
                if (Objects.equals(null, null)) {
                    String str = qakVar.c;
                    if (Objects.equals(null, null)) {
                        String str2 = qakVar.d;
                        if (Objects.equals(null, null)) {
                            qakVar.n();
                            if (Objects.equals(null, null) && Objects.equals(this.e, qakVar.e)) {
                                zdl zdlVar = qakVar.g;
                                if (Objects.equals(null, null)) {
                                    boolean z2 = qakVar.h;
                                    if (Objects.equals(this.f, qakVar.f)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // defpackage.qaj
    public final boolean f() {
        ywg ywgVar = this.e;
        return ywgVar == yvi.sA || ywgVar == yvi.sz;
    }

    public final synchronized int hashCode() {
        return Objects.hash(this.a, null, null, null, this.e, null, false, this.f, null);
    }

    @Override // defpackage.qaj
    public final void l(List list) {
        m(list);
    }

    public final synchronized void n() {
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.c();
        xxgVarAo.b("action", this.a);
        xxgVarAo.b("uiState", null);
        xxgVarAo.b("contentEi", null);
        xxgVarAo.b("contentVed", null);
        xxgVarAo.b("dataReference", null);
        xxgVarAo.b("clientLeafVe", this.e);
        xxgVarAo.b("featureFprint", null);
        xxgVarAo.b("isFeatureFprintScrubbed", null);
        return xxgVarAo.toString();
    }
}
