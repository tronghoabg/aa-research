package com.bumptech.glide.load.b;

import androidx.core.util.Pools;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final al f3209a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f3210b;

    public ah(Pools.Pool pool) {
        al alVar = new al(pool);
        this.f3210b = new ag();
        this.f3209a = alVar;
    }

    private final synchronized List d(Class cls) {
        ag agVar = this.f3210b;
        List listA = agVar.a(cls);
        if (listA != null) {
            return listA;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f3209a.b(cls));
        agVar.c(cls, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final synchronized List a(Class cls) {
        return this.f3209a.c(cls);
    }

    public final List b(Object obj) {
        List listD = d(obj.getClass());
        if (listD.isEmpty()) {
            throw new com.bumptech.glide.s(obj);
        }
        int size = listD.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            ad adVar = (ad) listD.get(i2);
            if (adVar.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i2);
                }
                arrayList.add(adVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new com.bumptech.glide.s(obj, listD);
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, ae aeVar) {
        this.f3209a.d(cls, cls2, aeVar);
        this.f3210b.b();
    }
}
