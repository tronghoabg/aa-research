package defpackage;

/* loaded from: classes3.dex */
final class aivy extends aivk {
    private final aitg a;

    public aivy(aitg aitgVar) {
        this.a = aitgVar;
    }

    @Override // defpackage.aivk
    public final void b(Throwable th) {
        Object objHN = f().hN();
        boolean z = aitz.a;
        boolean z2 = objHN instanceof aito;
        aitg aitgVar = this.a;
        if (z2) {
            aitgVar.w(woy.dE(((aito) objHN).b));
        } else {
            aitgVar.w(aivp.b(objHN));
        }
    }

    @Override // defpackage.aivk
    public final boolean c() {
        return false;
    }
}
