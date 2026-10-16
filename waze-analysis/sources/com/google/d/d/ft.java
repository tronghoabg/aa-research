package com.google.d.d;

import java.lang.Comparable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ft<K extends Comparable, V> {

    /* renamed from: a, reason: collision with root package name */
    private final NavigableMap f7628a = new TreeMap();

    private ft() {
    }

    public static ft a() {
        return new ft();
    }

    private final void f(ay ayVar, ay ayVar2, Object obj) {
        this.f7628a.put(ayVar, new fs(ayVar, ayVar2, obj));
    }

    public final Map.Entry b(Comparable comparable) {
        Map.Entry entryFloorEntry = this.f7628a.floorEntry(new ax(comparable));
        if (entryFloorEntry == null || !((er) ((fs) entryFloorEntry.getValue()).getKey()).apply(comparable)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    public final Map c() {
        return new fr(this, this.f7628a.values());
    }

    public final void e(er erVar, Object obj) {
        if (erVar.i()) {
            return;
        }
        com.google.d.b.an.B(obj);
        if (!erVar.i()) {
            NavigableMap navigableMap = this.f7628a;
            ay ayVar = erVar.f7580a;
            Map.Entry entryLowerEntry = navigableMap.lowerEntry(ayVar);
            if (entryLowerEntry != null) {
                fs fsVar = (fs) entryLowerEntry.getValue();
                if (fsVar.a().compareTo(ayVar) > 0) {
                    ay ayVarA = fsVar.a();
                    ay ayVar2 = erVar.f7581b;
                    if (ayVarA.compareTo(ayVar2) > 0) {
                        f(ayVar2, fsVar.a(), ((fs) entryLowerEntry.getValue()).getValue());
                    }
                    f(((er) fsVar.getKey()).f7580a, ayVar, ((fs) entryLowerEntry.getValue()).getValue());
                }
            }
            ay ayVar3 = erVar.f7581b;
            Map.Entry entryLowerEntry2 = navigableMap.lowerEntry(ayVar3);
            if (entryLowerEntry2 != null) {
                fs fsVar2 = (fs) entryLowerEntry2.getValue();
                if (fsVar2.a().compareTo(ayVar3) > 0) {
                    f(ayVar3, fsVar2.a(), ((fs) entryLowerEntry2.getValue()).getValue());
                }
            }
            navigableMap.subMap(ayVar, ayVar3).clear();
        }
        this.f7628a.put(erVar.f7580a, new fs(erVar, obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ft) {
            return c().equals(((ft) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return this.f7628a.values().toString();
    }
}
