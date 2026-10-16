package defpackage;

/* loaded from: classes.dex */
public final class avi extends cxt<avj> {
    private final afec a;

    public avi(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avj(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        avj avjVar = (avj) cfxVar;
        afec afecVar = avjVar.a;
        afec afecVar2 = this.a;
        if (afecVar != afecVar2 || !avjVar.b) {
            bzi.q(avjVar).W(false);
        }
        avjVar.a = afecVar2;
        avjVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        avi aviVar = obj instanceof avi ? (avi) obj : null;
        return aviVar != null && this.a == aviVar.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
