package com.waze.app_nav.hub.a;

import com.google.d.d.cn;
import h.g.a.l;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15221a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15222b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f15222b = i2;
        this.f15221a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v7, types: [h.g.a.p, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = this.f15222b;
        if (i2 == 0) {
            return ((Number) this.f15221a.invoke(obj, obj2)).intValue();
        }
        if (i2 == 1) {
            Map.Entry entry = (Map.Entry) obj;
            Map.Entry entry2 = (Map.Entry) obj2;
            int i3 = cn.f7499b;
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.f15221a.compare(entry.getKey(), entry2.getKey());
        }
        if (i2 == 2) {
            return ((Number) this.f15221a.invoke(obj, obj2)).intValue();
        }
        if (i2 == 3) {
            return ((Number) this.f15221a.invoke(obj, obj2)).intValue();
        }
        int i4 = 0;
        while (true) {
            l[] lVarArr = (l[]) this.f15221a;
            if (i4 >= lVarArr.length) {
                return 0;
            }
            l lVar = lVarArr[i4];
            int iA = h.b.a.a((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
            i4++;
        }
    }
}
