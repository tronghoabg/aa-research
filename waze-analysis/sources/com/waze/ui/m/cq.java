package com.waze.ui.m;

import androidx.compose.material.ModalBottomSheetState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class cq implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42891b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42892c;

    public /* synthetic */ cq(Object obj, Object obj2, int i2) {
        this.f42892c = i2;
        this.f42891b = obj;
        this.f42890a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlinx.b.a.q] */
    @Override // h.g.a.a
    public final Object invoke() {
        String[] strArrA;
        int i2 = this.f42892c;
        if (i2 == 0) {
            kotlinx.coroutines.aj.z(this.f42890a, null, null, new da((ModalBottomSheetState) this.f42891b, null, 0), 3);
            return h.ab.f48028a;
        }
        int i3 = 1;
        if (i2 == 1) {
            return h.k.n.z((String) this.f42891b, kotlinx.b.a.ab.f50903a, new kotlinx.b.a.q[0], new kotlinx.b.c.ci(this.f42890a, i3));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = this.f42890a;
        ?? r10 = this.f42891b;
        kotlinx.b.d.a.q.e(r10, (kotlinx.b.d.b) obj);
        int iB = r10.b();
        for (int i4 = 0; i4 < iB; i4++) {
            List listF = r10.f(i4);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listF) {
                if (obj2 instanceof kotlinx.b.d.s) {
                    arrayList.add(obj2);
                }
            }
            kotlinx.b.d.s sVar = (kotlinx.b.d.s) h.a.i.Y(arrayList);
            if (sVar != null && (strArrA = sVar.a()) != null) {
                for (String str : strArrA) {
                    String str2 = true != h.g.b.x.n(r10.h(), kotlinx.b.a.w.f50939a) ? "property" : "enum value";
                    if (linkedHashMap.containsKey(str)) {
                        throw new kotlinx.b.d.a.p("The suggested name '" + str + "' for " + str2 + ' ' + r10.c(i4) + " is already one of the names for " + str2 + ' ' + r10.c(((Number) h.a.r.h(linkedHashMap, str)).intValue()) + " in " + ((Object) r10));
                    }
                    linkedHashMap.put(str, Integer.valueOf(i4));
                }
            }
        }
        return linkedHashMap.isEmpty() ? h.a.r.j() : linkedHashMap;
    }

    public /* synthetic */ cq(kotlinx.coroutines.af afVar, ModalBottomSheetState modalBottomSheetState, int i2) {
        this.f42892c = i2;
        this.f42890a = afVar;
        this.f42891b = modalBottomSheetState;
    }
}
