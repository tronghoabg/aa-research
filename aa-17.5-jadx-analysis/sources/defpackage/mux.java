package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final /* synthetic */ class mux extends afey implements afeg {
    public static final mux a = new mux();

    public mux() {
        super(2, mva.class, "getItemKey", "getItemKey(ILjava/util/List;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        oqb oqbVar;
        String strValueOf;
        int iIntValue = ((Number) obj).intValue();
        List list = (List) obj2;
        list.getClass();
        return (iIntValue == 0 || (oqbVar = (oqb) woy.bI(list, iIntValue + (-1))) == null || (strValueOf = String.valueOf(oqbVar.a)) == null) ? "dashboard" : strValueOf;
    }
}
