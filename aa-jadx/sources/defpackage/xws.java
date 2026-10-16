package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xws extends defpackage.xwy {
    private static final long serialVersionUID = -1522852442442473691L;
    protected final java.lang.String a;
    private final java.lang.String h;
    private final boolean i;

    static {
        int i = defpackage.xwr.a;
    }

    protected xws() {
        super(null, defpackage.xwy.c, defpackage.xwy.b);
        this.a = null;
        this.h = "googleapis.com";
        this.i = false;
    }

    protected defpackage.xym b() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.c();
        xymVarBy.b("quotaProjectId", null);
        xymVarBy.b("universeDomain", this.h);
        xymVarBy.h("isExplicitUniverseDomain", false);
        return xymVarBy;
    }

    @Override // defpackage.xwy
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xws)) {
            return false;
        }
        defpackage.xws xwsVar = (defpackage.xws) obj;
        java.lang.String str = xwsVar.a;
        if (j$.util.Objects.equals(null, null) && j$.util.Objects.equals(this.h, xwsVar.h)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            boolean z = xwsVar.i;
            if (j$.util.Objects.equals(bool, bool)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xwy
    public int hashCode() {
        return j$.util.Objects.hash(null, this.h, java.lang.Boolean.FALSE);
    }

    @Override // defpackage.xwy
    public final java.lang.String toString() {
        return b().toString();
    }
}
