package defpackage;

/* loaded from: classes3.dex */
public final class uiq extends ukr {
    private volatile transient int w;
    private volatile transient boolean x;

    @Override // defpackage.ukr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiq) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof ukr)) {
                return false;
            }
            ukr ukrVar = (ukr) obj;
            zjj zjjVar = ukrVar.b;
            aazw aazwVar = ukrVar.c;
            yfq yfqVar = ukrVar.d;
            yfq yfqVar2 = ukrVar.e;
            zkh zkhVar = ukrVar.f;
            Boolean bool = ukrVar.g;
            yfq yfqVar3 = ukrVar.h;
            zjo zjoVar = ukrVar.i;
            acjg acjgVar = ukrVar.j;
            if (!yrm.W(this.k, ukrVar.k)) {
                return false;
            }
            abgj abgjVar = ukrVar.l;
            String str = this.m;
            if (str == null) {
                if (ukrVar.m != null) {
                    return false;
                }
            } else if (!str.equals(ukrVar.m)) {
                return false;
            }
            String str2 = this.n;
            if (str2 == null) {
                if (ukrVar.n != null) {
                    return false;
                }
            } else if (!str2.equals(ukrVar.n)) {
                return false;
            }
            String str3 = this.o;
            if (str3 == null) {
                if (ukrVar.o != null) {
                    return false;
                }
            } else if (!str3.equals(ukrVar.o)) {
                return false;
            }
            ablq ablqVar = ukrVar.p;
            if (!this.q.equals(ukrVar.q)) {
                return false;
            }
            abrv abrvVar = ukrVar.r;
            yfq yfqVar4 = ukrVar.s;
            abrw abrwVar = ukrVar.t;
            aaie aaieVar = ukrVar.u;
            aazx aazxVar = ukrVar.v;
        }
        return true;
    }

    @Override // defpackage.ukr
    public final int hashCode() {
        if (!this.x) {
            synchronized (this) {
                if (!this.x) {
                    int iHashCode = (this.k.hashCode() ^ 474194425) * 583896283;
                    String str = this.m;
                    int iHashCode2 = 0;
                    int iHashCode3 = iHashCode ^ (str == null ? 0 : str.hashCode());
                    String str2 = this.n;
                    int iHashCode4 = (iHashCode3 * 1000003) ^ (str2 == null ? 0 : str2.hashCode());
                    String str3 = this.o;
                    if (str3 != null) {
                        iHashCode2 = str3.hashCode();
                    }
                    this.w = ((((iHashCode4 * 1000003) ^ iHashCode2) * (-721379959)) ^ ((yly) this.q).c) * (-429739981);
                    this.x = true;
                }
            }
        }
        return this.w;
    }
}
