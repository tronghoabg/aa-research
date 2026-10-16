package defpackage;

/* loaded from: classes.dex */
final class amp extends afde implements afeh {
    int a;
    final /* synthetic */ amq b;
    final /* synthetic */ affs c;
    final /* synthetic */ float d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amp(amq amqVar, affs affsVar, float f, afck afckVar) {
        super(3, afckVar);
        this.b = amqVar;
        this.c = affsVar;
        this.d = f;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        affs affsVar;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            affsVar = (affs) this.e;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            amu amuVar = (amu) this.e;
            amq amqVar = this.b;
            aqh aqhVar = new aqh(amqVar, amuVar, 1);
            aom aomVar = amqVar.c;
            if (aomVar == null) {
                affa.d("resolvedFlingBehavior");
                aomVar = null;
            }
            affs affsVar2 = this.c;
            float f = this.d;
            this.e = affsVar2;
            this.a = 1;
            obj = aomVar.a(aqhVar, f, this);
            if (obj == afcrVar) {
                return afcrVar;
            }
            affsVar = affsVar2;
        }
        affsVar.a = ((Number) obj).floatValue();
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        amp ampVar = new amp(this.b, this.c, this.d, (afck) obj3);
        ampVar.e = (amu) obj;
        return ampVar.hT(afak.a);
    }
}
