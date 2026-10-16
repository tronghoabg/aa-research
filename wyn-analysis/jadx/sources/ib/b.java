package ib;

import hb.AbstractC2797C;
import hb.r;
import hb.v;
import hb.w;

/* loaded from: classes4.dex */
public final class b extends r {

    /* renamed from: a, reason: collision with root package name */
    public final r f36932a;

    public b(r rVar) {
        this.f36932a = rVar;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        if (wVar.P() != v.f36356i) {
            return this.f36932a.fromJson(wVar);
        }
        wVar.D();
        return null;
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        if (obj == null) {
            abstractC2797C.y();
        } else {
            this.f36932a.toJson(abstractC2797C, obj);
        }
    }

    public final String toString() {
        return this.f36932a + ".nullSafe()";
    }
}
