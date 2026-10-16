package com.waze.j;

import com.waze.z.a.al;
import h.g.b.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final al f24914a;

    public k(al alVar) {
        x.f(alVar, "genericLocalAutoCompletePlaceFilter");
        this.f24914a = alVar;
    }

    @Override // com.waze.j.j
    public final List a(String str, List list) {
        x.f(str, "searchTerm");
        x.f(list, "results");
        List listG = this.f24914a.g(str, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (hashSet.add(((com.waze.w.i) obj).f())) {
                arrayList.add(obj);
            }
        }
        return h.a.i.al(arrayList, new com.google.firebase.crashlytics.a.c.h(8));
    }
}
