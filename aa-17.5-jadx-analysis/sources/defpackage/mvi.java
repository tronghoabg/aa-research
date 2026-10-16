package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final /* synthetic */ class mvi extends afey implements afeg {
    public static final mvi a = new mvi();

    public mvi() {
        super(2, mvk.class, "findActualPage", "findActualPage(Ljava/lang/String;Ljava/util/List;)I", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        str.getClass();
        list.getClass();
        return Integer.valueOf(mvk.a(str, list));
    }
}
