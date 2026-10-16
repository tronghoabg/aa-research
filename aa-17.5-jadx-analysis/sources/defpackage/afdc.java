package defpackage;

/* loaded from: classes.dex */
public abstract class afdc extends afcy {
    public afdc(afck afckVar) {
        super(afckVar);
        if (afckVar != null && afckVar.hH() != afcp.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.afck
    public final afco hH() {
        return afcp.a;
    }
}
