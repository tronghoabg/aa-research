package com.waze.location.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af implements m {

    /* renamed from: a, reason: collision with root package name */
    private final long f25186a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25187b;

    public af(long j2, int i2) {
        this.f25187b = i2;
        this.f25186a = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.location.a.m
    public final l a(Map map, long j2) {
        Object next;
        if (this.f25187b != 0) {
            h.g.b.x.f(map, "data");
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c cVar = (c) next;
                long jA = cVar.a() - cVar.b();
                long j3 = this.f25186a;
                boolean z = false;
                if (cVar.c().hasSpeed() && cVar.c().getSpeed() != 0.0f) {
                    z = true;
                }
                if (jA > j3 && z) {
                    break;
                }
            }
            c cVar2 = (c) next;
            return cVar2 != null ? new j(cVar2.a() - cVar2.b(), map) : null;
        }
        h.g.b.x.f(map, "data");
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(Long.valueOf(((c) entry.getValue()).c().getTime() + (j2 - ((c) entry.getValue()).a())));
            }
            ArrayList arrayList2 = arrayList;
            h.g.b.x.f(arrayList2, "<this>");
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Comparable comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            long jLongValue = ((Number) comparable).longValue();
            h.g.b.x.f(arrayList2, "<this>");
            Iterator it3 = arrayList2.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            Comparable comparable3 = (Comparable) it3.next();
            while (it3.hasNext()) {
                Comparable comparable4 = (Comparable) it3.next();
                if (comparable3.compareTo(comparable4) > 0) {
                    comparable3 = comparable4;
                }
            }
            long jLongValue2 = jLongValue - ((Number) comparable3).longValue();
            if (jLongValue2 > this.f25186a) {
                return new k(jLongValue2, map);
            }
        }
        return null;
    }

    public final String toString() {
        int i2 = this.f25187b;
        long j2 = this.f25186a;
        if (i2 != 0) {
            return "StaleLocationDetector(staleLocationThresholdMs=" + j2 + ")";
        }
        return "TimeInconsistencyDetector(maxTimeDiffMs=" + j2 + ")";
    }
}
