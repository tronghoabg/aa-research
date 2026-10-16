package p9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ka.C1;

/* renamed from: p9.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3789j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3788i f43371a;

    /* renamed from: b, reason: collision with root package name */
    public final C1 f43372b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.j f43373c;

    public C3789j(s9.j jVar, EnumC3788i enumC3788i, C1 c12) {
        this.f43373c = jVar;
        this.f43371a = enumC3788i;
        this.f43372b = c12;
    }

    public static C3789j e(s9.j jVar, EnumC3788i enumC3788i, C1 c12) {
        boolean zEquals = jVar.equals(s9.j.f45378b);
        EnumC3788i enumC3788i2 = EnumC3788i.ARRAY_CONTAINS_ANY;
        EnumC3788i enumC3788i3 = EnumC3788i.ARRAY_CONTAINS;
        EnumC3788i enumC3788i4 = EnumC3788i.NOT_IN;
        EnumC3788i enumC3788i5 = EnumC3788i.IN;
        if (zEquals) {
            if (enumC3788i == enumC3788i5) {
                return new p(jVar, c12, 0);
            }
            if (enumC3788i == enumC3788i4) {
                return new p(jVar, c12, 1);
            }
            A6.c.z((enumC3788i == enumC3788i3 || enumC3788i == enumC3788i2) ? false : true, enumC3788i.f43370a.concat("queries don't make sense on document keys"), new Object[0]);
            return new p(jVar, enumC3788i, c12);
        }
        if (enumC3788i == enumC3788i3) {
            return new C3780a(jVar, enumC3788i3, c12, 1);
        }
        if (enumC3788i == enumC3788i5) {
            o oVar = new o(jVar, enumC3788i5, c12);
            A6.c.z(s9.p.f(c12), "InFilter expects an ArrayValue", new Object[0]);
            return oVar;
        }
        if (enumC3788i == enumC3788i2) {
            C3780a c3780a = new C3780a(jVar, enumC3788i2, c12, 0);
            A6.c.z(s9.p.f(c12), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
            return c3780a;
        }
        if (enumC3788i != enumC3788i4) {
            return new C3789j(jVar, enumC3788i, c12);
        }
        C3780a c3780a2 = new C3780a(jVar, enumC3788i4, c12, 2);
        A6.c.z(s9.p.f(c12), "NotInFilter expects an ArrayValue", new Object[0]);
        return c3780a2;
    }

    @Override // p9.k
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43373c.c());
        sb2.append(this.f43371a.f43370a);
        C1 c12 = s9.p.f45391a;
        StringBuilder sb3 = new StringBuilder();
        s9.p.a(sb3, this.f43372b);
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    @Override // p9.k
    public final List b() {
        return Collections.singletonList(this);
    }

    @Override // p9.k
    public final List c() {
        return Collections.singletonList(this);
    }

    @Override // p9.k
    public boolean d(s9.k kVar) {
        C1 c1F = kVar.f45384e.f(this.f43373c);
        EnumC3788i enumC3788i = EnumC3788i.NOT_EQUAL;
        C1 c12 = this.f43372b;
        return this.f43371a == enumC3788i ? c1F != null && g(s9.p.b(c1F, c12)) : c1F != null && s9.p.l(c1F) == s9.p.l(c12) && g(s9.p.b(c1F, c12));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3789j)) {
            C3789j c3789j = (C3789j) obj;
            if (this.f43371a == c3789j.f43371a && this.f43373c.equals(c3789j.f43373c) && this.f43372b.equals(c3789j.f43372b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return Arrays.asList(EnumC3788i.LESS_THAN, EnumC3788i.LESS_THAN_OR_EQUAL, EnumC3788i.GREATER_THAN, EnumC3788i.GREATER_THAN_OR_EQUAL, EnumC3788i.NOT_EQUAL, EnumC3788i.NOT_IN).contains(this.f43371a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            p9.i r2 = r5.f43371a
            int r3 = r2.ordinal()
            if (r3 == 0) goto L32
            if (r3 == r1) goto L2f
            r4 = 2
            if (r3 == r4) goto L2c
            r4 = 3
            if (r3 == r4) goto L29
            r4 = 4
            if (r3 == r4) goto L26
            r4 = 5
            if (r3 != r4) goto L1b
            if (r6 < 0) goto L35
            goto L34
        L1b:
            java.lang.String r6 = "Unknown FieldFilter operator: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            A6.c.s(r6, r1)
            r6 = 0
            throw r6
        L26:
            if (r6 <= 0) goto L35
            goto L34
        L29:
            if (r6 == 0) goto L35
            goto L34
        L2c:
            if (r6 != 0) goto L35
            goto L34
        L2f:
            if (r6 > 0) goto L35
            goto L34
        L32:
            if (r6 >= 0) goto L35
        L34:
            return r1
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.C3789j.g(int):boolean");
    }

    public final int hashCode() {
        return this.f43372b.hashCode() + ((this.f43373c.hashCode() + ((this.f43371a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
