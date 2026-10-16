package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;

@afdo
/* loaded from: classes.dex */
public final class bys {
    public final aan a;

    public /* synthetic */ bys(aan aanVar) {
        this.a = aanVar;
    }

    public static final Object a(aan aanVar, Object obj) {
        Object objA = aanVar.a(obj);
        if (objA == null) {
            return null;
        }
        if (!(objA instanceof aag)) {
            aanVar.i(obj);
            return objA;
        }
        aag aagVar = (aag) objA;
        if (aagVar.f()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = aagVar.b - 1;
        Object objC = aagVar.c(i);
        aagVar.h(i);
        objC.getClass();
        if (aagVar.f()) {
            aanVar.i(obj);
        }
        if (aagVar.b != 1) {
            return objC;
        }
        aanVar.m(obj, aagVar.b());
        return objC;
    }

    public static final void b(aan aanVar, Object obj, Object obj2) {
        int iG = aanVar.g(obj);
        boolean z = iG < 0;
        Object obj3 = z ? null : aanVar.c[iG];
        if (obj3 != null) {
            if (obj3 instanceof aag) {
                aag aagVar = (aag) obj3;
                aagVar.p(obj2);
                obj2 = aagVar;
            } else {
                obj2 = aah.c(obj3, obj2);
            }
        }
        if (!z) {
            aanVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        aanVar.b[i] = obj;
        aanVar.c[i] = obj2;
    }

    public static final void c(aan aanVar, Object obj, afec afecVar) {
        Object objA = aanVar.a(obj);
        if (objA != null) {
            if (!(objA instanceof aag)) {
                if (((Boolean) afecVar.invoke(objA)).booleanValue()) {
                    aanVar.i(obj);
                    return;
                }
                return;
            }
            aag aagVar = (aag) objA;
            int i = aagVar.b;
            Object[] objArr = aagVar.a;
            int i2 = 0;
            afha afhaVarM = afpt.m(0, i);
            int i3 = afhaVarM.a;
            int i4 = afhaVarM.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) afecVar.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            objArr.getClass();
            Arrays.fill(objArr, i - i2, i, (Object) null);
            aagVar.b -= i2;
            if (aagVar.f()) {
                aanVar.i(obj);
            }
            if (aagVar.b == 1) {
                aanVar.m(obj, aagVar.b());
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bys) && affa.f(this.a, ((bys) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
