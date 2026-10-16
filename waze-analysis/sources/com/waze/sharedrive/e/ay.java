package com.waze.sharedrive.e;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f38375a;

    /* renamed from: b, reason: collision with root package name */
    int f38376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bc f38377c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List f38378d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f38379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(bc bcVar, List list, h.c.e eVar) {
        super(2, eVar);
        this.f38377c = bcVar;
        this.f38378d = list;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ay ayVar = new ay(this.f38377c, this.f38378d, eVar);
        ayVar.f38379e = obj;
        return ayVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ay) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        h.o.f fVar;
        h.o.f fVar2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f38376b;
        if (i2 == 0) {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f38379e;
            bc bcVar = this.f38377c;
            h.o.f fVarA = bcVar.f38404f.a();
            this.f38379e = afVar2;
            this.f38375a = fVarA;
            this.f38376b = 1;
            Object objF = bc.f(bcVar, this);
            if (objF != aVar) {
                afVar = afVar2;
                obj = objF;
                fVar = fVarA;
            }
            return aVar;
        }
        if (i2 != 1) {
            fVar2 = (h.o.f) this.f38379e;
            e.b.c.b(obj);
            Map mapQ = h.a.r.q((Iterable) obj);
            bc bcVar2 = this.f38377c;
            long jA = fVar2.a();
            bcVar2.f38403e.a("getPinBitmaps took " + h.o.a.m(jA) + " ms for " + this.f38378d.size() + " participants");
            return mapQ;
        }
        fVar = (h.o.f) this.f38375a;
        afVar = (kotlinx.coroutines.af) this.f38379e;
        e.b.c.b(obj);
        Bitmap bitmapC = (Bitmap) obj;
        if (bitmapC == null) {
            bc bcVar3 = this.f38377c;
            bcVar3.f38403e.g("Failed to inflate/render layout placeholder bitmap, resorting to 1x1 fallbackPlaceholder");
            bitmapC = bc.c(bcVar3);
        }
        List list = this.f38378d;
        bc bcVar4 = this.f38377c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlinx.coroutines.aj.y(afVar, bcVar4.f38402d, null, new ax((com.waze.sharedrive.c.a.l) it.next(), bcVar4, bitmapC, null), 2));
        }
        this.f38379e = fVar;
        this.f38375a = null;
        this.f38376b = 2;
        obj = kotlinx.coroutines.aj.C(arrayList, this);
        if (obj != aVar) {
            fVar2 = fVar;
            Map mapQ2 = h.a.r.q((Iterable) obj);
            bc bcVar22 = this.f38377c;
            long jA2 = fVar2.a();
            bcVar22.f38403e.a("getPinBitmaps took " + h.o.a.m(jA2) + " ms for " + this.f38378d.size() + " participants");
            return mapQ2;
        }
        return aVar;
    }
}
