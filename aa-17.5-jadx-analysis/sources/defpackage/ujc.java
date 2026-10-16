package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ujc {
    public static final byte[] a = new byte[0];

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static void a(Object obj, yfh yfhVar, Map map) {
        if (yfhVar != null) {
            ?? r2 = yfhVar.a;
            if (r2.isEmpty()) {
                return;
            }
            tzy tzyVar = (tzy) r2.get(0);
            List arrayList = (List) map.get(tzyVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(tzyVar, arrayList);
            }
            arrayList.add(obj);
        }
    }
}
