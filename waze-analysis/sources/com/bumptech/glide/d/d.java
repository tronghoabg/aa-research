package com.bumptech.glide.d;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.g.o;
import com.bumptech.glide.load.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2808a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2809b;

    public d(byte[] bArr) {
        this.f2809b = new AtomicReference();
        this.f2808a = new ArrayMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized List g(String str) {
        ?? r0 = this.f2808a;
        if (!r0.contains(str)) {
            r0.add(str);
        }
        ?? r02 = this.f2809b;
        List list = (List) r02.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r02.put(str, arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2808a.iterator();
        while (it.hasNext()) {
            List<c> list = (List) this.f2809b.get((String) it.next());
            if (list != null) {
                for (c cVar : list) {
                    if (cVar.a(cls, cls2)) {
                        arrayList.add(cVar.f2806b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f2808a.iterator();
        while (it.hasNext()) {
            List<c> list = (List) this.f2809b.get((String) it.next());
            if (list != null) {
                for (c cVar : list) {
                    if (cVar.a(cls, cls2)) {
                        Class cls3 = cVar.f2805a;
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, u uVar, Class cls, Class cls2) {
        g(str).add(new c(cls, cls2, uVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final synchronized void d(List list) {
        ?? r1 = this.f2808a;
        ArrayList arrayList = new ArrayList((Collection) r1);
        r1.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r1.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            if (!list.contains(str)) {
                r1.add(str);
            }
        }
    }

    public final List e(Class cls, Class cls2, Class cls3) {
        List list;
        o oVar = (o) ((AtomicReference) this.f2809b).getAndSet(null);
        if (oVar == null) {
            oVar = new o(cls, cls2, cls3);
        } else {
            oVar.a(cls, cls2, cls3);
        }
        Object obj = this.f2808a;
        synchronized (obj) {
            list = (List) ((SimpleArrayMap) obj).get(oVar);
        }
        ((AtomicReference) this.f2809b).set(oVar);
        return list;
    }

    public final void f(Class cls, Class cls2, Class cls3, List list) {
        Object obj = this.f2808a;
        synchronized (obj) {
            ((SimpleArrayMap) obj).put(new o(cls, cls2, cls3), list);
        }
    }

    public d() {
        this.f2808a = new ArrayList();
        this.f2809b = new HashMap();
    }
}
