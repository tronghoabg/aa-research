package r9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class r implements InterfaceC3945b {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f44656a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f44657b = new HashMap();

    @Override // r9.InterfaceC3945b
    public final HashMap a(int i5, int i10, String str) {
        int i11;
        TreeMap treeMap = new TreeMap();
        for (t9.d dVar : this.f44656a.values()) {
            if (dVar.f45946b.f45951a.f45375a.g(r3.f45369a.size() - 2).equals(str) && (i11 = dVar.f45945a) > i5) {
                Map map = (Map) treeMap.get(Integer.valueOf(i11));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(i11), map);
                }
                map.put(dVar.f45946b.f45951a, dVar);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i10) {
                break;
            }
        }
        return map2;
    }

    @Override // r9.InterfaceC3945b
    public final HashMap d(TreeSet treeSet) {
        HashMap map = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            t9.d dVar = (t9.d) this.f44656a.get(hVar);
            if (dVar != null) {
                map.put(hVar, dVar);
            }
        }
        return map;
    }

    @Override // r9.InterfaceC3945b
    public final t9.d e(s9.h hVar) {
        return (t9.d) this.f44656a.get(hVar);
    }

    @Override // r9.InterfaceC3945b
    public final void f(int i5) {
        HashMap map = this.f44657b;
        if (map.containsKey(Integer.valueOf(i5))) {
            Set set = (Set) map.get(Integer.valueOf(i5));
            map.remove(Integer.valueOf(i5));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f44656a.remove((s9.h) it.next());
            }
        }
    }

    @Override // r9.InterfaceC3945b
    public final void g(int i5, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            t9.h hVar = (t9.h) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (hVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            TreeMap treeMap = this.f44656a;
            s9.h hVar2 = hVar.f45951a;
            t9.d dVar = (t9.d) treeMap.get(hVar2);
            HashMap map2 = this.f44657b;
            if (dVar != null) {
                ((Set) map2.get(Integer.valueOf(dVar.f45945a))).remove(hVar2);
            }
            treeMap.put(hVar2, new t9.d(i5, hVar));
            if (map2.get(Integer.valueOf(i5)) == null) {
                map2.put(Integer.valueOf(i5), new HashSet());
            }
            ((Set) map2.get(Integer.valueOf(i5))).add(hVar2);
        }
    }

    @Override // r9.InterfaceC3945b
    public final HashMap h(s9.m mVar, int i5) {
        HashMap map = new HashMap();
        int size = mVar.f45369a.size() + 1;
        for (t9.d dVar : this.f44656a.tailMap(new s9.h((s9.m) mVar.a(""))).values()) {
            s9.h hVar = dVar.f45946b.f45951a;
            if (!mVar.i(hVar.f45375a)) {
                break;
            }
            if (hVar.f45375a.f45369a.size() == size && dVar.f45945a > i5) {
                map.put(dVar.f45946b.f45951a, dVar);
            }
        }
        return map;
    }
}
