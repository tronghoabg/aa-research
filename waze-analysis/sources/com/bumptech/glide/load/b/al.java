package com.bumptech.glide.load.b;

import androidx.core.util.Pools;
import com.google.android.gms.common.api.internal.be;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private static final ad f3220a = new ak();

    /* renamed from: b, reason: collision with root package name */
    private final List f3221b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Set f3222c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Pools.Pool f3223d;

    public al(Pools.Pool pool) {
        this.f3223d = pool;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.b.ae, java.lang.Object] */
    private final ad e(be beVar) {
        ad adVarB = beVar.f4792c.b(this);
        com.bumptech.glide.g.p.f(adVarB);
        return adVarB;
    }

    public final synchronized ad a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (be beVar : this.f3221b) {
                Set set = this.f3222c;
                if (set.contains(beVar)) {
                    z = true;
                } else if (beVar.b(cls) && ((Class) beVar.f4791b).isAssignableFrom(cls2)) {
                    set.add(beVar);
                    arrayList.add(e(beVar));
                    set.remove(beVar);
                }
            }
            if (arrayList.size() > 1) {
                return new aj(arrayList, this.f3223d);
            }
            if (arrayList.size() == 1) {
                return (ad) arrayList.get(0);
            }
            if (!z) {
                throw new com.bumptech.glide.s(cls, cls2);
            }
            return f3220a;
        } catch (Throwable th) {
            this.f3222c.clear();
            throw th;
        }
    }

    final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (be beVar : this.f3221b) {
                Set set = this.f3222c;
                if (!set.contains(beVar) && beVar.b(cls)) {
                    set.add(beVar);
                    arrayList.add(e(beVar));
                    set.remove(beVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (be beVar : this.f3221b) {
            Object obj = beVar.f4791b;
            if (!arrayList.contains(obj) && beVar.b(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    final synchronized void d(Class cls, Class cls2, ae aeVar) {
        be beVar = new be(cls, cls2, aeVar);
        List list = this.f3221b;
        list.add(list.size(), beVar);
    }
}
