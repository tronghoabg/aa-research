package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final /* synthetic */ class muy extends afey implements afeg {
    public static final muy a = new muy();

    public muy() {
        super(2, mva.class, "findActualPage", "findActualPage(Ljava/lang/String;Ljava/util/List;)I", 1);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        str.getClass();
        list.getClass();
        int i = 0;
        if (!affa.f(str, "dashboard")) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (affa.f(String.valueOf(((oqb) it.next()).a), str)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                i = i2 + 1;
            }
        }
        return Integer.valueOf(i);
    }
}
