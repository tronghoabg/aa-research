package com.bumptech.glide.load.a;

import android.util.Log;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Class f3172a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3173b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.c.e.c f3174c;

    /* renamed from: d, reason: collision with root package name */
    private final Pools.Pool f3175d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3176e;

    public s(Class cls, Class cls2, Class cls3, List list, com.bumptech.glide.load.c.e.c cVar, Pools.Pool pool) {
        this.f3172a = cls;
        this.f3173b = list;
        this.f3174c = cVar;
        this.f3175d = pool;
        this.f3176e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private final aw b(com.bumptech.glide.load.data.g gVar, int i2, int i3, com.bumptech.glide.load.s sVar, List list) throws aq {
        List list2 = this.f3173b;
        int size = list2.size();
        aw awVarA = null;
        for (int i4 = 0; i4 < size; i4++) {
            com.bumptech.glide.load.u uVar = (com.bumptech.glide.load.u) list2.get(i4);
            try {
                if (uVar.b(gVar.a(), sVar)) {
                    awVarA = uVar.a(gVar.a(), i2, i3, sVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(uVar))), e2);
                }
                list.add(e2);
            }
            if (awVarA != null) {
                break;
            }
        }
        if (awVarA != null) {
            return awVarA;
        }
        throw new aq(this.f3176e, new ArrayList(list));
    }

    public final aw a(com.bumptech.glide.load.data.g gVar, int i2, int i3, com.bumptech.glide.load.s sVar, n nVar) {
        List list = (List) this.f3175d.acquire();
        com.bumptech.glide.g.p.f(list);
        try {
            aw awVarB = b(gVar, i2, i3, sVar, list);
            this.f3175d.release(list);
            return this.f3174c.a(nVar.a(awVarB), sVar);
        } catch (Throwable th) {
            this.f3175d.release(list);
            throw th;
        }
    }

    public final String toString() {
        com.bumptech.glide.load.c.e.c cVar = this.f3174c;
        List list = this.f3173b;
        return "DecodePath{ dataClass=" + String.valueOf(this.f3172a) + ", decoders=" + String.valueOf(list) + ", transcoder=" + cVar.toString() + "}";
    }
}
