package hb;

import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class I extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Type f36268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36269b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36270c;

    /* renamed from: d, reason: collision with root package name */
    public r f36271d;

    public I(Type type, String str, Object obj) {
        this.f36268a = type;
        this.f36269b = str;
        this.f36270c = obj;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        r rVar = this.f36271d;
        if (rVar != null) {
            return rVar.fromJson(wVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        r rVar = this.f36271d;
        if (rVar == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        rVar.toJson(abstractC2797C, obj);
    }

    public final String toString() {
        r rVar = this.f36271d;
        return rVar != null ? rVar.toString() : super.toString();
    }
}
