package defpackage;

/* loaded from: classes.dex */
public final class ddg extends cxt<ddi> implements cfw {
    public final boolean a;
    public final afec b;

    public ddg(boolean z, afec afecVar) {
        this.a = z;
        this.b = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ddi(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ddi ddiVar = (ddi) cfxVar;
        ddiVar.a = this.a;
        ddiVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddg)) {
            return false;
        }
        ddg ddgVar = (ddg) obj;
        return this.a == ddgVar.a && this.b == ddgVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }
}
