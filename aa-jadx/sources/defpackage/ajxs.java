package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajxs extends defpackage.ajxw implements defpackage.ajqc {
    private final defpackage.ajqb f;
    private boolean g;

    public ajxs(defpackage.ajqc ajqcVar) throws defpackage.ajqs {
        super(ajqcVar);
        defpackage.ajqb ajqbVarA = ajqcVar.a();
        this.f = ajqbVarA != null ? new defpackage.ajxr(this, ajqbVarA) : null;
        this.g = false;
    }

    @Override // defpackage.ajqc
    public final defpackage.ajqb a() {
        return this.f;
    }

    @Override // defpackage.ajqc
    public final boolean b() {
        defpackage.ajpy ajpyVarHi = hi("Expect");
        return ajpyVarHi != null && "100-continue".equalsIgnoreCase(ajpyVarHi.c());
    }

    @Override // defpackage.ajxw
    public final boolean q() {
        defpackage.ajqb ajqbVar = this.f;
        return ajqbVar == null || ajqbVar.h() || !this.g;
    }
}
