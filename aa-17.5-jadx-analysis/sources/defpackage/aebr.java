package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class aebr {
    static {
        Logger.getLogger(aebr.class.getName());
    }

    private aebr() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            aecg aecgVar = (aecg) it.next();
            bArr[i] = aecgVar.f.o();
            bArr[i + 1] = aecgVar.g.o();
            i += 2;
        }
        return aeab.b(bArr);
    }
}
