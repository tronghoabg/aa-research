package t9;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f45963c = new m(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final s9.o f45964a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f45965b;

    public m(s9.o oVar, Boolean bool) {
        A6.c.z(oVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f45964a = oVar;
        this.f45965b = bool;
    }

    public static m a(boolean z2) {
        return new m(null, Boolean.valueOf(z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(s9.k r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            s9.o r2 = r4.f45964a
            if (r2 == 0) goto L15
            boolean r3 = r5.d()
            if (r3 == 0) goto L24
            s9.o r5 = r5.f45382c
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L24
            goto L23
        L15:
            java.lang.Boolean r3 = r4.f45965b
            if (r3 == 0) goto L25
            boolean r2 = r3.booleanValue()
            boolean r5 = r5.d()
            if (r2 != r5) goto L24
        L23:
            return r1
        L24:
            return r0
        L25:
            if (r2 != 0) goto L2b
            if (r3 != 0) goto L2b
            r5 = r1
            goto L2c
        L2b:
            r5 = r0
        L2c:
            java.lang.String r2 = "Precondition should be empty"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            A6.c.z(r5, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.m.b(s9.k):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            s9.o oVar = mVar.f45964a;
            s9.o oVar2 = this.f45964a;
            if (oVar2 == null ? oVar != null : !oVar2.equals(oVar)) {
                return false;
            }
            Boolean bool = mVar.f45965b;
            Boolean bool2 = this.f45965b;
            if (bool2 != null) {
                return bool2.equals(bool);
            }
            if (bool == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        s9.o oVar = this.f45964a;
        int iHashCode = (oVar != null ? oVar.f45390a.hashCode() : 0) * 31;
        Boolean bool = this.f45965b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f45965b;
        s9.o oVar = this.f45964a;
        if (oVar == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (oVar != null) {
            return "Precondition{updateTime=" + oVar + "}";
        }
        if (bool == null) {
            A6.c.s("Invalid Precondition", new Object[0]);
            throw null;
        }
        return "Precondition{exists=" + bool + "}";
    }
}
