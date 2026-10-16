package defpackage;

/* loaded from: classes.dex */
public final class acx implements abh {
    public final Object a;
    public final Object b;
    private final /* synthetic */ abh c;

    public acx(abh abhVar, Object obj, Object obj2) {
        this.c = abhVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.abh
    public final acp a(aew aewVar, afec afecVar) {
        return this.c.a(aewVar, afecVar);
    }

    @Override // defpackage.abh
    public final acq b(aew aewVar, afec afecVar) {
        return this.c.b(aewVar, afecVar);
    }

    @Override // defpackage.abh
    public final void c(aby abyVar, adi adiVar) {
        abyVar.d = adiVar;
    }

    @Override // defpackage.agc
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.agc
    public final Object g() {
        return this.b;
    }

    @Override // defpackage.agc
    public final boolean h(Object obj, Object obj2) {
        return afp.s(this.c, obj, obj2);
    }
}
