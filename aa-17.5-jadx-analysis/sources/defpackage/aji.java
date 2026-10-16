package defpackage;

/* loaded from: classes.dex */
public final class aji extends cxt<ajk> {
    private final asf a;
    private final akm b;
    private final boolean c;
    private final boolean d;
    private final String f;
    private final ddo g;
    private final afdr h;

    public aji(asf asfVar, akm akmVar, boolean z, boolean z2, String str, ddo ddoVar, afdr afdrVar) {
        this.a = asfVar;
        this.b = akmVar;
        this.c = z;
        this.d = z2;
        this.f = str;
        this.g = ddoVar;
        this.h = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ajk(this.a, this.b, this.c, this.d, this.f, this.g, this.h);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ((ajk) cfxVar).w(this.a, this.b, this.c, this.d, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aji ajiVar = (aji) obj;
        return affa.f(this.a, ajiVar.a) && affa.f(this.b, ajiVar.b) && this.c == ajiVar.c && this.d == ajiVar.d && affa.f(this.f, ajiVar.f) && affa.f(this.g, ajiVar.g) && this.h == ajiVar.h;
    }

    public final int hashCode() {
        asf asfVar = this.a;
        int iHashCode = asfVar != null ? asfVar.hashCode() : 0;
        akm akmVar = this.b;
        int iHashCode2 = ((((((iHashCode * 31) + (akmVar != null ? akmVar.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + (true == this.d ? 1231 : 1237)) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ddo ddoVar = this.g;
        return ((iHashCode3 + (ddoVar != null ? ddoVar.a : 0)) * 31) + this.h.hashCode();
    }
}
