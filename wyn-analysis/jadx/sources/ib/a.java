package ib;

import E5.Q;
import hb.AbstractC2797C;
import hb.r;
import hb.v;
import hb.w;

/* loaded from: classes4.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r f36931a;

    public a(r rVar) {
        this.f36931a = rVar;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        if (wVar.P() != v.f36356i) {
            return this.f36931a.fromJson(wVar);
        }
        throw new Q("Unexpected null at " + wVar.i(), 11);
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        if (obj != null) {
            this.f36931a.toJson(abstractC2797C, obj);
        } else {
            throw new Q("Unexpected null at " + abstractC2797C.o(), 11);
        }
    }

    public final String toString() {
        return this.f36931a + ".nonNull()";
    }
}
