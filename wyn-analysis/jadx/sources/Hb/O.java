package hb;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class O extends r {

    /* renamed from: a, reason: collision with root package name */
    public final K f36286a;

    /* renamed from: b, reason: collision with root package name */
    public final r f36287b;

    /* renamed from: c, reason: collision with root package name */
    public final r f36288c;

    /* renamed from: d, reason: collision with root package name */
    public final r f36289d;

    /* renamed from: e, reason: collision with root package name */
    public final r f36290e;

    /* renamed from: f, reason: collision with root package name */
    public final r f36291f;

    public O(K k) {
        this.f36286a = k;
        this.f36287b = k.a(List.class);
        this.f36288c = k.a(Map.class);
        this.f36289d = k.a(String.class);
        this.f36290e = k.a(Double.class);
        this.f36291f = k.a(Boolean.class);
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        int iOrdinal = wVar.P().ordinal();
        if (iOrdinal == 0) {
            return this.f36287b.fromJson(wVar);
        }
        if (iOrdinal == 2) {
            return this.f36288c.fromJson(wVar);
        }
        if (iOrdinal == 5) {
            return this.f36289d.fromJson(wVar);
        }
        if (iOrdinal == 6) {
            return this.f36290e.fromJson(wVar);
        }
        if (iOrdinal == 7) {
            return this.f36291f.fromJson(wVar);
        }
        if (iOrdinal == 8) {
            wVar.D();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + wVar.P() + " at path " + wVar.i());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r1
  0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // hb.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void toJson(hb.AbstractC2797C r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.b()
            r5.i()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = ib.f.f36939a
            r2 = 0
            hb.K r3 = r4.f36286a
            hb.r r0 = r3.c(r0, r1, r2)
            r0.toJson(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.O.toJson(hb.C, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
