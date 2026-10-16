package defpackage;

/* loaded from: classes.dex */
public final class awg extends cxt<awh> {
    private final afec a;

    public awg(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awh(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        awh awhVar = (awh) cfxVar;
        afec afecVar = awhVar.a;
        afec afecVar2 = this.a;
        if (afecVar != afecVar2) {
            awhVar.a = afecVar2;
            awp awpVar = awhVar.d;
            if (awpVar != null) {
                awhVar.f((awo) awhVar.a.invoke(awpVar));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awg) && this.a == ((awg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
