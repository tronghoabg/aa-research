package com.bumptech.glide.load.a;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    private final Pools.Pool f3044a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3045b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3046c;

    public at(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f3044a = pool;
        com.bumptech.glide.g.p.d(list);
        this.f3045b = list;
        this.f3046c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final aw a(com.bumptech.glide.load.data.g gVar, com.bumptech.glide.load.s sVar, int i2, int i3, n nVar) {
        List list = (List) this.f3044a.acquire();
        com.bumptech.glide.g.p.f(list);
        try {
            List list2 = this.f3045b;
            int size = list2.size();
            aw awVarA = null;
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    awVarA = ((s) list2.get(i4)).a(gVar, i2, i3, sVar, nVar);
                } catch (aq e2) {
                    list.add(e2);
                }
                if (awVarA != null) {
                    break;
                }
            }
            if (awVarA != null) {
                return awVarA;
            }
            throw new aq(this.f3046c, new ArrayList(list));
        } finally {
            this.f3044a.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3045b.toArray()) + "}";
    }
}
