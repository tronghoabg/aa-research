package defpackage;

/* loaded from: classes2.dex */
public final class iez implements iff {
    private final boolean a;
    private ifa b;

    public iez(boolean z) {
        this.a = z;
    }

    @Override // defpackage.iff
    public final ife a(int i) {
        if (i == 5) {
            return ifc.a;
        }
        ifa ifaVar = this.b;
        if (ifaVar != null) {
            return ifaVar;
        }
        ifa ifaVar2 = new ifa(this.a);
        this.b = ifaVar2;
        return ifaVar2;
    }
}
