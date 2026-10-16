package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajtg implements Cloneable, ajtk {
    public final ajpe a;
    public final InetAddress b;
    public final boolean c;
    private final List d;
    private final ajtj e;
    private final ajti f;

    public ajtg(ajpe ajpeVar, InetAddress inetAddress, List list, boolean z, ajtj ajtjVar, ajti ajtiVar) {
        ahgm.e(ajpeVar, "Target host");
        if (ajpeVar.c < 0) {
            InetAddress inetAddress2 = ajpeVar.e;
            String str = ajpeVar.d;
            ajpeVar = new ajpe(ajpeVar.a, "http".equalsIgnoreCase(str) ? 80 : "https".equalsIgnoreCase(str) ? 443 : -1, str);
        }
        this.a = ajpeVar;
        this.b = inetAddress;
        if (list == null || list.isEmpty()) {
            this.d = null;
        } else {
            this.d = new ArrayList(list);
        }
        if (ajtjVar == ajtj.b) {
            ahgm.a(this.d != null, "Proxy required if tunnelled");
        }
        this.c = z;
        this.e = ajtjVar == null ? ajtj.a : ajtjVar;
        this.f = ajtiVar == null ? ajti.a : ajtiVar;
    }

    @Override // defpackage.ajtk
    public final int a() {
        List list = this.d;
        if (list != null) {
            return list.size() + 1;
        }
        return 1;
    }

    @Override // defpackage.ajtk
    public final ajpe b(int i) {
        ahgm.d(i, "Hop index");
        int iA = a();
        ahgm.a(i < iA, "Hop index exceeds tracked route length");
        return i < iA + (-1) ? (ajpe) this.d.get(i) : this.a;
    }

    @Override // defpackage.ajtk
    public final ajpe c() {
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ajpe) list.get(0);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajtk
    public final ajpe d() {
        return this.a;
    }

    @Override // defpackage.ajtk
    public final boolean e() {
        return this.f == ajti.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajtg) {
            ajtg ajtgVar = (ajtg) obj;
            if (this.c == ajtgVar.c && this.e == ajtgVar.e && this.f == ajtgVar.f && a.ao(this.a, ajtgVar.a) && a.ao(this.b, ajtgVar.b) && a.ao(this.d, ajtgVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajtk
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.ajtk
    public final boolean g() {
        return this.e == ajtj.b;
    }

    public final int hashCode() {
        int iC = ahku.c(ahku.c(17, this.a), this.b);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC = ahku.c(iC, (ajpe) it.next());
            }
        }
        boolean z = this.c;
        ajtj ajtjVar = this.e;
        return ahku.c(ahku.c((iC * 37) + (z ? 1 : 0), ajtjVar), this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((a() * 30) + 50);
        InetAddress inetAddress = this.b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.e == ajtj.b) {
            sb.append('t');
        }
        if (this.f == ajti.b) {
            sb.append('l');
        }
        if (this.c) {
            sb.append('s');
        }
        sb.append("}->");
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((ajpe) it.next());
                sb.append("->");
            }
        }
        sb.append(this.a);
        return sb.toString();
    }
}
