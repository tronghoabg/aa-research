package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class byy {
    public final defpackage.aau a;

    public /* synthetic */ byy(defpackage.aau aauVar) {
        this.a = aauVar;
    }

    public static final java.lang.Object a(defpackage.aau aauVar, java.lang.Object obj) {
        java.lang.Object objA = aauVar.a(obj);
        if (objA == null) {
            return null;
        }
        if (!(objA instanceof defpackage.aan)) {
            aauVar.i(obj);
            return objA;
        }
        defpackage.aan aanVar = (defpackage.aan) objA;
        if (aanVar.f()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i = aanVar.b - 1;
        java.lang.Object objC = aanVar.c(i);
        aanVar.h(i);
        objC.getClass();
        if (aanVar.f()) {
            aauVar.i(obj);
        }
        if (aanVar.b != 1) {
            return objC;
        }
        aauVar.m(obj, aanVar.b());
        return objC;
    }

    public static final void b(defpackage.aau aauVar, java.lang.Object obj, java.lang.Object obj2) {
        int iG = aauVar.g(obj);
        boolean z = iG < 0;
        java.lang.Object obj3 = z ? null : aauVar.c[iG];
        if (obj3 != null) {
            if (obj3 instanceof defpackage.aan) {
                defpackage.aan aanVar = (defpackage.aan) obj3;
                aanVar.p(obj2);
                obj2 = aanVar;
            } else {
                obj2 = defpackage.aao.c(obj3, obj2);
            }
        }
        if (!z) {
            aauVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        aauVar.b[i] = obj;
        aauVar.c[i] = obj2;
    }

    public static final void c(defpackage.aau aauVar, java.lang.Object obj, defpackage.affc affcVar) {
        java.lang.Object objA = aauVar.a(obj);
        if (objA != null) {
            if (!(objA instanceof defpackage.aan)) {
                if (((java.lang.Boolean) affcVar.invoke(objA)).booleanValue()) {
                    aauVar.i(obj);
                    return;
                }
                return;
            }
            defpackage.aan aanVar = (defpackage.aan) objA;
            int i = aanVar.b;
            java.lang.Object[] objArr = aanVar.a;
            int i2 = 0;
            defpackage.afia afiaVarM = defpackage.afqt.m(0, i);
            int i3 = afiaVarM.a;
            int i4 = afiaVarM.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((java.lang.Boolean) affcVar.invoke(objArr[i3])).booleanValue()) {
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
            java.util.Arrays.fill(objArr, i - i2, i, (java.lang.Object) null);
            aanVar.b -= i2;
            if (aanVar.f()) {
                aauVar.i(obj);
            }
            if (aanVar.b == 1) {
                aauVar.m(obj, aanVar.b());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.byy) && defpackage.afga.f(this.a, ((defpackage.byy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.a + ")";
    }
}
