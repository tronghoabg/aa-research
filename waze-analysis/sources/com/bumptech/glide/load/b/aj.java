package com.bumptech.glide.load.b;

import androidx.core.util.Pools;
import com.google.android.gms.common.api.internal.be;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final List f3218a;

    /* renamed from: b, reason: collision with root package name */
    private final Pools.Pool f3219b;

    aj(List list, Pools.Pool pool) {
        this.f3218a = list;
        this.f3219b = pool;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final boolean a(Object obj) {
        Iterator it = this.f3218a.iterator();
        while (it.hasNext()) {
            if (((ad) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bumptech.glide.load.o] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // com.bumptech.glide.load.b.ad
    public final be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) {
        be beVarB;
        List list = this.f3218a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i4 = 0;
        ?? r5 = 0;
        while (i4 < size) {
            ad adVar = (ad) list.get(i4);
            if (adVar.a(obj) && (beVarB = adVar.b(obj, i2, i3, sVar)) != null) {
                arrayList.add(beVarB.f4791b);
                r5 = beVarB.f4792c;
            }
            i4++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new be(r5, new ai(arrayList, this.f3219b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f3218a.toArray()) + "}";
    }
}
