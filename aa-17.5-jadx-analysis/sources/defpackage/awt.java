package defpackage;

/* loaded from: classes.dex */
public final class awt extends cxt<awa> {
    private final crw a;

    public awt(crw crwVar) {
        this.a = crwVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new awa(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((awa) cfxVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        awt awtVar = obj instanceof awt ? (awt) obj : null;
        if (awtVar == null) {
            return false;
        }
        return affa.f(this.a, awtVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
