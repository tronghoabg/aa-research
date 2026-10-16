package com.google.firebase.abt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g.c f8829a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8830b = null;

    public c(com.google.firebase.g.c cVar) {
        this.f8829a = cVar;
    }

    private final List b() {
        return ((com.google.firebase.a.a.c) this.f8829a.a()).b();
    }

    private final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = ((com.google.firebase.a.a.b) it.next()).f8814a;
            f();
        }
    }

    private final void d() throws a {
        if (this.f8829a.a() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private static final boolean e(List list, b bVar) {
        String strB = bVar.b();
        String strC = bVar.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.b().equals(strB) && bVar2.c().equals(strC)) {
                return true;
            }
        }
        return false;
    }

    private final void f() {
        ((com.google.firebase.a.a.c) this.f8829a.a()).a();
    }

    public final void a(List list) throws a {
        d();
        ArrayList<b> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((Map) it.next()));
        }
        if (arrayList.isEmpty()) {
            d();
            c(b());
            return;
        }
        d();
        List<com.google.firebase.a.a.b> listB = b();
        ArrayList<b> arrayList2 = new ArrayList();
        for (com.google.firebase.a.a.b bVar : listB) {
            int i2 = b.f8821b;
            String str = bVar.f8816c;
            if (str == null) {
                str = "";
            }
            arrayList2.add(new b(bVar.f8814a, String.valueOf(bVar.f8815b), str, new Date(bVar.f8819f), bVar.f8817d, bVar.f8818e));
        }
        ArrayList arrayList3 = new ArrayList();
        for (b bVar2 : arrayList2) {
            if (!e(arrayList, bVar2)) {
                arrayList3.add(bVar2.d());
            }
        }
        c(arrayList3);
        ArrayList<b> arrayList4 = new ArrayList();
        for (b bVar3 : arrayList) {
            if (!e(arrayList2, bVar3)) {
                arrayList4.add(bVar3);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(b());
        Integer numValueOf = this.f8830b;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(((com.google.firebase.a.a.c) this.f8829a.a()).c());
            this.f8830b = numValueOf;
        }
        int iIntValue = numValueOf.intValue();
        for (b bVar4 : arrayList4) {
            while (arrayDeque.size() >= iIntValue) {
                String str2 = ((com.google.firebase.a.a.b) arrayDeque.pollFirst()).f8814a;
                f();
            }
            com.google.firebase.a.a.b bVarD = bVar4.d();
            ((com.google.firebase.a.a.c) this.f8829a.a()).g();
            arrayDeque.offer(bVarD);
        }
    }
}
