package defpackage;

/* loaded from: classes2.dex */
public final class rra extends rqy {
    private final yxc a;
    private final yxy b;
    private final xxh c;
    private final xxh d;
    private final xxh e;
    private final yfq f;
    private final ygr g;
    private final yxo h;
    private final int i;

    public rra(yxc yxcVar, yxy yxyVar, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, yfq yfqVar, ygr ygrVar, yxo yxoVar, int i) {
        this.a = yxcVar;
        this.b = yxyVar;
        this.c = xxhVar;
        this.d = xxhVar2;
        this.e = xxhVar3;
        this.f = yfqVar;
        this.g = ygrVar;
        this.h = yxoVar;
        this.i = i;
    }

    public static rqz h() {
        rqz rqzVar = new rqz();
        rqzVar.a = yxc.TROUBLESHOOTER_EVENT;
        rqzVar.b = yxy.CONNECTIVITY;
        return rqzVar;
    }

    @Override // defpackage.rqy
    public final xxh a() {
        return this.c;
    }

    @Override // defpackage.rqy
    public final xxh b() {
        return this.d;
    }

    @Override // defpackage.rqy
    public final yfq c() {
        return this.f;
    }

    @Override // defpackage.rqy
    public final ygr d() {
        return this.g;
    }

    @Override // defpackage.rqy
    public final yxc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rra) {
            rra rraVar = (rra) obj;
            if (this.a.equals(rraVar.a) && this.b.equals(rraVar.b) && this.c.equals(rraVar.c) && this.d.equals(rraVar.d) && this.e.equals(rraVar.e) && yrm.W(this.f, rraVar.f) && this.g.equals(rraVar.g) && this.h.equals(rraVar.h)) {
                int i = this.i;
                int i2 = rraVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rqy
    public final yxy f() {
        return this.b;
    }

    @Override // defpackage.rqy
    public final abnp g() {
        abnp abnpVarG = super.g();
        abnp abnpVarN = yzu.a.n();
        int i = this.h.r;
        abnpVarN.t();
        yzu yzuVar = (yzu) abnpVarN.b;
        yzuVar.b |= 1;
        yzuVar.c = i;
        int i2 = this.i;
        if (i2 == 0) {
            throw null;
        }
        abnpVarN.t();
        yzu yzuVar2 = (yzu) abnpVarN.b;
        yzuVar2.b |= 2;
        yzuVar2.d = i2 - 1;
        abnpVarG.t();
        yxb yxbVar = (yxb) abnpVarG.b;
        yzu yzuVar3 = (yzu) abnpVarN.q();
        yxb yxbVar2 = yxb.a;
        yzuVar3.getClass();
        yxbVar.ac = yzuVar3;
        yxbVar.d |= 2;
        return abnpVarG;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        int i = this.i;
        a.aW(i);
        return i ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.i;
        return "TroubleshooterLogEvent{carEventType=" + String.valueOf(this.a) + ", domainIdType=" + String.valueOf(this.b) + ", lifetimeId=" + String.valueOf(this.c) + ", sessionId=" + String.valueOf(this.d) + ", gearheadInfo=" + String.valueOf(this.e) + ", domainLifetimeIds=" + String.valueOf(this.f) + ", testCodes=" + String.valueOf(this.g) + ", detectorType=" + String.valueOf(this.h) + ", troubleshooterEventType=" + (i != 0 ? Integer.toString(i - 1) : "null") + "}";
    }

    public rra() {
        throw null;
    }
}
