package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class xrt {
    public final Integer d;
    public final int[] e;

    public xrt(Integer num, int[] iArr) {
        this.d = num;
        this.e = iArr;
    }

    public abstract aacq e();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map j() {
        aacq aacqVarE = e();
        ?? r0 = aacqVarE.a;
        List listCc = woy.cc(r0.entrySet(), new tui(12));
        ArrayList arrayList = new ArrayList();
        Iterator it = listCc.iterator();
        while (it.hasNext()) {
            List listA = ((xrf) ((Map.Entry) it.next()).getValue()).a();
            ArrayList arrayList2 = new ArrayList(woy.bp(listA, 10));
            Iterator it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((xrj) it2.next()).d);
            }
            woy.cq(arrayList, arrayList2);
        }
        List listCf = woy.cf(arrayList);
        Object obj = aacqVarE.b;
        if (obj != null) {
            listCf = woy.bY(woy.bg(obj), listCf);
        }
        ArrayList arrayList3 = new ArrayList(woy.bp(listCf, 10));
        Iterator it3 = listCf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((xqq) it3.next()).a());
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listCf.iterator();
        while (it4.hasNext()) {
            Map mapA = ((xqq) it4.next()).a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (!affa.f(((Map) obj2).get(entry.getKey()), entry.getValue())) {
                        arrayList5.add(obj2);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            woy.cq(arrayList4, linkedHashMap.keySet());
        }
        Set setCl = woy.cl(arrayList4);
        ArrayList arrayList6 = new ArrayList(r0.size());
        for (Map.Entry entry2 : r0.entrySet()) {
            Object key = entry2.getKey();
            xrf xrfVar = (xrf) entry2.getValue();
            wpq wpqVar = xrfVar.b;
            xrfVar.b = null;
            xrfVar.getClass();
            nje njeVar = new nje(xrfVar, setCl, 20);
            xrf xrfVar2 = new xrf(null);
            njeVar.invoke(xrfVar2);
            arrayList6.add(new aezu(key, new xrd(xrfVar2.c, xrfVar2.a)));
        }
        return woy.bc(arrayList6);
    }
}
