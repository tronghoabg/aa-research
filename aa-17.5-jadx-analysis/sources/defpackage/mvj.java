package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
final class mvj extends afde implements afeg {
    final /* synthetic */ bbt a;
    final /* synthetic */ int b;
    final /* synthetic */ opr c;
    final /* synthetic */ int d;
    final /* synthetic */ bwq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvj(bbt bbtVar, int i, opr oprVar, int i2, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.a = bbtVar;
        this.b = i;
        this.c = oprVar;
        this.d = i2;
        this.e = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new mvj(this.a, this.b, this.c, this.d, this.e, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        bwq bwqVar = this.e;
        if (!mvk.b(bwqVar).isEmpty()) {
            oqb oqbVar = (oqb) woy.bI(mvk.b(bwqVar), mcd.n(this.a.o(), this.b));
            String num = oqbVar != null ? new Integer(oqbVar.a) : "choose_widget";
            opr oprVar = this.c;
            int i = this.d;
            String string = num.toString();
            string.getClass();
            SharedPreferences.Editor editorEdit = oprVar.a().edit();
            editorEdit.getClass();
            editorEdit.putString("last_widget_col_" + i, string);
            editorEdit.apply();
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mvj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
