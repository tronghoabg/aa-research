package okhttp3;

import androidx.autofill.HintConstants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class z implements Iterable, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f56351a;

    public /* synthetic */ z(String[] strArr) {
        this.f56351a = strArr;
    }

    public final int a() {
        return this.f56351a.length >> 1;
    }

    public final String b(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        String[] strArr = this.f56351a;
        int length = strArr.length - 2;
        int iD = h.e.b.d(length, 0, -2);
        if (iD <= length) {
            while (!h.n.o.m(str, strArr[length], true)) {
                if (length != iD) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i2) {
        return this.f56351a[i2 + i2];
    }

    public final String d(int i2) {
        return this.f56351a[i2 + i2 + 1];
    }

    public final List e(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int iA = a();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < iA; i2++) {
            if (h.n.o.m(str, c(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i2));
            }
        }
        if (arrayList == null) {
            return h.a.i.h();
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        h.g.b.x.c(listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && Arrays.equals(this.f56351a, ((z) obj).f56351a);
    }

    public final com.waze.shared_infra.coordinators.c f() {
        com.waze.shared_infra.coordinators.c cVar = new com.waze.shared_infra.coordinators.c((byte[]) null);
        h.a.i.aF(cVar.g(), this.f56351a);
        return cVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56351a);
    }

    @Override // java.lang.Iterable
    public final Iterator<h.k<String, String>> iterator() {
        int iA = a();
        h.k[] kVarArr = new h.k[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            kVarArr[i2] = new h.k(c(i2), d(i2));
        }
        return h.g.b.o.v(kVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i2 = 0; i2 < iA; i2++) {
            String strC = c(i2);
            String strD = d(i2);
            sb.append(strC);
            sb.append(": ");
            if (true == okhttp3.internal.b.y(strC)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
