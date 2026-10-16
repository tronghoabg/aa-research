package defpackage;

/* loaded from: classes2.dex */
public final class eyq extends afde implements afeh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyq(bqj bqjVar, afck afckVar, int i) {
        super(3, afckVar);
        this.b = i;
        this.a = bqjVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.b != 0) {
            woy.dF(obj);
            ((bqj) this.a).g.invoke();
            return afak.a;
        }
        woy.dF(obj);
        ((eys) this.a).e.decrementAndGet();
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.b != 0) {
            ((Number) obj2).floatValue();
            return new eyq((bqj) this.a, (afck) obj3, 1).hT(afak.a);
        }
        return new eyq((eys) this.a, (afck) obj3, 0).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyq(eys eysVar, afck afckVar, int i) {
        super(3, afckVar);
        this.b = i;
        this.a = eysVar;
    }
}
