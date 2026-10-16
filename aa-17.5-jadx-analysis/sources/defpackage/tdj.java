package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class tdj {
    public final tdk a;
    public final tdo b;
    public final tdo c;
    public final tdp d;
    public final int e;
    public final tdl f;

    public tdj(tdk tdkVar, List list) {
        tdkVar.getClass();
        list.getClass();
        this.a = tdkVar;
        this.b = new tdo(false, "?1", "?2", "?3", "?4", "?5", "color");
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tdi) it.next()).a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        tdo tdoVar = new tdo(true, (String[]) Arrays.copyOf(strArr, strArr.length));
        this.c = tdoVar;
        tdp tdpVar = new tdp(list);
        this.d = tdpVar;
        int i = this.b.a + 288 + tdoVar.a + tdpVar.c;
        this.e = i;
        this.f = new tdl((short) 512, (short) 288, i);
    }
}
