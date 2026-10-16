package defpackage;

/* loaded from: classes.dex */
public abstract class afda extends afcy {
    private final afco a;
    public transient afck r;

    public afda(afck afckVar) {
        this(afckVar, afckVar != null ? afckVar.hH() : null);
    }

    @Override // defpackage.afcy
    protected void e() {
        afck afckVar = this.r;
        if (afckVar != null && afckVar != this) {
            afcm afcmVar = hH().get(afcl.k);
            afcmVar.getClass();
            ((afcl) afcmVar).d(afckVar);
        }
        this.r = afcz.a;
    }

    @Override // defpackage.afck
    public afco hH() {
        afco afcoVar = this.a;
        afcoVar.getClass();
        return afcoVar;
    }

    public afda(afck afckVar, afco afcoVar) {
        super(afckVar);
        this.a = afcoVar;
    }
}
