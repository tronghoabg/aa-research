package defpackage;

import androidx.car.app.model.CarIcon;

/* loaded from: classes2.dex */
final class gqa extends afde implements afei {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gqb d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqa(gqb gqbVar, int i, afck afckVar) {
        super(4, afckVar);
        this.d = gqbVar;
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ?? r4 = this.a;
        ?? r0 = this.b;
        Object obj2 = this.c;
        boolean z = true;
        if (r4.length() <= 0 && r0.length() <= 0 && obj2 == null) {
            z = false;
        }
        int i = this.e;
        if (i != 7) {
            if (!z) {
                return gbk.a;
            }
            if (i == 3) {
                return gbk.c;
            }
        }
        return gbk.b;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        gqa gqaVar = new gqa(this.d, this.e, (afck) obj4);
        gqaVar.a = (CharSequence) obj;
        gqaVar.b = (CharSequence) obj2;
        gqaVar.c = (CarIcon) obj3;
        return gqaVar.hT(afak.a);
    }
}
