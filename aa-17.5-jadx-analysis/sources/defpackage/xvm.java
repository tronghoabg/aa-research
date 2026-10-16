package defpackage;

import j$.util.Objects;

/* loaded from: classes3.dex */
public class xvm extends xvs {
    private static final long serialVersionUID = -1522852442442473691L;
    protected final String a;
    private final String h;
    private final boolean i;

    static {
        int i = xvl.a;
    }

    protected xvm() {
        super(null, xvs.c, xvs.b);
        this.a = null;
        this.h = "googleapis.com";
        this.i = false;
    }

    protected xxg b() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.c();
        xxgVarAo.b("quotaProjectId", null);
        xxgVarAo.b("universeDomain", this.h);
        xxgVarAo.h("isExplicitUniverseDomain", false);
        return xxgVarAo;
    }

    @Override // defpackage.xvs
    public boolean equals(Object obj) {
        if (!(obj instanceof xvm)) {
            return false;
        }
        xvm xvmVar = (xvm) obj;
        String str = xvmVar.a;
        if (Objects.equals(null, null) && Objects.equals(this.h, xvmVar.h)) {
            boolean z = xvmVar.i;
            if (Objects.equals(false, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xvs
    public int hashCode() {
        return Objects.hash(null, this.h, false);
    }

    @Override // defpackage.xvs
    public final String toString() {
        return b().toString();
    }
}
