package com.bumptech.glide.g;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final Map f2910a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f2911b;

    /* renamed from: c, reason: collision with root package name */
    private long f2912c;

    public m(long j2) {
        this.f2911b = j2;
    }

    protected int a(Object obj) {
        return 1;
    }

    protected void c(Object obj, Object obj2) {
    }

    public final void g() {
        l(0L);
    }

    public final synchronized long h() {
        return this.f2911b;
    }

    public final synchronized Object i(Object obj) {
        l lVar = (l) this.f2910a.get(obj);
        if (lVar == null) {
            return null;
        }
        return lVar.f2908a;
    }

    public final synchronized Object j(Object obj, Object obj2) {
        int iA = a(obj2);
        long j2 = iA;
        long j3 = this.f2911b;
        if (j2 >= j3) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f2912c += j2;
        }
        l lVar = (l) this.f2910a.put(obj, obj2 == null ? null : new l(obj2, iA));
        if (lVar != null) {
            this.f2912c -= lVar.f2909b;
            Object obj3 = lVar.f2908a;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        l(j3);
        if (lVar != null) {
            return lVar.f2908a;
        }
        return null;
    }

    public final synchronized Object k(Object obj) {
        l lVar = (l) this.f2910a.remove(obj);
        if (lVar == null) {
            return null;
        }
        this.f2912c -= lVar.f2909b;
        return lVar.f2908a;
    }

    protected final synchronized void l(long j2) {
        while (this.f2912c > j2) {
            Iterator it = this.f2910a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            l lVar = (l) entry.getValue();
            this.f2912c -= lVar.f2909b;
            Object key = entry.getKey();
            it.remove();
            c(key, lVar.f2908a);
        }
    }
}
