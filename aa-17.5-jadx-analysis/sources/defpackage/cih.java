package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cih implements afev {
    public final /* synthetic */ afec a;

    public cih(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.afev
    public final aezn eV() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cih) && (obj instanceof afev)) {
            return affa.f(this.a, ((afev) obj).eV());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
