package vd;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import md.C3552u;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f47186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47187b;

    public j(C3552u c3552u) {
        Fe.e.t(c3552u, "eag");
        List list = c3552u.f40728a;
        this.f47186a = new String[list.size()];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            this.f47186a[i5] = ((SocketAddress) it.next()).toString();
            i5++;
        }
        Arrays.sort(this.f47186a);
        this.f47187b = Arrays.hashCode(this.f47186a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.f47187b == this.f47187b) {
            String[] strArr = jVar.f47186a;
            int length = strArr.length;
            String[] strArr2 = this.f47186a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47187b;
    }

    public final String toString() {
        return Arrays.toString(this.f47186a);
    }
}
