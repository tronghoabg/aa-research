package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class hqq {
    public final int a;
    public final byte[] b;
    public final Map c;
    public final List d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public hqq(int i, byte[] bArr, boolean z, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hqn hqnVar = (hqn) it.next();
                treeMap.put(hqnVar.a, hqnVar.b);
            }
        }
        this(i, bArr, treeMap, list, z);
    }

    public hqq(int i, byte[] bArr, Map map, List list, boolean z) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.e = z;
    }
}
