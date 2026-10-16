package defpackage;

/* loaded from: classes.dex */
final class crr extends cfx implements crq {
    public afec a;

    public crr(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.crq
    public final boolean c(crs crsVar) {
        afec afecVar = this.a;
        if (afecVar != null) {
            return ((Boolean) afecVar.invoke(crsVar)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.crq
    public final void f() {
    }
}
