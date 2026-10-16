package com.waze.search.v2;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class de<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f36353a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36354b;

    public de(Object obj, int i2) {
        this.f36354b = i2;
        this.f36353a = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.waze.av.d.s sVar;
        T next;
        Float fA;
        Float fA2;
        String strN;
        int i2 = this.f36354b;
        if (i2 == 0) {
            com.waze.shared_infra.h.c cVarH = ((com.waze.av.d.k) obj).h();
            com.waze.shared_infra.h.c cVar = (com.waze.shared_infra.h.c) this.f36353a;
            return h.b.a.a(Float.valueOf(com.waze.sharedui.utils.f.b(cVar, cVarH)), Float.valueOf(com.waze.sharedui.utils.f.b(cVar, ((com.waze.av.d.k) obj2).h())));
        }
        if (i2 == 1) {
            com.waze.shared_infra.h.c cVarH2 = ((com.waze.av.d.k) obj).h();
            com.waze.shared_infra.h.c cVar2 = (com.waze.shared_infra.h.c) this.f36353a;
            return h.b.a.a(Float.valueOf(com.waze.sharedui.utils.f.b(cVar2, cVarH2)), Float.valueOf(com.waze.sharedui.utils.f.b(cVar2, ((com.waze.av.d.k) obj2).h())));
        }
        if (i2 != 2) {
            com.waze.av.d.k kVar = (com.waze.av.d.k) obj;
            Object obj3 = this.f36353a;
            CharSequence charSequence = (CharSequence) obj3;
            String strN2 = " ";
            if (charSequence.length() <= 0 || !h.g.b.x.n(obj3, kVar.n())) {
                String strN3 = kVar.n();
                strN = (strN3 == null || strN3.length() == 0) ? "\uffff" : kVar.n();
            } else {
                strN = " ";
            }
            String str = strN;
            com.waze.av.d.k kVar2 = (com.waze.av.d.k) obj2;
            if (charSequence.length() <= 0 || !h.g.b.x.n(obj3, kVar2.n())) {
                String strN4 = kVar2.n();
                strN2 = (strN4 == null || strN4.length() == 0) ? "\uffff" : kVar2.n();
            }
            return h.b.a.a(str, strN2);
        }
        Iterator<T> it = ((com.waze.av.d.k) obj).H().iterator();
        while (true) {
            sVar = null;
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((com.waze.av.d.s) next).c(), ((dn) this.f36353a).a())) {
                break;
            }
        }
        com.waze.av.d.s sVar2 = next;
        float fFloatValue = Float.MAX_VALUE;
        Float fValueOf = Float.valueOf((sVar2 == null || (fA2 = sVar2.a()) == null) ? Float.MAX_VALUE : fA2.floatValue());
        Iterator<T> it2 = ((com.waze.av.d.k) obj2).H().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            if (h.g.b.x.n(((com.waze.av.d.s) next2).c(), ((dn) this.f36353a).a())) {
                sVar = next2;
                break;
            }
        }
        com.waze.av.d.s sVar3 = sVar;
        if (sVar3 != null && (fA = sVar3.a()) != null) {
            fFloatValue = fA.floatValue();
        }
        return h.b.a.a(fValueOf, Float.valueOf(fFloatValue));
    }
}
