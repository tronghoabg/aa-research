package com.waze.main_screen.m;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.waze.map.main.aa;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final aa f26661a = new aa(0, 0, 0, 0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final Map f26662b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final MutableState f26663c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(f26661a, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final MutableIntState f26664d = SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: e, reason: collision with root package name */
    private final MutableIntState f26665e = SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: f, reason: collision with root package name */
    private final MutableIntState f26666f = SnapshotIntStateKt.mutableIntStateOf(0);

    private final int f() {
        return c().c() / 2;
    }

    private final void g(aa aaVar) {
        this.f26663c.setValue(aaVar);
    }

    private final void h() {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Map map = this.f26662b;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            i iVar = (i) obj2;
            if ((iVar instanceof c) || (iVar instanceof a)) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = arrayList3.iterator();
        Integer num = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((i) it.next()).a());
            while (it.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((i) it.next()).a());
                if (numValueOf.compareTo(numValueOf4) < 0) {
                    numValueOf = numValueOf4;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num2 = numValueOf;
        this.f26665e.setIntValue(num2 != null ? h.k.n.h(num2.intValue(), 0) : 0);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            i iVar2 = (i) obj3;
            if (!(iVar2 instanceof g) && !(iVar2 instanceof b) && (!(iVar2 instanceof d) || ((d) iVar2).b())) {
                arrayList4.add(obj3);
            }
        }
        Iterator it2 = arrayList4.iterator();
        if (it2.hasNext()) {
            numValueOf2 = Integer.valueOf(((i) it2.next()).a());
            while (it2.hasNext()) {
                Integer numValueOf5 = Integer.valueOf(((i) it2.next()).a());
                if (numValueOf2.compareTo(numValueOf5) < 0) {
                    numValueOf2 = numValueOf5;
                }
            }
        } else {
            numValueOf2 = null;
        }
        Integer num3 = numValueOf2;
        this.f26664d.setIntValue(num3 != null ? h.k.n.h(h.k.n.i(num3.intValue(), f()), 0) : 0);
        Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            numValueOf3 = Integer.valueOf(((i) it3.next()).a());
            while (it3.hasNext()) {
                Integer numValueOf6 = Integer.valueOf(((i) it3.next()).a());
                if (numValueOf3.compareTo(numValueOf6) < 0) {
                    numValueOf3 = numValueOf6;
                }
            }
        } else {
            numValueOf3 = null;
        }
        Integer num4 = numValueOf3;
        int i2 = num4 != null ? h.k.n.i(num4.intValue(), f()) : 0;
        Object obj4 = map.get(d.class);
        if (true != (obj4 instanceof d)) {
            obj4 = null;
        }
        Collection collectionValues2 = map.values();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : collectionValues2) {
            if (obj5 instanceof o) {
                arrayList5.add(obj5);
            }
        }
        Iterator it4 = arrayList5.iterator();
        if (it4.hasNext()) {
            Integer numValueOf7 = Integer.valueOf(((o) it4.next()).a());
            loop4: while (true) {
                num = numValueOf7;
                while (it4.hasNext()) {
                    numValueOf7 = Integer.valueOf(((o) it4.next()).a());
                    if (num.compareTo(numValueOf7) < 0) {
                        break;
                    }
                }
            }
        }
        Integer num5 = num;
        this.f26666f.setIntValue(num5 != null ? h.k.n.h(num5.intValue(), 0) : 0);
        g(aa.h(c(), 0, 0, b(), 0, 0, i2, 0, 27));
    }

    public final int a() {
        return this.f26664d.getIntValue();
    }

    public final int b() {
        return this.f26666f.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final aa c() {
        return (aa) this.f26663c.getValue();
    }

    public final void d(j jVar) {
        x.f(jVar, "component");
        Map map = this.f26662b;
        if (x.n((j) map.get(jVar.getClass()), jVar)) {
            return;
        }
        map.put(jVar.getClass(), jVar);
        h();
    }

    public final void e(int i2, int i3) {
        if (i2 > 0 || i3 > 0) {
            if (i2 == c().c() && i3 == c().g()) {
                return;
            }
            g(aa.h(c(), i2, i3, 0, 0, 0, 0, 0, 124));
            h();
        }
    }
}
