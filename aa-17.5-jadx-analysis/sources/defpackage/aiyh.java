package defpackage;

/* loaded from: classes2.dex */
public class aiyh extends ajal {
    private final afeg d;

    public aiyh(afeg afegVar, afco afcoVar, int i, int i2) {
        super(afcoVar, i, i2);
        this.d = afegVar;
    }

    static /* synthetic */ Object g(aiyh aiyhVar, aixv aixvVar, afck afckVar) {
        Object objInvoke = aiyhVar.d.invoke(aixvVar, afckVar);
        return objInvoke == afcr.a ? objInvoke : afak.a;
    }

    @Override // defpackage.ajal
    public Object b(aixv aixvVar, afck afckVar) {
        return g(this, aixvVar, afckVar);
    }

    @Override // defpackage.ajal
    protected ajal c(afco afcoVar, int i, int i2) {
        return new aiyh(this.d, afcoVar, i, i2);
    }

    @Override // defpackage.ajal
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
