package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajhm {
    public static final ajhm a;
    public static final ajhm b;
    private static final List g;
    private static final List h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        List listBi = woy.bi(ajhk.p, ajhk.q, ajhk.r, ajhk.j, ajhk.l, ajhk.k, ajhk.m, ajhk.o, ajhk.n);
        g = listBi;
        List listBi2 = woy.bi(ajhk.p, ajhk.q, ajhk.r, ajhk.j, ajhk.l, ajhk.k, ajhk.m, ajhk.o, ajhk.n, ajhk.h, ajhk.i, ajhk.f, ajhk.g, ajhk.d, ajhk.e, ajhk.c);
        h = listBi2;
        ajhl ajhlVar = new ajhl(true);
        ajhk[] ajhkVarArr = (ajhk[]) listBi.toArray(new ajhk[0]);
        ajhlVar.e((ajhk[]) Arrays.copyOf(ajhkVarArr, ajhkVarArr.length));
        ajhlVar.f(ajij.a, ajij.b);
        ajhlVar.c();
        ajhlVar.a();
        ajhl ajhlVar2 = new ajhl(true);
        ajhk[] ajhkVarArr2 = (ajhk[]) listBi2.toArray(new ajhk[0]);
        ajhlVar2.e((ajhk[]) Arrays.copyOf(ajhkVarArr2, ajhkVarArr2.length));
        ajhlVar2.f(ajij.a, ajij.b);
        ajhlVar2.c();
        a = ajhlVar2.a();
        ajhl ajhlVar3 = new ajhl(true);
        ajhk[] ajhkVarArr3 = (ajhk[]) listBi2.toArray(new ajhk[0]);
        ajhlVar3.e((ajhk[]) Arrays.copyOf(ajhkVarArr3, ajhkVarArr3.length));
        ajhlVar3.f(ajij.a, ajij.b, ajij.c, ajij.d);
        ajhlVar3.c();
        ajhlVar3.a();
        b = new ajhl(false).a();
    }

    public ajhm(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ajhk.t.a(str));
        }
        return arrayList;
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            ajij ajijVar = ajij.a;
            arrayList.add(ahds.b(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajhm)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        ajhm ajhmVar = (ajhm) obj;
        if (z != ajhmVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, ajhmVar.e) && Arrays.equals(this.f, ajhmVar.f) && this.d == ajhmVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        String[] strArr = this.e;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
