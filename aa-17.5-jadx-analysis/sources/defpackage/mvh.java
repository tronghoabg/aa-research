package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final /* synthetic */ class mvh extends afey implements afeg {
    public static final mvh a = new mvh();

    public mvh() {
        super(2, mvk.class, "getItemKey", "getItemKey(ILjava/util/List;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String strValueOf;
        int iIntValue = ((Number) obj).intValue();
        List list = (List) obj2;
        list.getClass();
        yph yphVar = mvk.a;
        oqb oqbVar = (oqb) woy.bI(list, iIntValue);
        return (oqbVar == null || (strValueOf = String.valueOf(oqbVar.a)) == null) ? "choose_widget" : strValueOf;
    }
}
