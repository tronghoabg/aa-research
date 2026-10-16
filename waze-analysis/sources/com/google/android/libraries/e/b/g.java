package com.google.android.libraries.e.b;

import com.google.android.libraries.phenotype.client.stable.am;
import com.google.android.libraries.phenotype.client.stable.bg;
import com.google.b.d.b.ah;
import com.google.d.d.bn;
import com.google.d.d.fv;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.google.v.fi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements ag {

    /* renamed from: a, reason: collision with root package name */
    private final List f5860a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5861b;

    private g(List list, Executor executor) {
        this.f5860a = list;
        this.f5861b = executor;
    }

    public static g a(List list, Executor executor) {
        return new g(list, executor);
    }

    public static /* synthetic */ bm b(g gVar, fi fiVar, int i2, List list) {
        bm bmVarH = bd.h(fiVar);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) bd.o((Future) list.get(i3))).booleanValue()) {
                bmVarH = bd.n(bmVarH, ah.b(new am((d) gVar.f5860a.get(i3), 3)), cf.y());
            }
        }
        return bmVarH;
    }

    public static /* synthetic */ bm d(g gVar, int i2, List list) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) bd.o((Future) list.get(i3))).booleanValue()) {
                arrayList.add(((d) gVar.f5860a.get(i3)).a());
            }
        }
        return bd.c(arrayList).a(new bg(2), cf.y());
    }

    @Override // com.google.d.m.a.ag
    public final /* bridge */ /* synthetic */ bm apply(Object obj) {
        b bVar = (b) obj;
        List list = this.f5860a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        fv it = ((bn) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).b());
        }
        return bd.n(bVar.a(ah.b(new f(this, arrayList, size, 1)), cf.y()), ah.b(new f(this, size, arrayList, 0)), cf.y());
    }
}
