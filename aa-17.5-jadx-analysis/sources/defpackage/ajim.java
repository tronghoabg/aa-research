package defpackage;

/* loaded from: classes3.dex */
public final class ajim extends ajin {
    public final afhe a;
    public final Object b;
    public final ajin c;

    public ajim(afhe afheVar, Object obj, ajin ajinVar) {
        this.a = afheVar;
        this.b = obj;
        this.c = ajinVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajin
    public final ajin a(afhe afheVar, Object obj) {
        afhe afheVar2 = this.a;
        boolean zF = affa.f(afheVar, afheVar2);
        ajin ajinVar = this.c;
        ajim ajimVar = ajinVar;
        if (zF) {
            this = ajimVar;
        } else {
            ajin ajinVarA = ajinVar.a(afheVar, null);
            if (ajinVarA != ajinVar) {
                ajimVar = new ajim(afheVar2, this.b, ajinVarA);
                this = ajimVar;
            }
        }
        return obj != null ? new ajim(afheVar, obj, this) : this;
    }

    public final String toString() {
        return woy.cu(woy.ca(afrg.j(afrg.f(this, new airt(5)))), null, "{", "}", new airt(6), 25);
    }
}
