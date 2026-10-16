package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cbb {
    public static final void a(cbc cbcVar, int i, Object obj) {
        cbcVar.e[(cbcVar.f - cbcVar.a[cbcVar.b - 1].c) + i] = obj;
    }

    public static final void b(cbc cbcVar, int i, Object obj, int i2, Object obj2) {
        int i3 = cbcVar.f - cbcVar.a[cbcVar.b - 1].c;
        Object[] objArr = cbcVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(cbc cbcVar, Object obj, Object obj2, Object obj3) {
        int i = cbcVar.f - cbcVar.a[cbcVar.b - 1].c;
        Object[] objArr = cbcVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
