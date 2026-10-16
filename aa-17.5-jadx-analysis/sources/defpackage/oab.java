package defpackage;

/* loaded from: classes2.dex */
public final class oab extends afde implements afeg {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oab(int i, bwq bwqVar, bym bymVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.a = i;
        this.b = bwqVar;
        this.c = bymVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            return new oab(this.a, (bwq) this.b, (bym) this.c, afckVar, 1);
        }
        return new oab((afm) this.b, this.a, (Integer) this.c, afckVar, 0);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.d == 0) {
            woy.dF(obj);
            ((afm) this.b).d(Boolean.valueOf(this.a > 0 || this.c != null));
            return afak.a;
        }
        woy.dF(obj);
        if (roc.ag(this.c).size() <= this.a) {
            ?? r2 = this.b;
            if (((Boolean) r2.a()).booleanValue()) {
                r2.b(false);
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((oab) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((oab) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oab(afm afmVar, int i, Integer num, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.b = afmVar;
        this.a = i;
        this.c = num;
    }
}
