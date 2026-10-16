package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class tdn {
    public final int a;
    public final tdo b = new tdo(false, new String[0]);
    public final List c;
    public final tdl d;

    public tdn(Map map) {
        this.a = map.size();
        int i = 0;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            tdk tdkVar = (tdk) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() > 1) {
                woy.bs(list, new azl(10));
            }
            arrayList.add(new tdj(tdkVar, list));
        }
        this.c = arrayList;
        int i2 = this.b.a + 12;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i += ((tdj) it.next()).e;
        }
        this.d = new tdl((short) 2, (short) 12, i2 + i);
    }
}
