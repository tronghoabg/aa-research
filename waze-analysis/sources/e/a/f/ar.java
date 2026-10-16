package e.a.f;

import e.a.bc;
import e.a.cm;
import e.a.d.jz;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar {
    static {
        Logger.getLogger(ar.class.getName());
    }

    private ar() {
    }

    public static cm a(List list) {
        return bc.c(c(list));
    }

    public static cm b(List list) {
        return bc.c(c(list));
    }

    private static byte[][] c(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            e.a.f.a.a.e eVar = (e.a.f.a.a.e) it.next();
            bArr[i2] = eVar.f47495f.s();
            bArr[i2 + 1] = eVar.f47496g.s();
            i2 += 2;
        }
        return jz.b(bArr);
    }
}
