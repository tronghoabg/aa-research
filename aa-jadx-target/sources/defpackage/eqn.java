package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class eqn extends defpackage.eqo implements defpackage.eqe {
    final defpackage.eqg a;
    final /* synthetic */ defpackage.eqp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqn(defpackage.eqp eqpVar, defpackage.eqg eqgVar, defpackage.eqt eqtVar) {
        super(eqpVar, eqtVar);
        this.b = eqpVar;
        this.a = eqgVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        defpackage.eqg eqgVar2 = this.a;
        defpackage.epx epxVarA = eqgVar2.getLifecycle().a();
        if (epxVarA == defpackage.epx.a) {
            this.b.k(this.c);
            return;
        }
        defpackage.epx epxVar = null;
        while (epxVar != epxVarA) {
            d(dZ());
            epxVar = epxVarA;
            epxVarA = eqgVar2.getLifecycle().a();
        }
    }

    @Override // defpackage.eqo
    public final void b() {
        this.a.getLifecycle().d(this);
    }

    @Override // defpackage.eqo
    public final boolean c(defpackage.eqg eqgVar) {
        return this.a == eqgVar;
    }

    @Override // defpackage.eqo
    public final boolean dZ() {
        return this.a.getLifecycle().a().a(defpackage.epx.d);
    }
}
